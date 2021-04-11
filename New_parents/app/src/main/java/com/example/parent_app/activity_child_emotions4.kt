package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_child_emotions4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions4)
    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }

    fun next(view: View) {
        startActivity(Intent(this,main::class.java))
    }
}