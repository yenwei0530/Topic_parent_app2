package com.example.parent_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_page.*

class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        }
    fun forgot(view: View)
    {

    }
    fun login(view: View) {
        if (username_input.text != null && username_input.length()>0)
        {
            if (pass.length() > 0) {
                startActivity(Intent(this, main::class.java))
            }
            else{
                Toast.makeText(this, "請輸入密碼", Toast.LENGTH_LONG).show()
            }
        }
        else if (username_input.text == null)
        {
            Toast.makeText(this, "請輸入帳號", Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(this, "請輸入帳號密碼", Toast.LENGTH_LONG).show()

        }
        //startActivity(Intent(this,main::class.java))
    }
}