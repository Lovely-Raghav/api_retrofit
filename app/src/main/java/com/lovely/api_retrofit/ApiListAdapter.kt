package com.lovely.api_retrofit

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.lovely.api_retrofit.AlbumActivity.AlbumActivity
import com.lovely.api_retrofit.databinding.LayoutListItemBinding

class ApiListAdapter(var list: ArrayList<ApiList>,var context: Context):RecyclerView.Adapter<ApiListAdapter.MyViewHolder>() {
    inner class  MyViewHolder(var binding: LayoutListItemBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding:LayoutListItemBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),
        R.layout.layout_list_item,parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.binding.tvImage.setImageResource(list[position].image)
        holder.binding.tvText.text=list[position].apiName
        holder.itemView.setOnClickListener {
            when(position){
                0->{context.startActivity(Intent(context,AlbumActivity::class.java))}
            }
        }

    }

    override fun getItemCount(): Int {
      return list.size
    }
}