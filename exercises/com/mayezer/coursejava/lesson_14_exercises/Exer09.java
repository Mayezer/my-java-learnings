package com.mayezer.coursejava.lesson_14_exercises;

/* Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius
C = (5 * (f-32) / 9) */

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double transformInCelsius = (5 * (fahrenheit - 32)) / 9;

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit + "°F | And in Celsius: " + transformInCelsius + "°C");


        System.out.println("What is the temperature in Celsius: ");
        double celsius = scan.nextDouble();

        double transformInFahrenheit = ((celsius * 9) / 5) + 32;

        System.out.print("The temperature in Celsius is: " + celsius + "°C | And in Fahrenheit: " + transformInFahrenheit + "°F");
    }
}
