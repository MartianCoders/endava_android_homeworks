package com.example.firstappendava

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val button_ok : Button = findViewById(R.id.button_ok)
        val button_cancelled : Button = findViewById(R.id.button_cancelled)


        val return_intent : Intent = Intent()

        button_ok.setOnClickListener {
            return_intent.putExtra("result", 100)
            setResult(1, return_intent)
            finish()
        }

        button_cancelled.setOnClickListener {
            return_intent.putExtra("result", button_cancelled.text)
            setResult(2, return_intent)
            finish()
        }

    }

}