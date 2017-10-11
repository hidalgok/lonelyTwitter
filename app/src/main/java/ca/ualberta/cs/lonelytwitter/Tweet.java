package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by khidalgo on 9/12/17.
 */

public abstract class Tweet implements Comparable<Tweet>{

    private String message;
    private Date date;
    //private ArrayList<Mood> moodList;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else{
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    //taken and modified from https://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
    //2017-10-10
    public int compareTo(Tweet t){
        return getDate().compareTo(getDate());
    }

//    public void addMood(Mood newmood){
//        moodList.add(newmood);
//    }
//
//    public void removeMood(Mood oldmood){
//        moodList.remove(oldmood);
//    }
//
//    public String checkMood(int i){
//       return moodList.get(i).currMood();
//    }

}
