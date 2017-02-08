package com.diego.estouaqui.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.diego.estouaqui.R;

/**
 * Created by Diego on 08/02/2017.
 */
public class FilhoViewHolger extends RecyclerView.ViewHolder {

    public final TextView txtNome , txtEscola;


    public FilhoViewHolger(final View itemView) {
        super(itemView);
        this.txtNome = (TextView) itemView.findViewById(R.id.nome);
        this.txtEscola = (TextView) itemView.findViewById(R.id.nomeEscola);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(itemView.getContext(), txtNome.getText() , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
