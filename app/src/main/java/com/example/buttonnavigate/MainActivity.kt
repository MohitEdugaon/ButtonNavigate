package com.example.buttonnavigate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView = findViewById<NavigationView>(R.id.buttonNavigate)

        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.buttonNavigate ->
                    ChangeFragment(homeFragment())

                R.id.profile -> change

            }
            true
        }
    }
        fun ChangeFragment(fragment: Fragment){
            supportFragmentManager.beginTransaction().replace(R.id.framecontaint,fragment).commit()


    }
}