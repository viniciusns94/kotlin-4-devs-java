package org.example.section08._0803

fun main() {
    val estudante = getStudents()

    val combos = estudante.map { a -> "${a.nome} : ${a.idade}" }
    println("Combos: $combos")
    println("Estudante mais velho: ${estudante.maxByOrNull { it.idade }}")
    println("Estudante com nome longo: ${estudante.filter { it.nome.length > 5 }}")
}