package i.b.a.n.o.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;

/* compiled from: BitmapDrawableDecoder */
public class a<DataType> implements i<DataType, BitmapDrawable> {
    public final i<DataType, Bitmap> a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f2725b;

    public a(Resources resources, i<DataType, Bitmap> iVar) {
        g.a.a.b.a.a(resources, "Argument must not be null");
        this.f2725b = resources;
        g.a.a.b.a.a(iVar, "Argument must not be null");
        this.a = iVar;
    }

    public boolean a(DataType datatype, g gVar) {
        return this.a.a(datatype, gVar);
    }

    public v<BitmapDrawable> a(DataType datatype, int i2, int i3, g gVar) {
        return t.a(this.f2725b, this.a.a(datatype, i2, i3, gVar));
    }
}
