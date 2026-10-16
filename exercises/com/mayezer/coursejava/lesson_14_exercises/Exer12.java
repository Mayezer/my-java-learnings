package com.mayezer.coursejava.lesson_14_exercises;

/* Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal.
Utilize as seguintes fórmulas:
01 - Para homens: (72.7 * altura) - 58
02 - Para mulheres: (62.1 * altura) - 44.7 
03 - Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. */

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How tall are you: ");
        double height = scan.nextDouble();

        System.out.print("What is your weight: ");
        double weight = scan.nextDouble();

        System.out.print("What is your sex? [M / W]: ");
        String sex = scan.next();

        if (sex.equalsIgnoreCase("M")) { // Jeito mais prático de comparar Strings. Se digitar em maiúsculo ou minúsculo, o programa vai entender.
            double weightMan = (72.7 * height) - 58;
            System.out.println("Your ideal weight is: " + weightMan);

            if (weight > weightMan) {
                System.out.println("You are above your ideal weight!");
            } else if (weight < weightMan) {
                System.out.println("You are below your ideal weight!");
            } else {
                System.out.println("You are at your ideal weight!");
            }
        }

        if (sex.equals("W") || sex.equals("w")) {
            double weightWoman = (62.1 * height) - 44.7;
            System.out.println("Your ideal weight is: " + weightWoman);

            if (weight > weightWoman) {
                System.out.println("You are above your ideal weight!");
            } else if (weight < weightWoman) { // Como se fosse o elif do Python.
                System.out.println("You are below your ideal weight!");
            } else {
                System.out.println("You are at your ideal weight!");
            }
        }

        scan.close();
    }
}
