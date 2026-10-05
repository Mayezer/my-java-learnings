package com.mayezer.cursojava.aula13;

public class ShortCircuit {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean result01 = falso & verdadeiro; // Aqui ele checa os dois valores. Por isso é menos usado.
        boolean result02 = falso && verdadeiro; // Só verifica o primeiro valor, se for false é false, se for true é true.
        System.out.println(result01);
        System.out.println(result02);
    }
}
