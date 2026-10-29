# Meus Estudos de Java

Anotações dos cursos organizadas por nível, com explicações, exemplos e imagens originais.

## Sumário

- [Java Básico](#java-básico)
- [Java Intermediário](#java-intermediário)
- [Java Avançado](#java-avançado)

---

## Java Básico

### Introdução e dicas para quem está começando

Link do repositório de estudo e códigos feitos nas aula: https://github.com/Mayezer/my-java-learnings

Java é uma linguagem compilada e interpretada, quando escrevemos um código Java, para o computador entender devemos compilar esse nosso arquivo, transformando em um arquivo .class, que faz com que a JVM (Java Virtual Machine) entenda esse código, em linguagem de máquina (Binários/Assembly). Java é praticamente uma linguagem baseada em Micro-serviços baseada em API (Application Programming Interface).

- WORA (Write Once Run Anywhere): Quer dizer que podemos escrever um código e qualquer sistema entenderá nosso programa.
- Criador do Java: James Gosling.
- Empresa responsável pelo Java: Sun Microsystems | Que foi comprada pela Oracle.
- Macote do Java se chama: Duke.

Java é uma linguagem baseada orientada a objetos, então tudo é objeto.

Java engloba praticamente todas as plataformas de desenvolvimento: Web, Mobile, Back End, Servers e muito mais. E por ser uma linguem consistente, a demanda por programador Java é alta, com programas criados que funcionam a décadas que demandam manutenção/atualização.

### Primeiro programa em Java

O nome da classe começa com letra maiúscula, e o nome da classe segue o nome do arquivo.

Exemplo: MyFristProgram.java | class MyFristProgram

Para compilar nosso arquivo .java, abrimos o terminal e usamos: javac MyFristProgram.java

Assim criando nosso arquivo .class, e para executar esse arquivo: java MyFristProgram

Mostramos ao computador onde está nosso arquivo compilado para ele executar o arquivo .class: export CLASSPATH=$CLASSPATH:~/Documentos/Projetos/learning_java/...

Por enquanto, nada muda.

### Entendendo os erros

- Erros de sintaxe: Acontecem quando você escreve o código fora das regras da linguagem Java. Normalmente são encontrados pelo compilador antes do programa executar.
- Erros de Semântica: A sintaxe pode estar correta, mas a instrução não faz sentido para o Java ou não corresponde ao significado esperado.
- Erros em Tempo de Execução: O código compila normalmente, mas dá erro enquanto o programa está sendo executado.

O Java é Case Sensitive, Existe diferença entre letras maiúsculas e minúsculas.

Exemplo: Mayezer é diferente de mayezer que é diferente de maYezeR e assim por diante.

### Introdução à Orientação a Objetos

- Classes: É a descrição/molde de um grupo de objetos.
  - Nome da classe: Identifica o tipo de objeto.
  - Atributos: Representam as características/dados.
  - Métodos: Representam os comportamentos/ações.
- Objetos: São as instâncias de uma classe. A classe é o molde; o objeto é aquilo que foi criado a partir desse molde.
- Herança: Permite que uma classe herde atributos e métodos de outra classe. Em Java, usamos extends.
- Abstração: É representar apenas aquilo que é importante para o funcionamento do objeto, escondendo detalhes desnecessários de implementação. Em Java, pode ser feita principalmente com classes abstratas e interfaces.
- Polimorfismo: Significa "muitas formas". Permite que objetos diferentes sejam tratados por um mesmo tipo, mas executem comportamentos diferentes.

Para fixar: Classe = molde → Objeto = coisa criada → Herança = recebe → Abstração = simplifica → Polimorfismo = várias formas.

- Java: Pacotes
  - Forma de organizar nossas classes
  - Convenção: domínio + projeto + pasta
    - Exemplo: com.mayezer.cursojava.aula09

### Introdução a variáveis

O que é uma variável: Área de memória associada a um nome, que pode armazenar valores de um determinado tipo.

- &lt;tipo&gt;&lt;nome da variável&gt;
- &lt;tipo&gt;&lt;nome da variável&gt; = &lt;valor&gt;;

Convenção de Nomenclatura: Serve para deixar o código mais organizado e fácil de entender. O Java usa bastante o padrão camelCase. O nome vem da ideia de “corcova de camelo”: quando juntamos várias palavras, a primeira começa com letra minúscula e as próximas começam com letra maiúscula. Usamos esse padrão para variáveis e métodos.

- nomeDoUsuario;
- idadeDoCliente;

### Tipos primitivos

Tipos inteiros: São valores não quebrados, sem , ou . sem casas decimais.

Se usa mais: int e long | Os outros valores você precisa saber mais pra tirar a certificação.

Tipos Ponto Flutuante: São valores com casas decimais.

Se usa mais: double | O float você precisa saber mais pra tirar a certificação.

Tipo Char: É um caractere, nada mais que uma letra apenas do alfabeto. Porém pode ser um inteiro usando a Tabela ASCII, cada caractere tem um valor.

Tipo Boolean: São valores de true ou false. Usamos muitos para definir flags.

Literais: Decimal, Hexadecimais, Octais, Binários…

Como usar literais

Podemos usar _ para separar valores.

O que não podemos.

Java não é 100% orientada a objeto por conta dos tipos primitivos.

Escape + char

### Lendo dados do teclado usando a classe Scanner

Nosso assistente: Classe Scanner – Scanner scan = new Scanner(System.in);

Dessa forma, podemos ler os dados do Java.

Para usar essa classe, devemos importar ela: import java.util.Scanner;

- Opção 01: Lendo uma linha inteira
  - String nome = scan.nextLine();
- Opção 02: Lendo um tipo específico
  - String primeiroNome = scan.next();
  - int idade = scan.nestInt();
  - double altura = scan.nextDouble();

### Operadores (Aritiméticos, Lógicos e Relacionais)

Operadores são símbolos que solicitam ao compilador realizar alguma operação.

Operadores aritiméticos:

- \+ | Adição (e mais unário).
- \- | Subtração (e menos unários).
- \* | Multiplicação.
- / | Divisão.
- % | Módulo.
- ++ | Incremento (pos ou pré fix).
- -- | Decremento (pos ou pré fix).

Operadores relacionais, usamos para fazer comparação.

Operadores relacionais:

- == | igual a.
- != | diferente de.
- &gt; | maior que.
- &lt; | menor que.
- &gt;= | maior ou igual que.
- &lt;= | menor ou igual que.

Operadores lógicos:

- & | and (e).
- | | or (ou).
- ^ | xor ou tabela verdade.
- || | ou curto circuito.
- && | and curto circuito.
- ! | not (não).

Tabela verdade.

### Condicionais if-Else

Controle de decisão:

- if | (se):
- if -else | (se – senão):
- Mútiplos if – eles:

Nada que a gente não tenha visto em Python, mas fique de olho com o uso, é diferente.

Usando if – eles, eles só retornam valores booleanos, então se é true ou false. E é o mais usado.

### Condicional Switch-Case

É uma alternativa para vários if else alinhados. Ele funciona com múltiplos If-Else.

Usando switch ele aceita byte, short, int, char,  Enum e até String.

### Loops while e do-while

do-while (Faça enquanto): Executa o bloco dentro do comando do e depois avalia a expressão. O bloco deixa de ser executado após a expressão ficar falsa.

### Loop for e for each

Executa um bloco de código que está dentro do comando for enquanto uma expressão for verdadeira. O loop mais utilizado na programação.

```java
for (inicialização; condição; atualização;) {
// Bloco de código
}
```

for each (para cada): Se usa muito com arrays. É como se a gente criasse uma variável para receber o valor daquela determinada posição do array.

```java
For (String array : arrays) {
// Bloco de código
}
```

### Comando Break e Continue

break | Usado para saída/parada de loops.

continue | Continue o loop na próxima iteração.

### Vetores/Arrays

Arrays | É a estrutura de dados mais simples que existente na maioria das linguagens de programação. É uma lista ordenada de dados.

index/índices | Posições na lista/array, sempre começa no 0.

### Matrizes (Arrays Multidimensionais) – Parte 01, 02, 03

Array: É uma lista ordenadas de n elementos.

Matriz: É uma tabela estilo plano cartesiano (X e Y), de n x m elementos. Matriz == array de arrays.

Pode existir matrizes de quantas colunas e linhas quiseres.  
Matriz irregular é muito importante.

### Introdução a Programação Orientada a Objeto em Java

Classes são modelos para definir a estrutura dos nosso objetos, nesse caso:

- Atributos – Variáveis:
- Métodos – Funções: É o que o objeto possui, que descreve o comportamento do objeto, o que ele vai fazer.
  - Construtor: É um método especial de uma classe. Ele é chamado sempre o que o objeto da classe for criado. Sempre pra quando estivermos criando um objeto, a gente consiga passar parâmetros para essa construção do objeto, atribuir valores aos atributos do objeto e também para moldar alguma dependências internas do próprio objeto.

### Modificadores de acesso

São quem controla a visibilidade das nossas classes e métodos. Ela determina se nossas classes vão ser visíveis para outro arquivo ou classes, se pode reutilizar ela ou não.

- public - Diz se nossa classe ou método podém ser acessadas por outras classes.
- private - Diz que não poodemos compartilhar essa classe ou método. A não ser para a própria classe em que ela foi criada.
- default - Modificador de acesso padrão. Não precisamos declarar ele, apenas usamos class. Quando não definimos um modificador de acesso a alguma classe, ela recebe default. Isso significa que só podemos usar essa classe no mesmo packge que se encontra essa classe, é o tal do packge private.
- protected - Só podemos acessar classes e métodos protegidas no mesmo pacote.

Pacotes (packge) são usados para organizar as nossas classes e interfaces em name spaces distintos para evitar conflito. Faz um agrupamento lógico das classes, dizendo que fazem parte do mesmo grupo, então só importamos uma classe se ela estiver em outra pasta, em outro pacote.

### Interface e classes abstratas

É um “modelo” no java que define um “contrato” que as classes devem seguir.

### Herança e polimorfismo

Herança é um conceito dentro da orientação a objeto que define que uma classe pode herdar atributos e métodos de outra classe – Classe mãe e classe filha.

Polimorfismo é um conceito que permite que uma única interface, como método ou uma classe seja usada para representar diferentes tipos de ações ou objetos.


---

## Java Intermediário

Package: Usamos para organizar nossas classes de uma forma hierarquica, é muito importante para manutenção do código, porque quando dividimos nosso código em packages (pastas/diretórios) diferentes, conseguimos dividir responsabilidades, cada package terá sua funcionalidade ou responsabilidade do projeto, assim evitamos conflito no nome das classes.

Estruturação de pastas package:

### Java collections

São bibliotecas/frameworks do java, que exporta para gente um conjunto de interfaces e classes que facilitam o armazenamento, organização e manipulação de dados.

Force uma estrutura de dados populares para facilitar nosso trabalho no Java.

As principais são:

- Map: Estrutura de Chave/Valor, como se fosse um dicionário.
- Set: Não permite duplicatas, não podemos ter valores repetidos dentro de um set.
- List: Permite duplicatas, é uma lista ordenada que podemos ter elementos duplicados.
- Queue: Filas usadas para processamento em ordem.

### Generics

É um recurso do Java que nos permite criar classes, interfaces e métodos que operam sobre tipos parametrizados.

Facilitam a reutilização de classes, métodos por diferentes tipos.

### Records

É uma nova forma de declarar uma classe. É uma classe imutável, ela nos permite criar uma classe que não podem ser modificados depois de criado. Gera automaticamente os método de equals(), hashCode(), toString() e getter().

### Stream API no Java

É um recurso do Java que nos permite realizar operações funcionais nas nossas coleções (collections – estrutura de dados). Podemos usar métodos como:

- filter: Filtrar dados.
- map: Fazer  mapeamento, transformar elementos de uma coleção de um tipo para outro.
- reduce: Reduzir os dados para um conjunto menor de dado, para um dados único.
- aggregation: Soma, média, contagem e etc...


---

## Java Avançado

### Expressões Lambdas

Funções/Expressões Lambda são uma maneira concisa de representar funções anônimas em Java. Elas nos permitem definir uma implementação de uma interface funcional em uma única linha de código. Ela faz sua função, e para de existir.

São mais usadas quando precisamos fazer uma pequena implementação, que seja simples, saber algo se é true ou false, pequena conta de soma, multiplicação.

### Programação Async (Assíncrona)

Permite a execução de tarefas em segunda plano, sem bloquear o fluxo principal do programa, ou seja, código não bloqueante: non-blocking code.

Programação assíncrona não significa necessariamente executar duas tarefas em paralelo.

Assincronismo significa que uma operação pode ser iniciada e sua conclusão tratada posteriormente, sem obrigatoriamente bloquear o fluxo que precisa continuar respondendo. Resumindo, duas ou mais funções funcionam ao mesmo tempo, até que uma delas seja concluída.

Podemos comparar programação assíncrona com aquelas telas interativas de carregamento de jogos.

Tipo God of War Ragnarok onde o Kratos fica em um 'mundo espiritual' vagando até aparecer uma porta.

Muito importante saber onde usar, se não lascamos a memória do nosso programa.

Completable Future: É uma evolução do Future, permitindo executar tarefas assíncronas e combinar várias tarefas de forma fluída. Ele implementa a interface CompletionStage, que permite adicionar callbacks após a conclusão da tarefa.

### Threads

As threads são unidades de execução que permitem a paralelização em programa Java.  
Em Java, são subdivididas do processo (programa em Java) que trabalham paralelamente, mas na visão do processador, nós estamos executando somente um processo.

Elas podem ser mapeadas para diferentes núcleos da CPU, permitindo concorrência e, em alguns casos, paralelismo real.

Já se houver apenas um núcleo, o sistema alterna a execução entre as threads, gerando apenas concorrência,sem paralelismo real.

Ponto importante: O Java utiliza threads de nível de sistema operacional, ou seja, as treads Java são geralmente mapeadas para threads nativas do sistema operacional (POSIX threads no Linux, por exemplo).

Uma característica importante é que se uma thread lançar uma exceção, não irpa afetar a execução das demais.

Outro fato, é que não há garantia de qual thread irá executar primeiro. Não temos controle sobre o escalonador dos processos.

01\. Execução de threads - Há duas formas comuns de criar threads em Java:

- Extendendo a classe Thread:

```java
Class MyThread extends Thread {
public void run() {
System.out.println(“Thread is running”);
}
}
MyThread = new MyThread();
thread.start(); // Inicia a thread
```

- Implementando a interface Runnable:

```java
Class MyThread extends Runnable {
public void run() {
System.out.println(“Thread is running”);
}
}
MyRunnable = Thread (new MyRunnable());
thread.start(); // Inicia a thread
```

- isAlive(); Verifica se a thread ainda está em execução:

```java
Thread thread = new Thread([] -> {
System.out.println(“Running task.”);
});
thread.start();
System.out.println(thread.isAlive()); // Verifica se a thread está ativa.
```

02\. Concorrência vs. Paralelo:

- Concorrência: As threads parecem ser executadas simultaneamente, mas na verdade estão compartilhando o tempo de execução no processador.
- Paralelismo: Se o sistema tiver múltiplos núcleos, as threads podem ser executadas em núcleos diferente ao mesmo tempo, oferecendo paralelismo real.

Para quê serve:

Pra você fazer mais de uma coisa ao mesmo tempo sem ficar travando. Por exemplo, no seu Email Organizer, uma thread pode baixar os e-mails, outra pode processar o conteúdo, outra salva no banco. Ou, se for uma interface gráfica, a UI continua respondendo enquanto o trabalho pesado rola no fundo. É basicamente sobre desempenho e fluidez.

Pesquise sobre: Sincronização com Locks, é fundamental para garantir que recursos compartilhados sejam acessados de maneira segura, evitando condições de corrida e inconsistências de dados.

### COLETOR DE LIXO DO JAVA (memória Heap, Stack, Garbage Collector)

Em Java, quando criamos variáveis, objetos e executamos métodos, o computador precisa guardar informações na memória RAM.

Mas existe um problema: Se o programa ficar guardando tudo para sempre, uma hora a memória vai acabar.

É justamente aqui que entram três conceitos importantes:

- STACK — Pilha de execução:
  - Guarda as informações necessárias para executar as chamadas de métodos. Cada Thread possui sua própria Stack. O espaço de uma chamada é liberado quando ela termina.
- HEAP — Memória dos objetos:
  - É onde os objetos Java são armazenados. É compartilhada entre Threads e precisa de gerenciamento para não ficar cheia de objetos desnecessários.
- GARBAGE COLLECTOR — Coletor de lixo:
  - Identifica objetos que não podem mais ser alcançados pelo programa e recupera o espaço na Heap para que seja reutilizado.

![Tabela de prioridades de estudo](assets/avancado-01.png)
