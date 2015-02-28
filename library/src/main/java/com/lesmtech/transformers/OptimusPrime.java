package com.lesmtech.transformers;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;

import com.lesmtech.transformers.Animation.RotationY;
import com.lesmtech.transformers.library.R;

/**
 * Created by Te on 2/27/15.
 */
public class OptimusPrime extends ViewPager {

    public final static int RotationYTransformer = 0;







    private PagerAdapter mPageAdapter;
    private Context context;

    public OptimusPrime(Context context) {
        super(context);
        this.context = context;
    }

    public OptimusPrime(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.Transformer);
        int transformerType = ta.getInt(R.styleable.Transformer_type, RotationYTransformer);
        setTransformerType(transformerType);

        // Default Initial Setting, users can set Fragments by themSelves

    }

    // Set PageAdapter for PageView
    public void setFragments(Fragment[] fragments) {
        mPageAdapter = new ScreenSlidePagerAdapter(((FragmentActivity) context).getSupportFragmentManager(), fragments);
        setAdapter(mPageAdapter);
    }

    // Set Page Transformer Type
    public void setTransformerType(int type){
        switch (type){
            case RotationYTransformer:
                setPageTransformer(true, new RotationY());


            default:
                setPageTransformer(true, new RotationY());
        }

    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

        private Fragment[] fragments;
        private int NUM_PAGES;

        public ScreenSlidePagerAdapter(FragmentManager fm, Fragment[] fragments) {
            super(fm);
            this.fragments = fragments;
            NUM_PAGES = fragments.length;
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }

}
