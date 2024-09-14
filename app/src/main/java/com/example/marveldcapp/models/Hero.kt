package com.example.marveldcapp.models

data class Hero(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val publisherId: Int,
    val companyId: Int // Nuevo campo agregado
) {
    companion object {
        val heroes = mutableListOf<Hero>(
            // Marvel Heroes
            Hero(1, "Spider-Man", "El Hombre Araña, con habilidades sobrehumanas y sentido arácnido.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/i/r/iron-spider_marvel_hot-toys_04.jpg", 1, 1),
            Hero(2, "Iron Man", "Tony Stark, el genio multimillonario con una armadura avanzada.", "https://example.com/ironman.png", 1, 1),
            Hero(3, "Captain America", "Steve Rogers, el supersoldado patriota.", "https://example.com/captainamerica.png", 1, 1),
            Hero(4, "Thor", "Dios del trueno, hijo de Odín.", "https://example.com/thor.png", 1, 1),
            Hero(5, "Black Widow", "Natasha Romanoff, la espía maestra.", "https://example.com/blackwidow.png", 1, 1),
            Hero(6, "Hulk", "Bruce Banner, un científico que se transforma en un gigante verde.", "https://example.com/hulk.png", 1, 1),
            Hero(7, "Doctor Strange", "El Hechicero Supremo y guardián de las artes místicas.", "https://example.com/doctorstrange.png", 1, 1),
            Hero(8, "Scarlet Witch", "Wanda Maximoff, con habilidades de manipulación de la realidad.", "https://example.com/scarletwitch.png", 1, 1),
            Hero(9, "Black Panther", "T'Challa, el rey de Wakanda.", "https://example.com/blackpanther.png", 1, 1),
            Hero(10, "Ant-Man", "Scott Lang, el ladrón convertido en superhéroe con la capacidad de encogerse.", "https://example.com/antman.png", 1, 1),

            // DC Heroes
            Hero(11, "Superman", "El hombre de acero con poderes casi divinos.", "https://example.com/superman.png", 2, 2),
            Hero(12, "Batman", "Bruce Wayne, el vigilante de Gotham.", "https://example.com/batman.png", 2, 2),
            Hero(13, "Wonder Woman", "Diana, la guerrera amazona.", "https://example.com/wonderwoman.png", 2, 2),
            Hero(14, "Flash", "Barry Allen, el hombre más rápido del mundo.", "https://example.com/flash.png", 2, 2),
            Hero(15, "Aquaman", "Rey de la Atlántida con poderes acuáticos.", "https://example.com/aquaman.png", 2, 2),
            Hero(16, "Green Lantern", "Hal Jordan, el portador del anillo de poder.", "https://example.com/greenlantern.png", 2, 2),
            Hero(17, "Cyborg", "Victor Stone, un héroe mitad humano, mitad máquina.", "https://example.com/cyborg.png", 2, 2),
            Hero(18, "Shazam", "Un niño que se convierte en un superhéroe adulto al decir 'Shazam!'.", "https://example.com/shazam.png", 2, 2),
            Hero(19, "Green Arrow", "Oliver Queen, un arquero experto y justiciero de Star City.", "https://example.com/greenarrow.png", 2, 2),
            Hero(20, "Martian Manhunter", "J'onn J'onzz, el último sobreviviente de Marte con poderes mentales.", "https://example.com/martianmanhunter.png", 2, 2)
        )
    }
}
