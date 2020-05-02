package k.a.a;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.c;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public final class d extends k<d, a> implements e {
    public static final d v;
    public static volatile q<d> w;

    /* renamed from: h  reason: collision with root package name */
    public int f5015h;

    /* renamed from: i  reason: collision with root package name */
    public String f5016i = "";

    /* renamed from: j  reason: collision with root package name */
    public String f5017j = "";

    /* renamed from: k  reason: collision with root package name */
    public long f5018k;

    /* renamed from: l  reason: collision with root package name */
    public String f5019l = "";

    /* renamed from: m  reason: collision with root package name */
    public long f5020m;

    /* renamed from: n  reason: collision with root package name */
    public long f5021n;

    /* renamed from: o  reason: collision with root package name */
    public String f5022o = "";

    /* renamed from: p  reason: collision with root package name */
    public String f5023p = "";

    /* renamed from: q  reason: collision with root package name */
    public String f5024q = "";
    public String r = "";
    public String s = "";
    public int t;
    public l.b<b> u = r.f4965g;

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public static final class a extends k.b<d, a> implements e {
        public /* synthetic */ a(a aVar) {
            super(d.v);
        }
    }

    /* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
    public enum b implements l.a {
        POLICY_UNSPECIFIED(0),
        DISCARD_OLDEST(1),
        IGNORE_NEWEST(2),
        UNRECOGNIZED(-1);
        
        public final int e;

        /* access modifiers changed from: public */
        b(int i2) {
            this.e = i2;
        }
    }

    static {
        d dVar = new d();
        v = dVar;
        dVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f5016i.isEmpty()) {
            codedOutputStream.a(1, this.f5016i);
        }
        if (!this.f5017j.isEmpty()) {
            codedOutputStream.a(2, this.f5017j);
        }
        long j2 = this.f5018k;
        if (j2 != 0) {
            codedOutputStream.b(3, j2);
        }
        if (!this.f5019l.isEmpty()) {
            codedOutputStream.a(4, this.f5019l);
        }
        long j3 = this.f5020m;
        if (j3 != 0) {
            codedOutputStream.b(5, j3);
        }
        long j4 = this.f5021n;
        if (j4 != 0) {
            codedOutputStream.b(6, j4);
        }
        if (!this.f5022o.isEmpty()) {
            codedOutputStream.a(7, this.f5022o);
        }
        if (!this.f5023p.isEmpty()) {
            codedOutputStream.a(8, this.f5023p);
        }
        if (!this.f5024q.isEmpty()) {
            codedOutputStream.a(9, this.f5024q);
        }
        if (!this.r.isEmpty()) {
            codedOutputStream.a(10, this.r);
        }
        if (!this.s.isEmpty()) {
            codedOutputStream.a(11, this.s);
        }
        int i2 = this.t;
        if (i2 != b.POLICY_UNSPECIFIED.e) {
            codedOutputStream.a(12, i2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            codedOutputStream.a(13, (o) this.u.get(i3));
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int b2 = !this.f5016i.isEmpty() ? CodedOutputStream.b(1, this.f5016i) + 0 : 0;
        if (!this.f5017j.isEmpty()) {
            b2 += CodedOutputStream.b(2, this.f5017j);
        }
        long j2 = this.f5018k;
        if (j2 != 0) {
            b2 += CodedOutputStream.d(3, j2);
        }
        if (!this.f5019l.isEmpty()) {
            b2 += CodedOutputStream.b(4, this.f5019l);
        }
        long j3 = this.f5020m;
        if (j3 != 0) {
            b2 += CodedOutputStream.d(5, j3);
        }
        long j4 = this.f5021n;
        if (j4 != 0) {
            b2 += CodedOutputStream.d(6, j4);
        }
        if (!this.f5022o.isEmpty()) {
            b2 += CodedOutputStream.b(7, this.f5022o);
        }
        if (!this.f5023p.isEmpty()) {
            b2 += CodedOutputStream.b(8, this.f5023p);
        }
        if (!this.f5024q.isEmpty()) {
            b2 += CodedOutputStream.b(9, this.f5024q);
        }
        if (!this.r.isEmpty()) {
            b2 += CodedOutputStream.b(10, this.r);
        }
        if (!this.s.isEmpty()) {
            b2 += CodedOutputStream.b(11, this.s);
        }
        int i3 = this.t;
        if (i3 != b.POLICY_UNSPECIFIED.e) {
            b2 += CodedOutputStream.d(12, i3);
        }
        for (int i4 = 0; i4 < this.u.size(); i4++) {
            b2 += CodedOutputStream.b(13, (o) this.u.get(i4));
        }
        this.f4950g = b2;
        return b2;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return v;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                d dVar = (d) obj2;
                this.f5016i = kVar.a(!this.f5016i.isEmpty(), this.f5016i, !dVar.f5016i.isEmpty(), dVar.f5016i);
                this.f5017j = kVar.a(!this.f5017j.isEmpty(), this.f5017j, !dVar.f5017j.isEmpty(), dVar.f5017j);
                this.f5018k = kVar.a(this.f5018k != 0, this.f5018k, dVar.f5018k != 0, dVar.f5018k);
                this.f5019l = kVar.a(!this.f5019l.isEmpty(), this.f5019l, !dVar.f5019l.isEmpty(), dVar.f5019l);
                this.f5020m = kVar.a(this.f5020m != 0, this.f5020m, dVar.f5020m != 0, dVar.f5020m);
                this.f5021n = kVar.a(this.f5021n != 0, this.f5021n, dVar.f5021n != 0, dVar.f5021n);
                this.f5022o = kVar.a(!this.f5022o.isEmpty(), this.f5022o, !dVar.f5022o.isEmpty(), dVar.f5022o);
                this.f5023p = kVar.a(!this.f5023p.isEmpty(), this.f5023p, !dVar.f5023p.isEmpty(), dVar.f5023p);
                this.f5024q = kVar.a(!this.f5024q.isEmpty(), this.f5024q, !dVar.f5024q.isEmpty(), dVar.f5024q);
                this.r = kVar.a(!this.r.isEmpty(), this.r, !dVar.r.isEmpty(), dVar.r);
                this.s = kVar.a(!this.s.isEmpty(), this.s, !dVar.s.isEmpty(), dVar.s);
                boolean z2 = this.t != 0;
                int i2 = this.t;
                if (dVar.t != 0) {
                    z = true;
                }
                this.t = kVar.a(z2, i2, z, dVar.t);
                this.u = kVar.a(this.u, dVar.u);
                if (kVar == k.i.a) {
                    this.f5015h |= dVar.f5015h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        switch (i3) {
                            case 0:
                                z = true;
                                break;
                            case 10:
                                this.f5016i = gVar.h();
                                break;
                            case 18:
                                this.f5017j = gVar.h();
                                break;
                            case 24:
                                this.f5018k = gVar.e();
                                break;
                            case 34:
                                this.f5019l = gVar.h();
                                break;
                            case 40:
                                this.f5020m = gVar.e();
                                break;
                            case 48:
                                this.f5021n = gVar.e();
                                break;
                            case 58:
                                this.f5022o = gVar.h();
                                break;
                            case 66:
                                this.f5023p = gVar.h();
                                break;
                            case 74:
                                this.f5024q = gVar.h();
                                break;
                            case 82:
                                this.r = gVar.h();
                                break;
                            case 90:
                                this.s = gVar.h();
                                break;
                            case 96:
                                this.t = gVar.d();
                                break;
                            case 106:
                                if (!((c) this.u).e) {
                                    this.u = k.a(this.u);
                                }
                                this.u.add((b) gVar.a(b.f5012i.g(), iVar));
                                break;
                            default:
                                if (gVar.e(i3)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                    }
                }
                break;
            case 3:
                ((c) this.u).e = false;
                return null;
            case 4:
                return new d();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (w == null) {
                    synchronized (d.class) {
                        if (w == null) {
                            w = new k.c(v);
                        }
                    }
                }
                return w;
            default:
                throw new UnsupportedOperationException();
        }
        return v;
    }
}
