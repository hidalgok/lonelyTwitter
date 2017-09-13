package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by khidalgo on 9/12/17.
 */

public class SadMood extends Mood{

    public SadMood() {
        super(new Date());
    }

    public SadMood(Date date) {
        super(date);
    }

    public String currMood(){
        return "Sad";
    }
}
