package com.example.firstappendava

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val URL : String = "https://img.devrant.com/devrant/rant/r_1961636_vfL5b.jpg"

        val open_web : Button = findViewById(R.id.open_web_button)
        open_web.setOnClickListener {
            val open_web_intent : Intent = Intent(Intent.ACTION_VIEW)
            open_web_intent.setData(Uri.parse(URL))
            startActivity(open_web_intent)
            Log.i("TestLog", "Second -> Opened WEB")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("TestLog", "Second -> Start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TestLog", "Second -> Destroy")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TestLog", "Second -> Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TestLog", "Second -> Resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TestLog", "Second -> Restart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TestLog", "Second -> Stop")
    }
}