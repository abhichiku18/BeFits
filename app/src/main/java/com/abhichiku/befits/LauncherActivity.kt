package com.abhichiku.befits

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPref = getSharedPreferences("BeFitsPrefs", MODE_PRIVATE)
        val isFirstTime = sharedPref.getBoolean("IS_FIRST_TIME", true)

        val nextActivity = if (isFirstTime) {
            UserInfoActivity::class.java
        } else {
            WelcomeActivity::class.java
        }

        startActivity(Intent(this, nextActivity))
        finish()
    }
}
