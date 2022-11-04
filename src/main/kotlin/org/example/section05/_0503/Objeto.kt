package org.example.section05._0503

object mySingleton {
    var temperaturas = arrayOf(18, 22, 26)
    fun getLastTemperature() = temperaturas.last()
}

fun main() {
    val location1 = object {
        var latitude = 200
        var longitude = 400
    }

    println("Coordenadadas = (${location1.latitude}, ${location1.longitude})")

    val location = object {
        var latitude = 300
        var longitude = 600
        fun printIt() {
            println("Coordenadadas = ($latitude, $longitude)")
        }
    }
    location.printIt()

    location.longitude = 3000
    location.latitude = 6000
    location.printIt()

    val temperatura = mySingleton.getLastTemperature()
    println("ültima temperatura medida = $temperatura graus!")
}