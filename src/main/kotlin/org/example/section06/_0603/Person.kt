package org.example.section06._0603

class Person internal constructor(var nome: String, var sobrenome: String) {

    init {
        println("Cadastro da pessoa: $nome $sobrenome")
    }

    constructor(nome: String, sobrenome: String, nomeDoMeio: String) : this(nome, sobrenome)
}