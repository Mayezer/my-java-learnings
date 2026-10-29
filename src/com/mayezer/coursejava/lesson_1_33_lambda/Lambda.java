package com.mayezer.coursejava.lesson_1_33_lambda;

public class Lambda {

    interface  FactorialNumber { // Criamos nosso Lambda
        boolean test(int a, int b);
    }

    public static void main(String[] args) {

        // Uma expressão/função lambda é uma expressão anonima, onde ela é executada uma vez, e para de funcionar.
        // Usada para pequenas e simples tarefas
        FactorialNumber isFactor = (a, b) -> (b % a) == 0; // Declaração Lambda, só declaramos uma variável para podermos retornar algo, mas nem precisa.

        if (isFactor.test(9, 5)) {
            System.out.println("05 is a factor of 09.");
        } else {
            System.out.println("05 is not a factor of 09.");
        }


    }
}
