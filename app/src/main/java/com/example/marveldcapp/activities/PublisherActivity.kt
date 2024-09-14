package com.example.marveldcapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marveldcapp.R
import com.example.marveldcapp.adapters.HeroAdapter
import com.example.marveldcapp.models.Hero
import com.example.marveldcapp.models.Publisher

class PublisherActivity : AppCompatActivity() {
    lateinit var publisherTitle: TextView
    lateinit var heroRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)

        publisherTitle = findViewById(R.id.publisher_title)
        heroRecyclerView = findViewById(R.id.publisher_recyclerview)

        // Obtén el ID del publicador desde el intent
        val publisherId = intent.getIntExtra("publisherId", 0)
        Log.i("PublisherActivity", "El Id que me pasaron es: $publisherId")

        // Busca el publicador correspondiente
        val publisher = Publisher.publishers.firstOrNull { publisher ->
            publisher.id == publisherId
        }
        Log.i("PublisherActivity", publisher.toString())

        // Actualiza el título de la actividad con el nombre del publicador
        publisherTitle.text = publisher?.name

        // Filtra los héroes que pertenecen al publicador seleccionado
        val heroes = Hero.heroes.filter { hero ->
            hero.publisherId == publisherId
        }
        Log.i("PublisherActivity", heroes.toString())

        // Configura el adaptador y la vista en cuadrícula para el RecyclerView
        heroRecyclerView.adapter = HeroAdapter(heroes) { hero ->
            val intent = Intent(this@PublisherActivity, HeroActivity::class.java)
            intent.putExtra("heroId", hero.id)
            startActivity(intent)
        }
        heroRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}
