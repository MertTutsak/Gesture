package com.mert.gestureapp.gesture.types;

import android.content.Context;
import android.util.Log;
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
    public boolean onScroll(MotionEvent downEvent, MotionEvent moveEvent, float distanceX, float distanceY) {
        boolean result = false;
        float diffY = moveEvent.getY() - downEvent.getY();
        float diffX = moveEvent.getX() - downEvent.getX();

        if (Math.abs(diffX) > Math.abs(diffY)) {
            if (Math.abs(diffX) > SWIPE_THRESHOLD_VELOCITY && Math.abs(distanceX) > SWIPE_THRESHOLD_VELOCITY) {
                if (diffX > 0) {
                    Log.d("GESTURE_EVENT", "onFling => Right");
                    scroll.RightScroll();
                } else {
                    Log.d("GESTURE_EVENT", "onFling => Left");
                    scroll.LeftScroll();
                }
                result = true;
            }
        } else {
            if (Math.abs(diffY) > SWIPE_THRESHOLD_VELOCITY && Math.abs(distanceY) > SWIPE_THRESHOLD_VELOCITY) {
                if (diffY > 0) {
                    Log.d("GESTURE_EVENT", "onFling => Bottom");
                    scroll.BottomScroll();
                } else {
                    Log.d("GESTURE_EVENT", "onFling => Top");
                    scroll.TopScroll();
                }
                result = true;
            }
        }

        return result;
    }
}

