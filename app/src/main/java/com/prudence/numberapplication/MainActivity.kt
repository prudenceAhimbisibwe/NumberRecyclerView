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
        displayNumbers()
    }
    fun displayNumbers(){
        val numberList= listOf(0,1,1,2,3,5,8,13,21,34,55,99)
        binding.rvNumber.layoutManager=LinearLayoutManager(this)
        val numbersAdaptor=NumberRecyclerAdaptor(numberList )
        binding.rvNumber.adapter=numbersAdaptor
    }
}