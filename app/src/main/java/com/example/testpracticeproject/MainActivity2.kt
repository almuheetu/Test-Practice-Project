package com.example.testpracticeproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.testpracticeproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val firstFragment = FirstFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, firstFragment)
                .commit()
        }

    }
}