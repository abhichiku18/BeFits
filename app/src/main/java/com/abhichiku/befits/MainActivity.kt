package com.abhichiku.befits

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBmi.setOnClickListener {
            startActivity(Intent(this, BMICalculatorActivity::class.java))
        }

        binding.btnTips.setOnClickListener {
            startActivity(Intent(this, HealthTipsActivity::class.java))
        }

        binding.btnWater.setOnClickListener {
            startActivity(Intent(this, WaterTrackerActivity::class.java))
        }
        binding.btnExerciseTracker.setOnClickListener {
            startActivity(Intent(this, ExercisePlanActivity::class.java))
        }
        binding.btnDietPlan.setOnClickListener{
            startActivity(Intent(this, DietPlanActivity::class.java))
        }

    }
}