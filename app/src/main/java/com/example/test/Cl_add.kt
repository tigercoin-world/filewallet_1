package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityClAddBinding

import com.example.test.databinding.ActivityCustomerlistBinding


class Cl_add : AppCompatActivity() {

    private var mBinding: ActivityClAddBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cl_add)
        mBinding = ActivityClAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btAdd2.setOnClickListener {
            val name : String = binding.ptName.toString()
            val address : String = binding.ptAddress.toString()
            val date : String = binding.ptDate.toString()
            val interest : String = binding.ptInterest.toString()


            var CustomerList = arrayListOf<Customer>(Customer("$name","$address", "$interest","$date",R.drawable.ic_baseline_link_24 ))
            val Adapter = CustomerAdapter(this, CustomerList)

        }



    }
}