package com.mars.martialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mars.martialapp.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView targetImg;                            // declare variable de l'image
    private LinearLayout myLayout;                          // declare le layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);                 // va chercher dans la class mere AppCompatActivity
        setContentView(R.layout.activity_main2);             // affiche le design de l'appli dans R (ressource) .layout.activityMain     >> layout = structure page (+eur types)
        this.myLayout = (LinearLayout) findViewById(R.id.myDinamicLayout);    // recupere le layout en le castant en LinearLayout

        // ******************* les layout ***************************
        ImageView image = new ImageView(this);          // instancie nouvelle image
        ViewGroup.LayoutParams layoutParams = new ActionBar.LayoutParams(100, ViewGroup.LayoutParams.WRAP_CONTENT);     // parametre (x,y) soit en px, soit en indicateur
        image.setLayoutParams(layoutParams);                            // parametre l'image
        image.setBackgroundResource(R.drawable.shenron);            // lieux de l'image
        myLayout.addView(image);                                    // ajoute 'image (27) à la vue (25)    !!! ligne 24 choisir le bon layout (ici 3) !!!

        TextView text = new TextView(this);                     // declare le text view
        text.setText(getResources().getString(R.string.copyright));     // recupere copyright et l'attribu
        text.setTextColor(getResources().getColor(R.color.dark_red));
        text.setTextSize(25);                                           // change taille du texte
        myLayout.addView(text);                                         // ajoute le text (34) à la vue (25)    !!! ligne 24 choisir le bon layout (ici 3) !!!

    // ******************* les images simples ***************************
        this.targetImg = findViewById(R.id.imageBack);      // attribue l'id à l'image cible declaré lign 15
        // note le "new View.." + entré genere la suite
        targetImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trucEnclench = new Intent(getApplicationContext(), TrucActivity.class);         // "Intent" appelle une action/instruction  // getApplicationContext()  recupere les elements de l'appli  + , + appelle la classe
                startActivity(trucEnclench);                                                        // demarre l'aactivité cible
                finish();                                               // termine l'activité en cours
            }

        });
        


        Button loginBtn = (Button)findViewById(R.id.loginBtn);
        loginBtn.setText("Connexion");
        Button createBtn = (Button)findViewById(R.id.createBtn);
        createBtn.setText("Nouveau");
    }

    // button create
    public void mainOptions(View view) {startActivity(new Intent(this, SettingsActivity.class));
        finish();}
    public void loginAccount(View view) {startActivity(new Intent(this, LoginActivity.class));
        finish();}
}