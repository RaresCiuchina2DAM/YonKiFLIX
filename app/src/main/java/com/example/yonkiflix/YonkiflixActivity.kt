package com.example.yonkiflix

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.yonkiflix.databinding.ActivityYonkiflixBinding



enum class  ProviderType {
    BASIC
}
class YonkiflixActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yonkiflix)


        //Setup
        val bundle = intent.extras
        val email = bundle?.getString("email")
        val provider = bundle?.getString("provider")

        val email2= findViewById<TextView>(R.id.textView)
        email2.text = email

        val a = findViewById<TextView>(R.id.textView2)
        a.text = provider







    }


}