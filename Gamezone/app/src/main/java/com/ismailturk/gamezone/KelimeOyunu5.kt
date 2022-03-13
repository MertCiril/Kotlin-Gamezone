package com.ismailturk.gamezone


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu4.*
import kotlinx.android.synthetic.main.activity_kelime_oyunu5.*

class KelimeOyunu5 : AppCompatActivity(),IKelimeOyunuManager {
    var flag = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu5)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }

    override fun harfGoster(view: View) {
        when {

            harfGirEditText5.text.toString().toUpperCase() == "A" && a1TextView5.text != "A" -> {
                a1TextView5.text = "A"
                a2TextView5.text = "A"
                a3TextView5.text = "A"
                flag = flag + 1
            }
            harfGirEditText5.text.toString().toUpperCase() == "L" && l1TextView5.text != "L" -> {
                l1TextView5.text = "L"
                l2TextView5.text = "L"
                flag = flag + 1
            }
            harfGirEditText5.text.toString().toUpperCase() == "E" && e1TextView5.text != "E" -> {
                e1TextView5.text = "E"
                e2TextView5.text = "E"
                e3TextView5.text = "E"
                flag = flag + 1
            }
            harfGirEditText5.text.toString().toUpperCase() == "S" && s1TextView5.text != "S" -> {
                s1TextView5.text = "S"
                flag = flag + 1
            }
            harfGirEditText5.text.toString().toUpperCase() == "M" && m1TextView5.text != "M" -> {
                m1TextView5.text = "M"
                m2TextView5.text = "M"
                m3TextView5.text = "M"
                flag = flag + 1
            }
        }

        if (flag == 5) {
            Toast.makeText(this@KelimeOyunu5, "Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this, KelimeOyunu6::class.java)
            startActivity(intent)
        }
    }
}



