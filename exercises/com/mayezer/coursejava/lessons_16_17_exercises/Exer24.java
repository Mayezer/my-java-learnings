package com.mayezer.coursejava.lessons_16_17_exercises;

/*Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
Depois modifique o programa para que ele mostre os números um ao lado do outro */

public class Exer24 {

    public static void main(String[] args) {

        int number1;
        int number2;

        for (number1 = 1, number2 = 20; number1 <= number2; number1++) {
            System.out.println("As long as: " + number1);
        }
        for (number1 = 1, number2 = 20; number1 <= number2; number1++) {
            System.out.print("As long as: " + number1 + "\t");
        }
    }
}
