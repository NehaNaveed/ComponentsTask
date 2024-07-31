package com.example.componentstask

import android.widget.ArrayAdapter
import com.example.componentstask.databinding.BlocksBinding
import com.example.componentstask.databinding.ButtonBinding
import com.example.componentstask.databinding.DetailsBinding
import com.example.componentstask.databinding.TitleBarBinding
import kotlin.math.exp

fun setupIncomeComponent(blocks: BlocksBinding, income : Int){
    blocks.income.text = blocks.root.context.getString(income)
}

fun setupExpenseComponent(blocks: BlocksBinding, expense : Int){
    blocks.expense.text = blocks.root.context.getString(expense)
}

fun setupTitleBarComponent(titleBar: TitleBarBinding, title: Int){
    titleBar.header.text = titleBar.root.context.getString(title)
}

fun setupButtonComponent(button: ButtonBinding, text: Int){
    button.button.text = button.root.context.getString(text)
}

