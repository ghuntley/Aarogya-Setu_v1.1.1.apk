package h.l.d;

import androidx.fragment.app.Fragment;
import h.h.i.a;
import h.l.d.h0;
import h.l.d.r;

/* compiled from: FragmentTransition */
public final class d0 implements Runnable {
    public final /* synthetic */ h0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f1945f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f1946g;

    public d0(h0.a aVar, Fragment fragment, a aVar2) {
        this.e = aVar;
        this.f1945f = fragment;
        this.f1946g = aVar2;
    }

    public void run() {
        ((r.b) this.e).a(this.f1945f, this.f1946g);
    }
}
