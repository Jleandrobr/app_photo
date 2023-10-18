package com.example.photo

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvFoto: TextView
    private lateinit var imgView: ImageView
    private lateinit var btnFoto: Button
    private val REQUEST_IMAGE_CAPTURE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvFoto = findViewById(R.id.tvFoto)
        this.imgView = findViewById(R.id.imgView)

        this.btnFoto = findViewById(R.id.btnFoto)
        this.btnFoto.setOnClickListener { chamarCamera() }


    }

    fun chamarCamera(){
        val intet = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (intet.resolveActivity(packageManager) != null){
            startActivityForResult(intet, REQUEST_IMAGE_CAPTURE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK){
            val imagemBitmap = data?.extras?.get("data") as Bitmap
            this.imgView.setImageBitmap(imagemBitmap)
        }
    }
}