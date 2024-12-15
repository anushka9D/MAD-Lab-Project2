package com.example.taskme

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // add btn click
        val button1: ImageButton = findViewById(R.id.add)
        button1.setOnClickListener{
            val intent = Intent(this,Add_page::class.java)
            startActivity(intent)
        }

        // notification btn click
        val button2: ImageButton = findViewById(R.id.notification)
        button2.setOnClickListener{
            val intent = Intent(this,Notification_page::class.java)
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