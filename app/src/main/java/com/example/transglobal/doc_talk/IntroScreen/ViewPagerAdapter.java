package com.example.transglobal.doc_talk.IntroScreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.transglobal.doc_talk.R;

import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

//    private int[] layouts;


    private int[] layouts = new int[]{
                 R.layout.intro1,
                R.layout.intro2,
                R.layout.intro3};



    //constructor
    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {

        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

//        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(layouts[position],container,false);
        container.addView(view);

        return view;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        View view = (View) object;
        container.removeView(view);
    }





}
