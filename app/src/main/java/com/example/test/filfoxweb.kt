package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import com.example.test.databinding.ActivityFilfoxwebBinding
import com.example.test.databinding.ActivityMainBinding


class filfoxweb : AppCompatActivity() {

    private var mBinding: ActivityFilfoxwebBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_filfoxweb)
        mBinding = ActivityFilfoxwebBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.settings.javaScriptEnabled = true //자바스크립트 허용
//        웹뷰에서 새창이 뜨지 않도록 방지하는 구문
        binding.webView.webChromeClient = WebChromeClient()
        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://filfox.info/en/address/f01265268") //링크 주소를 load함

    }

    override fun onBackPressed() {//백버튼 로직에서 처리하는 액션
        if(binding.webView.canGoBack())
        {
            binding.webView.goBack() // 웹사이트 뒤로가기
        }
        else
        {
            super.onBackPressed()
        }
    }
}