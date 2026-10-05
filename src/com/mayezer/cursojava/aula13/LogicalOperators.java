package com.mayezer.cursojava.aula13;

public class LogicalOperators {

    public static void main(String[] args) {

        int value01 = 1;
        int value02 = 2;

        boolean result01 = (value01 == 1) && (value02 == 2);
        System.out.println("Result: " + result01); // true

        boolean result02 = (value01 == 1) || (value02 == 2);
        System.out.println("Result: " + result02); // true

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso); // false
        System.out.println(verdadeiro || falso); // true
        System.out.println(verdadeiro ^ falso); // true
        System.out.println(!verdadeiro && falso); // false
        System.out.println(!verdadeiro || falso); // false
    }
}
