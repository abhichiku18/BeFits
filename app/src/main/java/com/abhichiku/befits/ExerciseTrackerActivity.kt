package com.abhichiku.befits

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityExerciseTrackerBinding

class ExerciseTrackerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseTrackerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseTrackerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val selectedExercises = mutableListOf<String>()

            if (binding.cbPushUps.isChecked) selectedExercises.add("Push-Ups")
            if (binding.cbSquats.isChecked) selectedExercises.add("Squats")
            if (binding.cbJumpingJacks.isChecked) selectedExercises.add("Jumping Jacks")
            if (binding.cbPlank.isChecked) selectedExercises.add("Plank")

            if (selectedExercises.isEmpty()) {
                Toast.makeText(this, "Please select at least one exercise", Toast.LENGTH_SHORT).show()
            } else {
                val message = "Completed: ${selectedExercises.joinToString(", ")}"
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}
