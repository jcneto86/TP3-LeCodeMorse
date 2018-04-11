package com.jcneto.tp3_lecodemorse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TraducteurMorse traducteurMorse = new MonTraducteurMorse();
        EditText editText = (EditText) findViewById(R.id.editTextAlpha);
        editText.setText(traducteurMorse.getNomProgrammeurs());

        Button b = (Button) findViewById(R.id.btJouer);
        b.OnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                System.out.println("WoW");
            }
        });
    }






    // editTextAlpha
}
