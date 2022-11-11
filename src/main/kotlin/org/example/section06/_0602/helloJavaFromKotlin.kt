package org.example.section06._0602

fun main(){
    val gato = Animal("Garfield", "gato", 10)
    val cachorro = Animal("Totó", "cachorro", 30)
    println(gato.show())
    println(cachorro.show())

    gato.setmPeso(13)
    println(gato.show())
}