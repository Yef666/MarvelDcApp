package com.example.marveldcapp.models

data class Publisher(val id: Int, val name: String, val image: String) {
    companion object {
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "HotToys", "https://static.wikia.nocookie.net/metalgear/images/b/b9/LOGO-Hot-Toys.png/revision/latest/scale-to-width-down/1000?cb=20140511222939"),
            Publisher(2, "Funko", "https://1000marcas.net/wp-content/uploads/2023/10/Funko-Logo-500x281.png"),
            Publisher(3, "MarvelLegends", "https://static.wikia.nocookie.net/marvelcomicsfanon/images/4/44/MARVEL_LEGENDS_LOGO.png/revision/latest?cb=20220830201108"),
            Publisher(4, "McFarlane", "https://shop.bandai.co.uk/wp-content/uploads/2022/02/bandai-mcfarlane-toys-logo-001-1000x403.png")
        )
    }
}
