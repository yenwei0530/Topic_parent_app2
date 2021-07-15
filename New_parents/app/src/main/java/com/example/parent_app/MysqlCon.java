package com.example.parent_app;
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
    String url = "jdbc:mysql://" + mysql_ip + ":" + mysql_port + "/" + db_name ;
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
            Log.v("DB", "遠端連接成功");
        } catch (SQLException e) {
            Log.e("DB", "遠端連接失敗");
            Log.e("DB", e.toString());
        }
    }

    /*
    public String getData() {
        String data = "";
        try {
            Connection con = DriverManager.getConnection(url, db_user, db_password);
            String sql = "SELECT * FROM parent";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
            {
                String id = rs.getString("parent_id");
                data += id + ",  ";
                String id2 = rs.getString("password");
                data += id2 + ", ";
                String id3 = rs.getString("child");
                data += id3 + ", ";
                String id4 = rs.getString("parent_name");
                data += id4 + ", " + "\n";
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;

     */
    }




