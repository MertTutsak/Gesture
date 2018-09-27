package com.mert.gestureapp.gesture.types;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;

import com.mert.gestureapp.gesture.GestureListener;
import com.mert.gestureapp.gesture.GesturePresenter;

public class Fling extends GesturePresenter {

    private GestureListener.fling fling;

    public Fling(Context context, GestureListener.fling fling) {
        super(context);
        this.fling = fling;
    }

    @Override
    public boolean onFling(MotionEvent downEvent, MotionEvent moveEvent, float velocityX, float velocityY) {
        boolean result = false;
        float diffY = moveEvent.getY() - downEvent.getY();
        float diffX = moveEvent.getX() - downEvent.getX();

        if (Math.abs(diffX) > Math.abs(diffY)) {
            if (Math.abs(diffX) > SWIPE_THRESHOLD_VELOCITY && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                if (diffX > 0) {
                    Log.d("GESTURE_EVENT", "onFling => Right");
                    fling.RightFling();
                } else {
                    Log.d("GESTURE_EVENT", "onFling => Left");
                    fling.LeftFling();
                }
                return true;
            }
        } else {
            if (Math.abs(diffY) > SWIPE_THRESHOLD_VELOCITY && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                if (diffY > 0) {
                    Log.d("GESTURE_EVENT", "onFling => Bottom");
                    fling.BottomFling();
                } else {
                    Log.d("GESTURE_EVENT", "onFling => Top");
                    fling.TopFling();
                }
                return true;
            }
        }

        return false;
    }
}
