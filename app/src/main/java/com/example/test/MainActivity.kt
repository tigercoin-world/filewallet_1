package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityCustomerListBinding
import com.example.test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnF012.setOnClickListener {
            val intent = Intent(this, filfoxweb::class.java)
            startActivity(intent)
        }

        binding.btnCslist.setOnClickListener {
            val intent = Intent(this, ActivityCustomerListBinding::class.java )
            startActivity(intent)
        }
//    sdasd

    }
}