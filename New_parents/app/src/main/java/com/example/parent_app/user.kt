package com.example.parent_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_user.*

class user : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        //SPINNER用變數宣告-----------↓↓↓-----------//
        var ques1ans = 0
        var ques2ans = 0
        var ques3ans = 0
        var ques4ans = 0
        var ques4_1ans = 0
        var ques5ans = 0
        var ques6ans = 0
        var ques7ans = 0
        var ques8ans = 0
        //SPINNER用變數宣告-----------↑↑↑-----------//

        //-----------------------------------↓-SPINNER-↓-------------------------------------//
        //---------------------------Spinner 1 ↓
            val ques1 = arrayListOf("生父","生母","繼父","繼母","爺爺或外公","奶奶或外婆","其他(請說明___)")
            val adapter1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques1)
            spinner1.adapter = adapter1
            spinner1.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    Toast.makeText(this@user, "您與孩子的關係: " + ques1[position] , Toast.LENGTH_SHORT).show()
                    if (spinner1.getSelectedItem().toString() == "生父"){
                        ques1ans = 1
                    }else if (spinner1.getSelectedItem().toString() == "生母")
                    {
                        ques1ans = 2
                    }else if (spinner1.getSelectedItem().toString() == "繼父")
                    {
                        ques1ans = 3
                    }else if (spinner1.getSelectedItem().toString() == "繼母")
                    {
                        ques1ans = 4
                    }else if (spinner1.getSelectedItem().toString() == "爺爺或外公")
                    {
                        ques1ans = 5
                    }else if (spinner1.getSelectedItem().toString() == "奶奶或外婆")
                    {
                        ques1ans = 6
                    }else if (spinner1.getSelectedItem().toString() == "其他(請說明___)")
                    {
                        ques1ans = 7
                    }
                    Toast.makeText(this@user, ques1ans.toString(), Toast.LENGTH_SHORT).show()
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
                }
        }
        //---------------------------Spinner 2 ↓
        val ques2 = arrayListOf("一直如此","曾經有但現在沒有(同住多久?___年)")
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques2)
        spinner2.adapter = adapter2
        spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "是否與孩子同住: " + ques2[position], Toast.LENGTH_SHORT).show()
                if (spinner2.getSelectedItem().toString() == "一直如此") {
                    ques2ans = 1
                } else
                {
                    ques2ans = 2
                }
                Toast.makeText(this@user, ques2ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 3 ↓
        val ques3 = arrayListOf("父母雙親","父親","母親","爺爺或外公","奶奶或外婆","其他(請說明___)")
        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques3)
        spinner3.adapter = adapter3
        spinner3.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "平常孩子在家由誰照顧和管教? " + ques3[position] , Toast.LENGTH_SHORT).show()
                if (spinner3.getSelectedItem().toString() == "父母雙親"){
                    ques3ans = 1
                }else if (spinner3.getSelectedItem().toString() == "父親")
                {
                    ques3ans = 2
                }else if (spinner3.getSelectedItem().toString() == "母親")
                {
                    ques3ans = 3
                }else if (spinner3.getSelectedItem().toString() == "爺爺或外公")
                {
                    ques3ans = 4
                }else if (spinner3.getSelectedItem().toString() == "奶奶或外婆")
                {
                    ques3ans = 5
                }else if (spinner3.getSelectedItem().toString() == "其他(請說明___)")
                {
                    ques3ans = 6
                }
                Toast.makeText(this@user, ques3ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 4 ↓
        val ques4 = arrayListOf("第一","第二","第三","第四","第五")
        val adapter4 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques4)
        spinner4.adapter = adapter4
        spinner4.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "該位孩子在家中排行: " + ques4[position] , Toast.LENGTH_SHORT).show()
                if (spinner4.getSelectedItem().toString() == "第一"){
                    ques4ans = 1
                }else if (spinner4.getSelectedItem().toString() == "第二")
                {
                    ques4ans = 2
                }else if (spinner4.getSelectedItem().toString() == "第三")
                {
                    ques4ans = 3
                }else if (spinner4.getSelectedItem().toString() == "第四")
                {
                    ques4ans = 4
                }else if (spinner4.getSelectedItem().toString() == "第五")
                {
                    ques4ans = 5
                }
                Toast.makeText(this@user, ques4ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 4_1 ↓
        val ques4_1 = arrayListOf("1","2","3","4","5")
        val adapter4_1 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques4_1)
        spinner4_1.adapter = adapter4_1
        spinner4_1.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "兄弟姊妹人數: " + ques4_1[position] + "人", Toast.LENGTH_SHORT).show()
                if (spinner4_1.getSelectedItem().toString() == "1"){
                    ques4_1ans = 1
                }else if (spinner4_1.getSelectedItem().toString() == "2")
                {
                    ques4_1ans = 2
                }else if (spinner4_1.getSelectedItem().toString() == "3")
                {
                    ques4_1ans = 3
                }else if (spinner4_1.getSelectedItem().toString() == "4")
                {
                    ques4_1ans = 4
                }else if (spinner4_1.getSelectedItem().toString() == "5")
                {
                    ques4_1ans = 5
                }
                Toast.makeText(this@user, ques4_1ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 5 ↓


        //---------------------------Spinner 6 ↓
        val ques6 = arrayListOf("父母雙薪","父親","母親","其他(請說明)")
        val adapter6 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques6)
        spinner6.adapter = adapter6
        spinner6.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "家中經濟來源: " + ques6[position], Toast.LENGTH_SHORT).show()
                if (spinner6.getSelectedItem().toString() == "父母雙薪"){
                    ques6ans = 1
                }else if (spinner6.getSelectedItem().toString() == "父親")
                {
                    ques6ans = 2
                }else if (spinner6.getSelectedItem().toString() == "母親")
                {
                    ques6ans = 3
                }else if (spinner6.getSelectedItem().toString() == "其他(請說明)")
                {
                    ques6ans = 4
                }
                Toast.makeText(this@user, ques6ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 7 ↓
        val ques7 = arrayListOf("不識字","小學","中學","高中/高職","大學/專科","碩士","博士")
        val adapter7 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques7)
        spinner7.adapter = adapter7
        spinner7.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "父親教育程度: " + ques7[position], Toast.LENGTH_SHORT).show()
                if (spinner7.getSelectedItem().toString() == "不識字"){
                    ques7ans = 1
                }else if (spinner7.getSelectedItem().toString() == "小學")
                {
                    ques7ans = 2
                }else if (spinner7.getSelectedItem().toString() == "中學")
                {
                    ques7ans = 3
                }else if (spinner7.getSelectedItem().toString() == "高中/高職")
                {
                    ques7ans = 4
                }else if (spinner7.getSelectedItem().toString() == "大學/專科")
                {
                    ques7ans = 5
                }else if (spinner7.getSelectedItem().toString() == "碩士")
                {
                    ques7ans = 6
                }else if (spinner7.getSelectedItem().toString() == "博士")
                {
                    ques7ans = 7
                }

                Toast.makeText(this@user, ques7ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //---------------------------Spinner 7 ↓
        val ques8 = arrayListOf("不識字","小學","中學","高中/高職","大學/專科","碩士","博士")
        val adapter8 = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ques8)
        spinner8.adapter = adapter8
        spinner8.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@user, "母親教育程度: " + ques8[position], Toast.LENGTH_SHORT).show()
                if (spinner8.getSelectedItem().toString() == "不識字"){
                    ques8ans = 1
                }else if (spinner8.getSelectedItem().toString() == "小學")
                {
                    ques8ans = 2
                }else if (spinner8.getSelectedItem().toString() == "中學")
                {
                    ques8ans = 3
                }else if (spinner8.getSelectedItem().toString() == "高中/高職")
                {
                    ques8ans = 4
                }else if (spinner8.getSelectedItem().toString() == "大學/專科")
                {
                    ques8ans = 5
                }else if (spinner8.getSelectedItem().toString() == "碩士")
                {
                    ques8ans = 6
                }else if (spinner8.getSelectedItem().toString() == "博士")
                {
                    ques8ans = 7
                }

                Toast.makeText(this@user, ques8ans.toString(), Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@user, "你沒選擇" , Toast.LENGTH_SHORT).show()
            }
        }
        //-----------------------------------↑-SPINNER-↑-------------------------------------//
        //-----------------------------------↓-送資料庫-↓------------------------------------//

        //------------------------------------------------------------------------------------//
        imageView10.setOnClickListener {
            startActivity(Intent(this,main::class.java))
        }

        cirRegisterButton.setOnClickListener {
            finish()
        }

        }

    fun onLoginClick(view: View) {
        startActivity(Intent(this,main::class.java))
    }

    }