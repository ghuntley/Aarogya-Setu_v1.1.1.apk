package i.c.a.c.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import i.c.a.b.d.l.q;
import i.c.a.c.b;
import i.c.a.c.k;

/* compiled from: CalendarStyle */
public final class c {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4213b;
    public final b c;
    public final b d;
    public final b e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4214f;

    /* renamed from: g  reason: collision with root package name */
    public final b f4215g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f4216h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q.a(context, b.materialCalendarStyle, f.class.getCanonicalName()), k.MaterialCalendar);
        this.a = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayStyle, 0));
        this.f4215g = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayInvalidStyle, 0));
        this.f4213b = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_daySelectedStyle, 0));
        this.c = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = q.a(context, obtainStyledAttributes, k.MaterialCalendar_rangeFillColor);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearSelectedStyle, 0));
        this.f4214f = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f4216h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
