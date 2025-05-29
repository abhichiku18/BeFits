package com.abhichiku.befits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhichiku.befits.databinding.ActivityExerciseDetailBinding

class ExerciseDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExerciseDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val day = intent.getStringExtra("DAY_NAME") ?: "Today"
        binding.tvDayTitle.text = "Workout for $day"

        val workoutType = getWorkoutTypeForDay(day)
        val exercises = getExercisesFor(workoutType)

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@ExerciseDetailActivity)
            adapter = ExerciseAdapter(exercises)
        }
    }

    private fun getWorkoutTypeForDay(day: String): String {
        return when (day) {
            "Monday" -> "Back"
            "Tuesday" -> "Chest"
            "Wednesday" -> "Legs"
            "Thursday" -> "Shoulders"
            "Friday" -> "Arms"
            "Saturday" -> "Cardio"
            "Sunday" -> "Rest"
            else -> "Rest"
        }
    }

    private fun getExercisesFor(type: String): List<Exercise> {
        return when (type) {
            "Back" -> listOf(
                Exercise("Deadlift", R.drawable.img_1, "4 sets of 10"),
                Exercise("Lat Pulldown", R.drawable.img_2, "3 sets of 12"),
                Exercise("Bent-over Row", R.drawable.img_3, "3 sets of 10"),
                Exercise("T-Bar Row", R.drawable.img_4, "3 sets of 10")
            )
            "Chest" -> listOf(
                Exercise("Bench Press", R.drawable.img_5, "4 sets of 10"),
                Exercise("Incline Dumbbell Press", R.drawable.img_6, "3 sets of 12"),
                Exercise("Push Ups", R.drawable.img_7, "3 sets of 15")
            )
            "Legs" -> listOf(
                Exercise("Squats", R.drawable.img_8, "4 sets of 10"),
                Exercise("Leg Press", R.drawable.img_9, "3 sets of 12"),
                Exercise("Lunges", R.drawable.img_10, "3 sets each leg")
            )
            "Shoulders" -> listOf(
                Exercise("Overhead Press", R.drawable.img_11, "4 sets of 10"),
                Exercise("Lateral Raise", R.drawable.img_12, "3 sets of 15"),
                Exercise("Front Raise", R.drawable.img_13, "3 sets of 12")
            )
            "Arms" -> listOf(
                Exercise("Bicep Curls", R.drawable.img_14, "3 sets of 12"),
                Exercise("Tricep Dips", R.drawable.img_15, "3 sets of 15"),
                Exercise("Hammer Curls", R.drawable.img_16, "3 sets of 12")
            )
            "Cardio" -> listOf(
                Exercise("Jump Rope", R.drawable.img_17, "5 minutes"),
                Exercise("Burpees", R.drawable.img_18, "3 sets of 15"),
                Exercise("Mountain Climbers", R.drawable.img_19, "3 sets of 20")
            )
            "Rest" -> listOf(
                Exercise("Rest Day", R.drawable.img_20, "Relax and recover!")
            )
            else -> listOf(
                Exercise("Rest Day", R.drawable.img_20, "Relax and recover!")
            )
        }
    }
}
