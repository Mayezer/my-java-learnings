package com.mayezer.coursejava.lesson_1_15_switch;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a day of the week [1 / 7]: ");
            int dayWeek = scan.nextInt();

            switch (dayWeek) { // Assim usamos, passamos muitos parâmetros.
            case 1 -> System.out.println("It's Sunday!");
                // case 1 = caso 1
            case 2 -> System.out.println("It's Monday!");
                // break; Serve para que ao achar o que foi pedido, ele pare, se não ele printa tudo.
            case 3 -> System.out.println("It's Tuesday!");
                // Sem o break ele roda o código todinho procurando o que foi digitado
            case 4 -> System.out.println("It's Wednesday!");
                // caso você digite 3 e não tenha break; ele mostra todos os resultados
            case 5 -> System.out.println("It's Thursday!");
                // do 3 em diante.
            case 6 -> System.out.println("It's Friday!");
            case 7 -> System.out.println("It's Saturday!");
            default -> System.out.println("It is not a valid day of the week!"); // Funciona como else, caso digite algo que não seja 1 a 7.
            }
            // Assim usamos, passamos muitos parâmetros.

            switch (dayWeek) { 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: System.out.println("It is a business day."); break;
            case 7: 
            case 1: System.out.println("Weekend!"); break;
            default: System.out.println("It is not a valid day of the week!"); 
            }
        scan.close();
        }
    }
}
