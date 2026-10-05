package com.mayezer.cursojava.aula13;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 5;
        System.out.println(result);

        result = result % 7;
        System.out.println(result);

        String fristName = "This is ";
        String secondName = "a concatenated string! ";
        String fullName = fristName + secondName;
        System.out.println(fullName);

        result++;
        System.out.println(result);

        System.out.println(result++); // Dizemos que mostre o resultado e adicione mais um.
        /* Mesma coisa que:
        System.out.println(result);
        result = result + 1;
        result += 1; */
        System.out.println(++result);
        /* Mesma coisa que:
        result += 1;
        System.out.println(result); */

        result--;
        System.out.println(result);

        System.out.println(result--);
        System.out.println(--result);
    }
}
