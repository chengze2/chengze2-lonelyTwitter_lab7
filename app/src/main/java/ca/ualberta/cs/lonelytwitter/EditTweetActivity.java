package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intentCase = getIntent();
        Bundle bundleCase;
        bundleCase = intentCase.getExtras();

        TextView currentTweet = (TextView) findViewById(R.id.currentTweet);
        currentTweet.setText(bundleCase.getString("Tweet"));
    }
}
