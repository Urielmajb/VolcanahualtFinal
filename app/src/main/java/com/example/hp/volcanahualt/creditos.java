package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Owner on 20/11/2016.
 */
public class creditos extends AppCompatActivity implements View.OnClickListener{

    TextView creditos;
    TextView credistoIN;
    TextView kattya;
    TextView urielma;
    TextView karen;
    TextView boton_c;
    Button button_c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos);

        creditos = (TextView)findViewById(R.id.creditos);
        String font_path = "fonts/ComicNeueSansID.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        creditos.setTypeface(TF);

        credistoIN= (TextView)findViewById(R.id.creditoIN);
        String font_pat = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),font_path);
        credistoIN.setTypeface(T);

        kattya=(TextView)findViewById(R.id.kattya);
        String font_pa = "fonts/ComicNeueSansID.ttf";
        Typeface Te = Typeface.createFromAsset(getAssets(),font_path);
        kattya.setTypeface(Te);

        urielma=(TextView)findViewById(R.id.urielma);
        String font_p = "fonts/ComicNeueSansID.ttf";
        Typeface Ta = Typeface.createFromAsset(getAssets(),font_path);
        urielma.setTypeface(Ta);

        karen=(TextView)findViewById(R.id.karen);
        String font = "fonts/ComicNeueSansID.ttf";
        Typeface Tr = Typeface.createFromAsset(getAssets(),font_path);
        karen.setTypeface(Tr);

        boton_c=(TextView)findViewById(R.id.button_C);
        String fon = "fonts/ComicNeueSansID.ttf";
        Typeface Tl = Typeface.createFromAsset(getAssets(),font_path);
        boton_c.setTypeface(Tl);
        boton_c.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,menu2.class);
        startActivity(intent);
    }
}

