package com.mert.gestureapp.gesture.types;

import android.content.Context;
import android.view.MotionEvent;

import com.mert.gestureapp.gesture.GestureListener;
import com.mert.gestureapp.gesture.GesturePresenter;

public class Scroll extends GesturePresenter {
    private GestureListener.scroll scroll;

    public Scroll(Context context, GestureListener.scroll scroll) {
        super(context);
        this.scroll = scroll;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        scroll.BottomScroll();
        return super.onScroll(e1, e2, distanceX, distanceY);
    }
}

