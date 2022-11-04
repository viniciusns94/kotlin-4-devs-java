package org.example.section05._0502

//class Person constructor(nome: String, sobrenome: String) {

//class Person (nome: String, sobrenome: String) {

class Person internal constructor(nome: String, sobrenome: String) {

    init {
        println("Cadastro da pessoa: $nome $sobrenome")
    }

    constructor(nome: String, sobrenome: String, nomeDoMeio: String) : this(nome, sobrenome)
}