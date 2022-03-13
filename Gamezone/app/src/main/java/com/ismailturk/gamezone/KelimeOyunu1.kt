package com.ismailturk.gamezone



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu1.*

open class KelimeOyunu1 : AppCompatActivity(),IKelimeOyunuManager {
    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu1)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }

    override fun harfGoster(view: View) {


        when {

            harfGirEditText.text.toString().toUpperCase() == "A" && aTextView1.text != "A" -> {
                aTextView1.text = "A"
                aTextView2.text = "A"
                aTextView3.text = "A"
                flag = flag + 1
            }
            harfGirEditText.text.toString().toUpperCase() == "L" && lTextView1.text != "L" -> {
                lTextView1.text = "L"
                lTextView2.text = "L"
                lTextView3.text = "L"
                flag = flag + 1
            }
            harfGirEditText.text.toString().toUpperCase() == "K" && kTextView1.text != "K" -> {
                kTextView1.text = "K"
                flag = flag + 1
            }
            harfGirEditText.text.toString().toUpperCase() == "E" && eTextView1.text != "E" -> {
                eTextView1.text = "E"
                eTextView2.text = "E"
                flag = flag + 1
            }
            harfGirEditText.text.toString().toUpperCase() == "M" && mTextView1.text != "M" -> {
                mTextView1.text = "M"
                mTextView2.text = "M"
                flag = flag + 1
            }


        }
        if(flag==5){

            Toast.makeText(this@KelimeOyunu1,"Tebrikler Geçtiniz",Toast.LENGTH_LONG).show()
            kontrol1.text="1"
            val intent = Intent(this,KelimeOyunu2::class.java)
            startActivity(intent)
        }
    }




}
