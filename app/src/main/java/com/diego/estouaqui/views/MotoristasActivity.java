package com.diego.estouaqui.views;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.diego.estouaqui.R;
import com.diego.estouaqui.adapter.FilhoRecycleAdpater;
import com.diego.estouaqui.adapter.MotoristaRecycleAdapter;
import com.diego.estouaqui.models.Filho;
import com.diego.estouaqui.models.Motorista;

import java.util.ArrayList;
import java.util.List;

public class MotoristasActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager mStaggeredGridLayoutManager;
    private List<Motorista> filhos = new ArrayList<>();
    private MotoristaRecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motoristas);

        setToolBar();
        recyclerView = (RecyclerView) findViewById(R.id.listaMotorista);

        List<Motorista> motoristas = new ArrayList<>();

        Motorista motorista  = new Motorista(2F,"Diego Domingos Delmiro","São Paulo");
        Motorista motorista2  = new Motorista(1F,"Teste teste teste ","São Paulo - SP");

        motoristas.add(motorista);
        motoristas.add(motorista2);


        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        adapter = new MotoristaRecycleAdapter( motoristas,getBaseContext());
        recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

    }
    private void setToolBar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbarMotorista);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_done_white);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }
}
