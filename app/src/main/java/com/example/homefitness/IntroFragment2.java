package com.example.homefitness;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class IntroFragment2 extends Fragment {


    Button button,btn;
    public IntroFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v2 = inflater.inflate(R.layout.fragment_intro_fragment2, container, false);

        button = v2.findViewById(R.id.openLogin);
        btn = v2.findViewById(R.id.joinbtn);

        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  v2.findViewById(R.id.loginPage).setVisibility(View.VISIBLE);
              button.setVisibility(View.INVISIBLE);
              }
          });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2.findViewById(R.id.joinPage).setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                v2.findViewById(R.id.loginPage).setVisibility(View.INVISIBLE);
            }
        });

        return v2;

    }



}
