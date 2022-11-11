package org.example.section08._0804

fun cosureMaker(): () -> Unit {
    var number = 0
    return {
        println(number++)
    }
}

fun main() {
    val myCounter1 = cosureMaker()
    val myCounter2 = cosureMaker()

    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()
}