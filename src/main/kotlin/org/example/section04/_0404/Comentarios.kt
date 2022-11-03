package org.example.section04._0404

fun main(){

    //um comentário de linha

    val minhaFrase = "Eu sou uma String"
    val minhaPi = 3.14
    val minhaIdade = 28

    val aString: String
    val aDouble: Double
    val aInt: Int

    /* Outro comentário
    porém este é um comentário
    em bloco
     */

    val myDouble = 1.999
    val myFloat = 1.9F //Identificar que a variável é float utlizar f ou F ao final da atribuição caso contrário vira Double
    val myLong = 903430430L //Itentificar que a variável é long utilizar L ao final da atribuição caso contrário vira Int
    val myInt = 234
    val myShort: Short = 12
    val myByte: Byte = 127 //intevalo de -128 até 127

    val aLongNumber = 123_456_789
    val theSameNumber = 123456789

    val anInt: Int = 7
    val aLong: Long = anInt.toLong()
}
/*
fun fooBar(){
    /*
    Eu sou um comentário embutido isso não funciona no Java
     */
} */