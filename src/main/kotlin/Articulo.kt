package org.example

open class Articulo(var nombre: String, var precio: Double) {
    private val id: Int = generarId()

    companion object {
        private var totalArticulos = 0
        private fun generarId(): Int {
            return ++totalArticulos
        }
    }

    open fun promocionNavidad(porcentaje: Double) {
        precio -= precio * (porcentaje / 100)
    }

    override fun toString(): String {
        return "$nombre - %.2f€ (ID: $id)".format(precio)
    }
}