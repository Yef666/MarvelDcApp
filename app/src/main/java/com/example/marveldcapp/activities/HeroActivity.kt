package com.example.marveldcapp.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.marveldcapp.R
import com.example.marveldcapp.models.Hero

class HeroActivity : AppCompatActivity() {
    lateinit var heroTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero)

        // Vincular el TextView para mostrar el nombre del héroe
        heroTextView = findViewById(R.id.hero_name)

        // Obtener el ID del héroe que se pasó a través del Intent
        val heroId = intent.getIntExtra("heroId", 0)

        // Buscar el héroe en la lista por su ID
        val hero = Hero.heroes.firstOrNull { hero: Hero ->
            hero.id == heroId
        }

        // Mostrar el nombre del héroe en el TextView
        heroTextView.text = hero?.name ?: "Héroe no encontrado"
    }
}
