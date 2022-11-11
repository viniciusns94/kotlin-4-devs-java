package org.example.section07._0706

lateinit var p1: MyOperators
lateinit var p2: MyOperators

fun soma() {
    val p3 = p1 + p2
    println(p3.toString())
}

fun sub() {
    val p3 = p1 - p2
    println(p3.toString())
}

fun main() {
    p1 = MyOperators(200, 100)
    p2 = MyOperators(1000, 2000)
    soma()
    sub()
}