package com.example.templates4success;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;


public class Settings extends AppCompatActivity {

    private Switch switch_1;
    public static final String MyPreferences = "nightModePrefs";
    public static final String KEY_ISNIGHTMODE = "isNightMode";
    SharedPreferences shardpreferences;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        shardpreferences = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);


        Switch switch_1 = (Switch) findViewById(R.id.switch_1);

        checkNightModeActivated();




        switch_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_YES));
                    saveNightModeState(true);
                    recreate();
                }
                else {
                
                AppCompatDelegate.setDefaultNightMode((AppCompatDelegate.MODE_NIGHT_NO));
                saveNightModeState(false);
                recreate();
                
                }
                
            }
                
        });

    }

    private void saveNightModeState(boolean nightMode) {
        SharedPreferences.Editor editor = shardpreferences.edit();
        editor.putBoolean(KEY_ISNIGHTMODE, nightMode);
        editor.apply();

    }
    public void checkNightModeActivated() {
        if(shardpreferences.getBoolean(KEY_ISNIGHTMODE, false)) {
            switch_1.setChecked((true));
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }
        else {
            switch_1.setChecked((false));
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }


}


