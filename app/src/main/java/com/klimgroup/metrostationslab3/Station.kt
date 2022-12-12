package com.klimgroup.metrostationslab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klimgroup.metrostationslab3.databinding.ActivityMainBinding
import com.klimgroup.metrostationslab3.databinding.ActivityStationBinding

class Station : AppCompatActivity() {
    private lateinit var binding: ActivityStationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setActivity()
        binding.constraintBack.setOnClickListener { finish() }
    }

    private fun setActivity(){
        val stationId = intent.getIntExtra("stationId",0)
        val image = when(stationId){
            0 -> R.drawable.uzb_line
            1 -> R.drawable.yunusobod
            2 -> R.drawable.chilonzor_line
            else -> R.drawable.sirgali_line
        }
        binding.apply {
            binding.tvStationName.text = resources.getStringArray(R.array.StationName)[stationId]
            binding.tvDesc.text = resources.getStringArray(R.array.StationDescriptions)[stationId]
            binding.imgStation.setImageResource(image)
        }
    }
}