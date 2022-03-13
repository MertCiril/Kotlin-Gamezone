package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlin.concurrent.timer

class KelimeOyunuSon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu_son)
        Handler().postDelayed({
            val intent = Intent(this, MenuScreen::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
    }