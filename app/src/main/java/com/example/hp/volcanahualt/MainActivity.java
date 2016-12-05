package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtinicio;
    TextView txtEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtinicio = (TextView)findViewById(R.id.txtVolca);
        String font_path = "fonts/ComicNeueSansID.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        txtinicio.setTypeface(TF);

        txtEntrar = (TextView) findViewById(R.id.BtnEntrar);
        String fon= "fonts/comic.ttf";
        Typeface to = Typeface.createFromAsset(getAssets(),fon);
        txtEntrar.setTypeface(to);
    }

    public void llamar (View view){
        Intent i = new Intent(this, menu2.class);
        startActivity(i);

    }


}