package com.example.yonkiflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityLibretaBinding

class LibretaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLibretaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.getIntExtra("usuario",0)


    }
}