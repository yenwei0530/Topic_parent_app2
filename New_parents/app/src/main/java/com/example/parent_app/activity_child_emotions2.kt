package com.example.parent_app

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_child_emotions2.*

class activity_child_emotions2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_emotions2)
        // Page 1
        /*
        var get_emotions_ans1 = intent.getBundleExtra("bundle")?.getInt("emotions_ans1").toString()
        var get_emotions_ans2 = intent.getBundleExtra("bundle")?.getInt("emotions_ans2").toString()
        var get_emotions_ans3 = intent.getBundleExtra("bundle")?.getInt("emotions_ans3").toString()
        var get_emotions_ans4 = intent.getBundleExtra("bundle")?.getInt("emotions_ans4").toString()
        var get_emotions_ans5 = intent.getBundleExtra("bundle")?.getInt("emotions_ans5").toString()


         */
        /*
        var emotions_ans1 = get_emotions_ans1.toInt()
        var emotions_ans2 = get_emotions_ans2.toInt()
        var emotions_ans3 = get_emotions_ans3.toInt()
        var emotions_ans4 = get_emotions_ans4.toInt()
        var emotions_ans5 = get_emotions_ans5.toInt()
         */
        //Toast.makeText(this, emotions_ans1 + emotions_ans2 + emotions_ans3 + emotions_ans4 + emotions_ans5, Toast.LENGTH_SHORT).show()








        //Toast.makeText(this, get_emotions_ans1 + get_emotions_ans2 + get_emotions_ans3 + get_emotions_ans4 + get_emotions_ans5, Toast.LENGTH_SHORT).show()

        //
        var emotions_ans6 = 0
        var emotions_ans7 = 0
        var emotions_ans8 = 0
        var emotions_ans9 = 0
        var emotions_ans10 = 0
        var emotions_ans11 = 0
        var emotions_ans12 = 0
        var emotions_ans13 = 0


        // radiogroup 6 第六題 ↓↓
        radioButton1_emotions2.setOnClickListener {
            emotions_ans6 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton2_emotions2.setOnClickListener {
            emotions_ans6 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton3_emotions2.setOnClickListener {
            emotions_ans6 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton4_emotions2.setOnClickListener {
            emotions_ans6 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton5_emotions2.setOnClickListener {
            emotions_ans6 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 7 第七題 ↓↓
        radioButton6_emotions2.setOnClickListener {
            emotions_ans7 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton7_emotions2.setOnClickListener {
            emotions_ans7 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton8_emotions2.setOnClickListener {
            emotions_ans7 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton9_emotions2.setOnClickListener {
            emotions_ans7 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton10_emotions2.setOnClickListener {
            emotions_ans7 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 8 第八題 ↓↓
        radioButton11_emotions2.setOnClickListener {
            emotions_ans8 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton12_emotions2.setOnClickListener {
            emotions_ans8 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton13_emotions2.setOnClickListener {
            emotions_ans8 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton14_emotions2.setOnClickListener {
            emotions_ans8 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton15_emotions2.setOnClickListener {
            emotions_ans8 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 9 第九題 ↓↓
        radioButton16_emotions2.setOnClickListener {
            emotions_ans9 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton17_emotions2.setOnClickListener {
            emotions_ans9 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton18_emotions2.setOnClickListener {
            emotions_ans9 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton19_emotions2.setOnClickListener {
            emotions_ans9 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton20_emotions2.setOnClickListener {
            emotions_ans9 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 10 第十題 ↓↓
        radioButton21_emotions2.setOnClickListener {
            emotions_ans10 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton22_emotions2.setOnClickListener {
            emotions_ans10 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton23_emotions2.setOnClickListener {
            emotions_ans10 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton24_emotions2.setOnClickListener {
            emotions_ans10 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton25_emotions2.setOnClickListener {
            emotions_ans10 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 11 第十一題 ↓↓
        radioButton26_emotions2.setOnClickListener {
            emotions_ans11 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton27_emotions2.setOnClickListener {
            emotions_ans11 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton28_emotions2.setOnClickListener {
            emotions_ans11 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton29_emotions2.setOnClickListener {
            emotions_ans11 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton30_emotions2.setOnClickListener {
            emotions_ans11 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 12 第十二題 ↓↓
        radioButton31_emotions2.setOnClickListener {
            emotions_ans12 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton32_emotions2.setOnClickListener {
            emotions_ans12 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton33_emotions2.setOnClickListener {
            emotions_ans12 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton34_emotions2.setOnClickListener {
            emotions_ans12 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton35_emotions2.setOnClickListener {
            emotions_ans12 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }
        // radiogroup 13 第十三題 ↓↓
        radioButton36_emotions2.setOnClickListener {
            emotions_ans13 = 1
            Toast.makeText(this@activity_child_emotions2, "總是這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton37_emotions2.setOnClickListener {
            emotions_ans13 = 2
            Toast.makeText(this@activity_child_emotions2, "經常這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton38_emotions2.setOnClickListener {
            emotions_ans13 = 3
            Toast.makeText(this@activity_child_emotions2, "有時這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton39_emotions2.setOnClickListener {
            emotions_ans13 = 4
            Toast.makeText(this@activity_child_emotions2, "很少這樣", Toast.LENGTH_SHORT).show()
        }
        radioButton40_emotions2.setOnClickListener {
            emotions_ans13 = 5
            Toast.makeText(this@activity_child_emotions2, "從不這樣", Toast.LENGTH_SHORT).show()
        }



        cirRegisterButton2.setOnClickListener {
            if (emotions_ans6 == 0 || emotions_ans7 == 0 || emotions_ans8 == 0 || emotions_ans9 == 0 || emotions_ans10 == 0 ||
                emotions_ans11 == 0 || emotions_ans12 ==0 || emotions_ans13 == 0 )
            {
                AlertDialog.Builder(this)
                    .setMessage("請將題目填完再點選NEXT")
                    .setTitle("有題目尚未填寫")
                    .setPositiveButton("OK", null)
                    .show()
            }else
            {
                /*
                var bundle = Bundle()
                bundle.putInt("emotions_ans1",get_emotions_ans1.toInt())
                bundle.putInt("emotions_ans2",get_emotions_ans2.toInt())
                bundle.putInt("emotions_ans3",get_emotions_ans3.toInt())
                bundle.putInt("emotions_ans4",get_emotions_ans4.toInt())
                bundle.putInt("emotions_ans5",get_emotions_ans5.toInt())

                bundle.putInt("emotions_ans6",emotions_ans6)
                bundle.putInt("emotions_ans7",emotions_ans7)
                bundle.putInt("emotions_ans8",emotions_ans8)
                bundle.putInt("emotions_ans9",emotions_ans9)
                bundle.putInt("emotions_ans10",emotions_ans10)
                bundle.putInt("emotions_ans11",emotions_ans11)
                bundle.putInt("emotions_ans12",emotions_ans12)
                bundle.putInt("emotions_ans13",emotions_ans13)
                var intent = Intent(this@activity_child_emotions2,activity_child_emotions3::class.java)
                intent.putExtra("bundle",bundle)
                startActivity(intent)

                 */
                var intent = Intent(this@activity_child_emotions2,activity_child_emotions3::class.java)
                startActivity(intent)
            }


        }
    }


    fun onLoginClick(view: View) {
        finish()
    }

}