/*
 * SadMood
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
 * Represents a sad mood object.
 *
 * @author Ken Hidalgo
 * @see Mood
 */
public class SadMood extends Mood{

    /**
     * Constructs a sad mood object.
     */
    public SadMood() {
        super(new Date());
    }

    /**
     * Constructs a sad mood object.
     *
     * @param date sad mood date
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Abstract method to determine current mood.
     * Returns Sad for sad mood objects.
     *
     * @return "Sad"
     */
    public String currMood(){
        return "Sad";
    }
}
