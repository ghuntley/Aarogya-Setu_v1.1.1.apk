package i.c.a.c.h0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate */
public class i implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f4127f;

    public i(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f4127f = hVar;
        this.e = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f4127f.c()) {
                this.f4127f.f4118g = false;
            }
            h.a(this.f4127f, this.e);
            view.performClick();
        }
        return false;
    }
}
