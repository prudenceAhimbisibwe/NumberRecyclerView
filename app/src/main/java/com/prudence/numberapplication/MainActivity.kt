package com.prudence.numberapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.prudence.numberapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList = fibonacci_100(100)
        print(numberList)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter = NumberRecyclerAdaptor(numberList)
    }

    fun fibonacci_100(size:Int):List<Int> {
        var Number = ArrayList<Int>()
        var start =0
        var step = 1
        var sumNumber = 0
        while (sumNumber <= size) {
            print(start)
            var sumNumbers = start + step
            start = step
              step=sumNumbers
            sumNumber++
            Number+=sumNumbers
        }
        return Number
    }

    }
