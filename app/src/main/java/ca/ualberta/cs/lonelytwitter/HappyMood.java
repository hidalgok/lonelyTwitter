/*
 * HappyMood
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
 * Represents a happy mood object.
 *
 * @author Ken Hidalgo
 * @see Mood
 */
public class HappyMood extends Mood{

    /**
     * Constructs a happy mood object.
     */
    public HappyMood() {
        super(new Date());
    }

    /**
     * Constructs a happy mood object.
     *
     * @param date happy mood date
     */
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Abstract method to determine current mood.
     * Returns Happy for happy mood objects.
     *
     * @return "Happy"
     */
    public String currMood(){
        return "Happy";
    }
}
