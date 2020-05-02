package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.w1;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.p;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;

/* compiled from: Keyset */
public final class d2 extends k<d2, b> implements g2 {

    /* renamed from: k  reason: collision with root package name */
    public static final d2 f4419k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<d2> f4420l;

    /* renamed from: h  reason: collision with root package name */
    public int f4421h;

    /* renamed from: i  reason: collision with root package name */
    public int f4422i;

    /* renamed from: j  reason: collision with root package name */
    public l.b<c> f4423j = r.f4965g;

    /* compiled from: Keyset */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|8|9|11|12|13|14|15|(2:17|18)|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|5|6|7|8|9|11|12|13|14|15|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0025 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
        static {
            /*
                i.c.f.k$j[] r0 = i.c.f.k.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                r1 = 1
                r2 = 4
                i.c.f.k$j r3 = i.c.f.k.j.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x000f }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x0017 }
                i.c.f.k$j r4 = i.c.f.k.j.IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4 = 0
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x001e }
                i.c.f.k$j r4 = i.c.f.k.j.MAKE_IMMUTABLE     // Catch:{ NoSuchFieldError -> 0x001e }
                r4 = 3
                r3[r4] = r4     // Catch:{ NoSuchFieldError -> 0x001e }
            L_0x001e:
                r3 = 5
                int[] r4 = a     // Catch:{ NoSuchFieldError -> 0x0025 }
                i.c.f.k$j r5 = i.c.f.k.j.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x0025 }
                r4[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0025 }
            L_0x0025:
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x002b }
                i.c.f.k$j r4 = i.c.f.k.j.VISIT     // Catch:{ NoSuchFieldError -> 0x002b }
                r2[r1] = r3     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r1 = 6
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0032 }
                i.c.f.k$j r3 = i.c.f.k.j.MERGE_FROM_STREAM     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r0] = r1     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                r0 = 7
                int[] r2 = a     // Catch:{ NoSuchFieldError -> 0x0039 }
                i.c.f.k$j r3 = i.c.f.k.j.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0041 }
                i.c.f.k$j r2 = i.c.f.k.j.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x0041 }
                r2 = 8
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.d2.a.<clinit>():void");
        }
    }

    /* compiled from: Keyset */
    public static final class c extends k<c, a> implements d {

        /* renamed from: l  reason: collision with root package name */
        public static final c f4424l;

        /* renamed from: m  reason: collision with root package name */
        public static volatile q<c> f4425m;

        /* renamed from: h  reason: collision with root package name */
        public w1 f4426h;

        /* renamed from: i  reason: collision with root package name */
        public int f4427i;

        /* renamed from: j  reason: collision with root package name */
        public int f4428j;

        /* renamed from: k  reason: collision with root package name */
        public int f4429k;

        static {
            c cVar = new c();
            f4424l = cVar;
            cVar.f();
        }

        public static /* synthetic */ void a(c cVar, y1 y1Var) {
            if (cVar == null) {
                throw null;
            } else if (y1Var != null) {
                cVar.f4427i = y1Var.e;
            } else {
                throw null;
            }
        }

        public int c() {
            int i2 = this.f4950g;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if (this.f4426h != null) {
                i3 = 0 + CodedOutputStream.b(1, (o) i());
            }
            int i4 = this.f4427i;
            if (i4 != y1.UNKNOWN_STATUS.e) {
                i3 += CodedOutputStream.d(2, i4);
            }
            int i5 = this.f4428j;
            if (i5 != 0) {
                i3 += CodedOutputStream.e(3, i5);
            }
            int i6 = this.f4429k;
            if (i6 != p2.UNKNOWN_PREFIX.e) {
                i3 += CodedOutputStream.d(4, i6);
            }
            this.f4950g = i3;
            return i3;
        }

        public w1 i() {
            w1 w1Var = this.f4426h;
            return w1Var == null ? w1.f4605k : w1Var;
        }

        public p2 j() {
            p2 a2 = p2.a(this.f4429k);
            return a2 == null ? p2.UNRECOGNIZED : a2;
        }

        public y1 k() {
            y1 a2 = y1.a(this.f4427i);
            return a2 == null ? y1.UNRECOGNIZED : a2;
        }

        /* compiled from: Keyset */
        public static final class a extends k.b<c, a> implements d {
            public a() {
                super(c.f4424l);
            }

            public /* synthetic */ a(a aVar) {
                super(c.f4424l);
            }
        }

        public static /* synthetic */ void a(c cVar, p2 p2Var) {
            if (cVar == null) {
                throw null;
            } else if (p2Var != null) {
                cVar.f4429k = p2Var.e;
            } else {
                throw null;
            }
        }

        public static /* synthetic */ void a(c cVar, w1 w1Var) {
            if (w1Var != null) {
                cVar.f4426h = w1Var;
                return;
            }
            throw null;
        }

        public void a(CodedOutputStream codedOutputStream) {
            if (this.f4426h != null) {
                codedOutputStream.a(1, (o) i());
            }
            int i2 = this.f4427i;
            if (i2 != y1.UNKNOWN_STATUS.e) {
                codedOutputStream.a(2, i2);
            }
            int i3 = this.f4428j;
            if (i3 != 0) {
                codedOutputStream.c(3, i3);
            }
            int i4 = this.f4429k;
            if (i4 != p2.UNKNOWN_PREFIX.e) {
                codedOutputStream.a(4, i4);
            }
        }

        public final Object a(k.j jVar, Object obj, Object obj2) {
            boolean z = false;
            switch (jVar.ordinal()) {
                case 0:
                    return f4424l;
                case 1:
                    k.C0142k kVar = (k.C0142k) obj;
                    c cVar = (c) obj2;
                    this.f4426h = (w1) kVar.a(this.f4426h, cVar.f4426h);
                    this.f4427i = kVar.a(this.f4427i != 0, this.f4427i, cVar.f4427i != 0, cVar.f4427i);
                    this.f4428j = kVar.a(this.f4428j != 0, this.f4428j, cVar.f4428j != 0, cVar.f4428j);
                    boolean z2 = this.f4429k != 0;
                    int i2 = this.f4429k;
                    if (cVar.f4429k != 0) {
                        z = true;
                    }
                    this.f4429k = kVar.a(z2, i2, z, cVar.f4429k);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    i iVar = (i) obj2;
                    while (!z) {
                        try {
                            int i3 = gVar.i();
                            if (i3 != 0) {
                                if (i3 == 10) {
                                    w1.b bVar = this.f4426h != null ? (w1.b) this.f4426h.e() : null;
                                    w1 w1Var = (w1) gVar.a(w1.f4605k.g(), iVar);
                                    this.f4426h = w1Var;
                                    if (bVar != null) {
                                        bVar.a(w1Var);
                                        this.f4426h = (w1) bVar.j();
                                    }
                                } else if (i3 == 16) {
                                    this.f4427i = gVar.d();
                                } else if (i3 == 24) {
                                    this.f4428j = gVar.d();
                                } else if (i3 == 32) {
                                    this.f4429k = gVar.d();
                                } else if (!gVar.e(i3)) {
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
                    return new c();
                case 5:
                    return new a((a) null);
                case 6:
                    break;
                case 7:
                    if (f4425m == null) {
                        synchronized (c.class) {
                            if (f4425m == null) {
                                f4425m = new k.c(f4424l);
                            }
                        }
                    }
                    return f4425m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f4424l;
        }
    }

    /* compiled from: Keyset */
    public interface d extends p {
    }

    static {
        d2 d2Var = new d2();
        f4419k = d2Var;
        d2Var.f();
    }

    public static /* synthetic */ void a(d2 d2Var, c cVar) {
        if (cVar != null) {
            l.b<c> bVar = d2Var.f4423j;
            if (!((i.c.f.c) bVar).e) {
                d2Var.f4423j = k.a(bVar);
            }
            d2Var.f4423j.add(cVar);
            return;
        }
        throw null;
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.f4422i;
        int e = i3 != 0 ? CodedOutputStream.e(1, i3) + 0 : 0;
        for (int i4 = 0; i4 < this.f4423j.size(); i4++) {
            e += CodedOutputStream.b(2, (o) this.f4423j.get(i4));
        }
        this.f4950g = e;
        return e;
    }

    /* compiled from: Keyset */
    public static final class b extends k.b<d2, b> implements g2 {
        public b() {
            super(d2.f4419k);
        }

        public /* synthetic */ b(a aVar) {
            super(d2.f4419k);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4422i;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        for (int i3 = 0; i3 < this.f4423j.size(); i3++) {
            codedOutputStream.a(2, (o) this.f4423j.get(i3));
        }
    }

    public static d2 a(byte[] bArr) {
        return (d2) k.a(f4419k, bArr);
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4419k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                d2 d2Var = (d2) obj2;
                boolean z2 = this.f4422i != 0;
                int i2 = this.f4422i;
                if (d2Var.f4422i != 0) {
                    z = true;
                }
                this.f4422i = kVar.a(z2, i2, z, d2Var.f4422i);
                this.f4423j = kVar.a(this.f4423j, d2Var.f4423j);
                if (kVar == k.i.a) {
                    this.f4421h |= d2Var.f4421h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4422i = gVar.d();
                            } else if (i3 == 18) {
                                if (!((i.c.f.c) this.f4423j).e) {
                                    this.f4423j = k.a(this.f4423j);
                                }
                                this.f4423j.add(gVar.a(c.f4424l.g(), iVar));
                            } else if (!gVar.e(i3)) {
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
                ((i.c.f.c) this.f4423j).e = false;
                return null;
            case 4:
                return new d2();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4420l == null) {
                    synchronized (d2.class) {
                        if (f4420l == null) {
                            f4420l = new k.c(f4419k);
                        }
                    }
                }
                return f4420l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4419k;
    }
}
