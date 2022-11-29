package com.example.learn1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }

    /**
     * Displays the given score for Team A.
     */

    int scoreA = 0;
    int scoreB = 0;

    // team a

    public void threeA(View v){
        //displayForTeamA(3);
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void twoA(View v){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void oneA(View v){
        scoreA++;
        displayForTeamA(scoreA);
    }

    //team b

    public void threeB(View v){
        //displayForTeamA(3);
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void twoB(View v){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void oneB(View v){
        scoreB++;
        displayForTeamB(scoreB);
    }

    // reset

    public void Reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView1 = (TextView) findViewById(R.id.team_a_score2);
        scoreView1.setText(String.valueOf(score));
    }

}