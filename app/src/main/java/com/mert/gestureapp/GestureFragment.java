package com.mert.gestureapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mert.gestureapp.gesture.GestureListener;
import com.mert.gestureapp.gesture.types.Fling;

public class GestureFragment extends Fragment implements GestureListener.fling {
    private Fling fling;

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gesture, container, false);

        //GesturePresenter
        this.fling = new Fling(getActivity(),this);

        //TextView
        textView = view.findViewById(R.id.textView);


        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return fling.getGestureDetector().onTouchEvent(motionEvent);
            }
        });

        return view;
    }

    @Override
    public void TopFling() {
        textView.setText("TopFling");
    }

    @Override
    public void RightFling() {
        textView.setText("RightFling");
    }

    @Override
    public void LeftFling() {
        textView.setText("LeftFling");
    }

    @Override
    public void BottomFling() {
        textView.setText("BottomFling");
    }
}
