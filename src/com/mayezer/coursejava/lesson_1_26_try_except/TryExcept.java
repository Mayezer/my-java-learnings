package com.mayezer.coursejava.lesson_1_26_try_except;

public class TryExcept {

    public static void main(String[] args) {

        String myString = null;

        try { // Tente
            if (myString.equalsIgnoreCase("a")) {
                System.out.println("This is: 'A'");
            }
        } catch (NullPointerException exception) { // Uma exceção do tipo null.
            System.out.println("The value, is null!");
        }

        // Tipos de Exceções: 
        /*
        ArrayOutOfBoundException
        ArrayIndexOutOfBoundException
        RunTimeException - Exceção mais geral, caso a exceção nã oseja verificada, não tenha um motivo específico.
        IOException - Eros em leitura de arquivos, JSON, HTML e etc...
        ArithmeticException - Geralmente usadas com divisões por 0.
        SQLException - Exceções em códigos SQL.
        */
    }
}
