package com.ismailturk.gamezone



import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ismailturk.gamezone.ImageViewScrolling.IEventEnd


import kotlinx.android.synthetic.main.activity_slot_makinesi.*
import kotlin.random.Random

class SlotMakinesi : AppCompatActivity(), IEventEnd {


    override fun eventEnd(result: Int, count: Int)
    {
        if (count_down<2)
        {
            count_down++
        }
        else
        {
            down.visibility=View.GONE
            up.visibility=View.VISIBLE
            count_down=0
            if(image.value == image2.value && image2.value==image3.value)
            {
                Toast.makeText(this,"Buyuk odulu kazandiniz",Toast.LENGTH_SHORT ).show()
            }
            else if (image.value == image2.value || image2.value== image3.value || image.value == image3.value)
            {
                Toast.makeText(this,"Kucuk odul kazandiniz",Toast.LENGTH_SHORT ).show()
            }
            else
            {
                Toast.makeText(this,"Kaybettiniz",Toast.LENGTH_SHORT ).show()
            }
        }
    }
    internal var count_down=0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slot_makinesi)

        requestedOrientation=ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        image.setEventEnd(this@SlotMakinesi)
        image2.setEventEnd(this@SlotMakinesi)
        image3.setEventEnd(this@SlotMakinesi)

        up.setOnClickListener {

            up.visibility=View.GONE
            down.visibility=View.VISIBLE

            image.setValueRandom(Random.nextInt(6),
                    Random.nextInt(15-5+1)+5)
            image2.setValueRandom(Random.nextInt(6),
                    Random.nextInt(15-5+1)+5)
            image3.setValueRandom(Random.nextInt(6),
                    Random.nextInt(15-5+1)+5)

        }
    }


}