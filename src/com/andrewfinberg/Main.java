package com.andrewfinberg;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Main {

    public static void main(String[] args) {

        Note note1, note2, note3;
        note1 = new Note("A", 1);
        note2 = new Note("A#", 2);
        note3 = new Note("B", 4);

        note1.compareTo(note2);
        note2.compareTo(note3);
        note3.compareTo(note1);

    }
}

