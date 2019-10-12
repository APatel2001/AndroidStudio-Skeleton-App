package com.example.templates4success;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class EssayType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_essay_type);
    }

    public void collegeButtonClick(View view) {
        Intent i = new Intent(this, EssayInputs.class);
        startActivity(i);
    }
    public void settings(View view) {
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
    }
}
