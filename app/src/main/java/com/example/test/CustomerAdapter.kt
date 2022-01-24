package com.example.test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

//ArrayList안에 Customer라는 클래스형태를 넣는다. baseadapter를 상속받았음,
//어댑터는 코드연결할 때 쓴다고 보면된다. getView 가 호출되면서 만들어준다.
class CustomerAdapter (val context: Context, val CustomerList: ArrayList<Customer>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_customer, null)
// 포지션은 위치를 말함. 0부터 센다.
        val link = view.findViewById<ImageView>(R.id.iv_link)
        val name = view.findViewById<TextView>(R.id.tv_name)
        val address = view.findViewById<TextView>(R.id.tv_address)
        val date = view.findViewById<TextView>(R.id.tv_date)
        val product = view.findViewById<TextView>(R.id.tv_product)


        val customer = CustomerList[position]
        //layoutInflater는 view를 붙이는 과정

        link.setImageResource(customer.link)
        name.text = customer.name
        address.text = customer.address
        date.text = customer.date
        product.text = customer.product

        return view
    }

    override fun getCount(): Int {
        return CustomerList.size
    }

    override fun getItem(position: Int): Any {
        return CustomerList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }




}