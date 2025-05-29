package com.abhichiku.befits

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.MainActivity
import com.abhichiku.befits.UserInfoActivity
import com.abhichiku.befits.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    private lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPref = getSharedPreferences("BeFitsPrefs", MODE_PRIVATE)
        val name = sharedPref.getString("name", "User")

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWelcome.text = "Hey $name,\nReady to sweat today?"

        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Handle Update Profile Button
        binding.btnUpdateProfile.setOnClickListener {
            startActivity(Intent(this, UserInfoActivity::class.java))
        }
    }
}
