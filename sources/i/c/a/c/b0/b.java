package i.c.a.c.b0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import h.h.f.b.g;
import i.c.a.b.d.l.q;
import i.c.a.c.k;

/* compiled from: TextAppearance */
public class b {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f4027b;
    public final int c;
    public final int d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final ColorStateList f4028f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4029g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4030h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4031i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4032j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4033k = false;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f4034l;

    public b(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, k.TextAppearance);
        this.a = obtainStyledAttributes.getDimension(k.TextAppearance_android_textSize, 0.0f);
        this.f4027b = q.a(context, obtainStyledAttributes, k.TextAppearance_android_textColor);
        q.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorHint);
        q.a(context, obtainStyledAttributes, k.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(k.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(k.TextAppearance_android_typeface, 1);
        int i3 = k.TextAppearance_fontFamily;
        i3 = !obtainStyledAttributes.hasValue(i3) ? k.TextAppearance_android_fontFamily : i3;
        this.f4032j = obtainStyledAttributes.getResourceId(i3, 0);
        this.e = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(k.TextAppearance_textAllCaps, false);
        this.f4028f = q.a(context, obtainStyledAttributes, k.TextAppearance_android_shadowColor);
        this.f4029g = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDx, 0.0f);
        this.f4030h = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowDy, 0.0f);
        this.f4031i = obtainStyledAttributes.getFloat(k.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public void a(Context context, d dVar) {
        a();
        if (this.f4032j == 0) {
            this.f4033k = true;
        }
        if (this.f4033k) {
            dVar.a(this.f4034l, true);
            return;
        }
        try {
            int i2 = this.f4032j;
            a aVar = new a(dVar);
            if (context.isRestricted()) {
                aVar.a(-4, (Handler) null);
                return;
            }
            g.a.a.b.a.a(context, i2, new TypedValue(), 0, (g) aVar, (Handler) null, false);
        } catch (Resources.NotFoundException unused) {
            this.f4033k = true;
            dVar.a(1);
        } catch (Exception e2) {
            StringBuilder a2 = i.a.a.a.a.a("Error loading font ");
            a2.append(this.e);
            Log.d("TextAppearance", a2.toString(), e2);
            this.f4033k = true;
            dVar.a(-3);
        }
    }

    /* compiled from: TextAppearance */
    public class a extends g {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void a(Typeface typeface) {
            b bVar = b.this;
            bVar.f4034l = Typeface.create(typeface, bVar.c);
            b bVar2 = b.this;
            bVar2.f4033k = true;
            this.a.a(bVar2.f4034l, false);
        }

        public void a(int i2) {
            b.this.f4033k = true;
            this.a.a(i2);
        }
    }

    public void a(Context context, TextPaint textPaint, d dVar) {
        a();
        a(textPaint, this.f4034l);
        a(context, (d) new c(this, textPaint, dVar));
        ColorStateList colorStateList = this.f4027b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f4031i;
        float f3 = this.f4029g;
        float f4 = this.f4030h;
        ColorStateList colorStateList2 = this.f4028f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void a() {
        String str;
        if (this.f4034l == null && (str = this.e) != null) {
            this.f4034l = Typeface.create(str, this.c);
        }
        if (this.f4034l == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.f4034l = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f4034l = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f4034l = Typeface.DEFAULT;
            } else {
                this.f4034l = Typeface.MONOSPACE;
            }
            this.f4034l = Typeface.create(this.f4034l, this.c);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}
