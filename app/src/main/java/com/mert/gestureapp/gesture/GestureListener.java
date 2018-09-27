package com.mert.gestureapp.gesture;

import android.view.GestureDetector;
import android.view.MotionEvent;

public interface GestureListener extends GestureDetector.OnGestureListener {

    interface fling {
        void TopFling();
        void RightFling();
        void LeftFling();
        void BottomFling();
    }

    interface scroll {
        void TopScroll();
        void RightScroll();
        void LeftScroll();
        void BottomScroll();
    }

    interface Press {
        void onShowPress(MotionEvent e);
        void onLongPress(MotionEvent e);
        void onDown(MotionEvent e);
    }

    interface Tap {
        void onSingleTapUp(MotionEvent e);
        void onSingleTapConfirmed(MotionEvent e);
        void onDoubleTapEvent(MotionEvent e);
        void  onDoubleTap(MotionEvent e);
    }
}
