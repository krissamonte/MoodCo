package com.example.kris.moodco;

/**
 * Created by kris on 12/10/2015.
 */
public class Mood {
    static final String TABLE_NAME = "moodtable";
    static final String COLUMN_NAME = "name";
    static final String COLUMN_SCORE = "score";

    private String name;
    private int score;

    public Mood() {
    }

    public Mood(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
