package org.example.section04._0405

fun main() {
    val myInt = 199
    val aInt: Int = 7

    //int menor = (myInt < aInt) ? myInt: aInt Code Java
    val menor = if (myInt < aInt) myInt else aInt

    val temp = 25
    val isAirConditionerOn = if(temp >= 26) {
        println("Esta quente")
        true
    } else {
        println("Não esta quente")
        false
    }
    println("O ar condicionado esta ligado: $isAirConditionerOn")
}