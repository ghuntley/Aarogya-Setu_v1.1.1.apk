package h.b.o.i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import h.b.k.g;
import h.b.o.i.m;

/* compiled from: MenuDialogHelper */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public g f1301f;

    /* renamed from: g  reason: collision with root package name */
    public e f1302g;

    public h(g gVar) {
        this.e = gVar;
    }

    public void a(g gVar, boolean z) {
        g gVar2;
        if ((z || gVar == this.e) && (gVar2 = this.f1301f) != null) {
            gVar2.dismiss();
        }
    }

    public boolean a(g gVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.e.a((MenuItem) (i) this.f1302g.a().getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.f1302g;
        g gVar = this.e;
        m.a aVar = eVar.f1280l;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1301f.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1301f.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.e.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.e.performShortcut(i2, keyEvent, 0);
    }
}
