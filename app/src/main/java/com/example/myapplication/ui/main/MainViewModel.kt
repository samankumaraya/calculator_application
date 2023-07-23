package com.example.myapplication.ui.main

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel : ViewModel() {

    var result = MutableLiveData<Double>()

    fun add(number1: Double,number2: Double){
         result.value = number1.plus(number2)
         Log.d("Add Result",result.value.toString())
    }

//    fun addAntiFunction(number1: Double,number2: Double,message: TextView){
//        result.value = number1.plus(number2)
//        message.text= result.value.toString()
//        Log.d("Add Result",result.value.toString())
//    }
    
}