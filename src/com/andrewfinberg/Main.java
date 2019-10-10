package com.andrewfinberg;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Main {

    public static void main(String[] args) {

        Note note1, note2;
        note1 = new Note("A");
        note2 = new Note("B");

        note1.compareTo(note2);
    }
}
