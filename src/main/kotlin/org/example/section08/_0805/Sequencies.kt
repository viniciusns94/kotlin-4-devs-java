package org.example.section08._0805

fun main() {
    val estudantes = getStudents()

    val sqStudents = estudantes.drop(1).take(3).toList()
    println("Sequencia de estudantes: $sqStudents")

    val numeros = generateSequence(100) { it + 1 }
    println("Numeros: ${numeros.drop(5).take(20).toList()}")

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Números ao quadrado: ${evenSquares.take(5).toList()}")

    val fibonacci = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: ${fibonacci.take(15).toList()}")
}