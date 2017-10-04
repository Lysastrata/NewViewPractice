package com.tries.tali.multiuseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NinjaGoldActivity extends AppCompatActivity {
    int totalGold = 0;
    Random rand = new Random();
    List<String> resultArray = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja_gold);
        Button farmButton = (Button) findViewById(R.id.farmButton);
        farmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNum = rand.nextInt((21 - 10) + 1) + 10;
                TextView totalGoldTextView = (TextView) findViewById(R.id.totalGoldTextView);
                totalGold += randomNum;
                String log = "You won " + randomNum;
                resultArray.add(log);
                ListView resultsListView = (ListView) findViewById(R.id.resultsListView);
                resultsListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.my_listview, resultArray));
                totalGoldTextView.setText("You Have " + totalGold + " Gold");
            }
        });
        Button houseButton = (Button) findViewById(R.id.houseButton);
        houseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView totalGoldTextView = (TextView) findViewById(R.id.totalGoldTextView);
                int randomNum = rand.nextInt((5 - 2) + 1) + 2;
                resultArray.add("You won " + randomNum);
                totalGold += randomNum;
                ListView resultsListView = (ListView) findViewById(R.id.resultsListView);
                resultsListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.my_listview, resultArray));
                totalGoldTextView.setText("You Have " + totalGold + " Gold");
            }
        });
        Button caveButton = (Button) findViewById(R.id.caveButton);
        caveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView totalGoldTextView = (TextView) findViewById(R.id.totalGoldTextView);
                int randomNum = rand.nextInt((11 - 5) + 1) + 5;
                resultArray.add("You won " + randomNum);
                totalGold += randomNum;
                ListView resultsListView = (ListView) findViewById(R.id.resultsListView);
                resultsListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.my_listview, resultArray));
                totalGoldTextView.setText("You Have " + totalGold + " Gold");
            }
        });
        Button casinoButton = (Button) findViewById(R.id.casinoButton);
        casinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView totalGoldTextView = (TextView) findViewById(R.id.totalGoldTextView);
                int randomNum = rand.nextInt((50 - 0) + 1) + 0;
                int randomInt = rand.nextInt((2 - 1) + 1) + 1;
                if (randomInt == 1) {
                    totalGold -= randomNum;
                    resultArray.add("You lost " + randomNum);
                } else {
                    totalGold += randomNum;
                    resultArray.add("You won " + randomNum);
                }
                totalGoldTextView.setText("You Have " + totalGold + " Gold");
                ListView resultsListView = (ListView) findViewById(R.id.resultsListView);
                resultsListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.my_listview, resultArray));
            }
        });

    }
}
