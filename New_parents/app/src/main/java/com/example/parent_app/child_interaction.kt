package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_interaction.*

class child_interaction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_interaction)
        var interaction_ans1 = 0
        var interaction_ans2 = 0
        var interaction_ans3 = 0
        var interaction_ans4 = 0
        var interaction_ans5 = 0
        var interaction_ans6 = 0
        // radiogroup 1 第一題 ↓↓
        radioButton1_emotions2.setOnClickListener {
            interaction_ans1 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2_emotions2.setOnClickListener {
            interaction_ans1 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3.setOnClickListener {
            interaction_ans1 = 3
            Toast.makeText(this@child_interaction, "有時這樣" , Toast.LENGTH_SHORT).show()
        }
        radioButton4.setOnClickListener {
            interaction_ans1 = 4
            Toast.makeText(this@child_interaction, "很少這樣" , Toast.LENGTH_SHORT).show()
        }
        radioButton5.setOnClickListener {
            interaction_ans1 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 2 第二題 ↓↓
        radioButton6.setOnClickListener {
            interaction_ans2 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7.setOnClickListener {
            interaction_ans2 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8.setOnClickListener {
            interaction_ans2 = 3
            Toast.makeText(this@child_interaction, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9.setOnClickListener {
            interaction_ans2 = 4
            Toast.makeText(this@child_interaction, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10.setOnClickListener {
            interaction_ans2 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 3 第三題 ↓↓
        radioButton11.setOnClickListener {
            interaction_ans3 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12.setOnClickListener {
            interaction_ans3 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13.setOnClickListener {
            interaction_ans3 = 3
            Toast.makeText(this@child_interaction, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14.setOnClickListener {
            interaction_ans3 = 4
            Toast.makeText(this@child_interaction, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15.setOnClickListener {
            interaction_ans3 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 4 第四題 ↓↓
        radioButton16.setOnClickListener {
            interaction_ans4 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17.setOnClickListener {
            interaction_ans4 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18.setOnClickListener {
            interaction_ans4 = 3
            Toast.makeText(this@child_interaction, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19.setOnClickListener {
            interaction_ans4 = 4
            Toast.makeText(this@child_interaction, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20.setOnClickListener {
            interaction_ans4 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 5 第五題 ↓↓
        radioButton21.setOnClickListener {
            interaction_ans5 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22_interaction.setOnClickListener {
            interaction_ans5 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23.setOnClickListener {
            interaction_ans5 = 3
            Toast.makeText(this@child_interaction, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23_emotions2.setOnClickListener {
            interaction_ans5 = 4
            Toast.makeText(this@child_interaction, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25.setOnClickListener {
            interaction_ans5 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 6 第六題
        radioButton26.setOnClickListener {
            interaction_ans6 = 1
            Toast.makeText(this@child_interaction, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton27.setOnClickListener {
            interaction_ans6 = 2
            Toast.makeText(this@child_interaction, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton28.setOnClickListener {
            interaction_ans6 = 3
            Toast.makeText(this@child_interaction, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton29.setOnClickListener {
            interaction_ans6 = 4
            Toast.makeText(this@child_interaction, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton30.setOnClickListener {
            interaction_ans6 = 5
            Toast.makeText(this@child_interaction, "從不這樣", Toast.LENGTH_SHORT).show()
        }

        cirRegisterButton.setOnClickListener {
            if (interaction_ans1 == 0 || interaction_ans2 == 0 || interaction_ans3 == 0 ||
                interaction_ans4 == 0 || interaction_ans5 == 0 || interaction_ans6 == 0)
            {
                // TEST OK [TIME : 04/30 14:04]
                AlertDialog.Builder(this)
                    .setMessage("請將題目填完再點選送出")
                    .setTitle("有題目尚未填寫")
                    .setPositiveButton("OK", null)
                    .show()



            }else
            {
                // 測試
                // TEST OK [04/30 14:36]
                // TEST OK [05/07 14:10]
                // TEST OK [05/07 14:25]
                // TEST OK [05/07 15:55]

                /*
                var bundle = Bundle()
                bundle.putInt("interaction_ans1",interaction_ans1)
                bundle.putInt("interaction_ans2",interaction_ans2)
                bundle.putInt("interaction_ans3",interaction_ans3)
                bundle.putInt("interaction_ans4",interaction_ans4)
                bundle.putInt("interaction_ans5",interaction_ans5)
                bundle.putInt("interaction_ans6",interaction_ans6)
                var intent = Intent(this@child_interaction,for_test::class.java)
                intent.putExtra("bundle",bundle)
                startActivity(intent)

                 */





                Toast.makeText(this, "完成", Toast.LENGTH_SHORT).show()
                var intent = Intent(this@child_interaction,main::class.java)
                startActivity(intent)

            }

        }

    }

    fun onLoginClick(view: View) {
        finish()
    }
}