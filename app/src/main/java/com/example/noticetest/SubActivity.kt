package com.example.noticetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
    fun onBackButtonClick(v:View){
        finish()
    }

}
