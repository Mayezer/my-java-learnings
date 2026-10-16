package com.mayezer.coursejava.lesson_15_exercises;

/* Faça um programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. */

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scan.next();

        if (letter.equalsIgnoreCase("F")) {
            System.out.println("Female!");
        } else if (letter.equalsIgnoreCase("M")) {
            System.out.println("Male!");
        } else {
            System.out.println("Invalid gender!");
        }
    }
}
