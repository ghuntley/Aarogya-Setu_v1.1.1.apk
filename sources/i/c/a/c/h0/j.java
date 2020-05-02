package i.c.a.c.h0;

import android.view.View;

/* compiled from: DropdownMenuEndIconDelegate */
public class j implements View.OnFocusChangeListener {
    public final /* synthetic */ h e;

    public j(h hVar) {
        this.e = hVar;
    }

    public void onFocusChange(View view, boolean z) {
        this.e.a.setEndIconActivated(z);
        if (!z) {
            h.a(this.e, false);
            this.e.f4118g = false;
        }
    }
}
