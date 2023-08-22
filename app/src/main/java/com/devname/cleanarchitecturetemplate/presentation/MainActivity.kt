package com.devname.cleanarchitecturetemplate.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devname.cleanarchitecturetemplate.R
import com.devname.cleanarchitecturetemplate.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}