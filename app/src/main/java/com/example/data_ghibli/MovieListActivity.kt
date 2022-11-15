package com.example.data_ghibli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.data_ghibli.databinding.ActivityMovieListBinding

class MovieListActivity : AppCompatActivity() {

    lateinit var binding: ActivityMovieListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}