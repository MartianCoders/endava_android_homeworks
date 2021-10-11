package com.example.firstappendava

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val get_content = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult? ->
            if (result?.resultCode == 1) {
                result.data.let{
                    Log.i("TestLog", "Result from C -> " + result.data!!.getIntExtra("result", -1))
                }
            }
            else if (result?.resultCode == 2){
                result.data.let{
                    Log.i("TestLog", "Result from C -> " + result.data!!.getStringExtra("result"))
                }
            }
            else {
                Log.i("TestLog", "No result from C")
            }
        }

        val button_for_B : Button = findViewById(R.id.go_to_B_button)
        button_for_B.setOnClickListener {
            val intent : Intent = Intent(this, SecondActivity::class.java)
            get_content.launch(intent)
        }

        val button_for_C : Button = findViewById(R.id.go_to_C_button)
        button_for_C.setOnClickListener {
            val intent : Intent = Intent(this, ThirdActivity::class.java)
            get_content.launch(intent)
            //startActivityForResult(intent, 1)
            }
        }

    override fun onStart() {
        super.onStart()
        Log.i("TestLog", "Main -> Start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("TestLog", "Main -> Destroy")
    }

    override fun onPause() {
        super.onPause()
        Log.i("TestLog", "Main -> Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("TestLog", "Main -> Resume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("TestLog", "Main -> Restart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("TestLog", "Main -> Stop")
    }
}