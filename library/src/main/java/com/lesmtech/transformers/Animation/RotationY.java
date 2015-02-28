package com.lesmtech.transformers.Animation;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Te on 2/27/15.
 * <p/>
 * ViewPager
 */

public class RotationY implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View view, float position) {
        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(0);

        } else if (position <= 1) { // [-1,1]
            view.setAlpha(Math.abs(1 - Math.abs(position)));
            view.setRotationY(180 * position);
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(0);
        }
    }
}
