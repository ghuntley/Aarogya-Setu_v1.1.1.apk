package i.c.a.c.v;

import android.os.Build;
import android.widget.BaseAdapter;
import i.c.a.b.d.l.q;
import java.util.Calendar;

/* compiled from: DaysOfWeekAdapter */
public class e extends BaseAdapter {

    /* renamed from: h  reason: collision with root package name */
    public static final int f4217h = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    public final Calendar e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4218f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4219g = this.e.getFirstDayOfWeek();

    public e() {
        Calendar d = q.d();
        this.e = d;
        this.f4218f = d.getMaximum(7);
    }

    public int getCount() {
        return this.f4218f;
    }

    public Object getItem(int i2) {
        int i3 = this.f4218f;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f4219g;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    public long getItemId(int i2) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = i.c.a.c.h.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.e
            int r2 = r5.f4219g
            int r6 = r6 + r2
            int r2 = r5.f4218f
            if (r6 <= r2) goto L_0x0021
            int r6 = r6 - r2
        L_0x0021:
            r2 = 7
            r7.set(r2, r6)
            java.util.Calendar r6 = r5.e
            int r7 = f4217h
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = i.c.a.c.i.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.e
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.v.e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
