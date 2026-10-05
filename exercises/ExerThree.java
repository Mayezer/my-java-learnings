package exercises;

// Faça um programa que peça dois números e imprima a soma entre eles.

import java.util.Scanner;

public class ExerThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int fristNumber = scan.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scan.nextInt();

        int result = fristNumber + secondNumber;
        System.out.println("The sum of the numbers is: " + result);
    }
}
