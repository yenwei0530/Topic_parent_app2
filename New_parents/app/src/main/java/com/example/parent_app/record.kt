package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class record : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)
    }

    fun child_emotions(view: View) {}
    fun child_performance(view: View) {}
    fun child_interaction(view: View) {}
}