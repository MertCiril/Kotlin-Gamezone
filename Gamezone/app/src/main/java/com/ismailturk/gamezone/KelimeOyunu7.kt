package com.ismailturk.gamezone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu6.*

import kotlinx.android.synthetic.main.activity_kelime_oyunu7.*

class KelimeOyunu7 : AppCompatActivity(),IKelimeOyunuManager {
    var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu7)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }

    override fun harfGoster(view: View) {
        when {

            harfGirEditText7.text.toString().toUpperCase() == "K" && k1TextView7.text != "K" -> {
                k1TextView7.text="K"
                k2TextView7.text="K"
                k3TextView7.text="K"
                flag = flag + 1
            }
            harfGirEditText7.text.toString().toUpperCase() == "İ" && i1TextView7.text != "İ" -> {
                i1TextView7.text="İ"
                i2TextView7.text="İ"
                i3TextView7.text="İ"
                flag = flag + 1
            }
            harfGirEditText7.text.toString().toUpperCase() == "P" && p1TextView7.text != "P" ->{
                p1TextView7.text="P"
                p2TextView7.text="P"
                flag = flag + 1
            }
            harfGirEditText7.text.toString().toUpperCase() == "A" && a1TextView7.text != "A" -> {
                a1TextView7.text = "A"
                a2TextView7.text = "A"
                flag = flag + 1
            }

            harfGirEditText7.text.toString().toUpperCase() == "T" && t1TextView7.text != "T" -> {
                t1TextView7.text = "T"
                t2TextView7.text = "T"
                t3TextView7.text = "T"
                flag = flag + 1
            }
        }

        if (flag == 5) {
            Toast.makeText(this@KelimeOyunu7, "Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this, KelimeOyunuSon::class.java)
            startActivity(intent)
        }
    }
}