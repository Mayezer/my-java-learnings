package com.mayezer.coursejava.lesson_1_24_interfaces_and_abstract_class;

public interface InterfacesClass {

    // Aqui dentro vamos definir somente como a gente quer que uma classe se comporte, quais os seus atributos ou métodos ela vai ter
    // Porém não implementamos nada, ela é como um 'molde', só definimos a 'carcaça'.
    // Essa interface ela vai ser incrementada por uma classe, uma classe pode implementar um interface.
    // Uma interface não pode ser instaciada, porque ela é algo vazio, sem método/funções.

    // Isso é uma assinatura do método
    void fly();
    void swim();
    String walk();
}
