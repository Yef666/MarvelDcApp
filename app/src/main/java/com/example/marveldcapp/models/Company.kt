package com.example.marveldcapp.models

data class Company(val id: Int, val name: String, val image: String) {
    companion object {
        val companies = mutableListOf<Company>(
            Company(1, "Marvel", "https://cdn.shopify.com/s/files/1/0558/6413/1764/files/Marvel_Logo_Design_History_Evolution_0_1024x1024.jpg?v=1694102537"),
            Company(2, "DC Comics", "https://upload.wikimedia.org/wikipedia/commons/1/1c/DC_Comics_logo.png")
        )
    }
}
