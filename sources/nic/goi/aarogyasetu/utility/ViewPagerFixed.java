package nic.goi.aarogyasetu.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import h.z.a.b;

public class ViewPagerFixed extends b {
    public ViewPagerFixed(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ViewPagerFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
