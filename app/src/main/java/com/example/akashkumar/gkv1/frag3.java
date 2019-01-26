package com.example.akashkumar.gkv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by Akash Kumar on 03/04/2018.
 */

public class frag3 extends Fragment {

    Button jna,gpl,yoga,election,hostel;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.frag3,container,false);

       jna=view.findViewById(R.id.jna);
        gpl=view.findViewById(R.id.gpl);
        hostel=view.findViewById(R.id.hostal);
        election=view.findViewById(R.id.election);
        yoga=view.findViewById(R.id.yoga);

        MobileAds.initialize(getContext(),"ca-app-pub-2368632371520037~3707780148");
        AdView adView;
        adView=view.findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);
       jna.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent a1=new Intent(getActivity(),Main2Activity.class);
               startActivity(a1);
           }
       });
        gpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),gpl.class);
                startActivity(a1);
            }
        });
        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),yoga.class);
                startActivity(a1);
            }
        });
        hostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),hostelnight.class);
                startActivity(a1);
            }
        });
        election.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),Election.class);
                startActivity(a1);
            }
        });
       return view;
    }
}
