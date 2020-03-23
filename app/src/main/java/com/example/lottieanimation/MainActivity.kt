package com.example.lottieanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animation.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        Handler().postDelayed({
            animation.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splas_out))
            Handler().postDelayed({Intent(this,Main2Activity::class.java)
                animation.visibility=View.GONE
            }, 500)
        }, 3000)
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        Handler().postDelayed({
            textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splas_out))
            Handler().postDelayed({Intent(this,Main2Activity::class.java)
                animation.visibility=View.GONE
            }, 500)
        }, 3000)
        textView2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        Handler().postDelayed({
            textView2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splas_out))
            Handler().postDelayed({
                animation.visibility=View.GONE
                startActivity(Intent(this,Main2Activity::class.java))
            }, 500)
        }, 3000)

    }
}
