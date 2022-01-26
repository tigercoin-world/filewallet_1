package com.example.test

import android.os.AsyncTask
import android.util.Log
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL



    class ConnectBithumb : AsyncTask <String, String, String>(){

        //MainActivity의 TextView를 set하기 위해서
        var resultprice: TextView= null

        override fun onProgressUpdate(vararg values: String?) {
            super.onProgressUpdate(*values)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            //doInBackground에서 return된 변수가 result로 들어옴
            resultprice!!.text=result
        }

        override fun doInBackground(vararg urls: String): String? {
            Log.d("url",urls[0].toString())
            val url: URL = URL(urls[0].toString())

            //HttpUrlConnection클래스를 생성, url.openConnection으로 url을 연결

            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET" //GET 방식
            connection.doInput = true //input

            val `is` = connection.inputStream//데이터를 가져옴

            val br = BufferedReader(InputStreamReader(`is`))
            var readLine: String? = null //데이터를 한 줄씩 읽기 위해서
            var resultStringBuilder : String = null

            do {
                readLine = br.readLine()
                if (readLine == null)
                    break
                resultStringBuilder  += readLine
            } while (readLine==null) //readLine이 null이 될 때까지,

            br.close()//종료
            return resultStringBuilder//결과를 return
        }

        override fun onCancelled(result: String?) = super.onCancelled(result)
    }