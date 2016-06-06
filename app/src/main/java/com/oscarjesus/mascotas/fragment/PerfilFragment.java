package com.oscarjesus.mascotas.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oscarjesus.mascotas.R;
import com.oscarjesus.mascotas.adapter.GridAdaptador;
import com.oscarjesus.mascotas.adapter.MascotaAdaptador;
import com.oscarjesus.mascotas.pojo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {


    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.gvMascosta);

       /* LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/

        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);

        listaMascotas.setLayoutManager(glm);

        inicializarListaMascotas();
        inicializarAdaptador();


        return v;
    }

    public void inicializarAdaptador() {
        GridAdaptador adaptador = new GridAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta","10"));
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
