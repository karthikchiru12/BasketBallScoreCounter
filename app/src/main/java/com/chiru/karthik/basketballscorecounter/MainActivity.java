package com.chiru.karthik.basketballscorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //This section contains methods manipulating score of Team A
    public void onClick3Points_A(View view) {
        TextView score_A = (TextView) findViewById(R.id.score_A);
        scoreA = Integer.parseInt((String) score_A.getText());
        scoreA += 3;
        display_A(scoreA);

    }

    public void onClick2Points_A(View view) {
        TextView score_A = (TextView) findViewById(R.id.score_A);
        scoreA = Integer.parseInt((String) score_A.getText());
        scoreA += 2;
        display_A(scoreA);
    }

    public void onClickFreePoints_A(View view) {

        TextView score_A = (TextView) findViewById(R.id.score_A);
        scoreA = Integer.parseInt((String) score_A.getText());
        scoreA += 1;
        display_A(scoreA);
    }

    public void display_A(int number) {
        TextView score_A = (TextView) findViewById(R.id.score_A);
        score_A.setText(String.valueOf(number));
        display_B(scoreB);

    }


    //This section contains methods manipulating score of Team B

    public void onClick3Points_B(View view) {

        TextView score_B = (TextView) findViewById(R.id.score_B);
        scoreB = Integer.parseInt((String) score_B.getText());
        scoreB += 3;
        display_B(scoreB);

    }

    public void onClick2Points_B(View view) {
        TextView score_B = (TextView) findViewById(R.id.score_B);

        scoreB = Integer.parseInt((String) score_B.getText());
        scoreB += 2;
        display_B(scoreB);
    }

    public void onClickFreePoints_B(View view) {

        TextView score_B = (TextView) findViewById(R.id.score_B);
        scoreB = Integer.parseInt((String) score_B.getText());
        scoreB += 1;
        display_B(scoreB);
    }

    public void display_B(int number) {
        TextView score_B = (TextView) findViewById(R.id.score_B);
        score_B.setText(String.valueOf(number));
    }


    //code for the reset button

    public void onCLickReset(View view) {
        scoreA = 0;
        scoreB = 0;
        display_A(scoreA);

    }

    public void onClickAbout(View view){
        Intent intent=new Intent(this,About.class);
        startActivity(intent);
    }


}
