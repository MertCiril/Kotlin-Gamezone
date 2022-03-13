package com.ismailturk.gamezone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_coin_kapmaca.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoinKapmaca : AppCompatActivity() {
    var score = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_kapmaca)

        scoreTextView.text = "Skorunuz : 0"
        coin1.visibility = View.INVISIBLE
        coin2.visibility = View.INVISIBLE
        coin3.visibility = View.INVISIBLE
        coin4.visibility = View.INVISIBLE
        coin5.visibility = View.INVISIBLE
        coin6.visibility = View.INVISIBLE
        coin7.visibility = View.INVISIBLE
        coin8.visibility = View.INVISIBLE
        coin9.visibility = View.INVISIBLE

        object : CountDownTimer (10000000 , 2000) {
            override fun onFinish() {

            }

            override fun onTick(p0: Long) {
                var ran = (1..9).random()

                if (ran == 1)
                {
                    coin1.visibility = View.VISIBLE
                }

                else if (ran == 2)
                {
                    coin2.visibility = View.VISIBLE
                }

                else if (ran == 3)
                {
                    coin3.visibility = View.VISIBLE
                }

                else if (ran == 4)
                {
                    coin4.visibility = View.VISIBLE
                }

                else if (ran == 5)
                {
                    coin5.visibility = View.VISIBLE
                }

                else if (ran == 6)
                {
                    coin6.visibility = View.VISIBLE
                }

                else if (ran == 7)
                {
                    coin7.visibility = View.VISIBLE
                }

                else if (ran == 8)
                {
                    coin8.visibility = View.VISIBLE
                }

                else if (ran == 9)
                {
                    coin9.visibility = View.VISIBLE
                }

                //delay = bekleme
                GlobalScope.launch(context = Dispatchers.Main) {
                    delay(500)
                    coin1.visibility = View.INVISIBLE
                    coin2.visibility = View.INVISIBLE
                    coin3.visibility = View.INVISIBLE
                    coin4.visibility = View.INVISIBLE
                    coin5.visibility = View.INVISIBLE
                    coin6.visibility = View.INVISIBLE
                    coin7.visibility = View.INVISIBLE
                    coin8.visibility = View.INVISIBLE
                    coin9.visibility = View.INVISIBLE
                }



            }


        }.start()

    coin1.setOnClickListener {
        if (coin1.visibility == View.VISIBLE)
        {
            score++
            scoreTextView.text = "Skorunuz : ${score}"
        }
    }
        coin2.setOnClickListener {
            if (coin2.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin3.setOnClickListener {
            if (coin3.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin4.setOnClickListener {
            if (coin4.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin5.setOnClickListener {
            if (coin5.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin6.setOnClickListener {
            if (coin6.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin7.setOnClickListener {
            if (coin7.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin8.setOnClickListener {
            if (coin8.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
        coin9.setOnClickListener {
            if (coin9.visibility == View.VISIBLE)
            {
                score++
                scoreTextView.text = "Skorunuz : ${score}"
            }
        }
    }
}