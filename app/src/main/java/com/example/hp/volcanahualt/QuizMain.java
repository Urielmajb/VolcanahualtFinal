package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizMain extends AppCompatActivity {

    TextView texto;
    TextView empezar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizmain);

        texto = (TextView)findViewById(R.id.txtp);
        String font_path = "fonts/ComicNeueSansID.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        texto.setTypeface(TF);

        empezar = (TextView)findViewById(R.id.btnEmpezar);
        String font = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),font_path);
        empezar.setTypeface(T);

    }

    public void llamar(View view){
        Intent i = new Intent(this, Quiz.class);
        startActivity(i);

    }
}
