package com.example.minaxipc.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by MINAXI PC on 8/11/2016.
 */
public class Fragment2 extends Fragment {
    Button mbtn1;
    TextView mtv2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.franment2,container,false);
    }
    public void onStart(){
        super.onStart();
        mbtn1=(Button)getActivity().findViewById(R.id.btn1);
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mtv2=(TextView)getActivity().findViewById(R.id.tv2);
                Toast.makeText(getActivity(), mtv2.getText(), Toast.LENGTH_LONG).show();

            }
        });
    }
}
