package com.mayezer.coursejava.lesson_14_exercises;

/* Faça um programa que peça 02 números inteiros e um número real.
Calcule e mostre:
01 - O produto do dobro do primeiro com a metade do segundo.
02 - A soma do triplo do primeiro número com o terceiro.
03 - O terceiro elevado ao cubo. */

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstNumberInt = scan.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumberInt = scan.nextInt();

        System.out.print("Enter the first real number: ");
        double realNumber = scan.nextDouble();

        int firstAndSecondNumber = (firstNumberInt * 2) * (secondNumberInt / 2);
        double firstAndRealNumber = (firstNumberInt * 3 ) + realNumber;
        double realNumberCube = (realNumber * (realNumber * realNumber));

        System.out.println("Twice the first number plus half the second is: " + firstAndSecondNumber);
        System.out.println("Three times the first number plus the third number (real number): " + firstAndRealNumber);
        System.out.println("The third number (real number) raised to the third power: " + realNumberCube);
    }
}
