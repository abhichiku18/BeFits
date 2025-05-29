package com.abhichiku.befits

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserInfoBinding
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPref = getSharedPreferences("BeFitsPrefs", MODE_PRIVATE)

        binding.btnContinue.setOnClickListener {
            val name = binding.etName.text.toString()
            val age = binding.etAge.text.toString()
            val currentWeight = binding.etCurrentWeight.text.toString()
            val targetWeight = binding.etTargetWeight.text.toString()

            if (name.isNotEmpty() && age.isNotEmpty() && currentWeight.isNotEmpty() && targetWeight.isNotEmpty()) {
                sharedPref.edit().apply {
                    putString("name", name)
                    putString("age", age)
                    putString("currentWeight", currentWeight)
                    putString("targetWeight", targetWeight)
                    putBoolean("IS_FIRST_TIME", false)
                    apply()
                }

                startActivity(Intent(this, WelcomeActivity::class.java))
                finish()
            } else {
                binding.tvError.text = "Please fill all fields"
            }
        }
    }
}
