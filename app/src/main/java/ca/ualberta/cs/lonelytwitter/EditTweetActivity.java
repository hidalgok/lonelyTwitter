package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String tweet_message = extras.getString("TWEET_MESSAGE");
        Date tweet_date = new Date();
        tweet_date.setTime(extras.getLong("TWEET_DATE"));

        //TextView tweetfield = (TextView) findViewById(R.id.tweet_mess);
        //TextView datefield = (TextView) findViewById(R.id.tweet_date);

        //tweetfield.setText(tweet_message);
        //datefield.setText("Created on: " + tweet_date.toString());
    }
}
