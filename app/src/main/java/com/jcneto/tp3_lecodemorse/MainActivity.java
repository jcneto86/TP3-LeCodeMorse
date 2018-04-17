package com.jcneto.tp3_lecodemorse;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String morse = "";
    private final TraducteurMorse traducteurMorse = new TraducteurMorseConcrete();
    private AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        final EditText editTextAlpha = (EditText) findViewById(R.id.editTextAlpha);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Attention !");
        builder.setMessage(
                "Utilisez l'espace pour chaque code \n" +
                        "de lettre tapé, et une barre oblique \n" +
                        "pour marquer les espaces entre les mots.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "Entre votre code morse" + arg1, Toast.LENGTH_SHORT).show();
            }
        });
        alert = builder.create();
        alert.show();



        // Listenre Button
        Button b = (Button) findViewById(R.id.btJouer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("WoW");
            }
        });
        // Listenre TextView
        editTextAlpha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                TextView textViewSorti = (TextView) findViewById(R.id.textSorti);
                textViewSorti.setText(traducteurMorse.toMorse(editable.toString()));
                TextView textViewEntre = (TextView) findViewById(R.id.textEntre);
                textViewEntre.setText(traducteurMorse.nettoyerAlpha(editable.toString()));
            }
        });
        editTextMorse.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                TextView textViewSorti = (TextView) findViewById(R.id.textSorti);
                textViewSorti.setText(traducteurMorse.toAlpha(editable.toString()));
                TextView textViewEntre = (TextView) findViewById(R.id.textEntre);
                textViewEntre.setText(editTextMorse.getText());
            }
        });

    }

    public void backEnd(View v) {
        //Toast.makeText()
    }

    public void funcTire(View v) {
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        morse += "-";
        editTextMorse.setText(morse);
    }

    public void funcPoint(View v) {
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        morse += ".";
        editTextMorse.setText(morse);
    }

    public void funBarreOblique(View v) {
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        morse += "/";
        editTextMorse.setText(morse);
    }

    public void funcEspace(View v) {
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        morse += " ";
        editTextMorse.setText(morse);
    }
    public void funcEfface(View v) {
        final EditText editTextMorse = (EditText) findViewById(R.id.editTextMorse);
        final EditText editTextAlpha = (EditText) findViewById(R.id.editTextAlpha);
        morse = "";
        editTextMorse.setText("");
        editTextAlpha.setText("");
    }
    public void funcBackendBy(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                traducteurMorse.getNomProgrammeurs() , Toast.LENGTH_LONG);
        toast.show();
    }

}
