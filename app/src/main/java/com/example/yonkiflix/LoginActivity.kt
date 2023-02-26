package com.example.yonkiflix

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.yonkiflix.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Iniciar sesión si está registrqado en firebase

        binding.InicioSesion.setOnClickListener {
            if (binding.Email.text.toString().isNotEmpty() &&
                binding.ContrasenyaEdittext.text.toString().isNotEmpty()
            ) {
                FirebaseAuth.getInstance().signInWithEmailAndPassword(binding.Email.text.toString(),
                    binding.ContrasenyaEdittext.text.toString()
                ).addOnCompleteListener {
                    if (it.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        intent.putExtra("email", binding.Email.text.toString())
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Esta cuenta no existe, por favor, regístrese.", Toast.LENGTH_SHORT).show()
                    }
                }
            }else {
                Toast.makeText(this, "Por favor, rellene todos los campos.", Toast.LENGTH_SHORT).show()
            }
        }

        //si no tienes cuenta, te lleva a la pantalla de registro
        binding.notienescuenta.setOnClickListener {
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
            finish()
        }

        // si quieres saber por qué existimos, te lleva a la pantalla de por qué existimos
        binding.porqueexistimos.setOnClickListener {
            val intent = Intent(this, xqexistimosActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}