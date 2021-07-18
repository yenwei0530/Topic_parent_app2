package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_record.*

class record : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        radioButton.setOnClickListener {
            /*
            val text_view_num = findViewById<View>(R.id.textView22) as TextView
            val text_view_time = findViewById<View>(R.id.textView23) as TextView

            Thread {
                val con = MysqlCon()
                con.run()
                val data_time = con.data
                Log.v("OK", data_time)
                text_view_time.post { text_view_time.text = data_time }
            }.start()
             */
        }

        fun child_emotions(view: View) {}

        fun child_performance(view: View) {
        }

        fun child_interaction(view: View) {
        }
    }
}