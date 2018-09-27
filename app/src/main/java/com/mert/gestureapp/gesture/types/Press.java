package com.mert.gestureapp.gesture.types;

import android.content.Context;
import android.view.MotionEvent;

import com.mert.gestureapp.gesture.GestureListener;
import com.mert.gestureapp.gesture.GesturePresenter;

public class Press extends GesturePresenter {
    private GestureListener.Press press;

    public Press(Context context, GestureListener.Press press) {
        super(context);
        this.press = press;
    }
    @Override
    public void onShowPress(MotionEvent e) {
        press.onShowPress(e);
    }

    @Override
    public void onLongPress(MotionEvent e) {
        press.onLongPress(e);
    }

    @Override
    public boolean onDown(MotionEvent e) {
        press.onDown(e);
        return super.onDown(e);
    }
}
