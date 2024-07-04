package com.example.shpeapp.ui.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shpeapp.R

class GalleryAdapter(private val galleryItems: List<GalleryItem>) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gallery, parent, false)
        return GalleryViewHolder(view)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(galleryItems[position])
    }

    override fun getItemCount(): Int = galleryItems.size

    class GalleryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageView)
        private val textViewCaption: TextView = itemView.findViewById(R.id.textViewCaption)

        fun bind(galleryItem: GalleryItem) {
            imageView.setImageResource(galleryItem.imageResId)
            textViewCaption.text = galleryItem.caption
        }
    }
}
