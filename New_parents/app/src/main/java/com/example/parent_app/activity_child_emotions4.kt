package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions4.*

class activity_child_emotions4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions4)

        var get_emotions_ans1 = intent.getBundleExtra("bundle")?.getInt("emotions_ans1")
        var get_emotions_ans2 = intent.getBundleExtra("bundle")?.getInt("emotions_ans2")
        var get_emotions_ans3 = intent.getBundleExtra("bundle")?.getInt("emotions_ans3")
        var get_emotions_ans4 = intent.getBundleExtra("bundle")?.getInt("emotions_ans4")
        var get_emotions_ans5 = intent.getBundleExtra("bundle")?.getInt("emotions_ans5")
        var get_emotions_ans6 = intent.getBundleExtra("bundle")?.getInt("emotions_ans6")
        var get_emotions_ans7 = intent.getBundleExtra("bundle")?.getInt("emotions_ans7")
        var get_emotions_ans8 = intent.getBundleExtra("bundle")?.getInt("emotions_ans8")
        var get_emotions_ans9 = intent.getBundleExtra("bundle")?.getInt("emotions_ans9")
        var get_emotions_ans10 = intent.getBundleExtra("bundle")?.getInt("emotions_ans10")
        var get_emotions_ans11 = intent.getBundleExtra("bundle")?.getInt("emotions_ans11")
        var get_emotions_ans12 = intent.getBundleExtra("bundle")?.getInt("emotions_ans12")
        var get_emotions_ans13 = intent.getBundleExtra("bundle")?.getInt("emotions_ans13")
        var get_emotions_ans14 = intent.getBundleExtra("bundle")?.getInt("emotions_ans14")
        var get_emotions_ans15 = intent.getBundleExtra("bundle")?.getInt("emotions_ans15")
        var get_emotions_ans16 = intent.getBundleExtra("bundle")?.getInt("emotions_ans16")
        var get_emotions_ans17 = intent.getBundleExtra("bundle")?.getInt("emotions_ans17")
        var get_emotions_ans18 = intent.getBundleExtra("bundle")?.getInt("emotions_ans18")
        var get_emotions_ans19 = intent.getBundleExtra("bundle")?.getInt("emotions_ans19")
        var get_emotions_ans20 = intent.getBundleExtra("bundle")?.getInt("emotions_ans20")

        var emotions_ans1 = get_emotions_ans1.toString()
        var emotions_ans2 = get_emotions_ans2.toString()
        var emotions_ans3 = get_emotions_ans3.toString()
        var emotions_ans4 = get_emotions_ans4.toString()
        var emotions_ans5 = get_emotions_ans5.toString()
        var emotions_ans6 = get_emotions_ans6.toString()
        var emotions_ans7 = get_emotions_ans7.toString()
        var emotions_ans8 = get_emotions_ans8.toString()
        var emotions_ans9 = get_emotions_ans9.toString()
        var emotions_ans10 = get_emotions_ans10.toString()
        var emotions_ans11 = get_emotions_ans11.toString()
        var emotions_ans12 = get_emotions_ans12.toString()
        var emotions_ans13 = get_emotions_ans13.toString()
        var emotions_ans14 = get_emotions_ans14.toString()
        var emotions_ans15 = get_emotions_ans15.toString()
        var emotions_ans16 = get_emotions_ans16.toString()
        var emotions_ans17 = get_emotions_ans17.toString()
        var emotions_ans18 = get_emotions_ans18.toString()
        var emotions_ans19 = get_emotions_ans19.toString()
        var emotions_ans20 = get_emotions_ans20.toString()

        //Toast.makeText(this, emotions_ans1+ emotions_ans2 + emotions_ans3 + emotions_ans4 + emotions_ans5, Toast.LENGTH_SHORT).show()
        //Toast.makeText(this, emotions_ans6 + emotions_ans7 + emotions_ans8 + emotions_ans9 + emotions_ans10 + emotions_ans11 + emotions_ans12 + emotions_ans13 , Toast.LENGTH_SHORT).show()
        Toast.makeText(this, emotions_ans14 + emotions_ans15 + emotions_ans16 + emotions_ans17 + emotions_ans18 + emotions_ans19 + emotions_ans20 , Toast.LENGTH_SHORT).show()





        cirRegisterButton4.setOnClickListener {
            startActivity(Intent(this,main::class.java))

        }

    }
    fun onLoginClick(view: View) {
        startActivity(Intent(this,activity_child_emotions3::class.java))
    }


}