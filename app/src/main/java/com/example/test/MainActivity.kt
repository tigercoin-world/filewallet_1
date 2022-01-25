package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.DocumentsContract
import com.example.test.databinding.ActivityMainBinding
import com.google.mlkit.vision.text.Text
import org.jsoup.Jsoup
import org.jsoup.select.Elements
import org.w3c.dom.Document


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
            val intent = Intent(this, CustomerList::class.java)
            startActivity(intent)
        }

    }
}