package com.route.islami.project.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.route.islami.databinding.SuraItemBinding
import com.route.islami.project.models.SuraDataClass

class SuraAdapter(private val itemList:MutableList<SuraDataClass>) : RecyclerView.Adapter<SuraAdapter.SuraViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val viewBinding : SuraItemBinding = SuraItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuraViewHolder(viewBinding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        val suraItem = itemList[position]
        holder.bind(suraItem)
    }
    inner class SuraViewHolder(private val binding: SuraItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : SuraDataClass){
            binding.suraText.text = item.suraName
            binding.indexVerse.text = "${item.index}"
        }
    }
}