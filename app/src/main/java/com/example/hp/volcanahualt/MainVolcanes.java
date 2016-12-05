package com.example.hp.volcanahualt;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainVolcanes extends AppCompatActivity {
    //Declarar instancias globales
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincard);

        //Inicializar Volcanes
        List<Volcanes>items = new ArrayList<>();

        items.add(new Volcanes(R.drawable.sancristobal,"Volcán San Cristóbal","Es el volcán más alto de Nicaragua. Ubicado al noreste del pais."));
        items.add(new Volcanes(R.drawable.cosiguina,"Volcán Cosigüina","Es un volcán extinto al oeste de Nicaragua, también era llamado Lacoalguina."));
        items.add(new Volcanes(R.drawable.chonco,"Volcán El Chonco","Es un volcán apagado y fuertemente erosionado, rodeado de naturaleza y vida silvestre."));
        items.add(new Volcanes(R.drawable.casita,"Volcán El Casita","El famoso Casita forma parte del complejo volcanico de San Cristóbal. El casita esta inactivo."));

        //Obtener el Rycler
        recycler =(RecyclerView)findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        //Usar un administrador para LinerLayout
        lManager= new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new VolcanesAdapter(items);
        recycler.setAdapter(adapter);
    }
}
