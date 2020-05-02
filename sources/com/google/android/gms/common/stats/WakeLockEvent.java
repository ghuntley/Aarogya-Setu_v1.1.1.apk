package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import i.c.a.b.d.l.q;
import i.c.a.b.d.n.d;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new d();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final long f487f;

    /* renamed from: g  reason: collision with root package name */
    public int f488g;

    /* renamed from: h  reason: collision with root package name */
    public final String f489h;

    /* renamed from: i  reason: collision with root package name */
    public final String f490i;

    /* renamed from: j  reason: collision with root package name */
    public final String f491j;

    /* renamed from: k  reason: collision with root package name */
    public final int f492k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f493l;

    /* renamed from: m  reason: collision with root package name */
    public final String f494m;

    /* renamed from: n  reason: collision with root package name */
    public final long f495n;

    /* renamed from: o  reason: collision with root package name */
    public int f496o;

    /* renamed from: p  reason: collision with root package name */
    public final String f497p;

    /* renamed from: q  reason: collision with root package name */
    public final float f498q;
    public final long r;
    public final boolean s;
    public long t = -1;

    public WakeLockEvent(int i2, long j2, int i3, String str, int i4, List<String> list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.e = i2;
        this.f487f = j2;
        this.f488g = i3;
        this.f489h = str;
        this.f490i = str3;
        this.f491j = str5;
        this.f492k = i4;
        this.f493l = list;
        this.f494m = str2;
        this.f495n = j3;
        this.f496o = i5;
        this.f497p = str4;
        this.f498q = f2;
        this.r = j4;
        this.s = z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f487f);
        q.a(parcel, 4, this.f489h, false);
        q.a(parcel, 5, this.f492k);
        List<String> list = this.f493l;
        if (list != null) {
            int l2 = q.l(parcel, 6);
            parcel.writeStringList(list);
            q.m(parcel, l2);
        }
        q.a(parcel, 8, this.f495n);
        q.a(parcel, 10, this.f490i, false);
        q.a(parcel, 11, this.f488g);
        q.a(parcel, 12, this.f494m, false);
        q.a(parcel, 13, this.f497p, false);
        q.a(parcel, 14, this.f496o);
        q.a(parcel, 15, this.f498q);
        q.a(parcel, 16, this.r);
        q.a(parcel, 17, this.f491j, false);
        q.a(parcel, 18, this.s);
        q.m(parcel, a);
    }
}
