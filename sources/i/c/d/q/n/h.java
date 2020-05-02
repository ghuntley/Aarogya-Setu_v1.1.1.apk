package i.c.d.q.n;

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

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class h extends k<h, a> implements i {

    /* renamed from: k  reason: collision with root package name */
    public static final h f4827k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<h> f4828l;

    /* renamed from: h  reason: collision with root package name */
    public int f4829h;

    /* renamed from: i  reason: collision with root package name */
    public String f4830i = "";

    /* renamed from: j  reason: collision with root package name */
    public l.b<d> f4831j = r.f4965g;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<h, a> implements i {
        public /* synthetic */ a(a aVar) {
            super(h.f4827k);
        }
    }

    static {
        h hVar = new h();
        f4827k = hVar;
        hVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if ((this.f4829h & 1) == 1) {
            codedOutputStream.a(1, this.f4830i);
        }
        for (int i2 = 0; i2 < this.f4831j.size(); i2++) {
            codedOutputStream.a(2, (o) this.f4831j.get(i2));
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f4829h & 1) == 1 ? CodedOutputStream.b(1, this.f4830i) + 0 : 0;
        for (int i3 = 0; i3 < this.f4831j.size(); i3++) {
            b2 += CodedOutputStream.b(2, (o) this.f4831j.get(i3));
        }
        int a2 = this.f4949f.a() + b2;
        this.f4950g = a2;
        return a2;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4827k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                h hVar = (h) obj2;
                boolean z2 = (this.f4829h & 1) == 1;
                String str = this.f4830i;
                if ((hVar.f4829h & 1) == 1) {
                    z = true;
                }
                this.f4830i = kVar.a(z2, str, z, hVar.f4830i);
                this.f4831j = kVar.a(this.f4831j, hVar.f4831j);
                if (kVar == k.i.a) {
                    this.f4829h |= hVar.f4829h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 10) {
                                String g2 = gVar.g();
                                this.f4829h |= 1;
                                this.f4830i = g2;
                            } else if (i2 == 18) {
                                if (!((c) this.f4831j).e) {
                                    this.f4831j = k.a(this.f4831j);
                                }
                                this.f4831j.add((d) gVar.a(d.f4816k.g(), iVar));
                            } else if (!a(i2, gVar)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()));
                    }
                }
                break;
            case 3:
                ((c) this.f4831j).e = false;
                return null;
            case 4:
                return new h();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4828l == null) {
                    synchronized (h.class) {
                        if (f4828l == null) {
                            f4828l = new k.c(f4827k);
                        }
                    }
                }
                return f4828l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4827k;
    }
}
