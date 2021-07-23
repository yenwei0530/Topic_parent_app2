package com.example.parent_app;
import android.icu.text.SimpleDateFormat;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlCon {

    // 伺服器資料庫定義
    String mysql_ip = "184.168.97.99";
    int mysql_port = 3306; // Port 預設為 3306
    String db_name = "treatment";
    String url = "jdbc:mysql://" + mysql_ip + ":" + mysql_port + "/" + db_name + "?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";
    String db_user = "spopob8v48s2";
    String db_password = "Mm35176661";


    public void run() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Log.v("DB", "加載驅動成功");
        } catch (ClassNotFoundException e) {
            Log.e("DB", "加載驅動失敗");
            return;
        }

        // 連接資料庫
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            Log.v("DB", "遠端連接成功");
        } catch (SQLException e) {
            Log.e("DB", "遠端連接失敗");
            Log.e("DB", e.toString());
        }
    }




    public String getData() {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            //Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                String id = rs.getString("parent_id");
                data += id + ", ";
                String id2 = rs.getString("password");
                data += id2 + ", " + "\n";
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    public void interactive_scale_w(String id, String q1, String q2, String q3, String q4, String q5, String q6) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `interactive_scale_w`(`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`,`write_time`) VALUES('" + id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','"  + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗" );
            Log.e("DB", e.toString());
        }
    }

    public void adaptation_scale_w(String Student_id,String parent_id, String q1, String q2, String q3, String q4, String q5, String q6, String q7, String q8, String q9, String q10) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `adaptation_scale_w`(`student_id`,`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`,`q8`,`q9`,`q10`,`write_time`) VALUES('" + Student_id + "','" + parent_id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','" + q7 + "','" + q8 + "','" + q9 + "','" + q10 + "','"  + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗" );
            Log.e("DB", e.toString());
        }
    }

    public void mood_disorders_scale_w(String id, String q1, String q2, String q3, String q4, String q5
            , String q6, String q7, String q8, String q9, String q10,String q11,String q12
            ,String q13,String q14,String q15,String q16,String q17,String q18,String q19
            ,String q20,String q21,String q22,String q23,String q24,String q25,String q26
            ,String q27,String q28) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `mood_disorders_scale_w`(`parent_id`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`,`q8`,`q9`,`q10`,`q11`,`q12`,`q13`,`q14`,`q15`,`q16`,`q17`,`q18`,`q19`,`q20`,`q21`,`q22`,`q23`,`q24`,`q25`,`q26`,`q27`,`q28`,`write_time`) VALUES('" + id + "','" + q1 + "','" + q2 + "','" + q3 + "','" + q4 + "','" + q5 + "','" + q6 + "','" + q7 + "','" + q8 + "','" + q9 + "','" + q10 + "','"+ q11 + "','"+ q12 + "','"+ q13 + "','"+ q14 + "','"+ q15 + "','"+ q16 + "','"+ q17 + "','"+ q18 + "','"+ q19 + "','"+ q20 + "','"+ q21 + "','"+ q22 + "','"+ q23 + "','"+ q24 + "','"+ q25 + "','"+ q26 + "','"+ q27 + "','"+ q28 + "','"  + date + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗" );
            Log.e("DB", e.toString());
        }
    }

    public void relationship(String parent_id, String student_id, String relationship, String cohabitation, String discipline, String home_order, String brothers_sisters, String income) {
        try {
            SimpleDateFormat sDateFormat = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                sDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            }
            String date = null;
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                date = sDateFormat.format(new java.util.Date());
            }

            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "INSERT INTO `relationship`(`parent_id`,`student_id`, `relationship`, `cohabitation`, `discipline`, `home_order`, `brothers_sisters`, `income`) VALUES('" + parent_id + "','" + student_id + "','" + relationship + "','" + cohabitation + "','" + discipline + "','" + home_order + "','" + brothers_sisters + "','" + income + "')";
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();
            Log.v("DB", "寫入資料完成：" + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            Log.e("DB", "寫入資料失敗" );
            Log.e("DB", e.toString());
        }
    }
}





