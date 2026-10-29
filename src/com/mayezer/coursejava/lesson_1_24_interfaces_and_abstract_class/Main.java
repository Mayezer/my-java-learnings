package com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class;

import com.mayezer.coursejava.lesson_1_25_inheritance_and_polymorphism.Cat;
import com.mayezer.coursejava.lesson_1_25_inheritance_and_polymorphism.Human;

public class Main {

    public static void main(String[] args) {

        DaffyDuck daffyDuck = new DaffyDuck();
        DonaldDuck donaldDuck = new DonaldDuck();

        daffyDuck.fly();
        donaldDuck.walk();

        Human human = new Human();

        human.breathe();
        human.sleep(); // Veja que mesmo que não temos a classe sleep subescrita, ele retorna, pois a abstaração, manda todos os métodos.

        Cat cat = new Cat();

        cat.breathe(); // Polimorfismo, humanos e gatos respiram, mas de maneiras diferentes.
        cat.sleep();
    }
}
