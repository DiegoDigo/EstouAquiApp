package com.diego.estouaqui;


import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.diego.estouaqui.adapter.FilhoRecycleAdpater;
import com.diego.estouaqui.models.Filho;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager mStaggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolBar();
        recyclerView = (RecyclerView) findViewById(R.id.listaFilho);

        List<Filho> filhos = new ArrayList<>();
        Filho filho = new Filho(1L, "Diego Domingos Delmiro","Luiza Sallet Junca Almeida");
        Filho filho2 = new Filho(2L, "Willian Domingos Delmiro","Walfredo Avantes Caldas");
        filhos.add(filho);
        filhos.add(filho2);

        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        final FilhoRecycleAdpater  adapter = new FilhoRecycleAdpater(getBaseContext() , filhos);
        recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

    }


    private void setToolBar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_done_white);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
