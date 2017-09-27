/*
 * Tweet
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

import java.util.ArrayList;
import java.util.Date;


/**
 * Represents a tweet.
 *
 * @author Ken Hidalgo
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */
public abstract class Tweet {

    private String message;
    private Date date;
    //private ArrayList<Mood> moodList;

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }


    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }


    /**
     * Sets the message of a tweet object.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else{
            this.message = message;
        }
    }

    /**
     * Returns the message from a tweet object.
     *
     * @return tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Returns the date from a tweet object.
     *
     * @return tweet date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date of a tweet object.
     *
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Abstract method to check if tweet is important
     *
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Converts a tweet object to a string.
     *
     * @return the date and message of the tweet as a string
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    /**
     * Adds a mood to the mood list.
     *
     * @param newmood Mood object to be added
     */
//    public void addMood(Mood newmood){
//        moodList.add(newmood);
//    }
//
    /**
     * Removes a mood from the mood list.
     *
     * @param oldmood Mood object to be removed
     */
//    public void removeMood(Mood oldmood){
//        moodList.remove(oldmood);
//    }
//
    /**
     * Returns the current mood of a mood in the list.
     *
     * @param i index postion of mood
     * @return a string of the current mood
     */
//    public String checkMood(int i){
//       return moodList.get(i).currMood();
//    }

}
