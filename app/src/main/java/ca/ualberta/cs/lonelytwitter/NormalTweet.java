/*
 * NormalTweet
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
 * Represents a normal tweet.
 *
 * @author Ken Hidalgo
 * @see Tweet
 * @see Tweetable
 */
public class NormalTweet extends Tweet{

    /**
     * Constructs a normal tweet object.
     *
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a normal tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Abstract method to determine if tweet is important.
     * Returns false for normal tweets.
     *
     * @return FALSE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
