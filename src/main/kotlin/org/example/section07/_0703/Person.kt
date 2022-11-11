package org.example.section07._0703

@Deprecated("Use a classe Animal", ReplaceWith("Animal"))
class Person internal constructor(var nome: String, var sobrenome: String) {

    init {
        println("Cadastro da pessoa: $nome $sobrenome")
    }

    constructor(nome: String, sobrenome: String, nomeDoMeio: String) : this(nome, sobrenome)
}