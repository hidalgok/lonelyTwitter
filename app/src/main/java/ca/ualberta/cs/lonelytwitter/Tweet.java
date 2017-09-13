package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by khidalgo on 9/12/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moodList;

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

    public void addMood(Mood newmood){
        moodList.add(newmood);
    }

    public void removeMood(Mood oldmood){
        moodList.remove(oldmood);
    }

    public String checkMood(int i){
       return moodList.get(i).currMood();
    }

}
