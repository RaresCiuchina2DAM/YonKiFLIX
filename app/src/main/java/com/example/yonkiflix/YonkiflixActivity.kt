package com.example.yonkiflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityYonkiflixBinding



enum class  ProviderType {
    BASIC
}
class YonkiflixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityYonkiflixBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")
        setup(email ?: "", provider ?: "")
        //Buscar la id del textview y añadirle el email y el proveedor
        binding.textView.text = email
        binding.textView2.text = provider
    }

    private fun setup(email: String, provider: String) {

        title = "Inicio"


    }


}