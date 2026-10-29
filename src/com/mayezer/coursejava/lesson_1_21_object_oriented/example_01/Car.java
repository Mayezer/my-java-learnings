package com.mayezer.coursejava.lesson_1_21_object_oriented.example_01;

// Classe
public class Car {
        // Variáveis de instância - Atributos
        String mark; // Atributo - Variável
        String model;
        int numberPassengers;
        double fuelCapacity;

        // Método construtor
        public Car(
                String mark,
                String model,
                int numberPassengers,
                double fuelCapacity) {

                        this.mark = mark;
                        this.model = model;
                        this.numberPassengers = numberPassengers;
                        this.fuelCapacity = fuelCapacity;
        }

        // Métodos - Funções
        // Método de acesso (public ou private) - Método de retorno (String, int, boolean e etc...) ou não retorna nada (void)
        public String accelerate() {
                String accelerating = "Accelerating the " + this.mark + ": Vrum Vruuummmm! \n";
                System.out.println(accelerating);
                return accelerating;
        }
}
