package com.andrewfinberg;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Main {

    public static void main(String[] args) {

        // Create a few Note objects
        Note note1, note2, note3;
        note1 = new Note("G", 1);
        note2 = new Note("C", 2);
        note3 = new Note("F", 4);

        // Compare objects
        note1.compareTo(note2);
        note2.compareTo(note3);
        note3.compareTo(note1);

        // Create list of objects and sort
        ArrayList<Note> noteArrayList = new ArrayList<>();
        noteArrayList.add(note1);
        noteArrayList.add(note2);
        noteArrayList.add(note3);

        Collections.sort(noteArrayList);
    }
}

