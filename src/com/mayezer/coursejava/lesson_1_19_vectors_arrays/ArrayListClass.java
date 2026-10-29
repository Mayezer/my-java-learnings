package com.mayezer.coursejava.lesson_1_19_vectors_arrays;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        // ArrayList serve para implementar uma Lista Dinamica, sem precisar definir um tamanho fixo igual vetores.
        ArrayList<String> names = new ArrayList<>();
        names.add("Mayezer"); // Adicionamos itens a Lista.
        names.add("Samara");
        names.add("Mayender");
        names.add("Maelysson");

        System.err.println(names.get(0) + "\n");

        names.remove(0); // Exclui o item 0 da lista, primeiro item.

        for (String name : names) { // Printa toda a lista.
            System.out.println(name);
        }
    }
}
