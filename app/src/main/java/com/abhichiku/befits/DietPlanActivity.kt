package com.abhichiku.befits

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class DietPlanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_plan)

        val chartImage = findViewById<ImageView>(R.id.dietChartImage)
        val goalGroup = findViewById<RadioGroup>(R.id.goalRadioGroup)

        goalGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.rbWeightGain -> chartImage.setImageResource(R.drawable.img_21)
                R.id.rbWeightLoss -> chartImage.setImageResource(R.drawable.img_22)
            }
        }
    }
}
