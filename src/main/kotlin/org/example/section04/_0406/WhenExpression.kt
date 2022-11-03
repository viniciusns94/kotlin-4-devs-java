package org.example.section04._0406

fun main() {

    val pizzasPedidas = 7

    when (pizzasPedidas) {
        0 -> println("Sem Fome")
        1 -> println("Esta com fome")
        2 -> println("Muita fome")
        else -> println("Você tem certeza ?")
    }

    when (pizzasPedidas) {
        0 -> println("Sem Fome")
        1, 2 -> println("Fome")
        3 -> println("Muita fome")
        else -> println("Você tem certeza ?")
    }

    when (pizzasPedidas) {
        Math.abs(pizzasPedidas) -> println("Peça 0 ou mais pizzas")
        else -> println("Você pediu menos de 0 pizzas")
    }

    when (pizzasPedidas) {
        0 -> println("Nós precisamos de pedidos")
        in 1 .. 4 -> println("Pegue algumas encomendas") //acrescentar ".." entre os valores e a palavra reservada "in" ao início
        in 5 .. 9 -> println("Pedidos em alta")
        else -> println("Você tem certeza ?")
    }

    when {
        pizzasPedidas <= 0 -> println("Nada foi pedido")
        pizzasPedidas % 2 == 1 -> println("Número ímpar de pedidos")
        pizzasPedidas % 2 == 0 -> println("Número par de pedidos")
    }
}