package com.example.android.counterforteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTemA=0;
int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneForTeamA (View view) {
        scoreTemA = scoreTemA +1;
        displayForTeamA(scoreTemA);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

public void addTwoForTeamA(View view) {
        scoreTemA = scoreTemA + 2;
        displayForTeamA(scoreTemA);
}
public void addThreeForTeamA(View view){
    scoreTemA = scoreTemA + 3;
    displayForTeamA(scoreTemA);
}
public void addOneForTeamB(int view){
    scoreTeamB = scoreTeamB + 1;
    displayForTeamB(scoreTeamB);
}

    public void displayForTeamB(int score){
    TextView scoreView= (TextView) findViewById(R.id.team_b_score) ;
    scoreView.setText(String.valueOf(score));
    }

    public void addTwoForTeamB(View view){
    scoreTeamB = scoreTeamB +2;
    displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamB (View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
public void resetScore(View view){
        scoreTemA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTemA);
        displayForTeamB(scoreTeamB);
}
}
