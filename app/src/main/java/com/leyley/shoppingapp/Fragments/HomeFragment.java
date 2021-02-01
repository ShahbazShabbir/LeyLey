package com.leyley.shoppingapp.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leyley.shoppingapp.Activites.BestSell;
import com.leyley.shoppingapp.Activites.Categories;
import com.leyley.shoppingapp.Activites.Features;
import com.leyley.shoppingapp.Activites.Search;
import com.leyley.shoppingapp.R;

public class HomeFragment extends Fragment {

    TextView featureseeall,bestsellseeall,catsseeall;
    CardView search;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        search=view.findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    gotosearch();
            }
        });

        featureseeall=view.findViewById(R.id.featureseeall);
        featureseeall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotofeature();
            }
        });

        bestsellseeall=view.findViewById(R.id.bestsellseeall);
        bestsellseeall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotobestsell();
            }
        });

        catsseeall=view.findViewById(R.id.catsseeall);
        catsseeall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoseecat();
            }
        });

        return view;
    }

    private void gotofeature () {
        Intent i = new Intent(getActivity(), Features.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }
    private void gotobestsell () {
        Intent i = new Intent(getActivity(), BestSell.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }
    private void gotoseecat () {
        Intent i = new Intent(getActivity(), Categories.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }
    private void gotosearch () {
        Intent i = new Intent(getActivity(), Search.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }
    
}