package i.c.a.c.z;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* compiled from: StaticLayoutBuilderCompat */
public final class g {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f4277k;

    /* renamed from: l  reason: collision with root package name */
    public static Constructor<StaticLayout> f4278l;

    /* renamed from: m  reason: collision with root package name */
    public static Object f4279m;
    public CharSequence a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f4280b;
    public final int c;
    public int d = 0;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public Layout.Alignment f4281f;

    /* renamed from: g  reason: collision with root package name */
    public int f4282g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4283h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4284i;

    /* renamed from: j  reason: collision with root package name */
    public TextUtils.TruncateAt f4285j;

    /* compiled from: StaticLayoutBuilderCompat */
    public static class a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.z.g.a.<init>(java.lang.Throwable):void");
        }
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.f4280b = textPaint;
        this.c = i2;
        this.e = charSequence.length();
        this.f4281f = Layout.Alignment.ALIGN_NORMAL;
        this.f4282g = Integer.MAX_VALUE;
        this.f4283h = true;
        this.f4285j = null;
    }

    public StaticLayout a() {
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.f4282g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f4280b, (float) max, this.f4285j);
        }
        this.e = Math.min(charSequence.length(), this.e);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f4284i) {
                this.f4281f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.d, this.e, this.f4280b, max);
            obtain.setAlignment(this.f4281f);
            obtain.setIncludePad(this.f4283h);
            obtain.setTextDirection(this.f4284i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f4285j;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f4282g);
            return obtain.build();
        }
        if (!f4277k) {
            try {
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f4279m = this.f4284i && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, cls, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE});
                f4278l = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f4277k = true;
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f4278l;
            g.a.a.b.a.a(constructor);
            Object obj = f4279m;
            g.a.a.b.a.a(obj);
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f4280b, Integer.valueOf(max), this.f4281f, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f4283h), null, Integer.valueOf(max), Integer.valueOf(this.f4282g)});
        } catch (Exception e3) {
            throw new a(e3);
        }
    }
}
