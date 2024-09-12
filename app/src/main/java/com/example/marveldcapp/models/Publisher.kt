package com.example.marveldcapp.models

data class Publisher(val id: Int, val name: String, val image: String) {
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "HotToys", "https://example.com/hottoys.png"),
            Publisher(2, "Funko", "https://example.com/funko.png"),
            Publisher(3, "MarvelLegends", "https://example.com/marvellegends.png"),
            Publisher(4, "McFarlane", "https://example.com/mcfarlane.png")
        )
    }
}
