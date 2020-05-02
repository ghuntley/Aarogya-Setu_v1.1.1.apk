package i.c.d.q.n;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.c;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class b extends k<b, a> implements c {

    /* renamed from: l  reason: collision with root package name */
    public static final b f4810l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<b> f4811m;

    /* renamed from: h  reason: collision with root package name */
    public int f4812h;

    /* renamed from: i  reason: collision with root package name */
    public l.b<h> f4813i;

    /* renamed from: j  reason: collision with root package name */
    public long f4814j;

    /* renamed from: k  reason: collision with root package name */
    public l.b<f> f4815k;

    static {
        b bVar = new b();
        f4810l = bVar;
        bVar.f();
    }

    public b() {
        r<Object> rVar = r.f4965g;
        this.f4813i = rVar;
        this.f4815k = rVar;
    }

    public static q<b> i() {
        return f4810l.g();
    }

    public void a(CodedOutputStream codedOutputStream) {
        for (int i2 = 0; i2 < this.f4813i.size(); i2++) {
            codedOutputStream.a(1, (o) this.f4813i.get(i2));
        }
        if ((this.f4812h & 1) == 1) {
            codedOutputStream.a(2, this.f4814j);
        }
        for (int i3 = 0; i3 < this.f4815k.size(); i3++) {
            codedOutputStream.a(3, this.f4815k.get(i3));
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f4813i.size(); i4++) {
            i3 += CodedOutputStream.b(1, (o) this.f4813i.get(i4));
        }
        if ((this.f4812h & 1) == 1) {
            i3 += CodedOutputStream.c(2, this.f4814j);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f4815k.size(); i6++) {
            i5 += CodedOutputStream.a(this.f4815k.get(i6));
        }
        int size = this.f4815k.size() * 1;
        int a2 = this.f4949f.a() + size + i3 + i5;
        this.f4950g = a2;
        return a2;
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<b, a> implements c {
        public a() {
            super(b.f4810l);
        }

        public /* synthetic */ a(a aVar) {
            super(b.f4810l);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4810l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                b bVar = (b) obj2;
                this.f4813i = kVar.a(this.f4813i, bVar.f4813i);
                this.f4814j = kVar.a((this.f4812h & 1) == 1, this.f4814j, (bVar.f4812h & 1) == 1, bVar.f4814j);
                this.f4815k = kVar.a(this.f4815k, bVar.f4815k);
                if (kVar == k.i.a) {
                    this.f4812h |= bVar.f4812h;
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
                                if (!((c) this.f4813i).e) {
                                    this.f4813i = k.a(this.f4813i);
                                }
                                this.f4813i.add((h) gVar.a(h.f4827k.g(), iVar));
                            } else if (i2 == 17) {
                                this.f4812h |= 1;
                                this.f4814j = gVar.b();
                            } else if (i2 == 26) {
                                if (!((c) this.f4815k).e) {
                                    this.f4815k = k.a(this.f4815k);
                                }
                                this.f4815k.add(gVar.a());
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
                ((c) this.f4813i).e = false;
                ((c) this.f4815k).e = false;
                return null;
            case 4:
                return new b();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4811m == null) {
                    synchronized (b.class) {
                        if (f4811m == null) {
                            f4811m = new k.c(f4810l);
                        }
                    }
                }
                return f4811m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4810l;
    }
}
