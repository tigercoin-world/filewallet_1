package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityClAddBinding
import com.example.test.databinding.ActivityCpriceBinding


class Cl_add : AppCompatActivity() {

    private var mBinding: ActivityClAddBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cl_add)
        mBinding = ActivityClAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        



    }
}