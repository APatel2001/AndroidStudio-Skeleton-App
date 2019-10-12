package com.example.templates4success;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * outputs essay
 * @author Avi Patel
 * @author Josh Koh
 * @author Tariq Rahman
 * @author Sujal Nahata
 *
 * @version 10/11/19
 */

public class EssayOutputs extends AppCompatActivity {
    /**
     * Outputs essay to the screen by taking the input from extras using the keyword, assigning to variables and concatinating. Also generates/sets up activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_outputs2);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String name = extras.getString("Name");
        String Adjective1 = extras.getString("Adjective1");
        String Adjective2 = extras.getString("Adjective2");
        String School = extras.getString("School");
        String Club = extras.getString("Club");
        String Responsibilities = extras.getString("Responsibilities");
        String Achievements = extras.getString("Achievements");
        String Passion = extras.getString("Passion");
        String Story = extras.getString("Story");
        String Revelation = extras.getString("Revelation");
        String Skills = extras.getString("Skills");
        String Essay = "Hello, I’m " + name + ". I am a " + Adjective1 + " and " + Adjective2  + " student at " + School + ". I am an avid member of " + Club + ". My responsibilities include " + Responsibilities + ". Because of my hard work, I have been " + Achievements + ". I am also very passionate in " + Passion + ". Once, I " + Story + ". I learned that I am very " + Revelation + " and that I can " + Skills + ".";

        final TextView essay = (TextView) findViewById(R.id.essay);
        essay.setText(Essay);


    }

    /**
     * go to settings using intent
     *
     */
    public void settings(View view) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }
}
