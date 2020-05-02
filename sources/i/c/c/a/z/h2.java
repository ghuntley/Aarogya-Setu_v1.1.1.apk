package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.i2;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: KmsAeadKey */
public final class h2 extends k<h2, b> implements k2 {

    /* renamed from: j  reason: collision with root package name */
    public static final h2 f4468j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile q<h2> f4469k;

    /* renamed from: h  reason: collision with root package name */
    public int f4470h;

    /* renamed from: i  reason: collision with root package name */
    public i2 f4471i;

    /* compiled from: KmsAeadKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.h2.a.<clinit>():void");
        }
    }

    static {
        h2 h2Var = new h2();
        f4468j = h2Var;
        h2Var.f();
    }

    public static /* synthetic */ void a(h2 h2Var, i2 i2Var) {
        if (i2Var != null) {
            h2Var.f4471i = i2Var;
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
        int i4 = this.f4470h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4471i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        this.f4950g = i3;
        return i3;
    }

    public i2 i() {
        i2 i2Var = this.f4471i;
        return i2Var == null ? i2.f4483i : i2Var;
    }

    /* compiled from: KmsAeadKey */
    public static final class b extends k.b<h2, b> implements k2 {
        public b() {
            super(h2.f4468j);
        }

        public /* synthetic */ b(a aVar) {
            super(h2.f4468j);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4470h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4471i != null) {
            codedOutputStream.a(2, (o) i());
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4468j;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                h2 h2Var = (h2) obj2;
                boolean z2 = this.f4470h != 0;
                int i2 = this.f4470h;
                if (h2Var.f4470h != 0) {
                    z = true;
                }
                this.f4470h = kVar.a(z2, i2, z, h2Var.f4470h);
                this.f4471i = (i2) kVar.a(this.f4471i, h2Var.f4471i);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4470h = gVar.d();
                            } else if (i3 == 18) {
                                i2.b bVar = this.f4471i != null ? (i2.b) this.f4471i.e() : null;
                                i2 i2Var = (i2) gVar.a(i2.f4483i.g(), iVar);
                                this.f4471i = i2Var;
                                if (bVar != null) {
                                    bVar.a(i2Var);
                                    this.f4471i = (i2) bVar.j();
                                }
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
                return new h2();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4469k == null) {
                    synchronized (h2.class) {
                        if (f4469k == null) {
                            f4469k = new k.c(f4468j);
                        }
                    }
                }
                return f4469k;
            default:
                throw new UnsupportedOperationException();
        }
        return f4468j;
    }
}
