package com.example.yonkiflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityPeliculasBinding

class PeliculasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPeliculasBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_peliculas)


        val peliculas = Array<Int>(init = {0}, size = 1)
        peliculas[0]=R.drawable.avatar1
        peliculas[1]=R.drawable.avatar2
        peliculas[2]=R.drawable.coco
        peliculas[3]=R.drawable.disney1
        peliculas[4]=R.drawable.disney2
        peliculas[5]=R.drawable.disney3
        peliculas[6]=R.drawable.lossimpsons_peli
        peliculas[7]=R.drawable.monstruos_sa
        peliculas[8]=R.drawable.pelis2
        peliculas[9]=R.drawable.pelis3
        peliculas[10]=R.drawable.pelis4

        val random = (peliculas.indices).random()

        binding.imagenserie.setImageResource(peliculas[random])

        binding.otro.setOnClickListener {
            val random1 = (peliculas.indices).random()
            binding.imagenserie.setImageResource(peliculas[random1])
        }

        binding.ver.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            startActivity(intent)
        }





    }
}