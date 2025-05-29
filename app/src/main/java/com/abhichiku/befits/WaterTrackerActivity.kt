package com.abhichiku.befits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityWaterTrackerBinding

class WaterTrackerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWaterTrackerBinding
    private var glassCount = 0
    private val maxGlasses = 11

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWaterTrackerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddWater.setOnClickListener {
            glassCount++
            if (glassCount > maxGlasses) {
                glassCount = 0
            }
            binding.tvWaterCount.text = "Glasses: $glassCount"
        }
    }
}
