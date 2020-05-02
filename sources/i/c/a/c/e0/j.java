package i.c.a.c.e0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import i.c.a.b.d.l.q;
import i.c.a.c.k;

/* compiled from: ShapeAppearanceModel */
public class j {
    public d a;

    /* renamed from: b  reason: collision with root package name */
    public d f4072b;
    public d c;
    public d d;
    public c e;

    /* renamed from: f  reason: collision with root package name */
    public c f4073f;

    /* renamed from: g  reason: collision with root package name */
    public c f4074g;

    /* renamed from: h  reason: collision with root package name */
    public c f4075h;

    /* renamed from: i  reason: collision with root package name */
    public f f4076i;

    /* renamed from: j  reason: collision with root package name */
    public f f4077j;

    /* renamed from: k  reason: collision with root package name */
    public f f4078k;

    /* renamed from: l  reason: collision with root package name */
    public f f4079l;

    /* compiled from: ShapeAppearanceModel */
    public static final class b {
        public d a = new i();

        /* renamed from: b  reason: collision with root package name */
        public d f4080b = new i();
        public d c = new i();
        public d d = new i();
        public c e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f4081f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f4082g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f4083h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public f f4084i = new f();

        /* renamed from: j  reason: collision with root package name */
        public f f4085j = new f();

        /* renamed from: k  reason: collision with root package name */
        public f f4086k = new f();

        /* renamed from: l  reason: collision with root package name */
        public f f4087l = new f();

        public b() {
        }

        public b a(float f2) {
            this.f4083h = new a(f2);
            return this;
        }

        public b b(float f2) {
            this.f4082g = new a(f2);
            return this;
        }

        public b c(float f2) {
            this.e = new a(f2);
            return this;
        }

        public b d(float f2) {
            this.f4081f = new a(f2);
            return this;
        }

        public static float a(d dVar) {
            if (dVar instanceof i) {
                return ((i) dVar).a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).a;
            }
            return -1.0f;
        }

        public j a() {
            return new j(this, (a) null);
        }

        public b(j jVar) {
            this.a = jVar.a;
            this.f4080b = jVar.f4072b;
            this.c = jVar.c;
            this.d = jVar.d;
            this.e = jVar.e;
            this.f4081f = jVar.f4073f;
            this.f4082g = jVar.f4074g;
            this.f4083h = jVar.f4075h;
            this.f4084i = jVar.f4076i;
            this.f4085j = jVar.f4077j;
            this.f4086k = jVar.f4078k;
            this.f4087l = jVar.f4079l;
        }
    }

    public /* synthetic */ j(b bVar, a aVar) {
        this.a = bVar.a;
        this.f4072b = bVar.f4080b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f4073f = bVar.f4081f;
        this.f4074g = bVar.f4082g;
        this.f4075h = bVar.f4083h;
        this.f4076i = bVar.f4084i;
        this.f4077j = bVar.f4085j;
        this.f4078k = bVar.f4086k;
        this.f4079l = bVar.f4087l;
    }

    public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(k.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(k.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, (c) aVar);
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(k.ShapeAppearance_cornerFamilyBottomLeft, i4);
            c a2 = a(obtainStyledAttributes, k.ShapeAppearance_cornerSize, cVar);
            c a3 = a(obtainStyledAttributes, k.ShapeAppearance_cornerSizeTopLeft, a2);
            c a4 = a(obtainStyledAttributes, k.ShapeAppearance_cornerSizeTopRight, a2);
            c a5 = a(obtainStyledAttributes, k.ShapeAppearance_cornerSizeBottomRight, a2);
            c a6 = a(obtainStyledAttributes, k.ShapeAppearance_cornerSizeBottomLeft, a2);
            b bVar = new b();
            d a7 = q.a(i5);
            bVar.a = a7;
            float a8 = b.a(a7);
            if (a8 != -1.0f) {
                bVar.c(a8);
            }
            bVar.e = a3;
            d a9 = q.a(i6);
            bVar.f4080b = a9;
            float a10 = b.a(a9);
            if (a10 != -1.0f) {
                bVar.d(a10);
            }
            bVar.f4081f = a4;
            d a11 = q.a(i7);
            bVar.c = a11;
            float a12 = b.a(a11);
            if (a12 != -1.0f) {
                bVar.b(a12);
            }
            bVar.f4082g = a5;
            d a13 = q.a(i8);
            bVar.d = a13;
            float a14 = b.a(a13);
            if (a14 != -1.0f) {
                bVar.a(a14);
            }
            bVar.f4083h = a6;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public j() {
        this.a = new i();
        this.f4072b = new i();
        this.c = new i();
        this.d = new i();
        this.e = new a(0.0f);
        this.f4073f = new a(0.0f);
        this.f4074g = new a(0.0f);
        this.f4075h = new a(0.0f);
        this.f4076i = new f();
        this.f4077j = new f();
        this.f4078k = new f();
        this.f4079l = new f();
    }

    public static c a(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public j a(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        bVar.d(f2);
        bVar.b(f2);
        bVar.a(f2);
        return bVar.a();
    }

    public boolean a(RectF rectF) {
        Class<f> cls = f.class;
        boolean z = this.f4079l.getClass().equals(cls) && this.f4077j.getClass().equals(cls) && this.f4076i.getClass().equals(cls) && this.f4078k.getClass().equals(cls);
        float a2 = this.e.a(rectF);
        boolean z2 = this.f4073f.a(rectF) == a2 && this.f4075h.a(rectF) == a2 && this.f4074g.a(rectF) == a2;
        boolean z3 = (this.f4072b instanceof i) && (this.a instanceof i) && (this.c instanceof i) && (this.d instanceof i);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
