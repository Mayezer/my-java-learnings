package com.mayezer.coursejava.lesson_1_31_records;

public class Main {

    public static void main(String[] args) {

        // Nosso objeto do tipo carro(Record) recebe o nome toyota, e seus atributos são: Modelo - Hilux, Cor - Preto, Ano - 2025 e Placa - ABC-1234
        Records toyota = new Records("Hilux", "Black", 2025, "ABC-1234");
        toyota.age(); // É um getter do nosso atributo.

        // Não podemos alterar os valores, lembresse, records são classes imutáveis.
        // São muito usados para:
        // DTOs (Data Transfer Objects) - É quando recebemos um dado que está sendo tranferido.
        // Usados em requisições do body da nossa informação, API, Usuários e etc...

        // POJOs (Plain Old java Objects) - São objetos normais do Java que são criados através de classes.

    }
}
