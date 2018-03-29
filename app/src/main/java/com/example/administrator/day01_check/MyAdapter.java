package com.example.administrator.day01_check;

/**
 * Created by Administrator on 2018/3/29 0029.
 */

import android.support.v7.widget.RecyclerView;

import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22 0022.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    List<User.ResultBean.DataBean> list;
    private Context context ;
    private setOnItemClickListener listener;

    public MyAdapter(List<User.ResultBean.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_login,parent,false);

        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder)holder).title.setText(list.get(position).getTitle());
        Glide.with(context).load(list.get(position).getThumbnail_pic_s()).into(((ViewHolder)holder).img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.setOnItemListener(position);
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                listener.setOnItemLongListener(position);
                return false;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{


        private final TextView title;
        private final ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            img = itemView.findViewById(R.id.img);
        }


    }


    public interface setOnItemClickListener{

     void    setOnItemListener(int position);
     void    setOnItemLongListener(int position);
    }


    public void setOnClickListener(setOnItemClickListener listener){
        this.listener=listener;
    }
}
