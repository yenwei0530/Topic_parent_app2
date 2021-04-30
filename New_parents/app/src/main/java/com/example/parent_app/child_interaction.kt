package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class child_interaction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_interaction)
    }

    fun onLoginClick(view: View) {}
}