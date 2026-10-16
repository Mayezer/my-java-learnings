package com.mayezer.coursejava.lessons_16_17_exercises;

/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%,
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça o programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento. */

public class Exer22 {

    public static void main(String[] args) {

        double countryA;
        double countryB;

        int totalYears = 0;

        for (countryA = 80000, countryB = 200000; countryA >= countryB; ) {
            double populationTotalGrowthA = (countryA * 0.03) + countryA;
            double populationTotalGrowthB = (countryB * 0.015) + countryB;
            countryA = populationTotalGrowthA;
            countryB = populationTotalGrowthB;
            totalYears++;
        }
        System.out.println("End! Total years: " + totalYears);
    }
}


