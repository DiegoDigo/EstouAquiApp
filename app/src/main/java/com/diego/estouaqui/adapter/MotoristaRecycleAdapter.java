package com.diego.estouaqui.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.estouaqui.R;
import com.diego.estouaqui.adapter.viewholder.MotoristaViewHolder;
import com.diego.estouaqui.models.Motorista;

import java.util.List;

/**
 * Created by Diego on 09/02/2017.
 */

public class MotoristaRecycleAdapter extends RecyclerView.Adapter{

    private List<Motorista> motoristas;
    private Context context;

    public MotoristaRecycleAdapter(List<Motorista> motoristas, Context context) {
        this.motoristas = motoristas;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.layout_motorista,parent,false);
        return new MotoristaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Typeface fontNome = Typeface.createFromAsset(context.getAssets(),"CaveatBrush-Regular.ttf");
        Typeface fontCidade = Typeface.createFromAsset(context.getAssets(),"OpenSans-Regular.ttf");
        MotoristaViewHolder viewHolder = (MotoristaViewHolder) holder;
        viewHolder.nomeMotorista.setText(motoristas.get(position).getNome());
        viewHolder.nomeMotorista.setTypeface(fontNome);
        viewHolder.cidadeMotorista.setText(motoristas.get(position).getCidade());
        viewHolder.cidadeMotorista.setTypeface(fontCidade);
        viewHolder.rankMotorista.setRating(motoristas.get(position).getRank());
        viewHolder.tipoVeiculo.setText(motoristas.get(position).getTipoVeiculo());
        viewHolder.tipoVeiculo.setTypeface(fontCidade);
        viewHolder.lugar.setText(String.valueOf(motoristas.get(position).getLugar()));

    }

    @Override
    public int getItemCount() {
        return motoristas.size();
    }
}
