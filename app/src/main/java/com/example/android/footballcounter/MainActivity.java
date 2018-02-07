package com.example.android.footballcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int team_a_score = 0;
    private int team_b_score = 0;
    private int team_a_corner = 0;
    private int team_b_corner = 0;
    private int team_a_foul = 0;
    private int team_b_foul = 0;
    private int team_a_yellow_card = 0;
    private int team_b_yellow_card = 0;
    private int team_a_red_card = 0;
    private int team_b_red_card = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA(View view) {
        team_a_score++;
        displayForGoalA(team_a_score);
    }

    public void addCornerForTeamA(View view) {
        team_a_corner++;
        displayForCornerA(team_a_corner);
    }

    public void addFoulForTeamA(View view) {
        team_a_foul++;
        displayForFoulA(team_a_foul);
    }

    public void addYellowCardForTeamA(View view) {
        team_a_yellow_card++;
        displayForYellowCardA(team_a_yellow_card);
    }

    public void addRedCardForTeamA(View view) {
        team_a_red_card++;
        displayForRedCardA(team_a_red_card);
    }

    public void addGoalForTeamB(View view) {
        team_b_score++;
        displayForGoalB(team_b_score);
    }

    public void addCornerForTeamB(View view) {
        team_b_corner++;
        displayForCornerB(team_b_corner);
    }

    public void addFoulForTeamB(View view) {
        team_b_foul++;
        displayForFoulB(team_b_foul);
    }

    public void addYellowCardForTeamB(View view) {
        team_b_yellow_card++;
        displayForYellowCardB(team_b_yellow_card);
    }

    public void addRedCardForTeamB(View view) {
        team_b_red_card++;
        displayForRedCardB(team_b_red_card);
    }

    public void resetScore(View view) {
        team_a_score = 0;
        team_b_score = 0;
        team_a_corner = 0;
        team_b_corner = 0;
        team_a_foul = 0;
        team_b_foul = 0;
        team_a_yellow_card = 0;
        team_b_yellow_card = 0;
        team_a_red_card = 0;
        team_b_red_card = 0;
        displayForGoalA(team_a_score);
        displayForGoalB(team_b_score);
        displayForCornerA(team_a_corner);
        displayForCornerB(team_b_corner);
        displayForFoulA(team_a_foul);
        displayForFoulB(team_b_foul);
        displayForYellowCardA(team_a_yellow_card);
        displayForYellowCardB(team_b_yellow_card);
        displayForRedCardA(team_a_red_card);
        displayForRedCardB(team_b_red_card);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForGoalA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Team A.
     */
    public void displayForCornerA(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_a_corner);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayForFoulA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));

    }

    /**
     * Displays the given yellow card for Team A.
     */
    public void displayForYellowCardA(int yellowCard) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_a_yellow_card);
        yellowCardView.setText(String.valueOf(yellowCard));

    }

    /**
     * Displays the given red card for Team A.
     */
    public void displayForRedCardA(int redCard) {
        TextView redCardView = (TextView) findViewById(R.id.team_a_red_card);
        redCardView.setText(String.valueOf(redCard));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForGoalB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given corner for Team B.
     */
    public void displayForCornerB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_b_corner);
        cornerView.setText(String.valueOf(corner));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayForFoulB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));

    }

    /**
     * Displays the given yellow card for Team B.
     */
    public void displayForYellowCardB(int yellowCard) {
        TextView yellowCardView = (TextView) findViewById(R.id.team_b_yellow_card);
        yellowCardView.setText(String.valueOf(yellowCard));

    }

    /**
     * Displays the given red card for Team B.
     */
    public void displayForRedCardB(int redCard) {
        TextView redCardView = (TextView) findViewById(R.id.team_b_red_card);
        redCardView.setText(String.valueOf(redCard));

    }

}
