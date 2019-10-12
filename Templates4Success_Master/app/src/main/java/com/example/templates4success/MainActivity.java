package com.example.templates4success;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
/**
 * Login
 * @author Avi Patel
 * @author Josh Koh
 * @author Tariq Rahman
 * @author Sujal Nahata
 *
 * @version 10/11/19
 */

public class MainActivity extends AppCompatActivity {
    /**
     * generates/sets up activity
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     *
     * sets intents to open next activity
     */
    public void onClick(View view) {
        Intent i = new Intent(this, EssayType.class);
        final EditText enterEmail = (EditText) findViewById(R.id.enterEmail);
        final EditText enterPassword = (EditText) findViewById(R.id.enterPassword);

        startActivity(i);

    }

}
