package com.oscarjesus.mascotas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oscarjesus.mascotas.R;
import com.oscarjesus.mascotas.adapter.MascotaAdaptador;
import com.oscarjesus.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by OscarJesús on 30/05/2016.
 */
public class recyclerviewfragments extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascostas);

    LinearLayoutManager llm = new LinearLayoutManager(getActivity());
    llm.setOrientation(LinearLayoutManager.VERTICAL);

    listaMascotas.setLayoutManager(llm);

    inicializarListaMascotas();
    inicializarAdaptador();


    return v;
}

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_2, "Bolita","10"));
        mascotas.add(new Mascota(R.drawable.perrito_3, "Kiara","10"));
        mascotas.add(new Mascota(R.drawable.perrito_4, "Anni","10"));
        mascotas.add(new Mascota(R.drawable.perrito_5, "Buggie","10"));
        mascotas.add(new Mascota(R.drawable.perrito_6, "Toby", "10"));
        mascotas.add(new Mascota(R.drawable.perrito_7, "Doki", "10"));
        mascotas.add(new Mascota(R.drawable.perrito_8, "Camilo", "10"));
        mascotas.add(new Mascota(R.drawable.perrito_9, "Bruno", "10"));


    }

}
