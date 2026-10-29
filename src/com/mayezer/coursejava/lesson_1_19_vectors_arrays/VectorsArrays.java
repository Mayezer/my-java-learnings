package com.mayezer.coursejava.lesson_1_19_vectors_arrays;

public class VectorsArrays {

    public static void main(String[] args) {

        double[] temperatures = new double[365]; // Separamos na mémoria, 365 posições (valores) para ser guardados.
        temperatures[0] = 31.3; // Primeiro índice sempre começa em 0.
        temperatures[1] = 32;
        temperatures[2] = 33.7;
        temperatures[3] = 34;
        temperatures[4] = 33.1;
        temperatures[49] = 36.2;

        System.out.println("The temperature for the day one is: " + temperatures[0]); // Imprimimos o primeiro valor. No caso: 31.3.

        System.out.println("Array size: " + temperatures.length); // Nos mostra a quatidade de mémoria que separamos para o array. No caso, 365.

        for (int i = 0; i < temperatures.length; i++) { // printa os valores que temos salvos no array.
            System.out.println("The temperature for the day " + (i + 1) + " is: " + temperatures[i]); // Imprimimos os valores cadastrados do array.
        }

        for (double temp : temperatures) { // Um for melhorado para trabalhar com arrays. for-each.
            System.out.println(temp);
        }

        int[] numbersOneToTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int numberOneToTen : numbersOneToTen) { // Percorre todo o array/vetor
            System.out.println(numberOneToTen);
        }

        int[] myNumbers = new int[5]; // Definimos um vertor/array com tamanho 5 na memória. No caso: 0, 1, 2, 3, 4

    }
}
