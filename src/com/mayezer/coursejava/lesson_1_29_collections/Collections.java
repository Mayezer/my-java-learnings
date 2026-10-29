package com.mayezer.coursejava.lesson_1_29_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {
    
    public static void main(String[] args) {

        /*

        São apenas interfaces - Podemos subescrever seus métodos, respeitando suas regras. 
        Ou usamos implementações que já existem: ArrayList, HashSet e etc...

        Map => Estrutura de chave valor

        Set => Não permite duplicatas [1, 2, 3, 4, 5]

        List => List ordenada com elementos duplicados [1, 2, 3, 4, 5, 4, 4]

        Queue => Filas, usada normalmente para processamento em ordem

        */

        List<String> listOne = List.of("Mayezer", "Gente boa", "Javeiro"); // Passamos os parâmetros de uma vez.

        List<String> listTwo = new ArrayList<>(); // Quando queremos recuperar a informação de outro lugar.
        listTwo.add("Mayezer"); 
        listTwo.add("Mayezer"); // Permite itens duplicados
        listTwo.add("Samara"); // Estamos criando uma lista ordenada

        listTwo.get(0); // Pegamos o primeiro indice da nossa lista


        Set<String> setString = new HashSet<>(); // Não permite duplicados, usamos HashSet para incrementar a classe de set.
        // HashSet é o método mais comum, é uma implementação baseada em Hash Table.

        setString.add("Mayezer");
        setString.add("Samara"); // Não podemos dupicar itens dessa lista

        System.out.println("Set: " + setString.contains("Mayezer"));


        Map<String, String>  map= new HashMap<>(); // Passamos o tipo da chave e do valor, repare que ambos sã oStrings, mas poderia ser qualuqer outro tipo.

        map.put("Name", "Mayezer");
        map.put("SurNome", "Samara");

        System.out.println(map.get("Name")); // Se recuperarmos uma chave que não existe, ele retorna null (nulo). Importante comparar se o valor é null (nulo)


        Queue<String> queue = new LinkedList<>(); // Trabalhando com listas linkadas e duplamente limkadas (cadeadas). Vai além do Java.

        queue.add("Mayezer");
        queue.add("Samara");

        System.out.println(queue); // Retorna toda nossa lista
        System.out.println(queue.poll()); // Pega o primeiro valor - E retira da fila. Não gera exceção, se removermos os dois da lista, ele retorna uma fila nula, vazia.
        System.out.println(queue); // Como pegamos o primeiro valor, ele nos retorna somente os próximo valores.
        System.err.println(queue.peek()); // Pega o primeiro valor, mas não retira ele da fila, é como se só estivessimos dando umas espiadinha.
        System.err.println(queue.remove()); // Ai sim removemos ele da lista, não só da fila, e me retorna somente os outros valores. Ele gera uma exceção se fila estiver vazia

        LinkedList<String> linked = new LinkedList<>(); // Se declararmos LinkedList, temos mais métodos para podermos usar.
    }
}
