package com.example.ejercicioclase

data class Videojuego(val nombre: String, val plataforma: String)

fun contarJuegosPorPlataforma(lista: List<Videojuego>): Map<String, Int> {
    return lista.groupBy { it.plataforma }.mapValues { it.value.size }
}

fun main() {
    val listaVideojuegos = listOf(
        Videojuego("Juego1", "PC"),
        Videojuego("Juego2", "PS4"),
        Videojuego("Juego3", "Xbox"),
        Videojuego("Juego4", "PC"),
        Videojuego("Juego5", "Switch"),
        Videojuego("Juego6", "PS4"),
        Videojuego("Juego7", "Xbox"),
        Videojuego("Juego8", "PC")
    )

    val juegosPorPlataforma = contarJuegosPorPlataforma(listaVideojuegos)
    println("Número de juegos por plataforma: $juegosPorPlataforma")
}