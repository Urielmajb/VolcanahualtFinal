package com.example.hp.volcanahualt;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Recycler extends AppCompatActivity {
    RecyclerView mlistcontainer;
    TextView conocevolcanes;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_mainr);

        conocevolcanes = (TextView)findViewById(R.id.txtConoceVolcanes);
        String fonts = "fonts/ComicNeueSansID.ttf";
        Typeface T = Typeface.createFromAsset(getAssets(),fonts);
        conocevolcanes.setTypeface(T);

       mlistcontainer = (RecyclerView)findViewById(R.id.listContainer);
        ListAdapter adapter=new ListAdapter(this,getDatasource());
        mlistcontainer.setLayoutManager(new LinearLayoutManager(this));
        mlistcontainer.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("DemoRecView", "Pulsado el elemento " + mlistcontainer.getChildPosition(v));

                switch (mlistcontainer.getChildPosition(v)){
                    case 0:
                        mostrarchinandega();
                        break;
                    case 1:
                        mostrarleon();
                        break;
                    case 2:
                        mostrarmasaya();
                        break;
                    case 3:
                        mostrarmanagua();
                        break;
                    case 4:
                        mostrargranada();
                        break;
                    case 5:
                        mostrarrivas();
                        break;
                    case 6:
                        informacion();
                        break;

                }
            }
        });

    }

    private List<String> getDatasource(){
        List<String> list= new ArrayList<>();
           list.add("Chinandega");
           list.add("León");
           list.add("Masaya");
           list.add("Managua");
           list.add("Granada");
           list.add("Rivas");
           list.add("Más información");
        return list;
    }

        public void mostrarleon(){
        Intent intent = new Intent(this,MainLeon.class);
        startActivity(intent);
    }
    public void mostrarmasaya(){
        Intent intent = new Intent(this,MainMayasa.class);
        startActivity(intent);
    }
    public void mostrarmanagua(){
        Intent intent = new Intent(this,MainManagua.class);
        startActivity(intent);
    }

    public void mostrargranada(){
        Intent intent = new Intent(this,MainGranada.class);
        startActivity(intent);
    }

    public void mostrarrivas(){
        Intent intent = new Intent(this,MainRivas.class);
        startActivity(intent);
    }

    public void mostrarchinandega(){
        Intent intent = new Intent(this,MainVolcanes.class);
        startActivity(intent);
    }

    public void informacion(){
        Intent intent = new Intent(this,volcanesIn.class);
        startActivity(intent);
    }


}
