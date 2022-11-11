package org.example.section07._0705

import org.example.section07._0702.Coordenadas
import java.security.cert.PolicyNode

fun main() {

    showComponents()

    return

    val c1 = Coordenadas(200, 100)
    val c2 = Coordenadas(1000, 2000)
    val c3 = c1 + c2
    println(c3)

    val (lat, long) = c3

//    println("lat = $lat, long = $long")
    println("lat = ${c3.component1()}")
}

fun showComponents() {
    val myPoint = Point(5000, 500, 60000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}
