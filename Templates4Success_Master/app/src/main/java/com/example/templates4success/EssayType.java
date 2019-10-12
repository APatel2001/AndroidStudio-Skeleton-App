package com.example.templates4success;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
/**
 * Selelct essay(currently only 1)
 * @author Avi Patel
 * @author Josh Koh
 * @author Tariq Rahman
 * @author Sujal Nahata
 *
 * @version 10/11/19
 */
public class EssayType extends AppCompatActivity {
    /**
     * generates/sets up activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_type);
    }

    /**
     * intents for inputs page
     *
     */

    public void collegeButtonClick(View view) {
        Intent i = new Intent(this, EssayInputs.class);
        startActivity(i);
    }

    /**
     * opens settings
     */
    public void settings(View view) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }
}
