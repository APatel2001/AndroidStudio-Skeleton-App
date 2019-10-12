package com.example.templates4success;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class EssayInputs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_inputs);


    }

    public void enterButtonClick(View view) {
        Intent i = new Intent(this, EssayOutputs.class);
        startActivity(i);
    }
    public void settings(View view) {
        Intent i2 = new Intent(this, Settings.class);
        startActivity(i2);
    }

}
