package com.github.kotlin_studio.main_activity_and_fragment1_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Postman {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun fragmentMail(numberOfClicks: Int) {
        val message = "Сколько раз была нажата кнопка? $numberOfClicks!"
        this.textReport.text = message
    }
}
