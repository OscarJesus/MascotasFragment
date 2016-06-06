package com.oscarjesus.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.oscarjesus.mascotas.adapter.MascotaAdaptador;
import com.oscarjesus.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFav extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_fav);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascostasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));




    }


}
