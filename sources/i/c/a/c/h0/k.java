package i.c.a.c.h0;

import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate */
public class k implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    public void onDismiss() {
        h hVar = this.a;
        hVar.f4118g = true;
        hVar.f4120i = System.currentTimeMillis();
        h.a(this.a, false);
    }
}
