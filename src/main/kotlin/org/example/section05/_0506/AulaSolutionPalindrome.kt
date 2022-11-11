package org.example.section05._0506

class AulaSolutionPalindrome {

    fun isPalindrome(palavra: String) {
        if (palavra.uppercase().equals(palavra.reversed().uppercase()))
            println("$palavra é um palindrome")
        else
            println("$palavra Não é um palindrome")
    }
}