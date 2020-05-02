package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class i {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3702b;
    public final long c;
    public final long d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3703f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3704g;

    /* renamed from: h  reason: collision with root package name */
    public final Long f3705h;

    /* renamed from: i  reason: collision with root package name */
    public final Long f3706i;

    /* renamed from: j  reason: collision with root package name */
    public final Long f3707j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f3708k;

    public i(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        q.b(str);
        q.b(str2);
        boolean z = true;
        q.a(j7 >= 0);
        q.a(j8 >= 0);
        q.a(j9 >= 0);
        q.a(j10 < 0 ? false : z);
        this.a = str;
        this.f3702b = str2;
        this.c = j7;
        this.d = j8;
        this.e = j9;
        this.f3703f = j5;
        this.f3704g = j10;
        this.f3705h = l2;
        this.f3706i = l3;
        this.f3707j = l4;
        this.f3708k = bool;
    }

    public final i a(long j2) {
        return new i(this.a, this.f3702b, this.c, this.d, this.e, j2, this.f3704g, this.f3705h, this.f3706i, this.f3707j, this.f3708k);
    }

    public final i a(long j2, long j3) {
        return new i(this.a, this.f3702b, this.c, this.d, this.e, this.f3703f, j2, Long.valueOf(j3), this.f3706i, this.f3707j, this.f3708k);
    }

    public final i a(Long l2, Long l3, Boolean bool) {
        return new i(this.a, this.f3702b, this.c, this.d, this.e, this.f3703f, this.f3704g, this.f3705h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public i(String str, String str2, long j2, long j3, long j4) {
        this(str, str2, j2, j3, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }
}
