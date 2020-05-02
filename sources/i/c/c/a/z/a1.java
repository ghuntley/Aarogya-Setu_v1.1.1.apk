package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.g1;
import i.c.c.a.z.w0;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: EciesAeadHkdfParams */
public final class a1 extends k<a1, b> implements b1 {

    /* renamed from: k  reason: collision with root package name */
    public static final a1 f4391k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<a1> f4392l;

    /* renamed from: h  reason: collision with root package name */
    public g1 f4393h;

    /* renamed from: i  reason: collision with root package name */
    public w0 f4394i;

    /* renamed from: j  reason: collision with root package name */
    public int f4395j;

    /* compiled from: EciesAeadHkdfParams */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.a1.a.<clinit>():void");
        }
    }

    static {
        a1 a1Var = new a1();
        f4391k = a1Var;
        a1Var.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (this.f4393h != null) {
            codedOutputStream.a(1, (o) k());
        }
        if (this.f4394i != null) {
            codedOutputStream.a(2, (o) i());
        }
        int i2 = this.f4395j;
        if (i2 != m0.UNKNOWN_FORMAT.e) {
            codedOutputStream.a(3, i2);
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.f4393h != null) {
            i3 = 0 + CodedOutputStream.b(1, (o) k());
        }
        if (this.f4394i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        int i4 = this.f4395j;
        if (i4 != m0.UNKNOWN_FORMAT.e) {
            i3 += CodedOutputStream.d(3, i4);
        }
        this.f4950g = i3;
        return i3;
    }

    public w0 i() {
        w0 w0Var = this.f4394i;
        return w0Var == null ? w0.f4602i : w0Var;
    }

    public m0 j() {
        m0 a2 = m0.a(this.f4395j);
        return a2 == null ? m0.UNRECOGNIZED : a2;
    }

    public g1 k() {
        g1 g1Var = this.f4393h;
        return g1Var == null ? g1.f4460k : g1Var;
    }

    /* compiled from: EciesAeadHkdfParams */
    public static final class b extends k.b<a1, b> implements b1 {
        public b() {
            super(a1.f4391k);
        }

        public /* synthetic */ b(a aVar) {
            super(a1.f4391k);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4391k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                a1 a1Var = (a1) obj2;
                this.f4393h = (g1) kVar.a(this.f4393h, a1Var.f4393h);
                this.f4394i = (w0) kVar.a(this.f4394i, a1Var.f4394i);
                boolean z2 = this.f4395j != 0;
                int i2 = this.f4395j;
                if (a1Var.f4395j != 0) {
                    z = true;
                }
                this.f4395j = kVar.a(z2, i2, z, a1Var.f4395j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 10) {
                                g1.b bVar = this.f4393h != null ? (g1.b) this.f4393h.e() : null;
                                g1 g1Var = (g1) gVar.a(g1.f4460k.g(), iVar);
                                this.f4393h = g1Var;
                                if (bVar != null) {
                                    bVar.a(g1Var);
                                    this.f4393h = (g1) bVar.j();
                                }
                            } else if (i3 == 18) {
                                w0.b bVar2 = this.f4394i != null ? (w0.b) this.f4394i.e() : null;
                                w0 w0Var = (w0) gVar.a(w0.f4602i.g(), iVar);
                                this.f4394i = w0Var;
                                if (bVar2 != null) {
                                    bVar2.a(w0Var);
                                    this.f4394i = (w0) bVar2.j();
                                }
                            } else if (i3 == 24) {
                                this.f4395j = gVar.d();
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
                return new a1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4392l == null) {
                    synchronized (a1.class) {
                        if (f4392l == null) {
                            f4392l = new k.c(f4391k);
                        }
                    }
                }
                return f4392l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4391k;
    }
}
