package i.c.a.c.d0;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: ShadowRenderer */
public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f4038i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f4039j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4040k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f4041l = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f4042b;
    public final Paint c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f4043f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f4044g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f4045h = new Paint();

    public a() {
        a(-16777216);
        this.f4045h.setColor(0);
        Paint paint = new Paint(4);
        this.f4042b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(this.f4042b);
    }

    public void a(int i2) {
        this.d = h.h.g.a.b(i2, 68);
        this.e = h.h.g.a.b(i2, 20);
        this.f4043f = h.h.g.a.b(i2, 0);
        this.a.setColor(this.d);
    }
}
