package com.example.techdynamosstresliv;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.techdynamosstresliv.MoodMusic.moodMain;
import com.example.techdynamosstresliv.R;
import com.example.techdynamosstresliv.Reading.MotivationalBlogs;
import com.example.techdynamosstresliv.Reading.MotivitionalBooks;
import com.example.techdynamosstresliv.breath.breathMain;

public class MainActivity extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

       // c1 = findViewById(R.id.AiCard);
        //c2 = findViewById(R.id.SupportCard);
        c3 = findViewById( R.id.breathcard);
        c4 = findViewById ( R.id.MusicCard );
        c5 = findViewById ( R.id.BooksCard);
        c6 = findViewById ( R.id.BlogCard );


      /*  c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainPageActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

       */

      /*  c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainPageActivity.this, PhoneNumberActivity.class);
                startActivity(i);
            }
        });

       */

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, breathMain.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, moodMain.class);
                startActivity(i);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MotivitionalBooks.class);
                startActivity(i);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MotivationalBlogs.class);
                startActivity(i);
            }
        });

    }
}