package com.test.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//maciej zdrojewski
class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val check = findViewById<Button>(R.id.button)
        val textm = findViewById<TextView>(R.id.matchT)
        val text = findViewById<TextView>(R.id.Cap)
        val textN = findViewById<TextView>(R.id.number)
        val textC = findViewById<TextView>(R.id.specialchar)
        val regexC = Regex(".*[A-Z].*")
        val regexChar = Regex(pattern = ".*[!@#$%^&*()_+].*")
        val regexNum = Regex(pattern = ".*[0-9].*")


        check.setOnClickListener {
            var pass1 = findViewById<EditText>(R.id.passinput).text.toString()
            var pass2 = findViewById<EditText>(R.id.passinput2).text.toString()

            if (regexC.matches(pass1)) {
                text.setTextColor(Color.parseColor("#59FF11"))
            }
            else{
                text.setTextColor(Color.parseColor("#FF0000"))
            }

            if (regexNum.matches(pass1)) {
                textN.setTextColor(Color.parseColor("#59FF11"))
            }
            else{
                textN.setTextColor(Color.parseColor("#FF0000"))
            }

            if (regexChar.matches(pass1)) {
                textC.setTextColor(Color.parseColor("#59FF11"))
            }
            else{
                textC.setTextColor(Color.parseColor("#FF0000"))
            }

            if(pass1==pass2){
                textm.setTextColor(Color.parseColor("#59FF11"))

            }
            else{
                textm.setTextColor(Color.parseColor("#FF0000"))
            }

        }


    }
}


