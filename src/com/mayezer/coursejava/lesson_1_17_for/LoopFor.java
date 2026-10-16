package com.mayezer.coursejava.lesson_1_17_for;

public class LoopFor {

    public static void main(String[] args) {

        System.out.println("Learning the for loop!");

        for (int i = 0; i < 5; i++) { // Este é um for NORMAL.
            System.out.println("i Has the value: " + i);
        }

        // A várivel i não está duplicada, cada loop for está dentro de uma própria condição. Então ela só vale dentro desse bloco.

        for (int i = 5; i < 0; i--) { // Este é um for NORMAL.
            System.out.println("i Has the value: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) { // for com mais de uma variável.
            System.out.println("i Has the value: " + i + " j Has the value: " + j);
        }

        /*int i = 0;
        for (; i < 5; ) {  for com parte ausentes.
            System.out.println("i Has the value: " + i);
            i++;
        } */

        /*for (; ; ) {  loop infinito, nunca para. Não tente isso em casa!
            System.out.println("i Has the value: " + i);
        } */

        int count = 0;
        for (int i = 1; i < 5; count += i++) { // loop for sem corpo. Mais utilizados para somar valores.
            System.out.println("The value of the sum is: " + count);
        }
    }
}
