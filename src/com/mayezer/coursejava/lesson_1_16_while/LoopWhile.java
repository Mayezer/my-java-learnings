package com.mayezer.coursejava.lesson_1_16_while;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1; // Variável i, cont ou count, são as mais usadas para algum sistema de contagem. 
        int max = 10;

        System.out.println("Counting down to: ");

        while (i <= max) {
            System.out.println("Value with i: " + i);
            i++; // É igual a i = i + 1; ou i += 1;
        }

        System.out.println("The count is over!");

        scan.close();
    }
}
