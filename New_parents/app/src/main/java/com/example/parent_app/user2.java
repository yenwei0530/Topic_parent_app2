package com.example.parent_app;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class user2 extends AppCompatActivity {

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();//取得所有資料
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);

        //建立共用變數類別
        GlobalVariable gv = (GlobalVariable)getApplicationContext();

        //取資料
        Thread thread1 = new Thread() {
            @Override
            public void run ( ) {
                MysqlCon con = new MysqlCon();
                con.run();
                arrayList=con.getrelationship(gv.getuser());
            };
        };
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 宣告EditText物件
        EditText editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName);
        //宣告Spinner物件
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        final String[] lunch = {"請選擇","生父","生母","繼父","繼母","爺爺或外公","奶奶或外婆","其他"};
        ArrayAdapter<String> lunchList = new ArrayAdapter<>(user2.this,
                android.R.layout.simple_spinner_dropdown_item,
                lunch);spinner1.setAdapter(lunchList);

        if(arrayList.get(0).get("relationship").equals("生父")){
            spinner1.setSelection(1, false);
        }else  if(arrayList.get(0).get("relationship").equals("生母")){
            spinner1.setSelection(2, false);
        }else  if(arrayList.get(0).get("relationship").equals("繼父")){
            spinner1.setSelection(3, false);
        } else  if(arrayList.get(0).get("relationship").equals("繼母")){
            spinner1.setSelection(4, false);
        } else  if(arrayList.get(0).get("relationship").equals("爺爺或外公")){
            spinner1.setSelection(5, false);
        }else  if(arrayList.get(0).get("relationship").equals("奶奶或外婆")){
            spinner1.setSelection(6, false);
        }else {
            spinner1.setSelection(7, false);
            editTextTextPersonName.setText(arrayList.get(0).get("relationship"));
        }



        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(),parent.getSelectedItem().toString()/*這行可直接取得選中內容*/,Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });




    }
}