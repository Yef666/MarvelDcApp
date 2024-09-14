package com.example.marveldcapp.activities

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.marveldcapp.R
import com.example.marveldcapp.models.Hero
import com.squareup.picasso.Picasso

class HeroActivity : AppCompatActivity() {
    lateinit var heroTextView: TextView
    lateinit var heroImageView: ImageView
    lateinit var heroDescriptionView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero)

        // Vincular las vistas
        heroTextView = findViewById(R.id.hero_name)
        heroImageView = findViewById(R.id.hero_image)
        heroDescriptionView = findViewById(R.id.hero_description)

        // Obtener el ID del héroe que se pasó a través del Intent
        val heroId = intent.getIntExtra("heroId", 0)

        // Buscar el héroe en la lista por su ID
        val hero = Hero.heroes.firstOrNull { it.id == heroId }

        // Mostrar el nombre del héroe en el TextView
        heroTextView.text = hero?.name ?: "Héroe no encontrado"

        // Cargar la imagen del héroe
        hero?.let {
            Picasso.get().load(hero.image).into(heroImageView)
            heroDescriptionView.text = hero.description
        }
    }
}
