package com.mayezer.coursejava.lesson_1_37_trash_collector;

public class TrashCollector {

    /**
 * ==========================================================
 *       MEMÓRIA JAVA — STACK, HEAP E GARBAGE COLLECTOR
 * ==========================================================
 *
 * STACK (Pilha):
 * - Organiza a execução dos métodos.
 * - Guarda informações temporárias das chamadas.
 * - Cada Thread possui sua própria Stack.
 * - Quando um método termina, sua chamada sai da Stack.
 *
 * HEAP (Memória dos objetos):
 * - É onde os objetos Java são armazenados.
 * - É compartilhada entre as Threads.
 * - Objetos normalmente são criados utilizando "new".
 *
 * GARBAGE COLLECTOR (Coletor de lixo):
 * - Recupera a memória de objetos que não são mais acessíveis.
 * - Trabalha principalmente na Heap.
 * - Funciona automaticamente.
 * - Não garante que os objetos sejam removidos imediatamente.
 *
 * ==========================================================
 */

    public static void main(String[] args) {

        // ==================== STACK ====================

        // Ao chamar este método, uma nova chamada é
        // adicionada à Stack.
        calculateSum();

        // Quando o método termina, sua chamada é
        // removida da Stack.


        // ==================== HEAP ====================

        // O comando "new" cria um objeto na Heap.
        // A variável "person" guarda uma referência
        // que permite acessar esse objeto.

        Person person = new Person("Carlos", 25);

        System.out.println(person.name);
        System.out.println(person.age);


        // ============== GARBAGE COLLECTOR ==============

        // Criamos outro objeto na Heap.
        Person anotherPerson = new Person("Maria", 30);

        System.out.println(anotherPerson.name);

        // A variável deixa de apontar para o objeto.
        anotherPerson = null;

        // Como nenhuma outra referência aponta para
        // esse objeto, ele fica elegível para coleta.
        //
        // Isso NÃO significa que será apagado imediatamente.
        // A JVM decide quando recuperar essa memória.


        // Solicita uma coleta de lixo à JVM.
        // Não existe garantia de execução imediata.
        // Normalmente, não precisamos utilizar esse comando.
        System.gc();


        // O objeto Carlos continua acessível.
        // Portanto, não é considerado lixo neste momento.
        System.out.println(person.name);
    }


    // ==================== STACK ====================

    public static void calculateSum() {

        // Estas são variáveis locais do tipo primitivo.
        // Para facilitar o entendimento, podemos imaginá-las
        // dentro do espaço reservado para esta chamada na Stack.

        int number1 = 10;
        int number2 = 20;

        int result = number1 + number2;

        System.out.println(result);

        // Quando o método terminar, o espaço utilizado
        // por esta chamada será liberado da Stack.
    }


    // ==================== HEAP ====================

    static class Person {

        String name;
        int age;

        // Construtor responsável por inicializar o objeto.
        public Person(String name, int age) {

            // Os atributos pertencem ao objeto.
            // Esse objeto fica armazenado na Heap.

            this.name = name;
            this.age = age;
        }
    }
}
