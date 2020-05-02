package i.c.a.c.v;

import android.widget.BaseAdapter;
import i.c.a.b.d.l.q;
import java.util.Calendar;

/* compiled from: MonthAdapter */
public class o extends BaseAdapter {

    /* renamed from: i  reason: collision with root package name */
    public static final int f4232i = q.d().getMaximum(4);
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final d<?> f4233f;

    /* renamed from: g  reason: collision with root package name */
    public c f4234g;

    /* renamed from: h  reason: collision with root package name */
    public final a f4235h;

    public o(n nVar, d<?> dVar, a aVar) {
        this.e = nVar;
        this.f4233f = dVar;
        this.f4235h = aVar;
    }

    public int a() {
        return this.e.f();
    }

    public int b() {
        return (this.e.f() + this.e.f4231j) - 1;
    }

    public int getCount() {
        return a() + this.e.f4231j;
    }

    public long getItemId(int i2) {
        return (long) (i2 / this.e.f4230i);
    }

    /* JADX WARNING: type inference failed for: r9v29, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r0 = r10.getContext()
            i.c.a.c.v.c r1 = r7.f4234g
            if (r1 != 0) goto L_0x000f
            i.c.a.c.v.c r1 = new i.c.a.c.v.c
            r1.<init>(r0)
            r7.f4234g = r1
        L_0x000f:
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r9 != 0) goto L_0x0026
            android.content.Context r9 = r10.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r0 = i.c.a.c.h.mtrl_calendar_day
            android.view.View r9 = r9.inflate(r0, r10, r1)
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r9 = r7.a()
            int r9 = r8 - r9
            r10 = 1
            if (r9 < 0) goto L_0x00db
            i.c.a.c.v.n r2 = r7.e
            int r3 = r2.f4231j
            if (r9 < r3) goto L_0x0037
            goto L_0x00db
        L_0x0037:
            int r9 = r9 + r10
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r0.setText(r2)
            i.c.a.c.v.n r2 = r7.e
            java.util.Calendar r2 = r2.e
            java.util.Calendar r2 = i.c.a.b.d.l.q.a((java.util.Calendar) r2)
            r3 = 5
            r2.set(r3, r9)
            long r2 = r2.getTimeInMillis()
            i.c.a.c.v.n r9 = r7.e
            int r9 = r9.f4229h
            i.c.a.c.v.n r4 = new i.c.a.c.v.n
            java.util.Calendar r5 = i.c.a.b.d.l.q.c()
            r4.<init>(r5)
            int r4 = r4.f4229h
            java.lang.String r5 = "UTC"
            r6 = 24
            if (r9 != r4) goto L_0x009e
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x0086
            java.lang.String r4 = "MMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x009a
        L_0x0086:
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = i.c.a.b.d.l.q.b()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
        L_0x009a:
            r0.setContentDescription(r9)
            goto L_0x00d4
        L_0x009e:
            java.util.Locale r9 = java.util.Locale.getDefault()
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r6) goto L_0x00bd
            java.lang.String r4 = "yMMMEd"
            android.icu.text.DateFormat r9 = android.icu.text.DateFormat.getInstanceForSkeleton(r4, r9)
            android.icu.util.TimeZone r4 = android.icu.util.TimeZone.getTimeZone(r5)
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
            goto L_0x00d1
        L_0x00bd:
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r1, r9)
            java.util.TimeZone r4 = i.c.a.b.d.l.q.b()
            r9.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r2)
            java.lang.String r9 = r9.format(r4)
        L_0x00d1:
            r0.setContentDescription(r9)
        L_0x00d4:
            r0.setVisibility(r1)
            r0.setEnabled(r10)
            goto L_0x00e3
        L_0x00db:
            r9 = 8
            r0.setVisibility(r9)
            r0.setEnabled(r1)
        L_0x00e3:
            java.lang.Long r8 = r7.getItem((int) r8)
            if (r8 != 0) goto L_0x00eb
            goto L_0x016e
        L_0x00eb:
            i.c.a.c.v.a r9 = r7.f4235h
            i.c.a.c.v.a$b r9 = r9.f4208h
            long r2 = r8.longValue()
            boolean r9 = r9.e(r2)
            if (r9 == 0) goto L_0x0164
            r0.setEnabled(r10)
            i.c.a.c.v.d<?> r9 = r7.f4233f
            java.util.Collection r9 = r9.q()
            java.util.Iterator r9 = r9.iterator()
        L_0x0106:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0144
            java.lang.Object r10 = r9.next()
            java.lang.Long r10 = (java.lang.Long) r10
            long r1 = r10.longValue()
            long r3 = r8.longValue()
            java.util.Calendar r10 = i.c.a.b.d.l.q.d()
            r10.setTimeInMillis(r3)
            java.util.Calendar r10 = i.c.a.b.d.l.q.a((java.util.Calendar) r10)
            long r3 = r10.getTimeInMillis()
            java.util.Calendar r10 = i.c.a.b.d.l.q.d()
            r10.setTimeInMillis(r1)
            java.util.Calendar r10 = i.c.a.b.d.l.q.a((java.util.Calendar) r10)
            long r1 = r10.getTimeInMillis()
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 != 0) goto L_0x0106
            i.c.a.c.v.c r8 = r7.f4234g
            i.c.a.c.v.b r8 = r8.f4213b
            r8.a(r0)
            goto L_0x016e
        L_0x0144:
            java.util.Calendar r9 = i.c.a.b.d.l.q.c()
            long r9 = r9.getTimeInMillis()
            long r1 = r8.longValue()
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x015c
            i.c.a.c.v.c r8 = r7.f4234g
            i.c.a.c.v.b r8 = r8.c
            r8.a(r0)
            goto L_0x016e
        L_0x015c:
            i.c.a.c.v.c r8 = r7.f4234g
            i.c.a.c.v.b r8 = r8.a
            r8.a(r0)
            goto L_0x016e
        L_0x0164:
            r0.setEnabled(r1)
            i.c.a.c.v.c r8 = r7.f4234g
            i.c.a.c.v.b r8 = r8.f4215g
            r8.a(r0)
        L_0x016e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.v.o.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }

    public Long getItem(int i2) {
        if (i2 < this.e.f() || i2 > b()) {
            return null;
        }
        n nVar = this.e;
        Calendar a = q.a(nVar.e);
        a.set(5, (i2 - nVar.f()) + 1);
        return Long.valueOf(a.getTimeInMillis());
    }
}
