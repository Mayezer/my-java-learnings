package com.mayezer.coursejava.lesson_1_21_object_oriented.example_01;

// Classe principal
public class Main {

    // Representa um método que vai ser acionado quando a nossa classe (Main) for executada, é como se fosse o coração do projeto
    // As funcionalidades criadas em outros arquivos são tranferida pra cá, e esse método main da a faisca para inicar toda a aplicação
    // É um método especial (método inicial, de entrada da classe, método principal).
    public static void main(String[] args) {

        // instâncias da classe carro | Criado um Objeto do tipo carro
        Car myCarOne = new Car("Hilux", "Toyota", 5, 80); // Isso é a primeira instância da classe carro
        Car myCarTwo = new Car("Opala", "Chevrolet", 5, 84); // Isso é a segunda instância da classe carro

        myCarOne.accelerate(); // Puxamos um método (função) da clase Car
        myCarTwo.accelerate();
        System.out.println(myCarOne);
    }
}
