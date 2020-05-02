package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: HmacParams */
public final class u1 extends k<u1, b> implements v1 {

    /* renamed from: j  reason: collision with root package name */
    public static final u1 f4588j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile q<u1> f4589k;

    /* renamed from: h  reason: collision with root package name */
    public int f4590h;

    /* renamed from: i  reason: collision with root package name */
    public int f4591i;

    /* compiled from: HmacParams */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.u1.a.<clinit>():void");
        }
    }

    static {
        u1 u1Var = new u1();
        f4588j = u1Var;
        u1Var.f();
    }

    public static /* synthetic */ void a(u1 u1Var, p1 p1Var) {
        if (u1Var == null) {
            throw null;
        } else if (p1Var != null) {
            u1Var.f4590h = p1Var.e;
        } else {
            throw null;
        }
    }

    public static q<u1> j() {
        return f4588j.g();
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.f4590h;
        if (i4 != p1.UNKNOWN_HASH.e) {
            i3 = 0 + CodedOutputStream.d(1, i4);
        }
        int i5 = this.f4591i;
        if (i5 != 0) {
            i3 += CodedOutputStream.e(2, i5);
        }
        this.f4950g = i3;
        return i3;
    }

    public p1 i() {
        p1 a2 = p1.a(this.f4590h);
        return a2 == null ? p1.UNRECOGNIZED : a2;
    }

    /* compiled from: HmacParams */
    public static final class b extends k.b<u1, b> implements v1 {
        public b() {
            super(u1.f4588j);
        }

        public /* synthetic */ b(a aVar) {
            super(u1.f4588j);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4590h;
        if (i2 != p1.UNKNOWN_HASH.e) {
            codedOutputStream.a(1, i2);
        }
        int i3 = this.f4591i;
        if (i3 != 0) {
            codedOutputStream.c(2, i3);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4588j;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                u1 u1Var = (u1) obj2;
                this.f4590h = kVar.a(this.f4590h != 0, this.f4590h, u1Var.f4590h != 0, u1Var.f4590h);
                boolean z2 = this.f4591i != 0;
                int i2 = this.f4591i;
                if (u1Var.f4591i != 0) {
                    z = true;
                }
                this.f4591i = kVar.a(z2, i2, z, u1Var.f4591i);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4590h = gVar.d();
                            } else if (i3 == 16) {
                                this.f4591i = gVar.d();
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
                return new u1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4589k == null) {
                    synchronized (u1.class) {
                        if (f4589k == null) {
                            f4589k = new k.c(f4588j);
                        }
                    }
                }
                return f4589k;
            default:
                throw new UnsupportedOperationException();
        }
        return f4588j;
    }
}
