package com.lesmtech.transformers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

/**
 * Created by Te on 2/18/15.
 */
public class Mybutton extends Button {

    public Mybutton(Context context) {
        super(context);
        super.setAlpha(0.5f);
        super.setBackgroundColor(Color.BLUE);
    }

    public Mybutton(Context context, AttributeSet attrs) {
        super(context, attrs);
        super.setAlpha(0.5f);
        super.setBackgroundColor(Color.BLUE);
    }

    public Mybutton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        super.setAlpha(0.5f);
        super.setBackgroundColor(Color.BLUE);
    }

    public Mybutton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        super.setAlpha(0.5f);
        super.setBackgroundColor(Color.BLUE);
    }

    @Override
    public void setAnimation(Animation animation) {
        super.setAnimation(animation);
    }
}
