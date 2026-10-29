package com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class;

// Classe que também não pode ser instanciada
public abstract class AbstractClass {

    protected int age;
    // Com um método construtor em uma classe abstrata, nossa classe Human, é obrigado a passar um parâmetro.
    public AbstractClass(
        int age) {
            this.age = age; // this: Coloca o valor que chegou (parâmetro) dentro da caixinha do objeto (campo).
    }

    // Método sem função (implementação)
    public abstract void breathe();

    // Metodo com função (implementação)
    public void sleep() {
        System.out.println("Sleeping!");
    }

    // 
}
