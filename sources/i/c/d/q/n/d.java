package i.c.d.q.n;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class d extends k<d, a> implements e {

    /* renamed from: k  reason: collision with root package name */
    public static final d f4816k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<d> f4817l;

    /* renamed from: h  reason: collision with root package name */
    public int f4818h;

    /* renamed from: i  reason: collision with root package name */
    public String f4819i = "";

    /* renamed from: j  reason: collision with root package name */
    public f f4820j = f.f4932f;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<d, a> implements e {
        public /* synthetic */ a(a aVar) {
            super(d.f4816k);
        }
    }

    static {
        d dVar = new d();
        f4816k = dVar;
        dVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if ((this.f4818h & 1) == 1) {
            codedOutputStream.a(1, this.f4819i);
        }
        if ((this.f4818h & 2) == 2) {
            codedOutputStream.a(2, this.f4820j);
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f4818h & 1) == 1) {
            i3 = 0 + CodedOutputStream.b(1, this.f4819i);
        }
        if ((this.f4818h & 2) == 2) {
            i3 += CodedOutputStream.b(2, this.f4820j);
        }
        int a2 = this.f4949f.a() + i3;
        this.f4950g = a2;
        return a2;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4816k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                d dVar = (d) obj2;
                this.f4819i = kVar.a((this.f4818h & 1) == 1, this.f4819i, (dVar.f4818h & 1) == 1, dVar.f4819i);
                boolean z2 = (this.f4818h & 2) == 2;
                f fVar = this.f4820j;
                if ((dVar.f4818h & 2) == 2) {
                    z = true;
                }
                this.f4820j = kVar.a(z2, fVar, z, dVar.f4820j);
                if (kVar == k.i.a) {
                    this.f4818h |= dVar.f4818h;
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
                                this.f4818h |= 1;
                                this.f4819i = g2;
                            } else if (i2 == 18) {
                                this.f4818h |= 2;
                                this.f4820j = gVar.a();
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
                return null;
            case 4:
                return new d();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4817l == null) {
                    synchronized (d.class) {
                        if (f4817l == null) {
                            f4817l = new k.c(f4816k);
                        }
                    }
                }
                return f4817l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4816k;
    }
}
