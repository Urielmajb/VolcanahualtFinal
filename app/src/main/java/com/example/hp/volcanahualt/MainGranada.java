package com.example.hp.volcanahualt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainGranada extends AppCompatActivity {

    //Declarar instancias globales
    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincard);

        //Inicializar Volcanes
        List<Volcanes> items = new ArrayList<>();

        items.add(new Volcanes(R.drawable.mombacho,"Volcán Mombacho","Es uno de los más famosos de Nicaragua. El Mombacho tiene 4 cráteres, todos cubiertos por el bosque húmedo."));
        items.add(new Volcanes(R.drawable.zapatera,"Volcán El Zapatera","Es un volcán inactivo. Forma la Isla Zapatera en el lago Cocibolca. Isla Zapatera comprende una de las 78 áreas protegidas."));


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
