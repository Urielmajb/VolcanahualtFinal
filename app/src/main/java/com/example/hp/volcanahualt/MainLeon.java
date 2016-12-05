package com.example.hp.volcanahualt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainLeon extends AppCompatActivity {

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

        items.add(new Volcanes(R.drawable.momotombo,"Volcán Momotombo","Momotombo significa cumbre herviente. Es un volcán relativamente joven, con unos 4,500 años de edad."));
        items.add(new Volcanes(R.drawable.telica,"Volcán El Telica","Es un volcán activo a 30Km de León, ultima erupción violenta fue en 1948, pero desde entonces ha estado explusando humo y rugiendo."));
        items.add(new Volcanes(R.drawable.cerro_negro,"Volcán El Cerro Negro","Uno de los volcanes más jovenes en el mundo, es basicamente una colina negra y sin vegetación, con laderas bastante empinadas."));
        items.add(new Volcanes(R.drawable.hoyo,"Volcán El Hoyo","Es muy peculiar por la forma del cráter. Ahi hay varios cerros de origen volcánico en una sola base."));
        items.add(new Volcanes(R.drawable.santa_clara,"Volcán Santa Clara","Es un volcán ya extinto por lo que presenta a sus pies los respiraderos por donde desprende gases acumulados y agua caliente"));


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
