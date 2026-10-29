package com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class;

// Temos duas opções, implementar ou Duck deve ser uma classe abstrata.
public class DaffyDuck implements InterfacesClass {

    // Estamos Sobrencrevendo (Overrride) esse método da interface
    @Override
    // Nossso método 'base' vindo de interface.
    public void fly() {
        System.out.println("Flying!");
    }

    @Override
    public void swim() {

    }

    @Override
    public String walk() {
        String walking = "Walking!";
        System.out.println(walking);
        return walking;
    }
}
