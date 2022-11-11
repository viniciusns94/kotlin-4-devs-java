package org.example.section07._0705

data class Coordenadas(var latitude: Int, var longitude: Int) {

    operator fun plus(outra: Coordenadas): Coordenadas{
        return Coordenadas(latitude + outra.latitude, longitude + outra.longitude)
    }
}

