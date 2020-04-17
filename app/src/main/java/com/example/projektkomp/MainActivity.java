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

    ///////////////////////////////////////
    //COMMON
    ///////////////////////////////////////

    public void backToPrevView(View view)
    {
        setContentView(R.layout.activity_main);
        // Do something in response to button click
    }
    ///////////////////////////////////////
    //ORGANIZER
    ///////////////////////////////////////

    public void openOrganizerView(View view)
    {
        setContentView(R.layout.activity_organizer_main);
        // Do something in response to button click
    }

    public void openKalendarzView(View view)
    {
        setContentView(R.layout.activity_organizer_kalendarz);
    }

    public void openNotatnikView(View view)
    {
        setContentView(R.layout.activity_organizer_notatnik);
    }

    public void openPomodoroView(View view)
    {
        setContentView(R.layout.activity_organizer_pomodoro);
    }

    ///////////////////////////////////////
    //TRENING
    ///////////////////////////////////////

    public void openTreningView(View view)
    {
        setContentView(R.layout.activity_trening_main);
        // Do something in response to button click
    }

    public void openAtlasCwiczen(View view)
    {
        setContentView(R.layout.activity_trening_atlas);
        // Do something in response to button click
    }

    public void openPlanTreningowy(View view)
    {
        setContentView(R.layout.activity_trening_plan);
        // Do something in response to button click
    }

    public void openPosilki(View view)
    {
        setContentView(R.layout.activity_trening_posilki);
        // Do something in response to button click
    }

    public void openKalkulatorKalori(View view)
    {
        setContentView(R.layout.activity_trening_kalkulator);
        // Do something in response to button click
    }

    public void openDietView(View view)
    {
        setContentView(R.layout.activity_trening_dieta);
    }

    ///////////////////////////////////////
    //RAPORT
    ///////////////////////////////////////

    public void openRaportView(View view)
    {
        setContentView(R.layout.activity_raport_main);
        // Do something in response to button click
    }

    public void openKalorieView(View view)
    {
        setContentView(R.layout.activity_raport_kalorie);
        // Do something in response to button click
    }

    public void openAplikacjeView(View view)
    {
        setContentView(R.layout.activity_raport_aplikacje);
        // Do something in response to button click
    }

}
