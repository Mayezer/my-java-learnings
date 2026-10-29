package com.mayezer.coursejava.lesson_1_20_matrices;

public class MultidimensionalArrays {

    public static void main(String[] args) {

        // Instancia de uma matriz de 30 alunos (linhas) e 4 notas (colunas). 
        double[][] studentGrades1 = {{7, 8, 9, 10}, {8, 6, 7, 10}}; // array de arrays

        double[][] studentGrades = new double[30][4]; // É uma tabela de 30 por 4.

        studentGrades[0][0] = 10; // Notas do primeiro aluno
        studentGrades[0][1] = 7;
        studentGrades[0][2] = 9;
        studentGrades[0][3] = 9.5;

        studentGrades[1][0] = 8; // Notas do segundo aluno
        studentGrades[1][1] = 5.5;
        studentGrades[1][2] = 7;
        studentGrades[1][3] = 9;

        studentGrades[2][0] = 5; // Notas do terceiro aluno. E por ai vai... Podemos ter notas para 30 alunos.
        studentGrades[2][1] = 5.5;
        studentGrades[2][2] = 4;
        studentGrades[2][3] = 7;


        // Manipulação
        for (int i = 0; i < studentGrades.length; i++) { // Roda o loop na coluna
            for (int j = 0; j < studentGrades[i].length; j++) { // Roda o loop na linha
                System.out.println(studentGrades[i][j] + " "); // Printa os valores de todas as colunas e linhas.
            }
            System.out.println("\n"); // Pula uma linha a cada coluna.
        }

        studentGrades[1][3] = 8; // Alterando o valor da nota do segundo aluno, na posição 3.

        System.out.println("Calculating each student's average"); // Cauculando a média dos alunos
        double sumAverage;
        for (int k = 0; k < studentGrades.length; k++) {
            sumAverage = 0;
            for (int l = 0; l < studentGrades[k].length; l++) {
                sumAverage += studentGrades[k][l];
            }
            System.out.println("Student's average: " + k + " is = " + (sumAverage/4));
        }

        // Matrizes irregulares
        int[][] jaggedArray = new int[3][];

        jaggedArray[0] = new int[2]; // linha 0 has 2 coluna
        jaggedArray[1] = new int[4]; 
        jaggedArray[2] = new int[3];

        int count = 1;
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                jaggedArray[row][col] = count++;
            }
        }

        System.out.println("Jagged Array Contents:");
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}
