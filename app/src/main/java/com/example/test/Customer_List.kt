package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.test.databinding.ActivityCustomerlistBinding


class CustomerList : AppCompatActivity() {
    private var mBinding: ActivityCustomerlistBinding? = null
    private val binding get() = mBinding!!

    var CustomerList = arrayListOf<Customer>(
          Customer("이진형","f2r2l4exu5iq46okt3vh2yq72vlumx25hm7kptzyq", "3%","2021-09-20",R.drawable.ic_baseline_link_24 ),
          Customer("강민우","f3r2l4exu5iq46okt3vh2yq72vlumx25hm7kptzyq", "2%","2021-10-20",R.drawable.ic_baseline_link_24 ),
          Customer("장은영","f4r2l4exu5iq46okt3vh2yq72vlumx25hm7kptzyq", "3%","2021-12-20",R.drawable.ic_baseline_link_24 ),
          Customer("황다영","f5r2l4exu5iq46okt3vh2yq72vlumx25hm7kptzyq", "2%","2022-01-20",R.drawable.ic_baseline_link_24 ),
          Customer("김민재","f6r2l4exu5iq46okt3vh2yq72vlumx25hm7kptzyq", "3%","2022-01-25",R.drawable.ic_baseline_link_24 )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_customer_list)

        mBinding = ActivityCustomerlistBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val item = arrayOf("사과", "배", "키위","바나나")
//        //context는 한 activity에 모든 정보를 담고 있는
//        //val lv : ListView = findViewById(R.id.listView)
//
//        binding.lv.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)
//        //어댑터는 전원을 연결할때 사용하는 개체, 리스트는 어댑터가 있어야만 데이터들 인풋을 넣을 수 있다.
//        //context는 한 activity의 모든 정보를 의미.
            // 이 apater는 안드로이드가 제공하는 것이다.
        val Adapter = CustomerAdapter(this, CustomerList)
        binding.lv.adapter = Adapter



    }
}