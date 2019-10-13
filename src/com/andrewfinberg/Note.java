package com.andrewfinberg;

import java.util.HashMap;

/**
 * @author andrewfinberg 10/10/2019
 */
public class Note implements Comparable<Note> {
    private String noteName;
    private int duration;
    private double frequency;

    /**
     * HashMap to store notes in chromatic order
     * A = 440Hz
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

    /**
     * Method sorts notes by duration, then by frequency
     *
     * @param other Accepts second note for comparison
     * @return Result of the comparison
     */
    @Override
    public int compareTo(Note other) {
        int result = 1;
        if (getDuration() <= other.getDuration())
            if (getDuration() < other.getDuration()) {
                result = -1;
            } else if (!(getFrequency() > other.getFrequency()))
                if (getFrequency() < other.getFrequency()) {
                    result = -1;
                } else {
                    result = 0;
                }
        return result;
    }

    /**
     * This constructor sets the note and duration
     * and calculates the frequency in Hz
     *
     * @param noteName note name
     * @param duration duration
     */
    public Note(String noteName, int duration) {
        this.noteName = noteName;
        this.duration = duration;
        this.frequency = 440.0 * Math.pow(2.0, this.map.get(noteName) / 12.0);
    }

    /**
     * This method allows the user to determine if the selected note is natural or sharp
     *
     * @return This statement returns true if the note is sharp, or false if the note is natural
     */
    public boolean isSharp() {
        return (this.noteName.contains("#"));
    }

    /**
     * method to get note name
     * @return note name
     */
    public String getNoteName() {
        return noteName;
    }

    /**
     * method to set note name
     * @param noteName note name
     */
    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    /**
     * method to get note duration
     * @return note duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * method to set note duration
     * default value is 1
     * @param duration note duration
     */
    public void setDuration(int duration) {
        if (this.duration == 1 || this.duration == 2 || this.duration == 4 || this.duration == 8)
            this.duration = duration;
        else
            this.duration = 1;
    }

    /**
     * method to get frequency
     * @return frequency
     */
    public double getFrequency() {
        return frequency;
    }

    /**
     * method to set frequency
     * @param frequency frequency
     */
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteName = '" + noteName + '\'' +
                ", noteDuration = " + duration +
                ", frequency = " + frequency + "Hz" +
                '}';
    }
}
