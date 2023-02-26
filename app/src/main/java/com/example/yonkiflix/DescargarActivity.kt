package com.example.yonkiflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityDescargarBinding

class DescargarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDescargarBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_descargar)




    }
}