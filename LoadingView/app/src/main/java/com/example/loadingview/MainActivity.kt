package com.example.loadingview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loading_view.beginAnim()
        loading_view.setOnClickListener {
            val bm =it as BMLoadingView
            bm.pauseAnim()
        }
    }
}
