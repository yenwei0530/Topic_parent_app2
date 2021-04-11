package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class activity_child_emotions2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions2)
    }

    fun onLoginClick(view: View) {
        startActivity(Intent(this,child_emotions::class.java))
    }

    fun next(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }
}