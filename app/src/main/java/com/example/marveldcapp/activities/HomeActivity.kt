package com.example.marveldcapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import com.example.marveldcapp.MainActivity
import com.example.marveldcapp.R
import com.example.marveldcapp.adapters.PublisherAdapter
import com.example.marveldcapp.adapters.HeroAdapter
import com.example.marveldcapp.models.Hero
import com.example.marveldcapp.models.Publisher
import com.example.marveldcapp.models.User

class HomeActivity : AppCompatActivity() {
    lateinit var usernameTV: TextView
    lateinit var logoutBtn: ImageView
    lateinit var publisherRecyclerView: RecyclerView
    lateinit var heroRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)
        usernameTV = findViewById(R.id.usernameTV)
        logoutBtn = findViewById(R.id.logoutBtn)
        publisherRecyclerView = findViewById(R.id.publisher_recycleview)
        heroRecyclerView = findViewById(R.id.heroes_recyclerview)

        // Configurar el RecyclerView de publishers
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers) { publisher ->
            Log.i("Publisher desde Home", publisher.name)
            val intent = Intent(this@HomeActivity, PublisherActivity::class.java)
            intent.putExtra("publisherId", publisher.id)
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Configurar el RecyclerView de héroes
        heroRecyclerView.adapter = HeroAdapter(Hero.heroes) { hero ->
            val intent = Intent(this@HomeActivity, Hero::class.java)
            intent.putExtra("heroId", hero.id)
            startActivity(intent)
        }
        heroRecyclerView.layoutManager = GridLayoutManager(this, 2)

        // Asignar el nombre del usuario
        val user = User.users[1]
        usernameTV.text = user.computedName

        // Manejar el botón de logout
        logoutBtn.setOnClickListener {
            Log.i("LOGOUT", "Cerrando sesión")
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Ajuste de márgenes en la ventana principal
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
