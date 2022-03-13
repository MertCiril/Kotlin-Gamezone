package com.ismailturk.gamezone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tas_kagit_makas.*
import kotlin.random.Random

class TasKagitMakas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tas_kagit_makas)
        tasbutton.setOnClickListener {

            check("tas")
            youImageView.setImageResource(R.drawable.tas)
        }

        kagitbutton.setOnClickListener {

            check("kagit")
            youImageView.setImageResource(R.drawable.kagit)
        }
        makasbutton.setOnClickListener {

            check("makas")
            youImageView.setImageResource(R.drawable.makas)
        }


    }






    fun check(x:String) {
        var secim=""
        var randomNumber: Int = Random.nextInt(3)
        if (randomNumber == 0) {
            secim = "tas"
            computerImageView.setImageResource(R.drawable.tas)
        }
        if (randomNumber == 1) {
            secim = "kagit"
            computerImageView.setImageResource(R.drawable.kagit)
        }
        if (randomNumber == 2) {
            secim = "makas"
            computerImageView.setImageResource(R.drawable.makas)
        }

        if (secim.equals(x)) {  //equals ile yapıldı

            Toast.makeText(this@TasKagitMakas, "BERABERE!", Toast.LENGTH_SHORT).show()
        }
        if (secim == "tas" && x == "kagit") {
            Toast.makeText(this@TasKagitMakas, "KAZANDIN!", Toast.LENGTH_SHORT).show()

        }
        if (secim == "kagit" && x == "makas") {
            Toast.makeText(this@TasKagitMakas, "KAZANDIN!", Toast.LENGTH_SHORT).show()

        }
        if (secim == "makas" && x == "tas") {
            Toast.makeText(this@TasKagitMakas, "KAZANDIN!", Toast.LENGTH_SHORT).show()

        }
        if (secim == "tas" && x == "makas") {
            Toast.makeText(this@TasKagitMakas, "KAYBETTİN!", Toast.LENGTH_SHORT).show()

        }
        if (secim == "kagit" && x == "tas") {
            Toast.makeText(this@TasKagitMakas, "KAYBETTİN!", Toast.LENGTH_SHORT).show()

        }
        if (secim == "makas" && x == "kagit") {
            Toast.makeText(this@TasKagitMakas, "KAYBETTİN!", Toast.LENGTH_SHORT).show()


        }

    }
}