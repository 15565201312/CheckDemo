package com.example.administrator.day01_check;

import java.util.List;

/**
 * Created by Administrator on 2018/3/29 0029.
 */

public class User {

    /**
     * error_code : 0
     * reason : 成功的返回
     * result : {"data":[{"author_name":"新华国际头条","category":"头条","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","title":"俄罗斯女记者参加总统选举 闹着玩还是来真的？","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"拥抱岘港的碧海蓝天 ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"学习贯彻党的十九大精神 中央宣讲团宣讲报告会在郑举行","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"},{"author_name":"世事名嘴","category":"头条","date":"2017-11-09 16:49","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"21岁少女因车祸\u201c脑死亡\u201d，医院称已尽力，妈妈用一块冰\u201c复活\u201d","uniquekey":"65608c8671795f14128d630d0d60eeb4","url":"http://mini.eastday.com/mobile/171109164933695.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 16:48","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中美元首共同出席中美企业家对话会闭幕式","uniquekey":"38a441ec4a81c7960e5955562292cc9d","url":"http://mini.eastday.com/mobile/171109164814180.html"},{"author_name":"晋宝儿说星座","category":"头条","date":"2017-11-09 16:42","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来两年会人丁兴旺，添娃又添福的四大星座女","uniquekey":"d95333a23c1391f383ec95633dc06543","url":"http://mini.eastday.com/mobile/171109164209094.html"},{"author_name":"财经新观点","category":"头条","date":"2017-11-09 16:32","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"? 没买房的恭喜了 马云宣布杀入房地产","uniquekey":"9c9d70abccdcc9a718d0c1e5cd921b81","url":"http://mini.eastday.com/mobile/171109163206038.html"}],"stat":"1"}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"author_name":"新华国际头条","category":"头条","date":"2017-11-09 18:04","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg","title":"俄罗斯女记者参加总统选举 闹着玩还是来真的？","uniquekey":"685d0fccd3f5ea3014d7ab0215fecb5f","url":"http://mini.eastday.com/mobile/171109180455164.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 18:03","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"拥抱岘港的碧海蓝天 ","uniquekey":"5f32d44a161e65acb4db3a90f41379d1","url":"http://mini.eastday.com/mobile/171109180324333.html"},{"author_name":"人民网","category":"头条","date":"2017-11-09 17:55","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"学习贯彻党的十九大精神 中央宣讲团宣讲报告会在郑举行","uniquekey":"2fe32f3da298fe335a3305ee53a30e39","url":"http://mini.eastday.com/mobile/171109175525809.html"},{"author_name":"世事名嘴","category":"头条","date":"2017-11-09 16:49","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20171109/20171109164933_91402027fd92ce9f57aa8198c4352c06_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"21岁少女因车祸\u201c脑死亡\u201d，医院称已尽力，妈妈用一块冰\u201c复活\u201d","uniquekey":"65608c8671795f14128d630d0d60eeb4","url":"http://mini.eastday.com/mobile/171109164933695.html"},{"author_name":"中国新闻网","category":"头条","date":"2017-11-09 16:48","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20171109/20171109164814_c934243f108b251d707bf31c65b1012c_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"中美元首共同出席中美企业家对话会闭幕式","uniquekey":"38a441ec4a81c7960e5955562292cc9d","url":"http://mini.eastday.com/mobile/171109164814180.html"},{"author_name":"晋宝儿说星座","category":"头条","date":"2017-11-09 16:42","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20171109/20171109164209_208c2ec6405aca25a531d6dd79225844_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"未来两年会人丁兴旺，添娃又添福的四大星座女","uniquekey":"d95333a23c1391f383ec95633dc06543","url":"http://mini.eastday.com/mobile/171109164209094.html"},{"author_name":"财经新观点","category":"头条","date":"2017-11-09 16:32","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg","title":"? 没买房的恭喜了 马云宣布杀入房地产","uniquekey":"9c9d70abccdcc9a718d0c1e5cd921b81","url":"http://mini.eastday.com/mobile/171109163206038.html"}]
         * stat : 1
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * author_name : 新华国际头条
             * category : 头条
             * date : 2017-11-09 18:04
             * thumbnail_pic_s : http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg
             * title : 俄罗斯女记者参加总统选举 闹着玩还是来真的？
             * uniquekey : 685d0fccd3f5ea3014d7ab0215fecb5f
             * url : http://mini.eastday.com/mobile/171109180455164.html
             * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg
             */

            private String author_name;
            private String category;
            private String date;
            private String thumbnail_pic_s;
            private String title;
            private String uniquekey;
            private String url;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
