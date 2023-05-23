package com.lovely.api_retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.lovely.api_retrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var apiList=ArrayList<ApiList>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
           apiList.add(ApiList(R.drawable.images,"Albums"))
        val apiListAdapter=ApiListAdapter(apiList,this)
        binding.recyclerView.adapter=apiListAdapter
        apiListAdapter.notifyDataSetChanged()

    }
}