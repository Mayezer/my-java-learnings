package com.mayezer.coursejava.lessons_16_17_exercises;

/* Faça um programa que leia e valide as seguintes informações:
01 - Nome: Maior que 3 caracteres;
02 - Idade: Entre 0 e 130;
03 - Salário: Maior que 0;
04 - Sexo: "F" ou "M";
05 - Estado civil: "S", "C", "v", "D". */

import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scan.next();
            int total = name.length(); // Transforma o nome em um número inteiro, e .length() lê quantos caracteres.
            if (total <= 3) {
                System.out.println("Your name must be more than 03 characters long!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Age: ");
            int age = scan.nextInt();
            if (age > 130) {
                System.out.println("Enter a valid value between 0 and 130!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Salary: ");
            double salary = scan.nextDouble();
            if (salary <= 0) {
                System.out.println("Enter a valid salary, greater than 0!");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("W: Woman | M: Man");
            System.out.print("Sex [W|M]: ");
            String sex = scan.next();
            switch (sex) {
            case "M": break;
            case "m": break;
            case "W": break;
            case "w": break;
            default: System.out.println("Enter a valid sex, W or M!");
            continue;
            }
            break;
        }

        while (true) {
            System.out.println("S: Single | M: Married | W: Widower | D: Divorced");
            System.out.print("Marital status [S|M|W|D]: ");
            String maritalStatus = scan.next();
            switch (maritalStatus) {
            case "S": break;
            case "s": break;
            case "M": break;
            case "m": break;
            case "W": break;
            case "w": break;
            case "D": break;
            case "d": break;
            default: System.out.println("Enter a valid marital status, S, M, W or D!");
            continue;
            }
            break;
        }

        System.out.println("Registration saved. Thanks!");

    scan.close();
    }
}
