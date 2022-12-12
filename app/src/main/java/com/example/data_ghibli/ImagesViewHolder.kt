package com.example.data_ghibli

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.data_ghibli.databinding.ItemImageBinding

class ImagesViewHolder(private val binding: ItemImageBinding) :
    RecyclerView.ViewHolder(binding.root){
        fun bind(images: Images) {
            Glide.with(binding.itemHusbando.context)
                .load(images.url)
                .skipMemoryCache(true)
                .into(binding.itemHusbando)
        }
}