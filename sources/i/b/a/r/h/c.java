package i.b.a.r.h;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import i.b.a.r.b;
import i.b.a.t.j;

/* compiled from: CustomTarget */
public abstract class c<T> implements h<T> {
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2851f;

    /* renamed from: g  reason: collision with root package name */
    public b f2852g;

    public c() {
        if (j.a((int) RecyclerView.UNDEFINED_DURATION, (int) RecyclerView.UNDEFINED_DURATION)) {
            this.e = RecyclerView.UNDEFINED_DURATION;
            this.f2851f = RecyclerView.UNDEFINED_DURATION;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + RecyclerView.UNDEFINED_DURATION + " and height: " + RecyclerView.UNDEFINED_DURATION);
    }

    public void a() {
    }

    public void a(Drawable drawable) {
    }

    public final void a(b bVar) {
        this.f2852g = bVar;
    }

    public final void a(g gVar) {
    }

    public void b(Drawable drawable) {
    }

    public final void b(g gVar) {
        gVar.a(this.e, this.f2851f);
    }

    public void c() {
    }

    public void d() {
    }

    public final b b() {
        return this.f2852g;
    }
}
