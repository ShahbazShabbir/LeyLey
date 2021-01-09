package com.leyley.shoppingapp.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leyley.shoppingapp.Activites.Features;
import com.leyley.shoppingapp.Activites.Payment;
import com.leyley.shoppingapp.R;
import com.skydoves.elasticviews.ElasticLayout;


public class CartFragment extends Fragment {

    ElasticLayout buy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        buy=view.findViewById(R.id.buy);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotopayment();
            }
        });

        return view;
    }

    private void gotopayment () {

        Intent i = new Intent(getActivity(), Payment.class);
        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }
}