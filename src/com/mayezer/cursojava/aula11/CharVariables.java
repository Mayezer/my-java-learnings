package com.mayezer.cursojava.aula11;

public class CharVariables {

    public static void main(String[] args) {

        // char o = 'O';
        // char i = 'i';

        char o = 111; // Usando a tabela ASCII
        char i = 105; // Usando a tabela ASCII
        char question = 0X00E1; // Usando a tabela ASCII, esse valor é: ?

        // System.out.println("" + o + i + ",me chamos Mayezer!");
        System.out.println("" + o + i + ", me chamo Mayezer!");
        System.out.println("" + o + i + question);
    }
}
