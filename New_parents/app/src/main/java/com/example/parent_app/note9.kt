package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class note9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note9)
    }

    fun next(view: View) {
        startActivity(Intent(this,note10::class.java))
    }
    fun back(view: View) {
        startActivity(Intent(this,note8::class.java))
    }
}