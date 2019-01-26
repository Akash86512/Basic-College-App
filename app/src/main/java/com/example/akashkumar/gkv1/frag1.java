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


public class frag1 extends Fragment {

    Button gkv,campus,course,palecement,gallery,map,cantact,department,video;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag1,container,false);

        MobileAds.initialize(getContext(),"ca-app-pub-2368632371520037~3707780148");
        AdView adView;
        adView=view.findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);
        gkv=view.findViewById(R.id.gkv);
        campus=view.findViewById(R.id.campus);
        course=view.findViewById(R.id.course);
        palecement=view.findViewById(R.id.plecement);
        gkv=view.findViewById(R.id.gkv);
        gallery=view.findViewById(R.id.gallery);
        map=view.findViewById(R.id.map);
        cantact=view.findViewById(R.id.cantact);

        video=view.findViewById(R.id.video);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),MapsActivity1.class);
                startActivity(a1);
            }
        });
        gkv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),gkv1.class);
                startActivity(a1);
            }
        });
        campus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),Campus1.class);
                startActivity(a1);
            }
        });
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),Course1.class);
                startActivity(a1);
            }
        });
        palecement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),plecement1.class);
                startActivity(a1);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),gallery1.class);
                startActivity(a1);
            }
        });
        cantact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),Cantact1.class);
                startActivity(a1);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent a1= new Intent(getActivity(),Gkvvideo.class);
                startActivity(a1);
            }
        });
      return view;
    }
}
