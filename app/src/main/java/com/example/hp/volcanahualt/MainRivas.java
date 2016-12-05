package com.example.hp.volcanahualt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Owner on 17/11/2016.
 */
public class MainRivas extends AppCompatActivity {

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

        items.add(new Volcanes(R.drawable.concepcion,"Volcán El Concepción","Es uno de los dos volcanes de la Isla de Ometepe. Tiene 1640 metros de altura sobre el mar y es el más perfecto cono volcánico del pais."));
        items.add(new Volcanes(R.drawable.maderas,"Volcán El Madera","Es un volcán inactivo que se ubica en la isla de ometepe. Es un volcán alto con casi 1,400m de altura."));


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
