package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainJuegos extends AppCompatActivity  implements View.OnClickListener {

    TextView tictac, pt, volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);

        tictac = (TextView) findViewById(R.id.tictac);
        String font_path = "fonts/ComicNeueSansID.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tictac.setTypeface(TF);
        tictac.setOnClickListener(this);


        pt = (TextView) findViewById(R.id.tj);
        String font_pat = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(), font_path);
        pt.setTypeface(T);
        pt.setOnClickListener(this);

        volver = (TextView) findViewById(R.id.regresar);
        String font_pa = "fonts/ComicNeueSansID.ttf";
        Typeface TFa = Typeface.createFromAsset(getAssets(), font_path);
        volver.setTypeface(TFa);
        volver.setOnClickListener(this);
    }

    public void tictac() {
        Intent intent = new Intent(this, MainActivity_tictac.class);
        startActivity(intent);
    }

    public void volver() {
        Intent intent = new Intent(this, menu2.class);
        startActivity(intent);
    }

    public void juegodepapeltijera(){
        Intent i = new Intent(this, MainPPT.class);
        startActivity(i);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tictac:
                tictac();
                break;

            case R.id.tj:
                juegodepapeltijera();
                break;

            case R.id.regresar:
                volver();
                break;

        }
    }
}