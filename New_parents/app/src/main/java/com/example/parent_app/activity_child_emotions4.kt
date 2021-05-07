package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_child_emotions4.*

class activity_child_emotions4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions4)

        cirRegisterButton4.setOnClickListener {
            startActivity(Intent(this,main::class.java))

        }

    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }


}