package com.example.marveldcapp.models

data class User(val name:String,val email:String,val password: String){
    val computedName :String get() = "Hola, $name"
    companion object{
        val users = listOf(
            User("Yef","yef6rueda@outlook.com","12345"),
            User("Usuario","prueba123@hotmail.com","12345"),
            User("profe","profe@hotmail.com","12345")
        )
    }
}