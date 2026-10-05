package exercises;

// Faça um programa que converta metros para centímetros.

import java.util.Scanner;

public class ExerFive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of meters: ");
        double meters = scan.nextDouble();

        double centimeters = meters * 100;

        System.out.println("In meters: " + meters + " | Transform in centimeters: " + centimeters);
    }
}
