package com.mayezer.coursejava.lesson_1_35_threads;

/*
Para quê serve:
Pra você fazer mais de uma coisa ao mesmo tempo sem ficar travando. 
Por exemplo, no seu Email Organizer, uma thread pode baixar os e-mails, outra pode processar o conteúdo, outra salva no banco.
Ou, se for uma interface gráfica, a UI continua respondendo enquanto o trabalho pesado rola no fundo.
É basicamente sobre desempenho e fluidez.
*/

/**
 * ==========================================================
 *                 THREADS EM JAVA
 * ==========================================================
 *
 * O QUE SÃO THREADS?
 *
 * Threads são linhas de execução que permitem que
 * diferentes tarefas avancem de forma independente.
 *
 * PARA QUE SERVEM?
 *
 * - Executar tarefas de forma concorrente.
 * - Evitar que uma tarefa bloqueie outras desnecessariamente.
 * - Melhorar o aproveitamento dos recursos do computador.
 * - Permitir que diferentes operações ocorram ao mesmo tempo.
 *
 * CONCEITOS IMPORTANTES:
 *
 * Runnable:
 * - Representa uma tarefa que pode ser executada por uma Thread.
 *
 * Thread:
 * - Representa uma linha de execução.
 *
 * start():
 * - Inicia uma nova Thread para executar uma tarefa.
 *
 * join():
 * - Faz a Thread atual esperar outra Thread terminar.
 *
 * sleep():
 * - Suspende temporariamente a execução da Thread atual.
 *
 * interrupt():
 * - Sinaliza que uma Thread deve ser interrompida.
 *
 * ==========================================================
 */

public class MyThreads {

    public static void main(String[] args)
            throws InterruptedException {

        // ==================== RUNNABLE ====================

        // Criamos duas tarefas utilizando expressões lambda.
        // Runnable define o que cada tarefa deve executar.
        // Neste momento, as tarefas ainda não começaram.

        Runnable fetchEmails = () ->
                simulateTask("Fetching emails", 2500);

        Runnable generateReport = () ->
                simulateTask("Generating report", 1500);


        // ==================== THREAD ====================

        // Criamos uma Thread para cada tarefa.
        // Cada Thread poderá executar sua tarefa
        // independentemente da outra.

        Thread emailThread = new Thread(fetchEmails);
        Thread reportThread = new Thread(generateReport);


        // ==================== START ====================

        // start() solicita o início da execução das Threads.
        // As duas tarefas podem avançar simultaneamente.
        //
        // IMPORTANTE:
        // start() cria uma nova linha de execução.
        // Chamar run() diretamente NÃO cria uma nova Thread.

        emailThread.start();
        reportThread.start();


        // ==================== MAIN THREAD ====================

        // A Thread principal continua sua execução
        // enquanto as outras Threads trabalham.
        //
        // A ordem das mensagens no terminal pode variar,
        // pois o sistema decide quando cada Thread executa.

        System.out.println("Main continues working...");


        // ==================== JOIN ====================

        // join() faz a Thread principal esperar
        // até que a Thread indicada termine.
        //
        // Primeiro esperamos a Thread dos e-mails.
        // Depois garantimos que a Thread do relatório terminou.
        //
        // As duas já foram iniciadas e podem executar
        // ao mesmo tempo enquanto aguardamos.

        emailThread.join();
        reportThread.join();


        // Esta mensagem só aparece depois que
        // as duas Threads terminarem.

        System.out.println("All tasks completed!");
    }


    // ==================== SIMULATE TASK ====================

    private static void simulateTask(
            String taskName, long durationMillis) {

        // Exibimos o nome da tarefa que começou.

        System.out.println(taskName + " - Starting");


        try {

            // ==================== SLEEP ====================

            // sleep() suspende temporariamente
            // a Thread que está executando este método.
            //
            // O tempo informado é em milissegundos.
            //
            // 1000 = aproximadamente 1 segundo.
            // 1500 = aproximadamente 1,5 segundo.
            // 2500 = aproximadamente 2,5 segundos.
            //
            // Isso simula uma operação demorada.
            // Não representa uma busca real de e-mails.

            Thread.sleep(durationMillis);

            System.out.println(taskName + " - Completed");

        } catch (InterruptedException e) {

            // ==================== INTERRUPT ====================

            // Se a Thread for interrompida durante o sleep(),
            // uma InterruptedException será lançada.
            //
            // Como a exceção limpa o sinal de interrupção,
            // restauramos esse sinal para que outras partes
            // do programa possam identificá-lo.

            Thread.currentThread().interrupt();
        }
    }
}
