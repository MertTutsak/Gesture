package com.mert.gestureapp.gesture.types;

import android.content.Context;
import android.view.MotionEvent;

import com.mert.gestureapp.gesture.GestureListener;
import com.mert.gestureapp.gesture.GesturePresenter;

public class Tap extends GesturePresenter {
    GestureListener.Tap tap;

    public Tap(Context context, GestureListener.Tap tap) {
        super(context);
        this.tap = tap;
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        tap.onSingleTapUp(e);
        return super.onSingleTapUp(e);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tap.onSingleTapConfirmed(motionEvent);
        return super.onSingleTapConfirmed(motionEvent);
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tap.onDoubleTap(motionEvent);
        return super.onDoubleTap(motionEvent);
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tap.onDoubleTapEvent(motionEvent);
        return super.onDoubleTapEvent(motionEvent);
    }
}
