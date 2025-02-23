package org.example


fun main() {
    val articulo1 = Articulo("Mochila", 25.0)
    val articulo2 = Articulo("Auriculares", 45.0)
    val ordenador1 = Ordenador("PC Gamer", 1299.99, TipoOrdenador.GAMING)
    val ordenador2 = Ordenador("Laptop Básica", 399.99, TipoOrdenador.BASICO)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    println("Precios antes de la promoción de Navidad:")
    articulos.forEach { println(it) }

    println("Aplicando promoción del 20%...")
    articulos.forEach { it.promocionNavidad(20.0) }

    println("Precios después de la promoción de Navidad:")
    articulos.forEach { println(it) }
}