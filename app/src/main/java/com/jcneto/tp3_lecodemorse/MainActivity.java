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
    private String alpha = "";
    private final TraducteurMorse traducteurMorse = new TraducteurMorseConcrete();
    private AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        final EditText editTextAlpha = findViewById(R.id.editTextAlpha);
        // Listened Button
        Button b = findViewById(R.id.btJouer);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    playMorse();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // Listened TextView
        editTextAlpha.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                TextView textViewSorti = findViewById(R.id.textSorti);
                textViewSorti.setText(traducteurMorse.toMorse(editable.toString()));
                TextView textViewEntre = findViewById(R.id.textEntre);
                textViewEntre.setText(traducteurMorse.nettoyerAlpha(editable.toString()));
                morse = traducteurMorse.toMorse(editable.toString());
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
                TextView textViewSorti = findViewById(R.id.textSorti);
                textViewSorti.setText(traducteurMorse.toAlpha(editable.toString()));
                TextView textViewEntre = findViewById(R.id.textEntre);
                textViewEntre.setText(editTextMorse.getText());
                alpha = traducteurMorse.toAlpha(editable.toString());
                morse = editable.toString();
                /*
                 * Vérifiez si le alpha est vide et si le morse n'est pas vide
                 * pour afficher un message d'erreur
                 */
                if (alpha.equals("") && !morse.isEmpty()) {
                    alertAttention();
                }

            }
        });

    }

    /**
     * funcTire(View v)
     * Ajouter un point dans la variable Morse pour l'affichage
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funcTire(View v) {
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        morse += "-";
        editTextMorse.setText(morse);
    }

    /**
     * funcPoint(View v)
     * Ajouter un point dans la variable Morse pour l'affichage
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funcPoint(View v) {
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        morse += ".";
        editTextMorse.setText(morse);
    }

    /**
     * funBarreOblique(View v)
     * Ajouter une barre oblique dans la variable Morse pour l'affichage
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funBarreOblique(View v) {
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        morse += "/";
        editTextMorse.setText(morse);
    }

    /**
     * funcEspace(View v)
     * Ajouter un espace dans la variable Morse pour l'affichage
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funcEspace(View v) {
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        morse += " ";
        editTextMorse.setText(morse);
    }

    /**
     * funcEfface(View v)
     * Efface les EditText et les vabiable garder les valeur du morse et alpha.
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funcEfface(View v) {
        final EditText editTextMorse = findViewById(R.id.editTextMorse);
        final EditText editTextAlpha = findViewById(R.id.editTextAlpha);
        morse = "";
        alpha = "";
        editTextMorse.setText("");
        editTextAlpha.setText("");
    }

    /**
     * funcBackendBy
     * Afficher une message avec les nons de les
     * programmeurs qui a develope la application
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void funcBackendBy(View v) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Backend pour/Backend By");
        builder.setMessage(traducteurMorse.getNomProgrammeurs());
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, ":D", Toast.LENGTH_SHORT).show();
            }
        });
        alert = builder.create();
        alert.show();
    }

    /**
     * changerAlphaMorse(View v)
     * Fonction qui contrôle l'affichage des boutons dans le panneau de l'utilisateur
     *
     * @param v Un bouton pour appeler la méthode
     */
    public void changerAlphaMorse(View v) {
        final EditText toMorse = findViewById(R.id.editTextMorse);
        final EditText toAlpha = findViewById(R.id.editTextAlpha);
        final Button btEspace = findViewById(R.id.btEspace);
        final Button btPoint = findViewById(R.id.btPoint);
        final Button btTire = findViewById(R.id.btTire);
        final Button btBarreOblique = findViewById(R.id.btBarreOblique);
        final Button chagerAlphaMorse = findViewById(R.id.btChangerAlphaMorse);
        if (toMorse.getVisibility() == View.VISIBLE) {
            toMorse.setVisibility(View.INVISIBLE);
            btEspace.setVisibility(View.INVISIBLE);
            btPoint.setVisibility(View.INVISIBLE);
            btTire.setVisibility(View.INVISIBLE);
            btBarreOblique.setVisibility(View.INVISIBLE);
            toAlpha.setVisibility(View.VISIBLE);
            chagerAlphaMorse.setText("Traduire le morse");
        } else {
            toAlpha.setVisibility(View.INVISIBLE);
            toMorse.setVisibility(View.VISIBLE);
            btEspace.setVisibility(View.VISIBLE);
            btPoint.setVisibility(View.VISIBLE);
            btTire.setVisibility(View.VISIBLE);
            btBarreOblique.setVisibility(View.VISIBLE);
            chagerAlphaMorse.setText("Traduire_le_alpha");
        }
    }

    /**
     * alertAttention()
     * Fonction qui montre une alerte sur la bonne façon d'entrer le code morse
     *
     */
    public void alertAttention() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Attention !");
        builder.setMessage(
                "Utilisez seulement le point, le tiret, l\'espace \n " +
                        "et la barre pour écrire en morse.\n" +
                        "Toujours taper l'espace pour chaque code \n" +
                        "de lettre tapé, et une barre oblique \n" +
                        "pour marquer les espaces entre les mots.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener()

        {
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "Entre votre code morse\n" + "ou une phrase alpha", Toast.LENGTH_SHORT).show();
            }
        });
        alert = builder.create();
        alert.show();
    }

    /**
     * playMorse()
     * Faire jouer le son du code morse qui est afficher sur le chaim de sorti.
     *
     */
    public void playMorse() throws InterruptedException {
        final MediaPlayer dah = MediaPlayer.create(this, R.raw.dah);
        final MediaPlayer dit = MediaPlayer.create(this, R.raw.dit);
        final MediaPlayer esp = MediaPlayer.create(this, R.raw.espace);
        System.out.print("\n");
        String[] morseToPlay = morse.split("");
        for (int i = 0; i < morse.length(); i++) {
            System.out.print(morseToPlay[i] + "*");
        }
        System.out.print("\n");
        for (int i = 0; i < morseToPlay.length; i++) {
            if (morseToPlay[i].equals(".")) {
                dit.start();
                Thread.sleep(700);
            }
            if (morseToPlay[i].equals("-")) {
                dah.start();
                Thread.sleep(800);
            }
            if (morseToPlay[i].equals(" ")) {
                esp.start();
                Thread.sleep(800);
            }
            if (morseToPlay[i].equals("/")) {
                esp.start();
                esp.start();
                Thread.sleep(900);
            }

        }
    }

}
