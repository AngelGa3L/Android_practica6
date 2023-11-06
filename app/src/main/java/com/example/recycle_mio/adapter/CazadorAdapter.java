package com.example.recycle_mio.adapter;

import android.location.GnssAntennaInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_mio.R;
import com.example.recycle_mio.models.Cazador;

import java.util.List;

public class CazadorAdapter extends RecyclerView.Adapter<CazadorAdapter.ViewHolder> {

    private List<Cazador> cazadores;

    public CazadorAdapter(List<Cazador> cazadores){this.cazadores = cazadores;}

    @NonNull
    @Override
    public CazadorAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.cazadoritem,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CazadorAdapter.ViewHolder holder, int position) {

        Cazador c = cazadores.get(position);

        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return cazadores.size();
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{

        TextView txtnombre,txtrango,txtespada;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.tvnombre);
            txtespada = itemView.findViewById(R.id.tvespada);
            txtrango = itemView.findViewById(R.id.tvrango);
        }

        public void setData(Cazador c) {
            txtnombre.setText(c.getNombre());
            txtrango.setText(c.getRango());
            txtespada.setText(c.getEspada().getColor());

        }
    }
}
