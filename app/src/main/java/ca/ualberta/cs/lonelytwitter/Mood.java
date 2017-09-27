/*
 * Mood
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Team X, CMPUT 301, University of Alberta - All Rights Reserved. You may use,
 * distribute, or modify the code under terms and conditions of the Code of Student Behaviour at
 * University of Alberta.
 * You may find a copy of the licence in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a mood.
 *
 * @author Ken Hidalgo
 * @see SadMood
 * @see HappyMood
 */
public abstract class Mood {

    private Date date;

    /**
     * Abstract method to determine current mood.
     *
     * @return
     */
    public abstract String currMood();

    /**
     * Constructs a mood object.
     */
    public Mood() {
        this.date = new Date();
    }

    /**
     * Constructs a mood object.
     *
     * @param date mood date
     */
    public Mood(Date date) {
        this.date = date;
    }

    /**
     * Returns a date from a mood object.
     *
     * @return mood date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of a mood object.
     *
     * @param date mood date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}
