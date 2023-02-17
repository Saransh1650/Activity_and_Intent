package com.example.activityandintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import com.example.activityandintent.R.layout.activity_main
import com.example.activityandintent.R.layout.activity_second


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        var button = findViewById<Button>(R.id.btnOpenActivity)
        button.setOnClickListener {
                callActivity()
            }


        }
    private fun callActivity(){
        val intent = Intent(this, SecondActivity::class.java).also{startActivity(it)}
    }

    }




