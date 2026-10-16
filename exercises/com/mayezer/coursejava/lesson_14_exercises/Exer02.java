package com.mayezer.coursejava.lesson_14_exercises;

// Faça um programa que peça um número e então mostr a mensagem: O número informado foi [número]

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("The number provided was: " + number);
    }
}
