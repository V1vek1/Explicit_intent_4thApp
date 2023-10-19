package com.example.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//Yha per ye likha huaa h ki, ek Class h jiska name h "SecondActivity" jo ki "AppCompactActivity" ko call
//kar ha h phir hum "onCreate function ko override kar rhe h ek bundle ko
//or yeh "SecondActivity.kt" file Design File (activity_second.xml) file se Linked h

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}