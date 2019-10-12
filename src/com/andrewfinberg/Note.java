package com.andrewfinberg;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Note implements Comparable<Note> {
    private String noteName;
    private int noteDuration;
    private double frequency;

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
    public int compareTo(Note other) {
        int i;
        if (getFrequency() > other.getFrequency())
            i = 1;
        else if (getFrequency() < other.getFrequency())
            i = -1;
        else i = 0;
        return i;
    }

    public Note(String noteName, int noteDuration) {
        this.noteName = noteName;
        this.noteDuration = noteDuration;

        DecimalFormat df = new DecimalFormat("#.##");
        double f = 440.0 * Math.pow(2.0, this.map.get(noteName) / 12.0);
        this.frequency = Double.parseDouble(df.format(f));
    }

    /**
     * This method allows the user to determine if the selected note is natural or sharp
     * @return This statement returns true if the note is sharp, or false if the note is natural
     */
    public boolean isSharp() {
        if ((this.noteName.contains("#"))) {
            return true;
        } else return false;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public int getNoteDuration() {
        return noteDuration;
    }

    public void setNoteDuration(int noteDuration) {
        this.noteDuration = noteDuration;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteName='" + noteName + '\'' +
                ", noteDuration=" + noteDuration +
                ", frequency=" + frequency +
                '}';
    }
}
