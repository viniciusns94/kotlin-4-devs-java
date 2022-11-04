package org.example.section04._0411

fun myFizzBuzz(n: Int): List<String> {
    var i = 1
    val result = mutableListOf<String>()
    while (n >= i && i < 100) {
        when {
            i % 3 == 0 && i % 5 == 0 -> result.add("FizzBuzz")
            i % 3 == 0 -> result.add("Fizz")
            i % 5 == 0 -> result.add("Buzz")
            else -> result.add("$i")
        }
        i++
    }
    return result
}

fun fizzBuzz1Aula(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (it in 1..n) {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        result.add(item)
    }
    return result
}

fun fizzBuzz2Aula(n: Int): List<String> {
    val result = mutableListOf<String>()
    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
        result.add(item)
    }
    return result
}

fun main() {
//    print(myFizzBuzz(5))
//    println()
//    print(myFizzBuzz(16))

//    print(fizzBuzz1Aula(5))
//    println()
//    print(fizzBuzz1Aula(16))

    print(fizzBuzz2Aula(5))
    println()
    print(fizzBuzz2Aula(16))
}