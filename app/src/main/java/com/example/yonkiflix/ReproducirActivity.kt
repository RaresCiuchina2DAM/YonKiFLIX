package com.example.yonkiflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityReproducirBinding

class ReproducirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityReproducirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val video = intent.getStringExtra("video").toString()

        binding.webView.loadUrl(video)


    }
}