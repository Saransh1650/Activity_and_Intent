package com.example.activityandintent


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var back :Button = findViewById(R.id.btnBack)
        back.setOnClickListener{
            finish()
        }



        }
    }

