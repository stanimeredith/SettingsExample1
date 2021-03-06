package com.example.stani.settingsexample1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaySettings(View view) {



    //start settings activity
//    Intent intent = new Intent(this, SettingsActivity.class);
    startActivity( new Intent(this, SettingsActivity.class));

}

    public void readSettings(View view) {

        //read the value (stored in strings.xml)
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String setting1 = prefs.getString("example_text", "Joe Smith");

        Toast.makeText(this, setting1, Toast.LENGTH_LONG).show();


    }

}