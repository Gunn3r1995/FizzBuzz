package uk.ac.brighton.srs23.fizzbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        TextView tvOut = findViewById(R.id.fizzBuzzText);

        for (int i = 0; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                tvOut.append("FizzBuzz: " + i + "\n");
            }
            else if(i % 3 == 0) {
                tvOut.append("Fizz: " + i + "\n");
            }
            else if (i % 5 == 0) {
                tvOut.append("Buzz: " + i + "\n");
            }
            else {
                tvOut.append(Integer.toString(i) + "\n");
            }
        }
    }
}