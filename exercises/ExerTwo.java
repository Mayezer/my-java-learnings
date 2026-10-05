package exercises;

// Faça um programa que peça um número e então mostr a mensagem: O número informado foi [número]

import java.util.Scanner;

public class ExerTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        System.out.println("The number provided was: " + number);
    }
}
