package com.mayezer.coursejava.lesson_1_16_while;

import java.util.Scanner;

public class LoopDoWhile {

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;
        int max = 20;

        System.err.println("Starting the count...");

        do { // Faça
            i++;
            System.out.println("The value of i is: " + i);
        } while (i < max); // Enquanto i for menor que max.

        System.out.println("The count has finished!");
    }
}
