package com.mayezer.coursejava.lessons_16_17_exercises;

/* Faça um programa que peça uma nota, ente zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Say a number 0 - 10: ");
            double numberZeroToTen = scan.nextInt();

        if (numberZeroToTen > 10) {
                System.err.println("The number must be between 0 and 10!");
        } else {
            System.err.println("Your number is: " + numberZeroToTen);
            break;
        }
        }
        scan.close();
    }
}
