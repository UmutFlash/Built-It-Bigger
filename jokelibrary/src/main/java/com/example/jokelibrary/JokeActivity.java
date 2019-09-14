package com.example.jokelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeText = findViewById(R.id.joke_tv);
        String joke = getIntent().getStringExtra(JOKE);
        if (joke != null && joke.length() != 0) {
            jokeText.setText(joke);
        }
    }
}
