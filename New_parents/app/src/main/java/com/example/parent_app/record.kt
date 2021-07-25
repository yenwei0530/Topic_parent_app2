package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_record.*
import kotlinx.android.synthetic.main.login_page.*

class record : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)
        //建立共用變數類別
        val gv = applicationContext as GlobalVariable
        val con = MysqlCon()

        radioButton.setOnClickListener {

            val textview23= findViewById<View>(R.id.textView23) as TextView
            val textView22= findViewById<View>(R.id.textView22) as TextView
            val toast= Toast.makeText(this,"無資料", Toast.LENGTH_SHORT)

            Thread {
                val recordsql="SELECT write_time FROM `adaptation_scale_w` where `parent_id`= '"+ gv.getuser()+ "'"
                //val con = MysqlCon()
                //con.run()
                val record = con.getRecord(recordsql)
                Log.v("OK", record.toString())
                textview23.post { textview23.text = record.toString() }

            }.start()
        }
        radioButton51.setOnClickListener {
            val textview23= findViewById<View>(R.id.textView23) as TextView
            val textView22= findViewById<View>(R.id.textView22) as TextView
            val toast= Toast.makeText(this,"無資料", Toast.LENGTH_SHORT)

            Thread {
                val recordsql="SELECT write_time FROM `interactive_scale_w` where `parent_id`= '"+ gv.getuser()+ "'"
                //val con = MysqlCon()
                //con.run()
                val record = con.getRecord(recordsql)
                if (record == null)
                {
                    toast.show()
                    Log.e("toast",toast.toString())
                }else
                {
                    Log.v("OK", record.toString())
                    textview23.post { textview23.text = record.toString() }
                }
            }.start()
        }

        fun child_emotions(view: View) {}

        fun child_performance(view: View) {
        }

        fun child_interaction(view: View) {
        }
    }
}