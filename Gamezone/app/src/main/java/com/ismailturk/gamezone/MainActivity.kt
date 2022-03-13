package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun girisbtn(view: View){
        val intent= Intent(applicationContext,GirisActivity::class.java)
        startActivity(intent)
    }

    fun kayitolbtn(view: View){
        val intent= Intent(applicationContext,KayitActivity::class.java)
        startActivity(intent)

    }
}