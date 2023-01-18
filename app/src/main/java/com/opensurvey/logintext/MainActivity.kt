package com.opensurvey.logintext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBtn.setOnClickListener{

            val inputId = emailEdt.text.toString()
            val inputPass = passEdt.text.toString()

            if (inputId == "admin@test.com" && inputPass == "qwer") {

                val name = "태홍"

                Toast.makeText(this, "${name.toString()} 관리자입니다.", Toast.LENGTH_SHORT).show()
            }

            else  {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }



        }





    }
}