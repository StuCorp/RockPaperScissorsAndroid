package com.example.stuartbryce.rockpaperscissors;

import android.content.Intent;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import behaviours.Move;

import static android.R.transition.move;

public class ResultActivity extends AppCompatActivity {

    Game game;
    TextView player_choice;
    TextView computer_choice;
    TextView result_display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        game = new Game();

        player_choice = (TextView) findViewById(R.id.player_choice);
        computer_choice = (TextView) findViewById(R.id.computer_choice);
        result_display = (TextView) findViewById(R.id.result_display);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String playerMove = extras.getString("playerMove");
        String computerMove = game.computer.getMove().getType();
        Integer result = game.compareMoves(playerMove, computerMove);
        String resultDisplay = game.displayWinner(result);
        String userMove = String.format("You drew a %s", playerMove);
        String cpuMove = String.format("Computer drew a %s", computerMove);

        player_choice.setText(userMove);
        computer_choice.setText(cpuMove);
        result_display.setText(resultDisplay);


    }


}
