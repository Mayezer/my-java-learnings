package com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class;

public class DonaldDuck implements InterfacesClass {
    
    @Override 
    public void fly() {
    }

    @Override 
    public void swim() {
    }

    @Override 
    public String walk() {
        String walking = null;
        System.out.println(walking);
        return walking;
    }
}
