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


public class frag2 extends Fragment {

    Button fet3,course3,place3,cantact3,map3,gallery3,video,live;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.frag2,container,false);

        fet3=view.findViewById(R.id.fet2);
        course3=view.findViewById(R.id.course2);
        place3=view.findViewById(R.id.place2);
        cantact3=view.findViewById(R.id.cantact2);
        live=view.findViewById(R.id.live);

        MobileAds.initialize(getContext(),"ca-app-pub-2368632371520037~3707780148");
        AdView adView;
        adView=view.findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);

         video=view.findViewById(R.id.video1);
         map3=view.findViewById(R.id.map2);
        gallery3=view.findViewById(R.id.gallery2);
      map3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent a1=new Intent(getActivity(),MapsActivity2.class);
        startActivity(a1);
    }
});

        fet3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),aboutfet.class);
                startActivity(a1);

            }
        });

        course3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),Fetcourse.class);
                startActivity(a1);

            }
        });
        place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),plecement1.class);
                startActivity(a1);

            }
        });
        gallery3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),Gallery2.class);
                startActivity(a1);

            }
        });
        cantact3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),Contact2.class);
                startActivity(a1);

            }
        });
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),fetvideo.class);
                startActivity(a1);

            }
        });

        live.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a1=new Intent(getActivity(),livenews.class);
                startActivity(a1);

            }
        });
      return view;
    }
}
