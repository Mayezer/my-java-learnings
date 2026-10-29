package com.mayezer.coursejava.lesson_1_34_async;

// import java.util.concurrent.CompletableFuture;

public class AsyncProgramming {

        /*
        Programação assíncrona não significa necessariamente executar duas tarefas em paralelo.
        Assincronismo significa que uma operação pode ser iniciada e sua conclusão tratada posteriormente, sem obrigatoriamente bloquear o fluxo que precisa continuar respondendo. Resumindo, duas ou mais funções funcionam ao mesmo tempo, até que uma delas seja concluída.
        Podemos comparar programação assíncrona com aquelas telas interativas de carregamento de jogos.
        Tipo God of War Ragnarok onde o Kratos fica em um 'mundo espiritual' vagando até aparecer uma porta.
        */

        // Completable Future:

    public static void main(String[] args) {

        // Aguardando Resultado:

        /*
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> “Result”)
        String result = future.get(); - Bloqueia até o futuro ser completado 
        */


        // Completando um CompletableFuture:

        /*
        CompletableFuture<String> future = new CompletableFuture<>();
        future.complete(“Manually Completed!”);
        System.out.println(future.get()); // Output: “Manually Completed!”
        */



    }
}
