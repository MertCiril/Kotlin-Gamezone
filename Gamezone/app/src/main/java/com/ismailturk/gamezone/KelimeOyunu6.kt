package com.ismailturk.gamezone


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu5.*
import kotlinx.android.synthetic.main.activity_kelime_oyunu6.*

class KelimeOyunu6 : AppCompatActivity(),IKelimeOyunuManager {
    var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu6)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }

    override fun harfGoster(view: View) {
        when {

            harfGirEditText6.text.toString().toUpperCase() == "K" && k1TextView6.text != "K" -> {
                k1TextView6.text="K"
                k2TextView6.text="K"
                k3TextView6.text="K"
                flag = flag + 1
            }
            harfGirEditText6.text.toString().toUpperCase() == "M" && m1TextView6.text != "M" -> {
                m1TextView6.text="M"
                m2TextView6.text="M"
                m3TextView6.text="M"
                flag = flag + 1
            }
            harfGirEditText6.text.toString().toUpperCase() == "E" && e1TextView6.text != "E" ->{
                e1TextView6.text = "E"
                e2TextView6.text = "E"
                e3TextView6.text = "E"
                e4TextView6.text = "E"
                flag = flag + 1
            }
            harfGirEditText6.text.toString().toUpperCase() == "R" && r1TextView6.text != "R" -> {
                r1TextView6.text = "R"
                flag = flag + 1
            }

        }

        if (flag == 4) {
            Toast.makeText(this@KelimeOyunu6, "Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this, KelimeOyunu7::class.java)
            startActivity(intent)
        }
    }
}