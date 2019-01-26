package com.example.akashkumar.gkv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class aboutus extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        MobileAds.initialize(this,"ca-app-pub-2368632371520037~3707780148");
        AdView adView;
        adView=findViewById(R.id.adview);
        AdRequest adRequest=new AdRequest .Builder().build();
        adView.loadAd(adRequest);
    }
}
