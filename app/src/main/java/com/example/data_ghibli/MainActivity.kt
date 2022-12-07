package com.example.data_ghibli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.data_ghibli.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seeCatalog.setOnClickListener {
            val intentGoToCatalog = Intent(this, ListActivity::class.java)
            startActivity(intentGoToCatalog)
        }

        supportActionBar!!.hide()
    }
}