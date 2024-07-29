package com.avinash.materialdesign

import android.R
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.activity.ComponentActivity
import com.avinash.materialdesign.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        val scaleAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.fade_in)
        activityMainBinding.firstButton.setOnClickListener {
            it.startAnimation(scaleAnimation)
        }

        setContentView(activityMainBinding.root)
    }
}