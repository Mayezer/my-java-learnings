package exercises;

// Faça um programa que peça as 04 notas bimestrais e mostre a média.

import java.util.Scanner;

public class ExerFour {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the student's name: ");
        String name = scan.nextLine();

        System.out.print("What is the first note: ");
        double firstNote = scan.nextDouble();

        System.out.print("What is the second note: ");
        double secondNote = scan.nextDouble();

        System.out.print("What is the third note: ");
        double thirdNote = scan.nextDouble();

        System.out.print("What is the fourth note: ");
        double fourthNote = scan.nextDouble();

        double average = (firstNote + secondNote + thirdNote + fourthNote) / 4;
        System.out.println("The student's " + name + " final average is: " + average);
    }
}
