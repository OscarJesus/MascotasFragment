package com.oscarjesus.mascotas.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oscarjesus.mascotas.R;
import com.oscarjesus.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by OscarJesús on 03/06/2016.
 */
public class GridAdaptador extends RecyclerView.Adapter<GridAdaptador.GridViewHolder>{

    ArrayList<Mascota> mascotas;

    public GridAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }


    @Override
    public GridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_mascota, parent, false);
        return new GridViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GridViewHolder GridViewHolder, int position) {
        Mascota mascota = mascotas.get(position);
        GridViewHolder.imgFotoGV.setImageResource(mascota.getFoto());
        GridViewHolder.tvLikeGV.setText(mascota.getLike());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class GridViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFotoGV;
        private TextView tvLikeGV;

        public GridViewHolder(View itemView) {
            super(itemView);
            imgFotoGV = (ImageView) itemView.findViewById(R.id.imgFotoGV);
            tvLikeGV = (TextView) itemView.findViewById(R.id.tvLikeGV);
        }
    }
}
