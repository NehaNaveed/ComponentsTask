package com.example.componentstask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.componentstask.databinding.ActivityMainBinding
import com.example.componentstask.databinding.SecondActivityBinding
import com.example.componentstask.databinding.TitleBarBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupButtonComponent(binding.previous,R.string._prev)
        setupTitleBarComponent(binding.newScreen,R.string.new_title)
        setupIncomeComponent(binding.newBlocks,R.string.new_income)
        setupExpenseComponent(binding.newBlocks,R.string.new_expense)
        binding.previous.button.setOnClickListener(){
            finish()
        }

    }
}