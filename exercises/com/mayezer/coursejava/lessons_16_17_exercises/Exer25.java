package com.mayezer.coursejava.lessons_16_17_exercises;

import java.util.Scanner;

/* Faça um programa que leia 5 números e informa o maior número.
E informe a soma e a média dos números. */

public class Exer25 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;
        int quantityOfNumbers;

        for (number = 1, quantityOfNumbers = 5 + 1; number < quantityOfNumbers; number++) {
            System.out.print(number + " Number: ");
            double numbers = scan.nextDouble();

            if (number + 1  == quantityOfNumbers) {
                System.out.println(numbers);
            }
        }

        // System.out.println(numbers);

        scan.close();
    }
}
