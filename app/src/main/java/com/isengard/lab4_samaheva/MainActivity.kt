package com.isengard.lab4_samaheva

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.Lab4_SamahEva.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Gondor = findViewById<ImageView>(R.id.gondor)
        val Rohan = findViewById<ImageView>(R.id.rohan)
        val Mordor = findViewById<ImageView>(R.id.mordor)

        Gondor.setOnClickListener {
            Toast.makeText(this, getString(R.string.gondor), Toast.LENGTH_SHORT).show()
        }
        Rohan.setOnClickListener {
            Toast.makeText(
                this,
                getString
                    (R.string.rohan),
                Toast.LENGTH_SHORT).show()
        }
        Mordor.setOnClickListener {
            Toast.makeText(this, getString(R.string.mordor), Toast.LENGTH_SHORT).show()
        }
    }
}