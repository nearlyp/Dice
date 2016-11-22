package com.example.android.throwofthedice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    int diceRoll = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollResult(0);
    }

    /**
     * Onclick handlers to update the view for particular values.
     */
    public void rolld2(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        rollResult(diceRoll);
    }

    public void rolld4(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        rollResult(diceRoll);
    }

    public void rolld6(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        rollResult(diceRoll);
    }

    public void rolld8(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 8 + 1);
        rollResult(diceRoll);
    }

    public void rolld10(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        rollResult(diceRoll);
    }

    public void rolld12(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 12 + 1);
        rollResult(diceRoll);
    }

    public void rolld20(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 20 + 1);
        rollResult(diceRoll);
    }

    public void rolld100(View view) {
        diceRoll = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        rollResult(diceRoll);
    }

    /**
     * Resets the view for rollResult to 0. Seems unnecessary but not worth removing.
     */
    public void resetButton(View view) {
        diceRoll = 0;
        rollResult(diceRoll);
    }


    /**
     * Displays the given result for roll.
     */
    public void rollResult(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rollResult);
        scoreView.setText(String.valueOf(score));
    }
}
