package com.ismailturk.gamezone.ImageViewScrolling




import android.animation.Animator
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.Animation
import android.widget.FrameLayout
import android.widget.ImageView
import com.ismailturk.gamezone.R
import kotlinx.android.synthetic.main.activity_image_view_scrolling.view.*


class ImageViewScrolling:FrameLayout {
    internal lateinit var eventEnd: IEventEnd
    internal var last_result=0
    internal var oldValue=0
    companion object
    {
        private val ANIMATION_DURATION=150
    }

    val value:Int
        get() = Integer.parseInt(nextImage.tag.toString())
    fun setEventEnd(eventEnd:IEventEnd)
    {
        this.eventEnd=eventEnd
    }

    constructor(context:Context):super(context)
    {
        init(context)
    }
    constructor(context: Context,attrs:AttributeSet):super(context,attrs)
    {
        init(context)
    }

    private fun init(context: Context)
    {
        LayoutInflater.from(context).inflate(R.layout.activity_image_view_scrolling,this)
        nextImage.translationY=height.toFloat()
    }
    fun setValueRandom(image: Int, num_rotate: Int)
    {
        currentImage.animate()
            .translationY((-height).toFloat())
            .setDuration(ANIMATION_DURATION.toLong()).start()
        nextImage.translationY=nextImage.height.toFloat()
        nextImage.animate().translationY(0f).setDuration(ANIMATION_DURATION.toLong())
            .setListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(p0: Animator?)
                {

                }

                override fun onAnimationEnd(p0: Animator?)
                {
                    setImage(currentImage,oldValue%6)
                    currentImage.translationY=0f
                    if(oldValue != num_rotate) // if still have rotate
                    {
                        setValueRandom(image,num_rotate)
                        oldValue++;
                    }
                    else
                    {
                        last_result = 0
                        oldValue = 0
                        setImage(nextImage,image)
                        eventEnd.eventEnd(result = image%6,num_rotate)// become we have 6 images:
                    }
                }



                override fun onAnimationCancel(p0: Animator?)
                {

                }

                override fun onAnimationStart(p0: Animator?)
                {

                }
            }).start()
    }
    private fun setImage(img: ImageView?, value: Int)
    {
        if(value == Util.patateskizartmasi)
            img!!.setImageResource(R.drawable.patateskizartmasi)
        else if(value == Util.kulaklik)
            img!!.setImageResource(R.drawable.kulaklik)
        else if(value == Util.dunya)
            img!!.setImageResource(R.drawable.dunya)
        else if(value == Util.tac)
            img!!.setImageResource(R.drawable.kraltaci)
        else if(value == Util.hamburger)
            img!!.setImageResource(R.drawable.hamburger)
        else if(value == Util.soda)
            img!!.setImageResource(R.drawable.soda)

        img!!.tag = value
        last_result = value
    }
}
