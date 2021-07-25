package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //建立共用變數類別
        val gv = applicationContext as GlobalVariable

        txtdashboard.text == "家長"

        signout.setOnClickListener {
            startActivity(Intent(this,login_page::class.java))
        }

    }


    fun user(view: View) {
        startActivity(Intent(this,user::class.java))
    }

    fun child_emotions(view: View) {
        startActivity(Intent(this,child_emotions::class.java))
    }

    fun child_performance(view: View) {
        startActivity(Intent(this,child_performance::class.java))
    }

    fun child_interaction(view: View) {
        startActivity(Intent(this,child_interaction::class.java))
    }

    fun record(view: View) {
        startActivity(Intent(this,record::class.java))
    }
    fun manual(view: View) {
        startActivity(Intent(this,manual::class.java))
    }

}