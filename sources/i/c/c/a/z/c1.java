package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.e1;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: EciesAeadHkdfPrivateKey */
public final class c1 extends k<c1, b> implements d1 {

    /* renamed from: k  reason: collision with root package name */
    public static final c1 f4411k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<c1> f4412l;

    /* renamed from: h  reason: collision with root package name */
    public int f4413h;

    /* renamed from: i  reason: collision with root package name */
    public e1 f4414i;

    /* renamed from: j  reason: collision with root package name */
    public f f4415j = f.f4932f;

    /* compiled from: EciesAeadHkdfPrivateKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.c1.a.<clinit>():void");
        }
    }

    static {
        c1 c1Var = new c1();
        f4411k = c1Var;
        c1Var.f();
    }

    public static /* synthetic */ void a(c1 c1Var, e1 e1Var) {
        if (e1Var != null) {
            c1Var.f4414i = e1Var;
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
        int i4 = this.f4413h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4414i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4415j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4415j);
        }
        this.f4950g = i3;
        return i3;
    }

    public e1 i() {
        e1 e1Var = this.f4414i;
        return e1Var == null ? e1.f4435l : e1Var;
    }

    /* compiled from: EciesAeadHkdfPrivateKey */
    public static final class b extends k.b<c1, b> implements d1 {
        public b() {
            super(c1.f4411k);
        }

        public /* synthetic */ b(a aVar) {
            super(c1.f4411k);
        }
    }

    public static /* synthetic */ void a(c1 c1Var, f fVar) {
        if (fVar != null) {
            c1Var.f4415j = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4413h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4414i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4415j.isEmpty()) {
            codedOutputStream.a(3, this.f4415j);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4411k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                c1 c1Var = (c1) obj2;
                this.f4413h = kVar.a(this.f4413h != 0, this.f4413h, c1Var.f4413h != 0, c1Var.f4413h);
                this.f4414i = (e1) kVar.a(this.f4414i, c1Var.f4414i);
                boolean z2 = this.f4415j != f.f4932f;
                f fVar = this.f4415j;
                if (c1Var.f4415j != f.f4932f) {
                    z = true;
                }
                this.f4415j = kVar.a(z2, fVar, z, c1Var.f4415j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4413h = gVar.d();
                            } else if (i2 == 18) {
                                e1.b bVar = this.f4414i != null ? (e1.b) this.f4414i.e() : null;
                                e1 e1Var = (e1) gVar.a(e1.f4435l.g(), iVar);
                                this.f4414i = e1Var;
                                if (bVar != null) {
                                    bVar.a(e1Var);
                                    this.f4414i = (e1) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4415j = gVar.a();
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
                return new c1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4412l == null) {
                    synchronized (c1.class) {
                        if (f4412l == null) {
                            f4412l = new k.c(f4411k);
                        }
                    }
                }
                return f4412l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4411k;
    }
}
