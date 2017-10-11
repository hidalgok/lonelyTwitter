package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by khidalgo on 10/10/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    //add tweet to a list of tweets
    public void addTweet(Tweet tweet) {
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Tweet is already in tweet list");
        }else{
            tweets.add(tweet);
        }
    }

    //delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    //check if a list of tweets has the specified tweet
    //if it does return true, otherwise false
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int i){
        return tweets.get(i);
    }

    //returns a new array of tweets sorted by date
    public ArrayList<Tweet> getTweets(){
        ArrayList<Tweet> sortedTweets = new ArrayList<Tweet>();
        for(Tweet t: tweets){
            sortedTweets.add(t);
        }
        Collections.sort(sortedTweets);
        return sortedTweets;
    }

    //returns current size of tweetList
    public int getCount(){
        return tweets.size();
    }
}
