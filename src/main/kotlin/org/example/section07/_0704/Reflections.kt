package org.example.section07._0704

fun main() {

    val person = Person("Stan", "Lee")

    val kClass = person::class

//    println("Simple name = $kClass")
    println("Simple name = ${kClass.simpleName}")

    for (fields in kClass.java.declaredFields) {
//        println("Property name = $fields")
        println("Property name = ${fields.name}")
    }
    for (contructor in kClass.constructors) {
        println("Constructor = $contructor")
        println("Constructor Return = ${contructor.returnType}")
        println("Constructor Return = ${contructor.parameters}")
    }
}