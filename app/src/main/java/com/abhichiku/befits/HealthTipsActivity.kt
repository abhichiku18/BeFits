package com.abhichiku.befits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abhichiku.befits.databinding.ActivityHealthTipsBinding

class HealthTipsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHealthTipsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHealthTipsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val tips = """
            💧 Stay hydrated
            Drink at least 8 glasses of water daily.
            
            🏃 Exercise regularly
            Aim for 30 minutes of activity daily.
            
            🥗 Eat balanced meals
            Include fruits, veggies, and whole grains.
            
            😴 Sleep well
            Get 7–9 hours of restful sleep.
            
            ☀️ Get sunlight
            Morning sunlight boosts vitamin D.
            
            🧘‍♂️ Manage stress
            Try meditation or deep breathing.
            
            🚭 Avoid smoking & 🚫 limit alcohol
            
            🧼 Maintain hygiene
            Wash hands regularly and stay clean.
        """.trimIndent()

        binding.tvTips.text = tips
    }
}
