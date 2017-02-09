package com.diego.estouaqui.adapter.viewholder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.diego.estouaqui.R;

/**
 * Created by Diego on 09/02/2017.
 */

public class MotoristaViewHolder extends RecyclerView.ViewHolder{

    public TextView nomeMotorista, cidadeMotorista, tipoVeiculo, lugar;
    public RatingBar rankMotorista;

    public MotoristaViewHolder(View itemView) {

        super(itemView);
        this.nomeMotorista = (TextView) itemView.findViewById(R.id.nomeMotorista);
        this.cidadeMotorista = (TextView) itemView.findViewById(R.id.cidade);
        this.tipoVeiculo = (TextView) itemView.findViewById(R.id.txtTipoVeiculo);
        this.lugar = (TextView) itemView.findViewById(R.id.lugarDiposnivel);
        this.rankMotorista = (RatingBar) itemView.findViewById(R.id.avaliacao);



    }
}
