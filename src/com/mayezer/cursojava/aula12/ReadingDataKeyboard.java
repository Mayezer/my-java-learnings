package com.mayezer.cursojava.aula12;

import java.util.Scanner; // Importamos a classe Scanner

public class ReadingDataKeyboard {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("Your full name is: " + fullName);

        System.out.println("Enter your frist name: ");
        String fristName = scan.nextLine();
        System.out.println("Your frist name is: " + fristName);*/

        // Podemos usar /* SEU TEXTO AQUI */ para documentar texto com mais de uma linha.

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your height: ");
        double heigt = scan.nextDouble();
        System.out.println("Your heigt is: " + heigt);
    }
}
