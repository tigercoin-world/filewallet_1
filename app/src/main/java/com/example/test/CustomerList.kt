package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityCustomerListBinding


class CustomerList : AppCompatActivity() {
    private var mBinding: ActivityCustomerListBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_customer_list)

        mBinding = ActivityCustomerListBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}