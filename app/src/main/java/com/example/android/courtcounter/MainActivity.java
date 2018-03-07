package com.example.android.courtcounter;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //DECLARATION
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    boolean resetPoints = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Calling different method turning them into ID and calling all of
    // them using only 1 method "buttonAction"


    public void buttonAction(View view) {

        if (view.equals(findViewById(R.id.teamA_3points))) {
            scoreTeamA = scoreTeamA + 3;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.teamB_3points))) {
            scoreTeamB = scoreTeamB + 3;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.teamA_2points))) {
            scoreTeamA = scoreTeamA + 2;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.teamB_2points))) {
            scoreTeamB = scoreTeamB + 2;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.teamA_1points))) {
            scoreTeamA = scoreTeamA + 1;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.teamB_1points))) {
            scoreTeamB = scoreTeamB + 1;
            resetPoints = false;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        } else if (view.equals(findViewById(R.id.resetScore))) {
            scoreTeamA = 0;
            scoreTeamB = 0;
            resetPoints = true;
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);

        }

    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int number) {
        TextView quantityTextViewA = (TextView) findViewById(R.id.team_a_score);
        quantityTextViewA.setText(String.valueOf(number));
        if (resetPoints == false) {
            if (scoreTeamA > scoreTeamB) {
                quantityTextViewA.setTextColor(Color.parseColor("#4CAF50"));
            } else if (scoreTeamB > scoreTeamA) {
                quantityTextViewA.setTextColor(Color.parseColor("#F44336"));
            } else if (scoreTeamA == scoreTeamB) {
                quantityTextViewA.setTextColor(Color.parseColor("#ffffff"));
            }
        } else {
            quantityTextViewA.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int number) {
        TextView quantityTextViewB = (TextView) findViewById(R.id.team_b_score);
        quantityTextViewB.setText(String.valueOf(number));
        if (resetPoints == false) {
            if (scoreTeamB > scoreTeamA) {
                quantityTextViewB.setTextColor(Color.parseColor("#4CAF50"));
            } else if (scoreTeamA > scoreTeamB) {
                quantityTextViewB.setTextColor(Color.parseColor("#F44336"));
            } else if (scoreTeamA == scoreTeamB) {
                quantityTextViewB.setTextColor(Color.parseColor("#ffffff"));
            }
        } else {
            quantityTextViewB.setTextColor(Color.parseColor("#ffffff"));
        }
    }

    /* Additional Info (Don't Edit this)
    When a button click which is find by button click and call buttonAction which further is followed
    by id of that button. Color changing:: After reaching to id of that button, it perform the method
    and further call by resetpoints which changes the color for both TEAMS and display score and which
    one is leading/loosing/at same score.
     */
}
