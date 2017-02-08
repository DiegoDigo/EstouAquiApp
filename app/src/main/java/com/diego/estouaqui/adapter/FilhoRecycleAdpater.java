package com.diego.estouaqui.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.estouaqui.R;
import com.diego.estouaqui.models.Filho;
import com.diego.estouaqui.adapter.viewholder.FilhoViewHolger;

import java.util.List;

/**
 * Created by Diego on 08/02/2017.
 */
public class FilhoRecycleAdpater extends RecyclerView.Adapter {

    private List<Filho> filhos;
    private Context context;

    public FilhoRecycleAdpater(Context context, List<Filho> filhos) {
        this.filhos = filhos;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_filhos, parent,false);
        return new FilhoViewHolger(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Typeface fontNome = Typeface.createFromAsset(context.getAssets(),"CaveatBrush-Regular.ttf");
        Typeface fontEscola = Typeface.createFromAsset(context.getAssets(),"OpenSans-Regular.ttf");
        FilhoViewHolger filho = (FilhoViewHolger) holder;
        filho.txtNome.setText(filhos.get(position).getNome());
        filho.txtNome.setTypeface(fontNome);
        filho.txtEscola.setText(filhos.get(position).getNomeEscola());
        filho.txtEscola.setTypeface(fontEscola);

    }

    @Override
    public int getItemCount() {
        return filhos.size();
    }
}