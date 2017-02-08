package com.diego.estouaqui;


import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.diego.estouaqui.adapter.FilhoRecycleAdpater;
import com.diego.estouaqui.models.Filho;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private FloatingActionButton floatingActionButton;
    private StaggeredGridLayoutManager mStaggeredGridLayoutManager;
    private List<Filho> filhos = new ArrayList<>();
    private FilhoRecycleAdpater  adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolBar();
        recyclerView = (RecyclerView) findViewById(R.id.listaFilho);


        Filho filho = new Filho(1L, "Diego Domingos Delmiro","Luiza Sallet Junca Almeida");
        Filho filho2 = new Filho(2L, "Willian Domingos Delmiro","Walfredo Avantes Caldas");
        filhos.add(filho);
        filhos.add(filho2);


        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        adapter = new FilhoRecycleAdpater(getBaseContext() , filhos);
        recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

        listenersButtons();

    }


    private void setToolBar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_done_white);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public void listenersButtons() {
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_fabteste);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Salvo",Toast.LENGTH_LONG).show();
                // Cria uma nova pessoa chamada Renan Teles
                Filho filho = new Filho(3L,"teste button","teste button");
                filhos.add(filho);
                adapter.notifyDataSetChanged();

            }
        });
}
}
