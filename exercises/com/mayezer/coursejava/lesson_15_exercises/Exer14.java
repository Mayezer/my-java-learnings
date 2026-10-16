package com.mayezer.coursejava.lesson_15_exercises;

// Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double value = scan.nextDouble();

        if (value >= 0) {
            System.out.println("Your number is positive!");
        } else if (value <= 0) {
            System.out.println("Your number is negative!");
        }

        scan.close();
    }
}
