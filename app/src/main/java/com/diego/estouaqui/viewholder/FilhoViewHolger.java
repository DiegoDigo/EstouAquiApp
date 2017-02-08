package com.diego.estouaqui.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.diego.estouaqui.R;

/**
 * Created by Diego on 08/02/2017.
 */
public class FilhoViewHolger extends RecyclerView.ViewHolder {

    public final TextView txtNome , txtEscola;


    public FilhoViewHolger(View itemView) {
        super(itemView);
        this.txtNome = (TextView) itemView.findViewById(R.id.nome);
        this.txtEscola = (TextView) itemView.findViewById(R.id.nomeEscola);

    }
}
