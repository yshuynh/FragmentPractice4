package com.example.it4.fragmentpractice;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        FragmentB1 fragmentB1 = new FragmentB1();
        FragmentB2 fragmentB2 = new FragmentB2();
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frameB1, fragmentB1);
        fragmentTransaction.add(R.id.frameB2, fragmentB2);
        fragmentTransaction.commit();
        return view;
    }
}
