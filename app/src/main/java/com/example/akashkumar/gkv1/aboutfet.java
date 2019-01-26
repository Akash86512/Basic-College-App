package com.example.akashkumar.gkv1;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class aboutfet extends AppCompatActivity {
    ViewPager viewPager1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutfet);

        viewPager1=findViewById(R.id.view2);
        ViewPagerAdapter1 viewPagerAdapter1=new ViewPagerAdapter1(this);
        viewPager1.setAdapter(viewPagerAdapter1);
    }
}
