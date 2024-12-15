package com.example.taskme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // back btn click
        val button1: ImageButton = findViewById(R.id.backSignup)
        button1.setOnClickListener{
            val intent = Intent(this,Sign_in::class.java)
            startActivity(intent)
        }

        // signup btn click
        val button2: Button = findViewById(R.id.signinbtn)
        button2.setOnClickListener{
            val intent = Intent(this,Sign_in::class.java)
            startActivity(intent)
        }

        // signin_link btn click
        val button3: Button = findViewById(R.id.signinlink)
        button3.setOnClickListener{
            val intent = Intent(this,Sign_in::class.java)
            startActivity(intent)
        }
    }
}