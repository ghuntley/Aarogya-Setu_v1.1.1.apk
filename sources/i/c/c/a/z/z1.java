package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: KeyTemplate */
public final class z1 extends k<z1, b> implements a2 {

    /* renamed from: k  reason: collision with root package name */
    public static final z1 f4630k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<z1> f4631l;

    /* renamed from: h  reason: collision with root package name */
    public String f4632h = "";

    /* renamed from: i  reason: collision with root package name */
    public f f4633i = f.f4932f;

    /* renamed from: j  reason: collision with root package name */
    public int f4634j;

    /* compiled from: KeyTemplate */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.z1.a.<clinit>():void");
        }
    }

    static {
        z1 z1Var = new z1();
        f4630k = z1Var;
        z1Var.f();
    }

    public static /* synthetic */ void a(z1 z1Var, String str) {
        if (str != null) {
            z1Var.f4632h = str;
            return;
        }
        throw null;
    }

    public static b i() {
        return (b) f4630k.e();
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.f4632h.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.f4632h);
        }
        if (!this.f4633i.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.f4633i);
        }
        int i4 = this.f4634j;
        if (i4 != p2.UNKNOWN_PREFIX.e) {
            i3 += CodedOutputStream.d(3, i4);
        }
        this.f4950g = i3;
        return i3;
    }

    /* compiled from: KeyTemplate */
    public static final class b extends k.b<z1, b> implements a2 {
        public b() {
            super(z1.f4630k);
        }

        public b a(p2 p2Var) {
            k();
            z1.a((z1) this.f4951f, p2Var);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            super(z1.f4630k);
        }
    }

    public static /* synthetic */ void a(z1 z1Var, p2 p2Var) {
        if (z1Var == null) {
            throw null;
        } else if (p2Var != null) {
            z1Var.f4634j = p2Var.e;
        } else {
            throw null;
        }
    }

    public static /* synthetic */ void a(z1 z1Var, f fVar) {
        if (fVar != null) {
            z1Var.f4633i = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f4632h.isEmpty()) {
            codedOutputStream.a(1, this.f4632h);
        }
        if (!this.f4633i.isEmpty()) {
            codedOutputStream.a(2, this.f4633i);
        }
        int i2 = this.f4634j;
        if (i2 != p2.UNKNOWN_PREFIX.e) {
            codedOutputStream.a(3, i2);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4630k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                z1 z1Var = (z1) obj2;
                this.f4632h = kVar.a(!this.f4632h.isEmpty(), this.f4632h, !z1Var.f4632h.isEmpty(), z1Var.f4632h);
                this.f4633i = kVar.a(this.f4633i != f.f4932f, this.f4633i, z1Var.f4633i != f.f4932f, z1Var.f4633i);
                boolean z2 = this.f4634j != 0;
                int i2 = this.f4634j;
                if (z1Var.f4634j != 0) {
                    z = true;
                }
                this.f4634j = kVar.a(z2, i2, z, z1Var.f4634j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 10) {
                                this.f4632h = gVar.h();
                            } else if (i3 == 18) {
                                this.f4633i = gVar.a();
                            } else if (i3 == 24) {
                                this.f4634j = gVar.d();
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
                return new z1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4631l == null) {
                    synchronized (z1.class) {
                        if (f4631l == null) {
                            f4631l = new k.c(f4630k);
                        }
                    }
                }
                return f4631l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4630k;
    }
}
