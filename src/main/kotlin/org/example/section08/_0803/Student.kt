package org.example.section08._0803

data class Student(val nome: String, var idade: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Adan", 19),
        Student("Manuel", 23),
        Student("Maria", 20),
        Student("João", 39),
        Student("José", 16)
    )
}
