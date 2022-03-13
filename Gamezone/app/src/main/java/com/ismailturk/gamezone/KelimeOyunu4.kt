package com.ismailturk.gamezone



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu3.*
import kotlinx.android.synthetic.main.activity_kelime_oyunu4.*

class KelimeOyunu4 : AppCompatActivity(),IKelimeOyunuManager {
    var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu4)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }

    override fun harfGoster(view: View) {
        when {

            harfGirEditText4.text.toString().toUpperCase() == "A" && a1TextView4.text != "A" -> {
                a1TextView4.text = "A"
                a2TextView4.text = "A"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "K" && k1TextView4.text != "K" -> {
                k1TextView4.text="K"
                k2TextView4.text="K"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "E" && e1TextView4.text != "E" ->{
                e1TextView4.text="E"
                e2TextView4.text="E"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "L" && l1TextView4.text != "L" ->{
                l1TextView4.text="L"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "S" && s1TextView4.text != "S" ->{
                s1TextView4.text="S"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "F" && f1TextView4.text != "F" ->{
                f1TextView4.text="F"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "V" && v1TextView4.text != "V" ->{
                v1TextView4.text="V"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "R" && r1TextView4.text != "R" ->{
                r1TextView4.text="R"
                flag = flag + 1
            }
            harfGirEditText4.text.toString().toUpperCase() == "Y" && y1TextView4.text != "Y" ->{
                y1TextView4.text="Y"
                flag = flag + 1
            }
        }
        if(flag==9){
            Toast.makeText(this@KelimeOyunu4,"Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this,KelimeOyunu5::class.java)
            startActivity(intent)
        }
    }
}