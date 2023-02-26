package com.example.yonkiflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.yonkiflix.databinding.ActivityRegistroBinding
import com.google.firebase.auth.FirebaseAuth

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //si pulsas en los términos y condiciones, te lleva a la pantalla de términos y condiiciones personalizada
        binding.terminosycondiciones.setOnClickListener{
            val intent = Intent(this, TerminosActivity::class.java)
            startActivity(intent)
        }

        //si pulsas en el botón de volver, te lleva a la pantalla de login
        binding.volver.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


        //si pulsas en el botón de registrarse, empieza a registrar al usuario en firebase y
        // además debe de aceptar los terminos y condiciones para que le deje registrarse
        binding.botonregistro.setOnClickListener {

            if (binding.introduceemail.text.toString().isNotEmpty() &&
                binding.introducetucontrasenya.text.toString().isNotEmpty() && binding.aceptoterminos.isChecked
            ) {
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                    binding.introduceemail.text.toString(),
                    binding.introducetucontrasenya.text.toString()
                )
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            Toast.makeText(this, "Usuario registrado correctamente", Toast.LENGTH_SHORT).show()
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                            finish()
                        } else {
                            Toast.makeText(this, "Error al registrarse", Toast.LENGTH_SHORT).show()
                        }
                    }
            }else {
                Toast.makeText(this, "Por favor, rellene todos los campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}