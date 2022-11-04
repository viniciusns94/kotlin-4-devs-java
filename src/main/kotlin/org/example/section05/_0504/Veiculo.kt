package org.example.section05._0504

interface Veiculo {

    val nomeMontadora: String

    fun start() {
        println("Vruuuuuuuummmmm")
    }

    fun stop() {
        println("Barulho de freio")
    }

    fun getKmPorLitro(): Int {
        return 17
    }

    fun getDoors(): Int
}