package com.example.photo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvFoto: TextView
    private lateinit var imgView: ImageView
    private lateinit var btnFoto: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvFoto = findViewById(R.id.tvFoto)
        this.imgView = findViewById(R.id.imgView)
        this.btnFoto = findViewById(R.id.btnFoto)

        

    }
}