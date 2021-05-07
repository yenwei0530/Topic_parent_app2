package com.example.parent_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_for_test.*

class for_test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_test)
        ////////FOR interaction TEST
        var get_interaction_ans1 = intent.getBundleExtra("bundle")?.getInt("interaction_ans1").toString()
        var get_interaction_ans2 = intent.getBundleExtra("bundle")?.getInt("interaction_ans2").toString()
        var get_interaction_ans3 = intent.getBundleExtra("bundle")?.getInt("interaction_ans3").toString()
        var get_interaction_ans4 = intent.getBundleExtra("bundle")?.getInt("interaction_ans4").toString()
        var get_interaction_ans5 = intent.getBundleExtra("bundle")?.getInt("interaction_ans5").toString()
        var get_interaction_ans6 = intent.getBundleExtra("bundle")?.getInt("interaction_ans6").toString()

        textView_fortest1.text = get_interaction_ans1
        textView_fortest2.text = get_interaction_ans2
        textView_fortest3.text = get_interaction_ans3
        textView_fortest4.text = get_interaction_ans4
        textView_fortest5.text = get_interaction_ans5
        textView_fortest6.text = get_interaction_ans6

        ////////FOR performance TEST
        var get_performance_ans1 = intent.getBundleExtra("bundle")?.getInt("performance_ans1").toString()
        var get_performance_ans2 = intent.getBundleExtra("bundle")?.getInt("performance_ans2").toString()
        var get_performance_ans3 = intent.getBundleExtra("bundle")?.getInt("performance_ans3").toString()
        var get_performance_ans4 = intent.getBundleExtra("bundle")?.getInt("performance_ans4").toString()
        var get_performance_ans5 = intent.getBundleExtra("bundle")?.getInt("performance_ans5").toString()
        var get_performance_ans6 = intent.getBundleExtra("bundle")?.getInt("performance_ans6").toString()
        var get_performance_ans7 = intent.getBundleExtra("bundle")?.getInt("performance_ans7").toString()
        var get_performance_ans8 = intent.getBundleExtra("bundle")?.getInt("performance_ans8").toString()
        var get_performance_ans9 = intent.getBundleExtra("bundle")?.getInt("performance_ans9").toString()
        var get_performance_ans10 = intent.getBundleExtra("bundle")?.getInt("performance_ans10").toString()

        textView_fortest7.text = get_performance_ans1
        textView_fortest8.text = get_performance_ans2
        textView_fortest9.text = get_performance_ans3
        textView_fortest10.text = get_performance_ans4
        textView_fortest11.text = get_performance_ans5
        textView_fortest12.text = get_performance_ans6
        textView_fortest13.text = get_performance_ans7
        textView_fortest14.text = get_performance_ans8
        textView_fortest15.text = get_performance_ans9
        textView_fortest16.text = get_performance_ans10

        ////////FOR emotion TEST

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

        textView_emotions1.text = get_emotions_ans1.toString()
        textView_emotions2.text = get_emotions_ans2.toString()
        textView_emotions3.text = get_emotions_ans3.toString()
        textView_emotions4.text = get_emotions_ans4.toString()
        textView_emotions5.text = get_emotions_ans5.toString()
        textView_emotions6.text = get_emotions_ans6.toString()
        textView_emotions7.text = get_emotions_ans7.toString()
        textView_emotions8.text = get_emotions_ans8.toString()
        textView_emotions9.text = get_emotions_ans9.toString()
        textView_emotions10.text = get_emotions_ans10.toString()
        textView_emotions11.text = get_emotions_ans11.toString()
        textView_emotions12.text = get_emotions_ans12.toString()
        textView_emotions13.text = get_emotions_ans13.toString()


    }
}