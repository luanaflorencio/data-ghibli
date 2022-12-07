package com.example.data_ghibli

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.data_ghibli.databinding.ItemImageBinding

class ImagesAdapter(private val images: ArrayList<Images>, private val context: Context): RecyclerView.Adapter<ImagesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        val binding = ItemImageBinding.bind(view)
        return ImagesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        Glide.with(context)
            .load(Images().url)
            .skipMemoryCache(true)
            .into(holder.binding.itemHusbando)
    }

    override fun getItemCount(): Int = images.size
}