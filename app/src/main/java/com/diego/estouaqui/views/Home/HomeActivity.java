package com.diego.estouaqui.views.Home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.diego.estouaqui.R;
import com.diego.estouaqui.adapter.FragmentsAdapter;


public class HomeActivity extends AppCompatActivity {

    private TabLayout mTab;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTab = (TabLayout) findViewById(R.id.tab_home);
        mViewPager = (ViewPager) findViewById(R.id.conteiner_home);

        mViewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titulos)));
        mTab.setupWithViewPager(mViewPager);


    }

}
