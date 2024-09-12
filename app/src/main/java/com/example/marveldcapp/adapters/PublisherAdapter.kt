package com.example.marveldcapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marveldcapp.R
import com.example.marveldcapp.models.Publisher
import com.squareup.picasso.Picasso

class PublisherAdapter(
    private val publisherList: List<Publisher>,
    private val onPublisherClick: (Publisher) -> Unit
) : RecyclerView.Adapter<PublisherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publisherList.count()
    }

    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publisherList[position]
        holder.publisherNameTV.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)

        // Manejar clic en el publisher
        holder.itemView.setOnClickListener {
            onPublisherClick(publisher)
        }
    }
}

class PublisherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val publisherNameTV: TextView = view.findViewById(R.id.publisher_name)
    val publisherImage: ImageView = view.findViewById(R.id.publisher_image)
}
