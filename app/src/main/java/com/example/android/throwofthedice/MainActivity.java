package com.example.android.athrowofthedice;

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

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//    return super.onOptionsItemSelected(item);
//    }


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

    public void resetButton(View view) {
        diceRoll = 0;
        rollResult(diceRoll);
    }


//    private void display(int number) {
//        TextView quantityTextView = (TextView) findViewById(
//                R.id.quantity_text_view);
//        quantityTextView.setText("" + number);
//    }

    /**
     * Displays the given result for roll.
     */
    public void rollResult(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rollResult);
        scoreView.setText(String.valueOf(score + " !"));
    }

    public void rollText (String message) {
        TextView rollView = (TextView) findViewById(R.id.rollText);
        rollView.setText("yo");
    }
}
