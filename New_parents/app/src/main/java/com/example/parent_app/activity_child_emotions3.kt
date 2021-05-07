package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions3.*

class activity_child_emotions3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions3)
        /*
        var get_emotions_ans1 = intent.getBundleExtra("bundle")?.getInt("emotions_ans1").toString()
        var get_emotions_ans2 = intent.getBundleExtra("bundle")?.getInt("emotions_ans2").toString()
        var get_emotions_ans3 = intent.getBundleExtra("bundle")?.getInt("emotions_ans3").toString()
        var get_emotions_ans4 = intent.getBundleExtra("bundle")?.getInt("emotions_ans4").toString()
        var get_emotions_ans5 = intent.getBundleExtra("bundle")?.getInt("emotions_ans5").toString()
        var get_emotions_ans6 = intent.getBundleExtra("bundle")?.getInt("emotions_ans6").toString()
        var get_emotions_ans7 = intent.getBundleExtra("bundle")?.getInt("emotions_ans7").toString()
        var get_emotions_ans8 = intent.getBundleExtra("bundle")?.getInt("emotions_ans8").toString()
        var get_emotions_ans9 = intent.getBundleExtra("bundle")?.getInt("emotions_ans9").toString()
        var get_emotions_ans10 = intent.getBundleExtra("bundle")?.getInt("emotions_ans10").toString()
        var get_emotions_ans11 = intent.getBundleExtra("bundle")?.getInt("emotions_ans11").toString()
        var get_emotions_ans12 = intent.getBundleExtra("bundle")?.getInt("emotions_ans12").toString()
        var get_emotions_ans13 = intent.getBundleExtra("bundle")?.getInt("emotions_ans13").toString()
        //Toast.makeText(this, get_emotions_ans1 + get_emotions_ans2 + get_emotions_ans3 + get_emotions_ans4 + get_emotions_ans5, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, get_emotions_ans6 + get_emotions_ans7 + get_emotions_ans8 + get_emotions_ans9 + get_emotions_ans10, Toast.LENGTH_SHORT).show()


         */
        cirRegisterButton3.setOnClickListener {
            startActivity(Intent(this,activity_child_emotions4::class.java))

        }
    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions2::class.java))
    }

}