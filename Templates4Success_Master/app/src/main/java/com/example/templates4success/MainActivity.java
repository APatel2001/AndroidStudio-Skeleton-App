package com.example.templates4success;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent i = new Intent(this, EssayType.class);
        final EditText enterEmail = (EditText) findViewById(R.id.enterEmail);
        final EditText enterPassword = (EditText) findViewById(R.id.enterPassword);
        String emailAddress = enterEmail.getText().toString();
        String password = enterPassword.getText().toString();
        String correctEmail = "avidpatel1@gmail.com";
        String correctPassword = "college";
        /*
        if (emailAddress == correctEmail && password == correctPassword) {

        }
        */
        startActivity(i);

    }

}
