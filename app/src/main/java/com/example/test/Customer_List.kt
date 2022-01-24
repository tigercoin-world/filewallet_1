package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.test.databinding.ActivityCustomerlistBinding


class CustomerList : AppCompatActivity() {
    private var mBinding: ActivityCustomerlistBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_customer_list)

        mBinding = ActivityCustomerlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = arrayOf("사과", "배", "키위","바나나")
        //context는 한 activity에 모든 정보를 담고 있는
        //val lv : ListView = findViewById(R.id.listView)

        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
        //어댑터는 전원을 연결할때 사용하는 개체, 리스트는 어댑터가 있어야만 데이터들 인풋을 넣을 수 있다.


    }
}