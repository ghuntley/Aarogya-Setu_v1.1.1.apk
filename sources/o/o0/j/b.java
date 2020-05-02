package o.o0.j;

import o.o0.e;
import p.i;

/* compiled from: Header */
public final class b {
    public static final i d = i.d(":");
    public static final i e = i.d(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final i f5486f = i.d(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final i f5487g = i.d(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final i f5488h = i.d(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final i f5489i = i.d(":authority");
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final i f5490b;
    public final int c;

    public b(String str, String str2) {
        this(i.d(str), i.d(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a) || !this.f5490b.equals(bVar.f5490b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f5490b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return e.a("%s: %s", this.a.m(), this.f5490b.m());
    }

    public b(i iVar, String str) {
        this(iVar, i.d(str));
    }

    public b(i iVar, i iVar2) {
        this.a = iVar;
        this.f5490b = iVar2;
        this.c = iVar2.h() + iVar.h() + 32;
    }
}
