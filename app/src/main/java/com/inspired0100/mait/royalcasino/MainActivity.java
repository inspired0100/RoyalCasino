package com.inspired0100.mait.royalcasino;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll_button = (Button) findViewById(R.id.roll_button);
        final ImageView leftDice = (ImageView) findViewById(R.id.dice1);
        final ImageView rightDice = (ImageView) findViewById(R.id.dice2);


        final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};



        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RoyalCasino", "Button is working!!");

                Random randomNumber = new Random();

                int random = randomNumber.nextInt(6);
                Log.d("Random", ""+random);

                leftDice.setImageResource(diceArray[random]);

                random = randomNumber.nextInt(6);

                rightDice.setImageResource(diceArray[random]);



            }
        });


    }


}
