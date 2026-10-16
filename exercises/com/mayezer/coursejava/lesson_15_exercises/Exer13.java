package com.mayezer.coursejava.lesson_15_exercises;

// Faça um programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scan.nextDouble();

        if (firstNumber > secondNumber) {
            System.out.println("The first number is larger: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("The second number is larger: " + secondNumber);
        }
    }
}
