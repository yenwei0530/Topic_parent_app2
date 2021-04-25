package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class activity_child_emotions2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions2)

        var get_emotions_ans1 = intent.getBundleExtra("bundle")?.getInt("emotions_ans1").toString()
        Toast.makeText(this@activity_child_emotions2, "接收到的資料： \n "+" $get_emotions_ans1 ",
                Toast.LENGTH_SHORT).show()


    }


    fun onLoginClick(view: View) {
        finish()
    }

    fun next(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }
}