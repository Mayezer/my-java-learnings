package com.mayezer.coursejava.lesson_15_exercises;

import java.util.Scanner;

/* Faça um programa para a leitura de duas notas parciais de uma aluno.
O programa deve calcular a média alcançada pro aluno e apresentar:
01 - A mensagem "Aprovado", se a média alcaçada for maior ou igual a 07;
02 - A mensagem "Reprovado", se a média dor menor do que 07;
03 - A mensagem "Aprovado com Distinção", se a média for igual a 10. */



public class Exer17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the student's name: ");
        String studentName = scan.next();

        System.out.print("What is the student's first grade: ");
        double firstGrade = scan.nextDouble();

        System.out.print("What is the student's second grade: ");
        double secondGrade = scan.nextDouble();

        double averageGrade = (firstGrade + secondGrade) / 2;

        if (averageGrade == 10) {
            System.out.println(studentName + " You passed with honors!! With the score: " + averageGrade);
        } else if (averageGrade <= 7) {
            System.out.println(studentName + " You failed with an average of: " + averageGrade);
        } else {
            System.out.println(studentName + " You passed with an average of: " + averageGrade);
        }
    }
}
