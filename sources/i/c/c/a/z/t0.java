package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.p0;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: EcdsaPublicKey */
public final class t0 extends k<t0, b> implements u0 {

    /* renamed from: l  reason: collision with root package name */
    public static final t0 f4579l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<t0> f4580m;

    /* renamed from: h  reason: collision with root package name */
    public int f4581h;

    /* renamed from: i  reason: collision with root package name */
    public p0 f4582i;

    /* renamed from: j  reason: collision with root package name */
    public f f4583j;

    /* renamed from: k  reason: collision with root package name */
    public f f4584k;

    /* compiled from: EcdsaPublicKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.t0.a.<clinit>():void");
        }
    }

    static {
        t0 t0Var = new t0();
        f4579l = t0Var;
        t0Var.f();
    }

    public t0() {
        f fVar = f.f4932f;
        this.f4583j = fVar;
        this.f4584k = fVar;
    }

    public static /* synthetic */ void a(t0 t0Var, p0 p0Var) {
        if (p0Var != null) {
            t0Var.f4582i = p0Var;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(t0 t0Var, f fVar) {
        if (fVar != null) {
            t0Var.f4584k = fVar;
            return;
        }
        throw null;
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.f4581h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4582i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4583j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4583j);
        }
        if (!this.f4584k.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.f4584k);
        }
        this.f4950g = i3;
        return i3;
    }

    public p0 i() {
        p0 p0Var = this.f4582i;
        return p0Var == null ? p0.f4533k : p0Var;
    }

    /* compiled from: EcdsaPublicKey */
    public static final class b extends k.b<t0, b> implements u0 {
        public b() {
            super(t0.f4579l);
        }

        public /* synthetic */ b(a aVar) {
            super(t0.f4579l);
        }
    }

    public static /* synthetic */ void a(t0 t0Var, f fVar) {
        if (fVar != null) {
            t0Var.f4583j = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4581h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4582i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4583j.isEmpty()) {
            codedOutputStream.a(3, this.f4583j);
        }
        if (!this.f4584k.isEmpty()) {
            codedOutputStream.a(4, this.f4584k);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4579l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                t0 t0Var = (t0) obj2;
                this.f4581h = kVar.a(this.f4581h != 0, this.f4581h, t0Var.f4581h != 0, t0Var.f4581h);
                this.f4582i = (p0) kVar.a(this.f4582i, t0Var.f4582i);
                this.f4583j = kVar.a(this.f4583j != f.f4932f, this.f4583j, t0Var.f4583j != f.f4932f, t0Var.f4583j);
                boolean z2 = this.f4584k != f.f4932f;
                f fVar = this.f4584k;
                if (t0Var.f4584k != f.f4932f) {
                    z = true;
                }
                this.f4584k = kVar.a(z2, fVar, z, t0Var.f4584k);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4581h = gVar.d();
                            } else if (i2 == 18) {
                                p0.b bVar = this.f4582i != null ? (p0.b) this.f4582i.e() : null;
                                p0 p0Var = (p0) gVar.a(p0.f4533k.g(), iVar);
                                this.f4582i = p0Var;
                                if (bVar != null) {
                                    bVar.a(p0Var);
                                    this.f4582i = (p0) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4583j = gVar.a();
                            } else if (i2 == 34) {
                                this.f4584k = gVar.a();
                            } else if (!gVar.e(i2)) {
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
                return new t0();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4580m == null) {
                    synchronized (t0.class) {
                        if (f4580m == null) {
                            f4580m = new k.c(f4579l);
                        }
                    }
                }
                return f4580m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4579l;
    }
}
