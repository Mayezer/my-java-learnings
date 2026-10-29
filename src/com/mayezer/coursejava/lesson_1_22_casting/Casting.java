package com.mayezer.coursejava.lesson_1_22_casting;

public class Casting {

    public static void main(String[] args) {

        // casting explicito.
        double resultDouble = 0.0;
        int resultInt = (int) resultDouble;

        // casting implicito.
        int myInt = 10;
        double myDouble = myInt;

        // casting de String (texto)
        String myString = "10";
        int myNewInt = Integer.parseInt(myString); // Transforma String em inteiro (int).
        String myNewString = String.valueOf(myNewInt); // Trasforma inteiro (int) em String.

        // Vai existir momentos em que vai ser 'impossível' converter, e teremos que criar um lógica em cima disso.
    }
}
