package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.a1;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: EciesAeadHkdfPublicKey */
public final class e1 extends k<e1, b> implements f1 {

    /* renamed from: l  reason: collision with root package name */
    public static final e1 f4435l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<e1> f4436m;

    /* renamed from: h  reason: collision with root package name */
    public int f4437h;

    /* renamed from: i  reason: collision with root package name */
    public a1 f4438i;

    /* renamed from: j  reason: collision with root package name */
    public f f4439j;

    /* renamed from: k  reason: collision with root package name */
    public f f4440k;

    /* compiled from: EciesAeadHkdfPublicKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.e1.a.<clinit>():void");
        }
    }

    static {
        e1 e1Var = new e1();
        f4435l = e1Var;
        e1Var.f();
    }

    public e1() {
        f fVar = f.f4932f;
        this.f4439j = fVar;
        this.f4440k = fVar;
    }

    public static /* synthetic */ void a(e1 e1Var, a1 a1Var) {
        if (a1Var != null) {
            e1Var.f4438i = a1Var;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(e1 e1Var, f fVar) {
        if (fVar != null) {
            e1Var.f4440k = fVar;
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
        int i4 = this.f4437h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4438i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4439j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4439j);
        }
        if (!this.f4440k.isEmpty()) {
            i3 += CodedOutputStream.b(4, this.f4440k);
        }
        this.f4950g = i3;
        return i3;
    }

    public a1 i() {
        a1 a1Var = this.f4438i;
        return a1Var == null ? a1.f4391k : a1Var;
    }

    /* compiled from: EciesAeadHkdfPublicKey */
    public static final class b extends k.b<e1, b> implements f1 {
        public b() {
            super(e1.f4435l);
        }

        public /* synthetic */ b(a aVar) {
            super(e1.f4435l);
        }
    }

    public static /* synthetic */ void a(e1 e1Var, f fVar) {
        if (fVar != null) {
            e1Var.f4439j = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4437h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4438i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4439j.isEmpty()) {
            codedOutputStream.a(3, this.f4439j);
        }
        if (!this.f4440k.isEmpty()) {
            codedOutputStream.a(4, this.f4440k);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4435l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                e1 e1Var = (e1) obj2;
                this.f4437h = kVar.a(this.f4437h != 0, this.f4437h, e1Var.f4437h != 0, e1Var.f4437h);
                this.f4438i = (a1) kVar.a(this.f4438i, e1Var.f4438i);
                this.f4439j = kVar.a(this.f4439j != f.f4932f, this.f4439j, e1Var.f4439j != f.f4932f, e1Var.f4439j);
                boolean z2 = this.f4440k != f.f4932f;
                f fVar = this.f4440k;
                if (e1Var.f4440k != f.f4932f) {
                    z = true;
                }
                this.f4440k = kVar.a(z2, fVar, z, e1Var.f4440k);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4437h = gVar.d();
                            } else if (i2 == 18) {
                                a1.b bVar = this.f4438i != null ? (a1.b) this.f4438i.e() : null;
                                a1 a1Var = (a1) gVar.a(a1.f4391k.g(), iVar);
                                this.f4438i = a1Var;
                                if (bVar != null) {
                                    bVar.a(a1Var);
                                    this.f4438i = (a1) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4439j = gVar.a();
                            } else if (i2 == 34) {
                                this.f4440k = gVar.a();
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
                return new e1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4436m == null) {
                    synchronized (e1.class) {
                        if (f4436m == null) {
                            f4436m = new k.c(f4435l);
                        }
                    }
                }
                return f4436m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4435l;
    }
}
