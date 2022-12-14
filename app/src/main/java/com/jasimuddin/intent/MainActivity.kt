package com.jasimuddin.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textViewName:TextView
    lateinit var editTextAge:EditText
    lateinit var buttonSend:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewName=findViewById(R.id.textViewName)
        editTextAge=findViewById(R.id.editTextAge)
        buttonSend=findViewById(R.id.buttonSend)

        buttonSend.setOnClickListener {

            val userName:String=textViewName.text.toString()
            val userAge:Int = editTextAge.text.toString().toInt()

            val intent=Intent(this@MainActivity,SecondActivity::class.java)

            intent.putExtra("username",userName)
            intent.putExtra("user_age",userAge)

            startActivity(intent)

        }


    }
}