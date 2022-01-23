package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.test.databinding.ActivityCustomerListBinding


class CustomerList : AppCompatActivity() {
    private var mBinding: ActivityCustomerListBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_customer_list)

        mBinding = ActivityCustomerListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = arrayOf("사과", "배", "키위","바나나")
        //context는 한 activity에 모든 정보를 담고 있는
       binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
    }
}