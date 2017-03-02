package com.diego.estouaqui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.diego.estouaqui.fragments.FilhosFragment;
import com.diego.estouaqui.fragments.MapFragment;

/**
 * Created by Diego on 02/03/2017.
 */

public class FragmentsAdapter extends FragmentStatePagerAdapter {

    String[] titulos;

    public FragmentsAdapter(FragmentManager fm, String[] titulos) {
        super(fm);
        this.titulos = titulos;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MapFragment();
            case 1:
                return new FilhosFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return this.titulos.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.titulos[position];
    }
}
