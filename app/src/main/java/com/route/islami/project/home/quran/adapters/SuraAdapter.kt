package com.route.islami.project.home.quran.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.route.islami.databinding.SuraItemBinding
import com.route.islami.project.home.quran.models.SuraDataClass

class SuraAdapter(private val itemList: List<String>) : RecyclerView.Adapter<SuraAdapter.SuraViewHolder>() {
     var onSuraItemClickListener : OnSuraItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraViewHolder {
        val binding = SuraItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuraViewHolder(binding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: SuraViewHolder, position: Int) {
        val suraItem = itemList[position]
        holder.bind(suraItem)
    }
    inner class SuraViewHolder(private val binding: SuraItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(suraName :String){
            binding.suraText.text = suraName
            binding.root.setOnClickListener{
                onSuraItemClickListener?.onClick()
            }
        }
    }
    fun interface OnSuraItemClickListener{
        fun onClick()
    }
}