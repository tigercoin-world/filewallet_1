package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.test.databinding.ActivityCpriceBinding
import org.w3c.dom.Text

class c_price : AppCompatActivity() {

    private var mBinding: ActivityCpriceBinding? = null
    private val binding get() = mBinding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_cprice)

        mBinding = ActivityCpriceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var start_price = binding.txStart
        var high_price = binding.txHigh
        var low_price = binding.txLow
        var last_price = binding.txLast

        binding.btnCheck.setOnClickListener {
                var coinName = binding.editCoin.text.toString()
                getTicker(coinName)
            }


    }

    private fun getTicker(coinName: String){

        var url = "https://api.upbit.com/v1/ticker?markets=KRW-"+coinName



    }    }