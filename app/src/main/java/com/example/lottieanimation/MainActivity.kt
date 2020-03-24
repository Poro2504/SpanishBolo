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

        Animation.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splash_in))
        Handler().postDelayed({
            Animation.startAnimation(AnimationUtils.loadAnimation(this, R.anim.splas_out))
            Handler().postDelayed({
                Animation.visibility=View.GONE
                startActivity(Intent(this,Main2Activity::class.java))
            }, 500)
        }, 3000)

    }
}
