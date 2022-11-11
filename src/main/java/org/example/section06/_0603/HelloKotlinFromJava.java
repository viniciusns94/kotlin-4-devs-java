package org.example.section06._0603;

import org.example.section05._0505.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {
        Person rob = new Person("Malcon", "X");
        System.out.println("O nome é " + rob.getNome() + " " + rob.getSobrenome());

        rob.setNome("Mayk");
        System.out.println("O nome agora é " + rob.getNome() + " " + rob.getSobrenome());

        Integer maxInt = MaxKt.max(2022, 2002);
        System.out.println("O maior valor é " + maxInt);
    }
}
