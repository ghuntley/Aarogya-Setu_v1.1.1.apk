package h.h.e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import h.h.m.c;
import h.o.h;
import h.o.l;
import h.o.m;
import h.o.w;

/* compiled from: ComponentActivity */
public class d extends Activity implements l, c.a {
    public m e = new m(this);

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !h.h.m.m.b(decorView, keyEvent)) {
            return c.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !h.h.m.m.b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.e.a(h.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
