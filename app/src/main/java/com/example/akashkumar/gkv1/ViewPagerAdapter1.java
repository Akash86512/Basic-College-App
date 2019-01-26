package com.example.akashkumar.gkv1;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class ViewPagerAdapter1 extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] integers1={R.drawable.fet1,R.drawable.fet2,R.drawable.fet3,R.drawable.fet4};

    public ViewPagerAdapter1(Context context) {


        this.context = context;
    }

    @Override
    public int getCount() {
        return integers1.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View view=layoutInflater.inflate(R.layout.custom_layout1,null);

        ImageView imageView=view.findViewById(R.id.imageView1);
        imageView.setImageResource(integers1[position]);
        ViewPager vp=(ViewPager) container;
        vp.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp=(ViewPager)container;
        View view=(View) object;
        vp.removeView(view);

    }
}
