package com.example.marveldcapp.models

data class Hero(
    val id: Int,
    val name: String,
    val description: String,
    val image: String,
    val publisherId: Int,
    val companyId: Int

) {
    companion object {
        val heroes = mutableListOf<Hero>(
            // Marvel Heroes
            Hero(1, "Spider-Man", "El Hombre Araña, con habilidades sobrehumanas y sentido arácnido.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/p/l/plantilla-imagenes-tooys_8_7.jpg", 1, 1),
            Hero(3, "Iron Man", "Tony Stark, el genio multimillonario con una armadura avanzada.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/i/r/iron-man-mark-xlii-20-deluxe_marvel_hot-toys_0.jpg", 1, 1),
            Hero(5, "Captain America", "Steve Rogers, el supersoldado patriota.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/c/a/captain-america-1-1-bust_0.jpg", 1, 1),
            Hero(7, "Thor", "Dios del trueno, hijo de Odín.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/t/h/thor-00.jpg", 2, 1),
            Hero(9, "Black Widow", "Natasha Romanoff, la espía maestra.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/f/u/funko-pop-603-natasha-romanoff-black-widow.jpg", 2, 1),
            Hero(11, "Hulk", "Bruce Banner, un científico que se transforma en un gigante verde.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/h/u/hulk-she-hulk-funko-01.jpg", 2, 1),
            Hero(13, "Doctor Strange", "El Hechicero Supremo y guardián de las artes místicas.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/d/r/dr.strangers-8.png", 3, 1),
            Hero(15, "Scarlet Witch", "Wanda Maximoff, con habilidades de manipulación de la realidad.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/s/c/scarleth-witch-marvel-leyends-hasbro-tooys.jpg", 3, 1),
            Hero(17, "Black Panther", "T'Challa, el rey de Wakanda.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/b/l/black-panther-original-suit__hot-toys-00.jpg", 1, 1),
            Hero(19, "Deadpool", "Copia de Slade Wilson, el mercenario vocazas", "https://tooys.mx/media/catalog/product/cache/46541c45d67e6fc22f43e1701555bbb7/d/e/deadpool_deadpool_sh-figuarts_0.jpg", 3, 1),

            // DC Heroes
            Hero(2, "Superman", "El hombre de acero con poderes casi divinos.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/s/u/superman-chase-2.jpg", 2, 2),
            Hero(4, "Batman", "Bruce Wayne, el vigilante de Gotham.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/b/a/batman_todd_mcfarlane_01.jpg", 4, 2),
            Hero(6, "Wonder Woman", "Diana, la guerrera amazona.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/w/o/wonder-woman-special-edition_00.png", 1, 2),
            Hero(8, "Flash", "Barry Allen, el hombre más rápido del mundo.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/m/u/muerte-roja-vs-flash-macfarlane-tooys-11_1.jpg", 4, 2),
            Hero(10, "Aquaman", "Rey de la Atlántida con poderes acuáticos.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/a/q/aquaman_exclusivo_00.png", 2, 2),
            Hero(12, "Green Lantern", "Hal Jordan, el portador del anillo de poder.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/g/r/green-lantern_dc-comics_feature.jpg", 4, 2),
            Hero(14, "Cyborg", "Victor Stone, un héroe mitad humano, mitad máquina.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/c/y/cybor-mcfarlane-justice-league-figure-tooys-06_1.jpg", 4, 2),
            Hero(16, "Shazam", "Un niño que se convierte en un superhéroe adulto al decir 'Shazam!'.", "https://tooys.mx/media/catalog/product/cache/39c7ff5a74bd9fa282a021db605b774d/s/h/shazam-00.png", 2, 2),
            Hero(18, "Joker", "El jajas, el enemigo más conocido de Batman", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/t/h/the-joker_colletor_dc-comics_hot-toys_0.jpg", 1, 2),
            Hero(20, "Harley Queen", "Novia del jajas, su primera aparición fue en la serie de tv the Batman.", "https://tooys.mx/media/catalog/product/cache/b08da76a6a11be3f8c423a2fce86c081/h/a/harley-quinn_dc-comics_2.jpg", 1, 2)
        )
    }
}
