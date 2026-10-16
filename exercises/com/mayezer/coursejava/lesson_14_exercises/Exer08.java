package com.mayezer.coursejava.lesson_14_exercises;

/* Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
Calcule e mostre o total do seu salário no referido mês. */

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How much do you earn per hour at your job: R$ ");
        double moneyPerHour = scan.nextDouble();

        System.out.print("How many hours did you work during the month: ");
        double hoursMounth = scan.nextDouble();

        double moneyForMounth = moneyPerHour * hoursMounth;

        System.out.println("You earn per hour: R$ " + moneyPerHour + " | You worked this month: " + hoursMounth);
        System.out.println("You will receive this month: R$ " + moneyForMounth);
    }
}
