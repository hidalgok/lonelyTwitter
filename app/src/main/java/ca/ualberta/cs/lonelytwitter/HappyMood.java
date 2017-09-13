package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by khidalgo on 9/12/17.
 */

public class HappyMood extends Mood{

    public HappyMood() {
        super(new Date());
    }

    public HappyMood(Date date) {
        super(date);
    }

    public String currMood(){
        return "Happy";
    }
}
