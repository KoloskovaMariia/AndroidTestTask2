package com.example.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task2.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val  view = binding.root
        setContentView(view)

        binding.number2.text = (Constance.CURRENT_NUMBER * Constance.CURRENT_NUMBER).toString()
        binding.switchButton2.setOnClickListener {
            Constance.increaseCurrentNumber()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}