package com.example.taskme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Add_new_event_task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_new_event_task)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // back btn click
        val button1: ImageButton = findViewById(R.id.add_new_event_back)
        button1.setOnClickListener{
            val intent = Intent(this,Add_page::class.java)
            startActivity(intent)
        }

        // back btn click
        val button2: Button = findViewById(R.id.add_new_events)
        button2.setOnClickListener{
            val intent = Intent(this,Add_page::class.java)
            startActivity(intent)
        }
    }
}