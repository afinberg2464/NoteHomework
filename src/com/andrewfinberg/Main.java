package com.andrewfinberg;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Main {

    public static void main(String[] args) {

        int duration;
        double frequency;
        String noteName;
        boolean isSharp;
        int isLarger;
        ArrayList<Note> noteArrayList = new ArrayList<>();

        Note note1, note2, note3;

        note1 = new Note("G", 1);
        duration = note1.getDuration();
        frequency = note1.getFrequency();
        noteName = note1.getNoteName();
        isSharp = note1.isSharp();

        note2 = new Note("C", 2);
        duration = note2.getDuration();
        frequency = note2.getFrequency();
        noteName = note2.getNoteName();
        isSharp = note2.isSharp();

        note3 = new Note("F", 4);
        duration = note3.getDuration();
        frequency = note3.getFrequency();
        noteName = note3.getNoteName();
        isSharp = note3.isSharp();

        isLarger = note1.compareTo(note2);
        isLarger = note2.compareTo(note3);
        isLarger = note3.compareTo(note1);

        noteArrayList.add(note1);
        noteArrayList.add(note2);
        noteArrayList.add(note3);

        Collections.sort(noteArrayList);
    }
}

