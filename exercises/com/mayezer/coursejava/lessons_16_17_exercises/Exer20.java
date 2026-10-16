package com.mayezer.coursejava.lessons_16_17_exercises;

/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário.
E mostre uma mensagem de erro e voltando a pedir informações. */

import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your username: ");
            String userName = scan.next();

            System.out.print("Enter your password: ");
            String password = scan.next();

            if (userName.contentEquals(password)) {
                System.out.println("Your USERNAME CANNOT be the SAME as your PASSWORD!");
            } else {
                System.out.println("Your Username and Password are registered. Thanks " + userName + "!");
                break;
            }
        }
    }
}
