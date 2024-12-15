package com.example.taskme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Notification_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // home btn click
        val button2: ImageButton = findViewById(R.id.home)
        button2.setOnClickListener{
            val intent = Intent(this,Home_page::class.java)
            startActivity(intent)
        }

        // add btn click
        val button1: ImageButton = findViewById(R.id.add)
        button1.setOnClickListener{
            val intent = Intent(this,Add_page::class.java)
            startActivity(intent)
        }

        // profile btn click
        val button3: ImageButton = findViewById(R.id.profile)
        button3.setOnClickListener{
            val intent = Intent(this,Profile_page::class.java)
            startActivity(intent)
        }
    }
}