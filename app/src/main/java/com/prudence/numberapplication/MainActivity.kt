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
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacci_100(100)
    }
    fun fibonacci_100(size:Int):List<Int> {
        var Number = ArrayList<Int>()
        var start = 0
        var step = 1
        var sumNumber = 0
        while (sumNumber <= size) {
            print(start)
            var sumNumber = start + step
            start = step
            sumNumber++
            Number += sumNumber
        }
        return Number
    }

    }
