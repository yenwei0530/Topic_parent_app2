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



    }
}