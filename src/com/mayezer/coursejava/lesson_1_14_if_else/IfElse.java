package com.mayezer.coursejava.lesson_1_14_if_else;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you: ");
        int age = scan.nextInt();

        if (age >= 18) { // Se idade for maior que 18, print: 
            System.out.println("You are of legal age!");
        } else { // Se não, print:
            System.out.println("You are a minor!");
        } 

        System.out.println("Enter the item price: ");
        double priceItem = scan.nextDouble();

        if (priceItem <= 10) {
            System.out.println("It's cheap—you can buy it.");
        } else if (priceItem > 10 && priceItem < 15) {
            System.out.println("You can ask for a discount.");
        } else if (priceItem >= 15 && priceItem < 17) {
            System.out.println("You can do more research.");
        } /* else { // priceItem >= 17
            System.out.println("It's very expensive. Don't buy it.");
        } */
    }
}
