package com.ismailturk.gamezone



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu2.*
import kotlinx.android.synthetic.main.activity_kelime_oyunu3.*

class KelimeOyunu3 : AppCompatActivity(),IKelimeOyunuManager {
    var flag=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu3)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }
    override fun harfGoster(view: View) {


        when {

            harfGirEditText3.text.toString().toUpperCase() == "A" && a1TextView3.text != "A" -> {
                a1TextView3.text = "A"
                a2TextView3.text = "A"
                a3TextView3.text = "A"
                flag = flag + 1
            }
            harfGirEditText3.text.toString().toUpperCase() == "K" && k1TextView3.text != "K" -> {
                k1TextView3.text="K"
                k2TextView3.text="K"
                k3TextView3.text="K"
                k4TextView3.text="K"
                k5TextView3.text="K"
                k6TextView3.text="K"
                flag = flag + 1
            }
            harfGirEditText3.text.toString().toUpperCase() == "L" && l1TextView3.text != "L" -> {
                l1TextView3.text="L"
                l2TextView3.text="L"
                l3TextView3.text="L"
                l4TextView3.text="L"
                flag = flag + 1
            }
            harfGirEditText3.text.toString().toUpperCase() == "I" && ii1TextView3.text != "I" ->{
                ii1TextView3.text="I"
                flag = flag + 1
            }
            harfGirEditText3.text.toString().toUpperCase() == "U" && u1TextView3.text != "U" ->{
                u1TextView3.text="U"
                flag = flag + 1
            }
        }
        if(flag==5){
            Toast.makeText(this@KelimeOyunu3,"Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this,KelimeOyunu4::class.java)
            startActivity(intent)
        }
    }
}