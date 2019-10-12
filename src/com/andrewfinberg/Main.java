package com.andrewfinberg;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Main {

    public static void main(String[] args) {

        // Create a few Note objects
        // Note duration: 1 = whole, 2 = half, 4 = quarter, 8 = eighth
        Note note1, note2, note3;
        note1 = new Note("G", 1);
        note2 = new Note("C", 2);
        note3 = new Note("F", 4);

        // Compare Note objects
        note1.compareTo(note2);
        note2.compareTo(note3);
        note3.compareTo(note1);

        // Create list of Note objects and sort
        ArrayList<Note> noteArrayList = new ArrayList<>();
        noteArrayList.add(note1);
        noteArrayList.add(note2);
        noteArrayList.add(note3);

        Collections.sort(noteArrayList);
    }
}

