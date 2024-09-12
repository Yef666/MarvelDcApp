package com.example.marveldcapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marveldcapp.R
import com.example.marveldcapp.models.Hero
import com.squareup.picasso.Picasso

class HeroAdapter(val heroList: List<Hero>, val onClick: (Hero) -> Unit) : RecyclerView.Adapter<HeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item, parent, false)  // Aquí debe ser tu layout específico para héroes
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroList.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroList[position]
        holder.heroName.text = hero.name
        Picasso.get().load(hero.image).into(holder.heroImage)

        // Al hacer clic en un héroe, se ejecuta el callback con el héroe seleccionado
        holder.itemView.setOnClickListener {
            onClick(hero)
        }
    }
}

class HeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val heroImage: ImageView = view.findViewById(R.id.publisher_image)  // Cambia si es necesario
    val heroName: TextView = view.findViewById(R.id.publisher_name)     // Cambia si es necesario
}
