package com.klimgroup.metrostationslab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klimgroup.metrostationslab3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickListeners()
    }

    private fun onClickListeners(){
        binding.apply {
            ConstraintOzbekiston.setOnClickListener { goToStation(0) }
            ConstraintYunusobod.setOnClickListener { goToStation(1) }
            ConstraintChilonzor.setOnClickListener { goToStation(2) }
            ConstraintSirgali.setOnClickListener { goToStation(3) }
            constraintExit.setOnClickListener { finish() }
        }
    }

    private fun goToStation(stationId:Int){
        val i = Intent(this,Station::class.java).putExtra("stationId",stationId)
        startActivity(i)
    }


}