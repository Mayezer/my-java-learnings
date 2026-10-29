package com.mayezer.coursejava.lesson_1_30_generics;

// Esamos parametrizando nossa classes Generics, tipo MyGeneric significa que estamos recebendo um tipo genérico, e pode ser qualquer coisa, desde que seja Pintavel (Paintable)
public class Generics<MyGeneric extends Paintable> {
    // Podemos dar qualquer nome para o nosso tipo generico, geralmente é representado por uma única letra. Coloquei MyGeneric para melhorar o entendimento.

    private MyGeneric thingsIWillPaint; // Não definios um tipo primitivo, que seja String, int, boolean e etc... Ela pode ser qualquer coisa.
    private Paintable paintable; // Funciona igual o MyGeneric.

    public Generics(
        MyGeneric thingsIWillPaint) {
            this.thingsIWillPaint = thingsIWillPaint;
    }

    public void paint(MyGeneric thing) {
        this.thingsIWillPaint.applyPaint();
    }

    // NOTA: Estudar mais sobre generics!!!
}
