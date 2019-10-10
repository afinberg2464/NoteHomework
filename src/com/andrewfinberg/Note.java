package com.andrewfinberg;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * This is a class to build a single musical note
 * @author andrewfinberg 10/10/2019
 */
public class Note implements Comparable {
    private String noteName;
    private String noteDuration;

    /**
     * This is a HashMap to store the 12 notes in chromatic order
     */
    private HashMap<String, Integer> map = new HashMap<>();

    {
        map.put("A", 0);
        map.put("A#", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("C#", 4);
        map.put("D", 5);
        map.put("D#", 6);
        map.put("E", 7);
        map.put("F", 8);
        map.put("F#", 9);
        map.put("G", 10);
        map.put("G#", 11);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Note() {
        this("A", "whole note");
    }

    public Note(String noteName) {
        this.noteName = noteName;
    }

    public Note(String noteName, String noteDuration) {
        this.noteName = noteName;
        this.noteDuration = noteDuration;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteName='" + noteName + '\'' +
                ", noteDuration='" + noteDuration + '\'' +
                ", map=" + map +
                '}';
    }

    public String getNoteName() {
        return this.noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNoteDuration() {
        return this.noteDuration;
    }

    public void setNoteDuration(String noteDuration) {
        this.noteDuration = noteDuration;
    }

    /**
     * This method allows the user to get the frequency of the selected note
     *
     * @return This statement returns the frequency in Hz
     */
    public double getFrequency() {
        double frequency = 440.0 * Math.pow(2.0, this.map.get(noteName) / 12.0);
        DecimalFormat df = new DecimalFormat("###.##");
        return frequency;
    }

    /**
     * This method allows the user to determine if the selected note is natural or sharp
     *
     * @return This statement returns true if the note is sharp, or false if the note is natural
     */
    public boolean isSharp() {
        if ((this.noteName.contains("#"))) {
            return true;
        } else return false;
    }

}
