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
    //String url = "jdbc:mysql://" + mysql_ip + ":" + mysql_port + "/" + db_name ;
    //String url ="jdbc:mysql://184.168.97.99:3306/treatment?autoReconnect=true&amp;useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC";
    //String url ="jdbc:mysql://184.168.97.99:3306/treatment?enabledTLSProtocols=TLSv1.2";
    String url ="jdbc:mysql://184.168.97.99:3306/treatment?user=spopob8v48s2&password=Mm35176661&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&autoReconnect=true";
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

}





