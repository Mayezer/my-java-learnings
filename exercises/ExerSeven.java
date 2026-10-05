package exercises;

// Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

import java.util.Scanner;

public class ExerSeven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Area of the first square: ");
        double firstSide = scan.nextDouble();

        System.out.print("Area of the second square: ");
        double secondSide = scan.nextDouble();

        double area = firstSide * secondSide;
        double doubleArea = area * 2;
        System.out.println("This is the area of the square: " + area + " | And this is twice the area of the square: " + doubleArea);
    }
}
