/*
 * Tweetable
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
 * An interface to be used by tweet objects.
 * All a message and date must be retrievable from all tweet objects.
 *
 * @author Ken Hidalgo
 * @see Tweet
 * @see ImportantTweet
 * @see NormalTweet
 */
public interface Tweetable {
    String getMessage();
    Date getDate();

}
