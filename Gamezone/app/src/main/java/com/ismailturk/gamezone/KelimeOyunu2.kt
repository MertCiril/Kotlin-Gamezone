package com.ismailturk.gamezone



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kelime_oyunu1.*
import kotlinx.android.synthetic.main.activity_kelime_oyunu2.*

class KelimeOyunu2 :AppCompatActivity(), IKelimeOyunuManager{
    var flag=0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kelime_oyunu2)
    }
    override fun lobiGonder(view: View) {
        val intent = Intent(this, MenuScreen::class.java)
        startActivity(intent)
    }
    override fun harfGoster(view: View) {


        when {

            harfGirEditText2.text.toString().toUpperCase() == "A" && aaTextView1.text != "A" -> {
                aaTextView1.text = "A"
                aaTextView2.text = "A"
                aaTextView3.text = "A"
                aaTextView4.text = "A"

                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "İ" && iiTextView1.text != "İ" -> {
                iiTextView1.text="İ"
                iiTextView2.text="İ"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "R" && rrTextView1.text != "R" -> {
                rrTextView1.text="R"
                rrTextView2.text="R"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "L" && llTextView1.text != "L" -> {
                llTextView1.text="L"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "G" && ggTextView1.text != "G" -> {
                ggTextView1.text="G"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "S" && ssTextView1.text != "S" -> {
                ssTextView1.text="S"
                ssTextView2.text="S"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "Y" && yyTextView1.text != "Y" -> {
                yyTextView1.text="Y"
                yyTextView2.text="Y"
                flag = flag + 1
            }
            harfGirEditText2.text.toString().toUpperCase() == "B" && bbTextView1.text != "B" -> {
                bbTextView1.text="B"
                flag = flag + 1
            }


        }
        if(flag==8){
            Toast.makeText(this@KelimeOyunu2,"Tebrikler Geçtiniz", Toast.LENGTH_LONG).show()
            val intent = Intent(this,KelimeOyunu3::class.java)
            startActivity(intent)
        }
    }

}
