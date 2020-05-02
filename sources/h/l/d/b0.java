package h.l.d;

import androidx.fragment.app.Fragment;
import h.h.i.a;
import h.l.d.h0;
import h.l.d.r;

/* compiled from: FragmentTransition */
public final class b0 implements Runnable {
    public final /* synthetic */ h0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f1943f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f1944g;

    public b0(h0.a aVar, Fragment fragment, a aVar2) {
        this.e = aVar;
        this.f1943f = fragment;
        this.f1944g = aVar2;
    }

    public void run() {
        ((r.b) this.e).a(this.f1943f, this.f1944g);
    }
}
