package com.example.mysticstreetdicegame2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class roll_and_divide extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    ImageView imageDice1, imageDice2;
    TextView textResult2, textResult1;
    int player1Value;
    Button rollDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_and_divide);

        imageDice1 = findViewById(R.id.imageDice1);
        imageDice2 = findViewById(R.id.imageDice2);
        textResult1 = findViewById(R.id.textResult1);
        textResult2 = findViewById(R.id.textResult2);
        rollDice = findViewById(R.id.rollDice);

        rollDice.setOnClickListener(new View.OnClickListener() {
            int result2Value = 0;
            @Override
            public void onClick(View view) {
                player1Value = playTurn(1);
                textResult1.setText(String.valueOf(player1Value));


//                int result2Value = player1Value + (player1Value * 3);
                result2Value += player1Value;
                textResult2.setText(String.valueOf(result2Value));


            }
        });
    }

    private int playTurn(int player) {
        int value1 = randomDiceValue();
        int value2 = randomDiceValue();

        int totalValue = value1 / value2;


        int res1 = getResources().getIdentifier("dice" + value1, "drawable", "com.example.mysticstreetdicegame2");
        int res2 = getResources().getIdentifier("dice" + value2, "drawable", "com.example.mysticstreetdicegame2");

        imageDice1.setImageResource(res1);
        imageDice2.setImageResource(res2);



        if (player == 1) {
            return addingNumbersLogic(totalValue);
        }

        return 0;


    }

    private int addingNumbersLogic(int totalValue) {
        return totalValue;
    }

    public static int randomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }
}