package com.example.templates4success;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

/**
 * Inputs for essay
 * @author Avi Patel
 * @author Josh Koh
 * @author Tariq Rahman
 * @author Sujal Nahata
 *
 * @version 10/11/19
 */
public class EssayInputs extends AppCompatActivity {


    /**
     * Creates activty upon opening
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_inputs);


    }

    /**
     * Deals with the intents for going to the written essay. Also uses extras to send input from this activity to the other for concatination
     */

    public void enterButtonClick(View view) {
        Intent i = new Intent(this, EssayOutputs.class);
        Bundle extras = new Bundle();

        final EditText yourname = (EditText) findViewById(R.id.yourname);
        String name = yourname.getText().toString();
        extras.putString("Name", name);


        final EditText adjective1 = (EditText) findViewById(R.id.adjective1);
        String Adjective1 = adjective1.getText().toString();
        extras.putString("Adjective1", Adjective1);

        final EditText adjective2 = (EditText) findViewById(R.id.adjective2);
        String Adjective2 = adjective2.getText().toString();
        extras.putString("Adjective2", Adjective2);

        final EditText school = (EditText) findViewById(R.id.school);
        String School = school.getText().toString();
        extras.putString("School", School);

        final EditText club = (EditText) findViewById(R.id.club);
        String Club = club.getText().toString();
        extras.putString("Club", Club);

        final EditText responsibilities = (EditText) findViewById(R.id.responsibilities);
        String Responsibilities = responsibilities.getText().toString();
        extras.putString("Responsibilities", Responsibilities);

        final EditText achievements = (EditText) findViewById(R.id.achievements);
        String Achievements = achievements.getText().toString();
        extras.putString("Achievements", Achievements);

        final EditText passion = (EditText) findViewById(R.id.passion);
        String Passion = passion.getText().toString();
        extras.putString("Passion", Passion);

        final EditText story = (EditText) findViewById(R.id.story);
        String Story = story.getText().toString();
        extras.putString("Story", Story);

        final EditText revelation = (EditText) findViewById(R.id.revelation);
        String Revelation = revelation.getText().toString();
        extras.putString("Revelation", Revelation);

        final EditText skills = (EditText) findViewById(R.id.skills);
        String Skills = skills.getText().toString();
        extras.putString("Skills", Skills);

        i.putExtras(extras);
        startActivity(i);
    }

    /**
     * Opens settings
     *
     */
    public void settings(View view) {
        Intent i2 = new Intent(this, Settings.class);
        startActivity(i2);
    }

}
