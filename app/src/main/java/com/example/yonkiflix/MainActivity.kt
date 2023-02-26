package com.example.yonkiflix

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.yonkiflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getStringExtra("email").toString()
        val email2 = email.substring(0, email.indexOf("@"))

        binding.Nombreusuario1.text = email2

        val imagendeusuario = Array<Int>(init = {0}, size = 1)

        imagendeusuario[0]=R.drawable.perfil1
        imagendeusuario[1]=R.drawable.perfil2
        imagendeusuario[2]=R.drawable.perfil3
        imagendeusuario[3]=R.drawable.perfil4

        val random = (imagendeusuario.indices).random()

        binding.botonimagen1.setImageResource(imagendeusuario[random])
        binding.botonimagen2.setImageResource(imagendeusuario[random])

        binding.botonimagen1.setOnClickListener {
            val intent = Intent(this, LibretaActivity::class.java)
            intent.putExtra("usuario",binding.botonimagen1.background.toString())

            startActivity(intent)
        }

        binding.botonimagen2.setOnClickListener {
            val intent = Intent(this, LibretaActivity::class.java)
            intent.putExtra("usuario",binding.botonimagen2.background.toString())
            startActivity(intent)
        }



    }

}
