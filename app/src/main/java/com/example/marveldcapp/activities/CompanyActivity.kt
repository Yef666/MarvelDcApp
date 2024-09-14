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
import com.example.marveldcapp.models.Company

class CompanyActivity : AppCompatActivity() {
    lateinit var companyTitle: TextView
    lateinit var heroRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_company)

        companyTitle = findViewById(R.id.company_title)
        heroRecyclerView = findViewById(R.id.company_recyclerview)

        // Obtén el ID de la compañía desde el intent
        val companyId = intent.getIntExtra("companyId", 0)
        Log.i("CompanyActivity", "El Id que me pasaron es: $companyId")

        // Busca la compañía correspondiente
        val company = Company.companies.firstOrNull { company ->
            company.id == companyId
        }
        Log.i("CompanyActivity", company.toString())

        // Actualiza el título de la actividad con el nombre de la compañía
        companyTitle.text = company?.name

        // Filtra los héroes que pertenecen a la compañía seleccionada
        val heroes = Hero.heroes.filter { hero ->
            hero.companyId == companyId
        }
        Log.i("CompanyActivity", heroes.toString())

        // Configura el adaptador y la vista en cuadrícula para el RecyclerView
        heroRecyclerView.adapter = HeroAdapter(heroes) { hero ->
            val intent = Intent(this@CompanyActivity, HeroActivity::class.java)
            intent.putExtra("heroId", hero.id)
            startActivity(intent)
        }
        heroRecyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}
