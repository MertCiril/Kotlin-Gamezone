package com.ismailturk.gamezone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kelime_oyunu1.*

open class KelimeOyunuManager: AppCompatActivity() {
  var asama =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        asamaSec()
    }
   open fun asamaSec(){
        if (kontrol1.text.equals("1")){
            val intent = Intent(this, KelimeOyunu1::class.java)
            startActivity(intent)
        }
        else {
            val intent = Intent(this, KelimeOyunu2::class.java)
            startActivity(intent)
        }
       /*else if (asama==3){
            val intent = Intent(this, KelimeOyunu3::class.java)
            startActivity(intent)
        }
        else  if (asama==4){
            val intent = Intent(this, KelimeOyunu4::class.java)
            startActivity(intent)
        }
        else if (asama==5){
            val intent = Intent(this, KelimeOyunu5::class.java)
            startActivity(intent)
        }
        else if (asama==6){
            val intent = Intent(this, KelimeOyunu6::class.java)
            startActivity(intent)
        }
        else if (asama==7){
            val intent = Intent(this, KelimeOyunu7::class.java)
            startActivity(intent)
        }*/
    }
}