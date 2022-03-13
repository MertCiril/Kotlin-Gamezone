package com.ismailturk.gamezone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_zar_atmaca.*
import kotlin.random.Random

class ZarAtmaca : AppCompatActivity() {
    lateinit var zarImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zar_atmaca)

      /*  val zarAt: Button =findViewById(R.id.zarAtButton)
        zarAt.setOnClickListener {
            zarAt() //fonksiyonumuzu cağirdik
        }*/
        zarAt1.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==1){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }
        zarAt2.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==2){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }
        zarAt3.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==3){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }
        zarAt4.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==4){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }
        zarAt5.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==5){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }
        zarAt6.setOnClickListener {
            val randomInt= Random.nextInt(6)+1
            val drawableResource= when(randomInt){

                1->R.drawable.zar1
                2->R.drawable.zar2
                3->R.drawable.zar3
                4->R.drawable.zar4
                5->R.drawable.zar5
                else->R.drawable.zar6
            }
            zarImage.setImageResource(drawableResource)
            if(randomInt==6){
                Toast.makeText(this@ZarAtmaca,"BİLDİNİZ!", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this@ZarAtmaca,"BİLEMEDİNİZ!", Toast.LENGTH_SHORT).show()
        }











        zarImage=findViewById(R.id.zarImage)

    }





    fun zarAt(){

        val randomInt= Random.nextInt(6)+1
        val drawableResource= when(randomInt){

            1->R.drawable.zar1
            2->R.drawable.zar2
            3->R.drawable.zar3
            4->R.drawable.zar4
            5->R.drawable.zar5
            else->R.drawable.zar6
        }
        zarImage.setImageResource(drawableResource)


    }
}