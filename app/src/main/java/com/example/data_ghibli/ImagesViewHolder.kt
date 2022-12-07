package com.example.data_ghibli

import androidx.recyclerview.widget.RecyclerView
import com.example.data_ghibli.databinding.ItemImageBinding

class ImagesViewHolder(val binding: ItemImageBinding) :
    RecyclerView.ViewHolder(binding.root){
        fun bind(images: Images) {
           binding.itemUrl.text = images.url
        }
}