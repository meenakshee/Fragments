package com.example.minaxipc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Created by MINAXI PC on 8/11/2016.
 */
public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment1,container,false);
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        WindowManager wm = getWindowManager();
        Display d= wm.getDefaultDisplay();
        if (d.getWidth()>d.getHeight()) {

                Fragment1 fragment1=new Fragment1();
            fragmentTransaction.replace(android.R.id.content, fragment1);
        }
        else  {

            Fragment2 fragment2=new Fragment2();
            fragmentTransaction.replace(android.R.id.content, fragment2);
        }
        fragmentTransaction.commit();

    }
}

