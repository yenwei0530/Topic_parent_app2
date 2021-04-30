package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class child_performance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_performance)
    }

    fun onLoginClick(view: View) {}
}