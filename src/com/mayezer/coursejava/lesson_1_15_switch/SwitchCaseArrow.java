package com.mayezer.coursejava.lesson_1_15_switch;

public class SwitchCaseArrow {

    public static void main(String[] args) {

        var myVariable = "adidas";

        switch (myVariable) { // Ideal para quando temos somente um comando para cada caso.
            case "adidas" -> System.out.println("Adidas Shoes");
            case "nike" -> System.out.println("Nike Shoes");
        }
    }
}
