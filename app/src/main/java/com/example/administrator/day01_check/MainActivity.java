package com.example.administrator.day01_check;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recycle;
    private TextView name;
    private Button but_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        try {
            name.setText(DataCleanManager.getCacheSize(new File(getCacheDir()+"")));

        } catch (Exception e) {
            e.printStackTrace();
        }


        but_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name.setText("0");
                DataCleanManager.cleanApplicationData(MainActivity.this,getApplication()+"");
                DataCleanManager.deleteFolderFile(getCacheDir()+"",false);
                Toast.makeText(MainActivity.this, "缓存删除完毕", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void initData() {

        OkHttpClient build = new OkHttpClient().newBuilder().cache(new Cache(MainActivity.this.getCacheDir(), 20 * 10240))
                .connectTimeout(100, TimeUnit.MINUTES)
                .connectTimeout(100, TimeUnit.MINUTES)
                .build();


        build.newCall(new Request.Builder().url("http://192.168.137.1:8080/json/da.txt").build()).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {


            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                String string = response.body().string();

                User user = new Gson().fromJson(string, User.class);

                List<User.ResultBean.DataBean> list = user.getResult().getData();


                recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
                recycle.setAdapter(new MyAdapter(list, MainActivity.this));
            }
        });
    }

    private void initView() {
        recycle = (RecyclerView) findViewById(R.id.recycle);
        name = (TextView) findViewById(R.id.name);
        name.setOnClickListener(this);
        but_add = (Button) findViewById(R.id.but_add);
        but_add.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_add:

                break;
        }
    }
}
