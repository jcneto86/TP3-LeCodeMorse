package com.jcneto.tp3_lecodemorse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TraducteurMorse traducteurMorse = new TraducteurMorseConcrete();

//        EditText editText = (EditText) findViewById(R.id.editTextAlpha);
//        editText.setText(traducteurMorse.getNomProgrammeurs());

        // Listenre Button
        Button b = (Button) findViewById(R.id.btJouer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("WoW");
            }
        });
        // Listenre TextView
        final EditText editTextAlpha = (EditText) findViewById(R.id.editTextAlpha);
        editTextAlpha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
//                TextView textView = (TextView) findViewById(R.id.textView);
//                textView.setText(editable.toString());
            }
        });
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        editTextMorse.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
//                TextView textView = (TextView) findViewById(R.id.textView);
//                textView.setText(editable.toString());
            }
        });

    }


    // editTextAlpha
}
