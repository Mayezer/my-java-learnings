package com.mayezer.coursejava.lesson_15_exercises;

// Faça um programa que verifique se uma letra digitada é vogal ou consoante.

import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scan.next();

        if (letter.equalsIgnoreCase("A")) {
            System.out.println("It's a vowel!");
        } else if (letter.equalsIgnoreCase("E")) {
            System.out.println("It's a vowel!");
        } else if (letter.equalsIgnoreCase("I")) {
            System.out.println("It's a vowel!");
        } else if (letter.equalsIgnoreCase("O")) {
            System.out.println("It's a vowel!");
        } else if (letter.equalsIgnoreCase("U")) {
            System.out.println("It's a vowel!");
        } else {
            System.out.println("It's a consonant!");
        }
    }
}
