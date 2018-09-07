package com.example.it4.fragmentpractice;

import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameA, fragmentA);
        fragmentTransaction.add(R.id.frameB, fragmentB);
        fragmentTransaction.commit();

    }
}
