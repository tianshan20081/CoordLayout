package com.gooker.coordlayout.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by sczhang on 2017/5/22. 下午10:49
 * Package Name com.gooker.coordlayout.behavior
 * Project Name CoordLayout
 */

public class MyBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    public MyBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes) {
        boolean b = nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL;
        return b || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        if (dyConsumed > 0) {
//往下滑
            animOut(child);
        }
        if (dyConsumed < 0) {
//            往上滑
            animIn(child);
        }
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
    }

    private void animIn(FloatingActionButton child) {
        ViewCompat.animate(child).translationY(0).start();
    }

    private void animOut(FloatingActionButton child) {
        ViewCompat.animate(child).translationY(child.getHeight())
                .setListener(new ViewPropertyAnimatorListener() {
                    @Override
                    public void onAnimationStart(View view) {
                        
                    }

                    @Override
                    public void onAnimationEnd(View view) {

                    }

                    @Override
                    public void onAnimationCancel(View view) {

                    }
                })
                .start();
    }
}
