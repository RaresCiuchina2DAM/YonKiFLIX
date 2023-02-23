package com.example.yonkiflix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yonkiflix.databinding.ActivityLibretaBinding

class LibretaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLibretaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.getStringExtra("usuario").toString()

        if (usuario == R.drawable.perfil1.toString()) {
            binding.perfil.setImageResource(R.drawable.perfil1)
        } else if (usuario == R.drawable.perfil2.toString()) {
            binding.perfil.setImageResource(R.drawable.perfil2)
        } else if (usuario == R.drawable.perfil3.toString()) {
            binding.perfil.setImageResource(R.drawable.perfil3)
        } else if (usuario == R.drawable.perfil4.toString()) {
            binding.perfil.setImageResource(R.drawable.perfil4)
        }

        binding.btnSeriesTv.setOnClickListener {
            val intent = Intent(this, SeriesActivity::class.java)
            startActivity(intent)
        }
    }
}