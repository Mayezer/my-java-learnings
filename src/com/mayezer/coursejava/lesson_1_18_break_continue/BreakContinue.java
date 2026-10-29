package com.mayezer.coursejava.lesson_1_18_break_continue;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 7 == 0) {
                System.out.println("Value i is: " + i);
                break; // Para a execução do loop
            }
        }

        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 7 == 0) {
                continue; // Se usa mais continue quando é um for dentro de um for, no caso, fors aninhados.
            }
            System.out.println("Value i is: " + i);
        }
    }
}
