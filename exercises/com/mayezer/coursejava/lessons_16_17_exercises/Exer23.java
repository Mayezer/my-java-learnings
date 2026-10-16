package com.mayezer.coursejava.lessons_16_17_exercises;

/* Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%,
e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça o programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento. 

Altere o programa permitindo que o usuário informe as populações e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a operação. */

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.print("What is the population of country A: ");
            double countryA = scan.nextDouble();
            if (countryA <= 0) {
                System.out.println("We do not accept negative numbers or 0!");
                continue;
            }

            System.out.print("What is the population of country B: ");
            double countryB = scan.nextDouble();
            if (countryB <= 0) {
                System.out.println("We do not accept negative numbers or 0!");
                continue;
            }

            System.out.print("What is the growth percentage of country A: ");
            double growthPercentageA = scan.nextDouble();
            if (growthPercentageA <= 0) {
                System.out.println("We do not accept negative numbers or 0!");
                continue;
            }
            growthPercentageA = growthPercentageA / 100;

            System.out.print("What is the growth percentage of country B: ");
            double growthPercentageB = scan.nextDouble();
            if (growthPercentageB <= 0) {
                System.out.println("We do not accept negative numbers or 0!");
                continue;
            }
            growthPercentageB = growthPercentageB / 100;

            int totalYears = 0;

            if (countryA < countryB) {
                while (countryA <= countryB) {
                    double populationTotalGrowthA = (countryA * growthPercentageA) + countryA;
                    double populationTotalGrowthB = (countryB * growthPercentageB) + countryB;
                    countryA = populationTotalGrowthA;
                    countryB = populationTotalGrowthB;
                    totalYears++;

                }
            System.out.println("End! Total years: " + totalYears);
            } else if (countryA > countryB) {
                while (countryA >= countryB) {
                    double populationTotalGrowthA = (countryA * growthPercentageA) + countryA;
                    double populationTotalGrowthB = (countryB * growthPercentageB) + countryB;
                    countryA = populationTotalGrowthA;
                    countryB = populationTotalGrowthB;
                    totalYears++;

                }
            System.out.println("End! Total years: " + totalYears);
            } else if (countryA == countryB) {
                System.out.println("The numbers are the same!");
                continue;
            }

            // System.out.println("End! Total years: " + totalYears);

            System.out.print("Do you want to repeat? [Y|N]: ");
            String yesOrNo = scan.next();
            if (yesOrNo.equalsIgnoreCase("y")) {
                continue;
            }
            if (yesOrNo.equalsIgnoreCase("n")) {
                break;
            }
        }
        scan.close();
    }
}
