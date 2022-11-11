package org.example.section07._0706

data class MyOperators(val num1: Int, val num2: Int) {

    operator fun plus(other: MyOperators): MyOperators  = MyOperators(num1 + other.num1, num2 + other.num2)

    operator fun minus(other: MyOperators): MyOperators = MyOperators(num1 - other.num1, num2 - other.num2)
}
