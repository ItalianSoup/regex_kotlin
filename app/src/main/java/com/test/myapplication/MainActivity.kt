package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var pass1 = findViewById<EditText>(R.id.passinput).toString()
    var pass2 = findViewById<EditText>(R.id.passinput2).toString()
    val check = findViewById<Button>(R.id.button)
    val text = findViewById<TextView>(R.id.textView)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        check.setOnClickListener {
            if(pass1==pass2){
                text.setText("match!")
        }

    }


    }
}


