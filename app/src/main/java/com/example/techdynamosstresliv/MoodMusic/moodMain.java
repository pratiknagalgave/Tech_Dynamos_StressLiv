package com.example.techdynamosstresliv.MoodMusic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.example.techdynamosstresliv.R;

public class moodMain extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_mood_main );

        FragmentManager fm = getFragmentManager ();
        FragmentTransaction tx = fm.beginTransaction ();
        tx.replace( R.id.fl,new SadMood ());
        tx.commit ();

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void selectFrag( View view){
        android.app.Fragment fr;

        if(view == findViewById ( R.id.fb1 )){
            fr = new MotivitionalMood ();
        }else{
            fr = new SadMood ();
        }

        FragmentManager fm = getFragmentManager ();
        FragmentTransaction tx = fm.beginTransaction ();
        tx.replace(R.id.fl , fr);
        tx.commit ();

    }
}