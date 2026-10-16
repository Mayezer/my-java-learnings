package com.mayezer.coursejava.lesson_14_exercises;

/* Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguite fórmula:
01 - (72.7 * altura) - 58 */

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How tall are you: ");
        double height = scan.nextDouble();

        double idealWeight = (72.7 * height) - 58;

        System.out.println("Your ideal weight based on your height is: " + idealWeight);
    }
}
