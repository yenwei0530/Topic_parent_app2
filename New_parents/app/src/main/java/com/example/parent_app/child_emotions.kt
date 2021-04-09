package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class child_emotions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions)
    }

    fun onLoginClick(view: View) {
        startActivity(Intent(this,main::class.java))
    }
}