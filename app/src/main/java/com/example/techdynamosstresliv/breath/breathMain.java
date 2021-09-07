package com.example.techdynamosstresliv.breath;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.techdynamosstresliv.R;

public class breathMain extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.breath_main );
        btn = (Button)findViewById ( R.id.button );
        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( breathMain.this,startBreathing.class);
                startActivity ( intent );
            }
        } );
    }
}