package com.diego.estouaqui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.diego.estouaqui.R;
import com.diego.estouaqui.adapter.FilhoRecycleAdpater;
import com.diego.estouaqui.models.Filho;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diego on 02/03/2017.
 */

public class FilhosFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Filho> filhos = new ArrayList<>();
    private StaggeredGridLayoutManager mStaggeredGridLayoutManager;
    private FilhoRecycleAdpater  adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.listaFilho);


        Filho filho = new Filho(1L, "Diego Domingos Delmiro","Luiza Sallet Junca Almeida");
        Filho filho2 = new Filho(2L, "Willian Domingos Delmiro","Walfredo Avantes Caldas");
        filhos.add(filho);
        filhos.add(filho2);


        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        adapter = new FilhoRecycleAdpater(view.getContext() , filhos);
        recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);



        return view;
    }
}
