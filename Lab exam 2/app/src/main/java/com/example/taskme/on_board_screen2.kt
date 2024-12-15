package com.example.taskme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class on_board_screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board_screen2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Skip btn click
        val buttonskip: Button = findViewById(R.id.skip2)
        buttonskip.setOnClickListener{
            val intent = Intent(this,on_board_screen_getStart::class.java)
            startActivity(intent)
        }

        // Next btn click
        val buttonnext: Button = findViewById(R.id.next2)
        buttonnext.setOnClickListener{
            val intent = Intent(this,on_board_screen3::class.java)
            startActivity(intent)
        }

    }
}