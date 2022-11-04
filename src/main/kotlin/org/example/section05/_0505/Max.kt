package org.example.section05._0505

fun <T: Comparable<T>> max(parametro1: T, parametro2: T) : T {
     val result = parametro1.compareTo(parametro2)
    return if(result > 0) parametro1 else parametro2
}