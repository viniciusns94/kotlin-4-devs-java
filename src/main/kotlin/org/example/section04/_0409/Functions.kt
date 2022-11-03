package org.example.section04._0409

fun myMathFuncion(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun myExpresionBodyFuncion(number1: Int, number2: Int): Int = number1 + number2

fun myExpresionBodyFuncionInference(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Oi") : Int {
    val result = number1 + number2
    println(message)
    return result
}

fun main() {
    println("10 + 20 = ${myMathFuncion(10, 20)}")
    println("15 + 25 = ${myExpresionBodyFuncion(15, 25)}")
    println("10 + 10 = ${myExpresionBodyFuncionInference(10, 10)}")
    println("10 + 10 = ${myFunctionWithDefaults(10, 10)}")
    println("10 + 10 = ${myFunctionWithDefaults(10, 10, "Hello")}")
    println("Default SUM = ${myFunctionWithDefaults(message = "Hello")}")
}