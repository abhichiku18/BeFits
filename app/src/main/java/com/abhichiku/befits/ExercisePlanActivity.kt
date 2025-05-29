package com.abhichiku.befits

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityExercisePlanBinding

class ExercisePlanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExercisePlanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExercisePlanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMonday.setOnClickListener { openDayPlan("Monday") }
        binding.btnTuesday.setOnClickListener { openDayPlan("Tuesday") }
        binding.btnWednesday.setOnClickListener { openDayPlan("Wednesday") }
        binding.btnThursday.setOnClickListener { openDayPlan("Thursday") }
        binding.btnFriday.setOnClickListener { openDayPlan("Friday") }
        binding.btnSaturday.setOnClickListener { openDayPlan("Saturday") }
        binding.btnSunday.setOnClickListener { openDayPlan("Sunday") }
    }

    private fun openDayPlan(day: String) {
        val intent = Intent(this, ExerciseDetailActivity::class.java)
        intent.putExtra("DAY_NAME", day)
        startActivity(intent)
    }
}
