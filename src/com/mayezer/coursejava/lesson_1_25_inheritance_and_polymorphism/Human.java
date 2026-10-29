package com.mayezer.coursejava.lesson_1_25_inheritance_and_polymorphism;

import com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class.AbstractClass;

// Isso é herança, pegamos os métodos e atributos de outra classe.
public class Human extends AbstractClass {

    public Human() {
        super(25); // super, para disse que estamos puxando o construtor da super classe (classe mãe).
        System.out.println("Your age: " + this.age); // Com isso, podemos acessar age.
    }

    // Só precisamos subescrever esse único método, por ele não ter nada incrementado dentro dele
    @Override
    public void breathe() {
        System.out.println("Breathing in - Breathing out");
    }

    // Não precisamos subescrever, pois já temos um função feita na classe abstrata, mas podemos, dependendo do tipo do método.
    /* 
    public void sleep() {
        System.out.println("Sleeping!");
    }
    */
}
