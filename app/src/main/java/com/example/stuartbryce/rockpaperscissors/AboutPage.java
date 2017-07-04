package com.example.stuartbryce.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutPage extends AppCompatActivity {

    Button goToGame;
    TextView rpg_wiki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        goToGame = (Button) findViewById(R.id.start_game_button);
        rpg_wiki = (TextView) findViewById(R.id.about_tv);
    }



    public void buttonClick(View button){
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
    }
}
