package com.mayezer.coursejava.lesson_1_17_for;

import java.util.Random;

public class LoopForEach {

    public static void main(String[] args) {

        int[] notes = new int[10];

        Random random = new Random(); // Randomiza números

        for (int i = 0; i < notes.length; i++) {
            notes[i] = random.nextInt(10);
        }

        for (int note : notes) { // Usando o for each
            System.out.println(note);
        }
        
    }
}
