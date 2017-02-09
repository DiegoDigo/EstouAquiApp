package com.diego.estouaqui.views;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
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
        setRecyclerView(getBaseContext());


    }
    private void setToolBar() {
        Toolbar mToolbar = (Toolbar) findViewById(R.id.toolbarMotorista);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_done_white);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    private List<Motorista> popularTeste(){
        List<Motorista> motoristas = new ArrayList<>();

        Motorista motorista  = new Motorista("Diego Domingos Delmiro","São Paulo","Van",1,1F);
        Motorista motorista2  = new Motorista("Teste teste teste ","São Paulo - SP","Van",2,2F);
        Motorista motorista3  = new Motorista("Teste teste teste ","São Paulo - SP","Micro Onibus",3,3F);
        Motorista motorista4  = new Motorista("Teste teste teste ","São Paulo - SP","Micro Onibus",4,4F);
        Motorista motorista5  = new Motorista("Diego Teste","Sao Paulo","Van escolar",5,5F);


        motoristas.add(motorista);
        motoristas.add(motorista2);
        motoristas.add(motorista3);
        motoristas.add(motorista4);
        motoristas.add(motorista5);

        return motoristas;
    }

    private void setRecyclerView(Context c){
        recyclerView = (RecyclerView) findViewById(R.id.listaMotorista);

        mStaggeredGridLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);

        adapter = new MotoristaRecycleAdapter( this.popularTeste(),c);
        recyclerView.setLayoutManager(mStaggeredGridLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(adapter);
    }
}
