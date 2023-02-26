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

        binding.btnPeliculas.setOnClickListener {
            val intent = Intent(this, PeliculasActivity::class.java)
            startActivity(intent)
        }
        binding.btnSeriesTv.setOnClickListener {
            val intent = Intent(this, SeriesActivity::class.java)
            startActivity(intent)
        }

        binding.botonprincipalreproducir.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "avatar")
            startActivity(intent)
        }


        binding.volveraver1aqnhqv.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "aqnhqv")
            startActivity(intent)
        }

        binding.volveraver2ccavm.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "ccavm")
            startActivity(intent)
        }

        binding.volveraver3elpueblo.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "elpueblo")
            startActivity(intent)
        }

        binding.volveraver4machosalfa.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "machosalfa")
            startActivity(intent)
        }
        binding.volveraver5futurama.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "futurama")
            startActivity(intent)
        }

        binding.volveraver6lossimpsons.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "lossimpsons")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten1coco.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "coco")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten2lossimpsonspeli.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "lossimpsonspeli")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten3avatar1.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "avatar")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten4avatar2.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "avatar2")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten5toystory1.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "toystory1")
            startActivity(intent)
        }

        binding.peliculasquequizastegusten6toystory11.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "toystory11")
            startActivity(intent)
        }

        binding.loMasVisto1Emilyenparis.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "emilyenparis")
            startActivity(intent)
        }
        binding.loMasVisto2Aqnhqv.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "aqnhqv")
            startActivity(intent)
        }
        binding.loMasVisto3Ccavm.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "ccavm")
            startActivity(intent)
        }
        binding.loMasVisto4Chernobil.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "chernobil")
            startActivity(intent)
        }
        binding.loMasVisto5Lossimpsons.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "lossimpsons")
            startActivity(intent)
        }
        binding.loMasVisto6Machosalfa.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "machosalfa")
            startActivity(intent)
        }
        binding.loMasVisto7Futurama.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "futurama")
            startActivity(intent)
        }
        binding.loMasVisto8Sherlock.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "sherlock")
            startActivity(intent)
        }
        binding.loMasVisto9Up.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "up")
            startActivity(intent)
        }

        binding.loMasVisto10Pocahontas.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "pocahontas")
            startActivity(intent)
        }

        binding.recomendados1Blackrocs.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "blackrocs")
            startActivity(intent)
        }

        binding.recomendados2Elapagon.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "elapagon")
            startActivity(intent)
        }
        binding.recomendados3Skyrojo.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "skyrojo")
            startActivity(intent)
        }

        binding.recomendados4Insideout.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "insideout")
            startActivity(intent)
        }

        binding.recomendados5Aladin.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "aladin")
            startActivity(intent)
        }
        binding.recomendados6Peterpan.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            intent.putExtra("video", "peterpan")
            startActivity(intent)
        }







    }
}