package org.example.section05._0505

fun main() {

    val maxInt: Int = max(42, 99)
    val maxLong: Long = max(123_456_789L, 999_999_999L)
    val maxByte: Byte = max((-128).toByte(), (127).toByte())
    val maxString: String = max("Alfa", "Omega")

    println("O maior Int = $maxInt")
    println("O maior Long = $maxLong")
    println("O maior Byte = $maxByte")
    println("O maior String = $maxString")
}