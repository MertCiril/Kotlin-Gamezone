package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kelime_oyunu1.*
import kotlinx.android.synthetic.main.activity_menu_screen.*

class MenuScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_screen)

        cikisTextView.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        kelimeOyunuTextView.setOnClickListener{
            val intent = Intent(applicationContext, KelimeOyunu1::class.java)
            startActivity(intent)

        }
        tasKagitMakasTextView.setOnClickListener {
            val intent = Intent(applicationContext, TasKagitMakas::class.java)
            startActivity(intent)
        }
        zarAtmacaTextView.setOnClickListener {
            val intent = Intent(applicationContext, ZarAtmaca::class.java)
            startActivity(intent)
        }
        slotMakinesi.setOnClickListener {
            val intent = Intent(applicationContext, SlotMakinesi::class.java)
            startActivity(intent)
        }
        filmgramTextView.setOnClickListener {
            val intent = Intent(applicationContext, CoinKapmaca::class.java)
            startActivity(intent)
        }


    }
}