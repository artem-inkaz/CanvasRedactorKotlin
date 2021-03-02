package com.example.canvasredactorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catCanvasView = CanvasView(this)
        catCanvasView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        setContentView(catCanvasView)
    }
}