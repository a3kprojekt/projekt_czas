package com.example.projektkomp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTreningView(View view)
    {
        setContentView(R.layout.activity_trening_main);
        // Do something in response to button click
    }

    public void openOrganizerView(View view)
    {
        setContentView(R.layout.activity_organizer_main);
        // Do something in response to button click
    }

    public void openRaportView(View view)
    {
        setContentView(R.layout.activity_raport_main);
        // Do something in response to button click
    }

    public void backToPrevView(View view)
    {
        setContentView(R.layout.activity_main);
        // Do something in response to button click
    }

    ///////////////////////////////////////

    public void openDietView(View view)
    {
        setContentView(R.layout.activity_trening_dieta);
    }

}
