package com.tries.tali.multiuseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ninjaGoldButton = (Button) findViewById(R.id.ninjaGoldButton);
        ninjaGoldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goNinjaGold = new Intent(getApplicationContext(), NinjaGoldActivity.class);
                startActivity(goNinjaGold);
            }
        });
        Button calculatorButton = (Button) findViewById(R.id.calculatorButton);
        calculatorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goCalculator = new Intent(getApplicationContext(), CalculatorActivity.class);
                startActivity(goCalculator);
            }
        });
        Button musicButton = (Button) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goMusic = new Intent(getApplicationContext(), MusicActivity.class);
                startActivity(goMusic);
            }
        });
    }
}
