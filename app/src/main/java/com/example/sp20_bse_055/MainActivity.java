package com.example.sp20_bse_055;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private FragmentManager fragmentManager;
private leftfrag leftf;
private FragmentTransaction fragmentTransaction;
private rightfrag rightf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        int orientation = getResources().getConfiguration().orientation;


        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            leftf = leftfrag.newInstance();
            rightf = rightfrag.newInstance();

            fragmentTransaction.replace(R.id.leftf, leftf);
            fragmentTransaction.replace(R.id.rightf,rightf);

            fragmentTransaction.commit();
    }
}}