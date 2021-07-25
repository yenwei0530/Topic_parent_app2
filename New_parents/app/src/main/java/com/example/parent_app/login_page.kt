package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_page.*
import java.util.*


class login_page : AppCompatActivity() {


    private val DB_NAME = "treatment.db"
    private val TABLE_NAME = "parent"
    private val DB_VERSION = 1
    var mDBHelper: SQLiteDataBaseHelper? = null

    var arrayList = ArrayList<HashMap<String, String>>() //取得所有資料

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        mDBHelper = SQLiteDataBaseHelper(this, DB_NAME, null, DB_VERSION, TABLE_NAME) //初始化資料庫
        val con = MysqlCon()

        Thread {
            con.run()
            Log.v("OK", "LOGIN con ok")
            /*val data= con.getData("select * from `parent` where `parent_id`='p001' and `password`='p001'")
            if(data==0){
                Log.v("OK", "帳密錯誤")
            }else{
                Log.v("OK", "登入成功")
            }*/
        }.start()


        //建立共用變數類別
        val gv: GlobalVariable = applicationContext as GlobalVariable

        //宣告Button物件
        val login = findViewById<TextView>(R.id.login)

        //宣告EditText物件
        val UserId = findViewById<EditText>(R.id.username_input)
        val Password = findViewById<EditText>(R.id.pass)

        login.setOnClickListener {
            if(username_input.text.toString() == ""){
                Toast.makeText(this, "帳號未輸入!!", Toast.LENGTH_SHORT).show()
            }else if(pass.text.toString() == ""){
                Toast.makeText(this, "密碼未輸入!!", Toast.LENGTH_SHORT).show()
            }else{
                val toast=Toast.makeText(this,"帳密錯誤!!", Toast.LENGTH_SHORT)
                Thread {
                    val sql="select * from `parent` where `parent_id`='"+username_input.text.toString()+"' and `password`='"+pass.text.toString()+"'"
                    Log.v("test", sql)
                    val data= con.getData(sql)
                    if(data==0){
                        //Log.v("OK", "帳密錯誤")
                        toast.show()
                    }else{
                        val intent = Intent(this@login_page, main::class.java)
                        startActivity(intent)
                    }
                }.start()


            }

    /*
                if (mDBHelper!!.checkparent(
                        UserId.text.toString(),
                        Password.text.toString()
                    ) == "T"
                ) {

                    gv.setuser(UserId.text.toString())
                    gv.setpassword(Password.text.toString())
                    arrayList = mDBHelper!!.parent(UserId.text.toString())
                    gv.setname(arrayList[0]["name"])

                    Log.v("LOGIN", "T")
                    val intent = Intent(this@login_page, main::class.java)
                    startActivity(intent)
                } else
                    Log.e("LOGIN", "F" + "/" + UserId.text + "/" + Password.text)
                    Toast.makeText(this@login_page, "帳號密碼錯誤!!!", Toast.LENGTH_LONG).show()
     */
        }
    }
}
