package com.jasimuddin.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var result:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        result=findViewById(R.id.textView)

        var userName:String=intent.getStringExtra("username").toString()
        var userAge:Int=intent.getIntExtra("user_age",0)

        result.text="Your Selected name is $userName and age is $userAge"
    }
}