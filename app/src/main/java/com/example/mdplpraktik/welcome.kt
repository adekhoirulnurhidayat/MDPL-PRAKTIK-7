package com.example.mdplpraktik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button

class welcome : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val Btn_scn = findViewById<Button>(R.id.button2)
        val Btn_tk = findViewById<Button>(R.id.button3)

        Btn_scn.setOnClickListener {
            startActivity(Intent(this, Scan::class.java))
        }

        Btn_tk.setOnClickListener {
            startActivity(Intent(this, Tulis::class.java))
        }


    }


    }
