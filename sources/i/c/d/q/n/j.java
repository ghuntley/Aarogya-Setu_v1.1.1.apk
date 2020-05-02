package i.c.d.q.n;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.d.q.n.b;
import i.c.d.q.n.f;
import i.c.f.c;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class j extends k<j, a> implements k {

    /* renamed from: n  reason: collision with root package name */
    public static final j f4832n;

    /* renamed from: o  reason: collision with root package name */
    public static volatile q<j> f4833o;

    /* renamed from: h  reason: collision with root package name */
    public int f4834h;

    /* renamed from: i  reason: collision with root package name */
    public b f4835i;

    /* renamed from: j  reason: collision with root package name */
    public b f4836j;

    /* renamed from: k  reason: collision with root package name */
    public b f4837k;

    /* renamed from: l  reason: collision with root package name */
    public f f4838l;

    /* renamed from: m  reason: collision with root package name */
    public l.b<l> f4839m = r.f4965g;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<j, a> implements k {
        public /* synthetic */ a(a aVar) {
            super(j.f4832n);
        }
    }

    static {
        j jVar = new j();
        f4832n = jVar;
        jVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if ((this.f4834h & 1) == 1) {
            codedOutputStream.a(1, (o) k());
        }
        if ((this.f4834h & 2) == 2) {
            codedOutputStream.a(2, (o) i());
        }
        if ((this.f4834h & 4) == 4) {
            codedOutputStream.a(3, (o) j());
        }
        if ((this.f4834h & 8) == 8) {
            f fVar = this.f4838l;
            if (fVar == null) {
                fVar = f.f4821l;
            }
            codedOutputStream.a(4, (o) fVar);
        }
        for (int i2 = 0; i2 < this.f4839m.size(); i2++) {
            codedOutputStream.a(5, (o) this.f4839m.get(i2));
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f4834h & 1) == 1 ? CodedOutputStream.b(1, (o) k()) + 0 : 0;
        if ((this.f4834h & 2) == 2) {
            b2 += CodedOutputStream.b(2, (o) i());
        }
        if ((this.f4834h & 4) == 4) {
            b2 += CodedOutputStream.b(3, (o) j());
        }
        if ((this.f4834h & 8) == 8) {
            f fVar = this.f4838l;
            if (fVar == null) {
                fVar = f.f4821l;
            }
            b2 += CodedOutputStream.b(4, (o) fVar);
        }
        for (int i3 = 0; i3 < this.f4839m.size(); i3++) {
            b2 += CodedOutputStream.b(5, (o) this.f4839m.get(i3));
        }
        int a2 = this.f4949f.a() + b2;
        this.f4950g = a2;
        return a2;
    }

    public b i() {
        b bVar = this.f4836j;
        return bVar == null ? b.f4810l : bVar;
    }

    public b j() {
        b bVar = this.f4837k;
        return bVar == null ? b.f4810l : bVar;
    }

    public b k() {
        b bVar = this.f4835i;
        return bVar == null ? b.f4810l : bVar;
    }

    public static j a(InputStream inputStream) {
        k a2 = k.a(f4832n, new g(inputStream, com.crashlytics.android.core.CodedOutputStream.DEFAULT_BUFFER_SIZE), i.a());
        k.a(a2);
        return (j) a2;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4832n;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                j jVar2 = (j) obj2;
                this.f4835i = (b) kVar.a(this.f4835i, jVar2.f4835i);
                this.f4836j = (b) kVar.a(this.f4836j, jVar2.f4836j);
                this.f4837k = (b) kVar.a(this.f4837k, jVar2.f4837k);
                this.f4838l = (f) kVar.a(this.f4838l, jVar2.f4838l);
                this.f4839m = kVar.a(this.f4839m, jVar2.f4839m);
                if (kVar == k.i.a) {
                    this.f4834h |= jVar2.f4834h;
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
                                b.a aVar = (this.f4834h & 1) == 1 ? (b.a) this.f4835i.e() : null;
                                b bVar = (b) gVar.a(b.i(), iVar);
                                this.f4835i = bVar;
                                if (aVar != null) {
                                    aVar.a(bVar);
                                    this.f4835i = (b) aVar.j();
                                }
                                this.f4834h |= 1;
                            } else if (i2 == 18) {
                                b.a aVar2 = (this.f4834h & 2) == 2 ? (b.a) this.f4836j.e() : null;
                                b bVar2 = (b) gVar.a(b.i(), iVar);
                                this.f4836j = bVar2;
                                if (aVar2 != null) {
                                    aVar2.a(bVar2);
                                    this.f4836j = (b) aVar2.j();
                                }
                                this.f4834h |= 2;
                            } else if (i2 == 26) {
                                b.a aVar3 = (this.f4834h & 4) == 4 ? (b.a) this.f4837k.e() : null;
                                b bVar3 = (b) gVar.a(b.i(), iVar);
                                this.f4837k = bVar3;
                                if (aVar3 != null) {
                                    aVar3.a(bVar3);
                                    this.f4837k = (b) aVar3.j();
                                }
                                this.f4834h |= 4;
                            } else if (i2 == 34) {
                                f.a aVar4 = (this.f4834h & 8) == 8 ? (f.a) this.f4838l.e() : null;
                                f fVar = (f) gVar.a(f.f4821l.g(), iVar);
                                this.f4838l = fVar;
                                if (aVar4 != null) {
                                    aVar4.a(fVar);
                                    this.f4838l = (f) aVar4.j();
                                }
                                this.f4834h |= 8;
                            } else if (i2 == 42) {
                                if (!((c) this.f4839m).e) {
                                    this.f4839m = k.a(this.f4839m);
                                }
                                this.f4839m.add((l) gVar.a(l.f4840l.g(), iVar));
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
                ((c) this.f4839m).e = false;
                return null;
            case 4:
                return new j();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4833o == null) {
                    synchronized (j.class) {
                        if (f4833o == null) {
                            f4833o = new k.c(f4832n);
                        }
                    }
                }
                return f4833o;
            default:
                throw new UnsupportedOperationException();
        }
        return f4832n;
    }
}
