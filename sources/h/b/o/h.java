package h.b.o;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: WindowCallbackWrapper */
public class h implements Window.Callback {
    public final Window.Callback e;

    public h(Window.Callback callback) {
        if (callback != null) {
            this.e = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.e.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.e.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.e.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.e.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.e.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.e.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.e.onAttachedToWindow();
    }

    public View onCreatePanelView(int i2) {
        return this.e.onCreatePanelView(i2);
    }

    public void onDetachedFromWindow() {
        this.e.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.e.onMenuItemSelected(i2, menuItem);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.e.onPointerCaptureChanged(z);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.e.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.e.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.e.onWindowFocusChanged(z);
    }

    public boolean onSearchRequested() {
        return this.e.onSearchRequested();
    }
}
