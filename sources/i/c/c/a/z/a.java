package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.k;
import i.c.c.a.z.q1;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesCtrHmacAeadKey */
public final class a extends k<a, b> implements d {

    /* renamed from: k  reason: collision with root package name */
    public static final a f4381k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<a> f4382l;

    /* renamed from: h  reason: collision with root package name */
    public int f4383h;

    /* renamed from: i  reason: collision with root package name */
    public k f4384i;

    /* renamed from: j  reason: collision with root package name */
    public q1 f4385j;

    /* renamed from: i.c.c.a.z.a$a  reason: collision with other inner class name */
    /* compiled from: AesCtrHmacAeadKey */
    public static /* synthetic */ class C0128a {
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.a.C0128a.<clinit>():void");
        }
    }

    static {
        a aVar = new a();
        f4381k = aVar;
        aVar.f();
    }

    public static /* synthetic */ void a(a aVar, k kVar) {
        if (kVar != null) {
            aVar.f4384i = kVar;
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
        int i4 = this.f4383h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4384i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (this.f4385j != null) {
            i3 += CodedOutputStream.b(3, (o) j());
        }
        this.f4950g = i3;
        return i3;
    }

    public k i() {
        k kVar = this.f4384i;
        return kVar == null ? k.f4486k : kVar;
    }

    public q1 j() {
        q1 q1Var = this.f4385j;
        return q1Var == null ? q1.f4556k : q1Var;
    }

    /* compiled from: AesCtrHmacAeadKey */
    public static final class b extends k.b<a, b> implements d {
        public b() {
            super(a.f4381k);
        }

        public /* synthetic */ b(C0128a aVar) {
            super(a.f4381k);
        }
    }

    public static /* synthetic */ void a(a aVar, q1 q1Var) {
        if (q1Var != null) {
            aVar.f4385j = q1Var;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4383h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4384i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (this.f4385j != null) {
            codedOutputStream.a(3, (o) j());
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4381k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                a aVar = (a) obj2;
                boolean z2 = this.f4383h != 0;
                int i2 = this.f4383h;
                if (aVar.f4383h != 0) {
                    z = true;
                }
                this.f4383h = kVar.a(z2, i2, z, aVar.f4383h);
                this.f4384i = (k) kVar.a(this.f4384i, aVar.f4384i);
                this.f4385j = (q1) kVar.a(this.f4385j, aVar.f4385j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4383h = gVar.d();
                            } else if (i3 == 18) {
                                k.b bVar = this.f4384i != null ? (k.b) this.f4384i.e() : null;
                                k kVar2 = (k) gVar.a(k.f4486k.g(), iVar);
                                this.f4384i = kVar2;
                                if (bVar != null) {
                                    bVar.a(kVar2);
                                    this.f4384i = (k) bVar.j();
                                }
                            } else if (i3 == 26) {
                                q1.b bVar2 = this.f4385j != null ? (q1.b) this.f4385j.e() : null;
                                q1 q1Var = (q1) gVar.a(q1.f4556k.g(), iVar);
                                this.f4385j = q1Var;
                                if (bVar2 != null) {
                                    bVar2.a(q1Var);
                                    this.f4385j = (q1) bVar2.j();
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
                return new a();
            case 5:
                return new b((C0128a) null);
            case 6:
                break;
            case 7:
                if (f4382l == null) {
                    synchronized (a.class) {
                        if (f4382l == null) {
                            f4382l = new k.c(f4381k);
                        }
                    }
                }
                return f4382l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4381k;
    }
}
