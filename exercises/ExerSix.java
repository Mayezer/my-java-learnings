package exercises;

// Faça um programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class ExerSix {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the diameter of the circle: ");
        double diameterCircler = scan.nextDouble();

        double radius = diameterCircler / 2;
        System.out.println("The radius of the circle is: " + radius);
    }
}
