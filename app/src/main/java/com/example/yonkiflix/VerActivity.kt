package com.example.yonkiflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivityVerBinding
class VerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityVerBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_ver)


        binding.webview.loadUrl("https://www.youtube.com/watch?v=rU93XqVOItw")




    }



}