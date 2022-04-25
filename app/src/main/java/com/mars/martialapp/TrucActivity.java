package com.mars.martialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrucActivity extends AppCompatActivity {

    private TextView pointsDeClic;                  // instancie le textview
    private ImageView cibleDeClic;                  // instancie le textview
    private int clickFait = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truc);
        // note (TextView) est un 'cast'
        this.pointsDeClic =(TextView) findViewById(R.id.pointsDeClic);  // on associe objet code à xml
        this.cibleDeClic =(ImageView) findViewById(R.id.cibleDeClic);

        cibleDeClic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickFait++;                                        // ajoute à chaques cliques
                pointsDeClic.setText("Points : " + clickFait);      // on redefini le texte
            }
        });

    }
}