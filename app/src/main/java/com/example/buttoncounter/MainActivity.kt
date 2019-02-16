package com.example.buttoncounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewDebug
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var button : Button
    lateinit var counter : TextView
    var count = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialisation()

button.setOnClickListener {
    buttonClick()
}

    }

    private fun initialisation () {
        button = findViewById(R.id.button)
        counter = findViewById(R.id.counter)
    }

    fun buttonClick () {
count ++
        val scount = count.toString()

        counter.text = scount


    }
}
