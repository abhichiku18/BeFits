package com.abhichiku.befits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityBmicalculatorBinding

class BMICalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBmicalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmicalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalculate.setOnClickListener {
            val weight = binding.etWeight.text.toString().toFloatOrNull()
            val height = binding.etHeight.text.toString().toFloatOrNull()

            if (weight != null && height != null && height > 0) {
                val bmi = weight / (height * height)
                binding.tvResult.text = "BMI: %.2f".format(bmi)
            } else {
                binding.tvResult.text = "Please enter valid values."
            }
        }
    }
}
