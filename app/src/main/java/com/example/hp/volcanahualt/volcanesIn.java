package com.example.hp.volcanahualt;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class volcanesIn extends AppCompatActivity {
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

        items.add(new Volcanes(R.drawable.mombacho,"Volcán Mombacho","Existe un reporte histórico sobre una actividad en 1570."));
        items.add(new Volcanes(R.drawable.zapatera,"Volcán El Zapatera","629 metros de elevación, última erupción (Prehistórica), Estado actual: Extinto"));

        items.add(new Volcanes(R.drawable.momotombo,"Volcán Momotombo","Una erupción violenta en 1524 es la primera actividad histórica conocida. En el cráter existen muchas áreas con azufre amarillo luminoso."));
        items.add(new Volcanes(R.drawable.telica,"Volcán El Telica","Es uno de los volcanes más activos de Nicaragua; presenta erupciones de forma intermitente desde la conquista española."));
        items.add(new Volcanes(R.drawable.cerro_negro,"Volcán El Cerro Negro","675 metros de elevación, última erupción en 1999, Estado actual: Activo."));
        items.add(new Volcanes(R.drawable.hoyo,"Volcán El Hoyo","1050 metros de elevación, última erupción en 1952 y 1954, Estado actual: Activo."));
        items.add(new Volcanes(R.drawable.santa_clara,"Volcán Santa Clara","834 metros de elevación, última erupción (Prehistórica), Estado actual: Extinto"));

        items.add(new Volcanes(R.drawable.apoyeque,"Volcán Apoyeque","En 1988, las temperaturas de la laguna empezaron a subir y se empezó a sentir un fuerte olor a azufre."));

        items.add(new Volcanes(R.drawable.vol_masaya,"Volcán Masaya","632 metros de elevación, última erupción en 1946 y 1965, Estado actual: Activo"));

        items.add(new Volcanes(R.drawable.concepcion,"Volcán El Concepción","Altura 1,610 m. Uno de los volcanes más altos de Nicaragua, también figura entre los más activos"));
        items.add(new Volcanes(R.drawable.maderas,"Volcán El Madera","El último período eruptivo importante del volcán ocurrió hace más de 3000 años."));

        items.add(new Volcanes(R.drawable.sancristobal,"Volcán San Cristóbal","Altura 1,745 m. Las primeras descripciones de erupciones se conocen de los años 1520"));
        items.add(new Volcanes(R.drawable.cosiguina,"Volcán Cosigüina","Originó una corta pero poderosa erupción explosiva en 1835, la más grande en Nicaragua, en tiempos históricos."));
        items.add(new Volcanes(R.drawable.chonco,"Volcán El Chonco","Es un volcán apagado y fuertemente erosionado, Rodeado de abundante naturaleza y vida silvestre"));
        items.add(new Volcanes(R.drawable.casita,"Volcán El Casita","El Casita, 1405 metros de elevación, última erupción (avalancha en 1998), Estado actual: Extinto"));


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
