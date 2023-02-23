package com.example.yonkiflix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yonkiflix.databinding.ActivitySeriesBinding

class SeriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySeriesBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_series)

        val series = Array<Int>(init = {0}, size = 1)
        series[0]=R.drawable.aqnhqv
        series[1]=R.drawable.ccavm
        series[2]=R.drawable.chernobyl
        series[3]=R.drawable.elpueblo
        series[4]=R.drawable.emilyenparis
        series[5]=R.drawable.futurama
        series[6]=R.drawable.lossimpsons1
        series[7]=R.drawable.laschicasdelcable
        series[8]=R.drawable.disney9
        series[9]=R.drawable.machosalfa
        series[10]=R.drawable.patria

        val random = (series.indices).random()

        binding.imagenserie.setImageResource(series[random])

        binding.otro.setOnClickListener {
            val random1 = (series.indices).random()
            binding.imagenserie.setImageResource(series[random1])
        }

        binding.ver.setOnClickListener {
            val intent = Intent(this, VerActivity::class.java)
            startActivity(intent)
        }


    }
}