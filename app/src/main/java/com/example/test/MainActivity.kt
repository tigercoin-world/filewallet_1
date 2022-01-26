package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!


    var resultString: String = "" //String 자료형
    var target_1: Int = 0 // Integer 자료형
    var target_2 = 0 // 자동으로 추론하게 해줌.

    //코틀린에서 list는 listOf를 통해서 만들고 안에 값을 넣을 수 있습니다.
    var currencys = listOf(
        "BTC",
        "ETH",
        "DASH",
        "LTC",
        "ETC",
        "XRP",
        "BCH",
        "XMR",
        "ZEC",
        "QTUM",
        "BTG",
        "EOS",
        "ICX",
        "VEN",
        "TRX"
    )

    //빗썸의 public API를 사용합니다.
    var url = "https://api.bithumb.com/public/orderbook/BTC"

    //ConnectBithumb라는 클래스를 만들어서 사용할 것 입니다.
    //해당 클래스는 추후에 API url을 연결하고 TextView를 set합니다.
    var connectBithumb: ConnectBithumb? = null


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
            val intent = Intent(this, CustomerList::class.java)
            startActivity(intent)
        }

        connectBithumb = ConnectBithumb()

        //connectBtn을 누르면 빗썸 API의 가격을 가져옵니다.
        binding.btnPricecheck.setOnClickListener  { view ->
            Log.d("preUrl", url);//url확인

            //ConnectBithumb의 TextView 변수를 set합니다.
            connectBithumb!!.resultprice = binding.tvPrice
            //ConnectBithumb AsyncTask를 실행합니다.
            connectBithumb!!.execute(url)


        }
    }