package org.example.section05._0506

class Palindrome {

    private fun valida(palindrome: String): Boolean {
        val metade: Int = palindrome.length / 2
        var isPalindromo = true
        var msmPosicao = false

        var i = 0
        while (i <= metade && isPalindromo && !msmPosicao) {
            msmPosicao = i == palindrome.length - i
            val caracterInicial = palindrome[i]
            val caracterFinal = palindrome[(palindrome.length - 1) - i]

            isPalindromo = caracterInicial.equals(caracterFinal)

            i++
        }
        return isPalindromo
    }

    fun isPalindrome(palindome: String) {
        val palavra = palindome.uppercase()
        if (valida(palavra))
            println("$palavra é um palindrome")
        else
            println("$palavra Não é um palindrome")
    }
}