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

        binding.botonimagen1.setOnClickListener {
            val intent = Intent(this, LibretaActivity::class.java)
            intent.putExtra("usuario",1)
            startActivity(intent)
        }

        binding.botonimagen2.setOnClickListener {
            val intent = Intent(this, LibretaActivity::class.java)
            intent.putExtra("usuario",2)
            startActivity(intent)
        }



    }

}
