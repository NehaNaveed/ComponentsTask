package com.example.componentstask

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.componentstask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.topLayout.button.setOnClickListener(){
            startActivity(Intent(this, SecondActivity::class.java))
        }
        setupIncomeComponent(binding.blocks , R.string.num_income)
        setupExpenseComponent(binding.blocks , R.string.num_expense)
        setupTitleBarComponent(binding.title, R.string.title_text)
        setupButtonComponent(binding.topLayout, R.string._continue)
        selectCategory()
        selectMethod()
    }

    private fun selectCategory(){
        val spinner = binding.bottomLayout.category
        val category = arrayOf("Food & Drinks", "Shopping", "Education","Subscription","Debt Payments","Insurance")
        val arrayAdapter =  ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, category)
        spinner.adapter = arrayAdapter
    }

    private fun selectMethod(){
        val spinner = binding.bottomLayout.paymentMethod
        val category = arrayOf("PayPal","GooglePay","Venmo","EasyPaisa","Bank Transfer")
        val arrayAdapter =  ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, category)
        spinner.adapter = arrayAdapter
    }


}

