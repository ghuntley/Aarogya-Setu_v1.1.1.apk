package h.i.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: m  reason: collision with root package name */
    public int f1861m;

    /* renamed from: n  reason: collision with root package name */
    public int f1862n;

    /* renamed from: o  reason: collision with root package name */
    public LayoutInflater f1863o;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1862n = i2;
        this.f1861m = i2;
        this.f1863o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1863o.inflate(this.f1861m, viewGroup, false);
    }
}
