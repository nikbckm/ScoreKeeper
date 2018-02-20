package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA;
    int ScoreTeamB;
    TextView score_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score_textView = findViewById(R.id.score_textView);
    }

    public void fieldgoal_TeamA(View view) {
        ScoreTeamA = ScoreTeamA+3;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void fieldgoal_TeamB(View view) {
        ScoreTeamB = ScoreTeamB+3;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void touchdown_TeamA(View view) {
        ScoreTeamA = ScoreTeamA+7;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void touchdown_TeamB(View view) {
        ScoreTeamB = ScoreTeamB+7;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void twopoint_TeamA(View view) {
        ScoreTeamA = ScoreTeamA+2;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void twopoint_TeamB(View view) {
        ScoreTeamB = ScoreTeamB+2;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void extrapoint_TeamA(View view) {
        ScoreTeamA++;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void extrapoint_TeamB(View view) {
        ScoreTeamB++;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }

    public void resetScore(View view) {
        ScoreTeamA=0; ScoreTeamB=0;
        score_textView.setText(""+ScoreTeamA+" : "+ScoreTeamB);
    }
}
