package com.mayezer.coursejava.lesson_1_25_inheritance_and_polymorphism;

import com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class.AbstractClass;

// Conceito de polimorfismo, podemos ter uma classes com os mesmo métodos, mas com funções diferentes
public class Cat extends AbstractClass {

    public Cat() {
        super(2);
    }

    @Override
    public void breathe() {
        System.out.println("Fast breathing in - Fast breathing out");
    }
}
