package com.example.parent_app;

import android.app.Application;

public class GlobalVariable extends Application {
    private String name;     //帳號
    private String user;     //帳號
    private String password;  //密碼
    private String sex;  //性別
    private String interaction1;  //Q1
    private String interaction2;  //Q2
    private String interaction3;  //Q3
    private String interaction4;  //Q4
    private String interaction5;  //Q5
    private String interaction6;  //Q6

    private String diary1="非常快樂";  //心情日記Q1
    private String diary2="晴天";  //心情日記Q2
    private String diary3="自己";  //心情日記Q3
    private String diary4="早上";  //心情日記Q4
    private String diary5;  //心情日記Q5
    private String diary6;  //心情日記Q6
    private String diary7;  //心情日記Q7
    private String diary8;  //心情日記Q8
    private String diary9_start;  //心情日記Q9開始時間
    private String diary9_end;  //心情日記Q9結束時間
    private int diary10;  //心情日記Q10
    private String ter1_1="7非常快樂";  //心情溫度計sp1_1
    private String ter1_2="非常快樂";  //心情溫度計sp1_2
    private String ter1_3="呼吸變急";  //心情溫度計sp1_3
    private String ter1_4="想打自己";  //心情溫度計sp1_4
    private String ter3_1="提醒自己的話";  //心情溫度計sp3_1
    private String ter6_1="7非常快樂";  //心情溫度計sp6_1
    private String exit_ter1_1="7非常快樂";  //離開_心情溫度計sp1_1
    private String exit_ter1_2="非常快樂";  //離開_心情溫度計sp1_2
    private String abc="T";     //注音
    private String upmood;     //上次心情


    //修改 變數値
    public void setname(String name) {
        this.name = name;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public void setinteraction1(String interaction1) {
        this.interaction1 = interaction1;
    }
    public void setinteraction2(String interaction2) {
        this.interaction2 = interaction2;
    }
    public void setinteraction3(String interaction3) {
        this.interaction3 = interaction3;
    }
    public void setinteraction4(String interaction4) {
        this.interaction4 = interaction4;
    }
    public void setinteraction5(String interaction5) {
        this.interaction5 = interaction5;
    }
    public void setinteraction6(String interaction6) {
        this.interaction6 = interaction6;
    }

    //取得 變數值
    public String getname() { return name;  }

    public String getuser() { return user;  }

    public String getpassword() {
        return password;
    }

    public String getinteraction1() {
        return interaction1;
    }

    public String getinteraction2() {
        return interaction2;
    }

    public String getinteraction3() {
        return interaction3;
    }
    public String getinteraction4() {
        return interaction4;
    }

    public String getinteraction5() {
        return interaction5;
    }

    public String getinteraction6() {
        return interaction6;
    }

}