package com.example.it4.fragmentpractice;

import android.app.Fragment;
import android.app.FragmentManager;
;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_a, container, false);

        FragmentA1 fragmentA1 = new FragmentA1();
        FragmentA2 fragmentA2 = new FragmentA2();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameA1, fragmentA1);
        fragmentTransaction.add(R.id.frameA2, fragmentA2);
        fragmentTransaction.commit();

        return view;
    }

}
