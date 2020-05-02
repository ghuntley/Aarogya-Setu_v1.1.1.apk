package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.u1;
import i.c.f.g;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesCtrHmacStreamingParams */
public final class i extends k<i, b> implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final i f4472l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<i> f4473m;

    /* renamed from: h  reason: collision with root package name */
    public int f4474h;

    /* renamed from: i  reason: collision with root package name */
    public int f4475i;

    /* renamed from: j  reason: collision with root package name */
    public int f4476j;

    /* renamed from: k  reason: collision with root package name */
    public u1 f4477k;

    /* compiled from: AesCtrHmacStreamingParams */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.i.a.<clinit>():void");
        }
    }

    static {
        i iVar = new i();
        f4472l = iVar;
        iVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4474h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        int i3 = this.f4475i;
        if (i3 != 0) {
            codedOutputStream.c(2, i3);
        }
        int i4 = this.f4476j;
        if (i4 != p1.UNKNOWN_HASH.e) {
            codedOutputStream.a(3, i4);
        }
        if (this.f4477k != null) {
            codedOutputStream.a(4, (o) i());
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.f4474h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        int i5 = this.f4475i;
        if (i5 != 0) {
            i3 += CodedOutputStream.e(2, i5);
        }
        int i6 = this.f4476j;
        if (i6 != p1.UNKNOWN_HASH.e) {
            i3 += CodedOutputStream.d(3, i6);
        }
        if (this.f4477k != null) {
            i3 += CodedOutputStream.b(4, (o) i());
        }
        this.f4950g = i3;
        return i3;
    }

    public u1 i() {
        u1 u1Var = this.f4477k;
        return u1Var == null ? u1.f4588j : u1Var;
    }

    /* compiled from: AesCtrHmacStreamingParams */
    public static final class b extends k.b<i, b> implements j {
        public b() {
            super(i.f4472l);
        }

        public /* synthetic */ b(a aVar) {
            super(i.f4472l);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4472l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                i iVar = (i) obj2;
                this.f4474h = kVar.a(this.f4474h != 0, this.f4474h, iVar.f4474h != 0, iVar.f4474h);
                this.f4475i = kVar.a(this.f4475i != 0, this.f4475i, iVar.f4475i != 0, iVar.f4475i);
                boolean z2 = this.f4476j != 0;
                int i2 = this.f4476j;
                if (iVar.f4476j != 0) {
                    z = true;
                }
                this.f4476j = kVar.a(z2, i2, z, iVar.f4476j);
                this.f4477k = (u1) kVar.a(this.f4477k, iVar.f4477k);
                return this;
            case 2:
                g gVar = (g) obj;
                i.c.f.i iVar2 = (i.c.f.i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4474h = gVar.d();
                            } else if (i3 == 16) {
                                this.f4475i = gVar.d();
                            } else if (i3 == 24) {
                                this.f4476j = gVar.d();
                            } else if (i3 == 34) {
                                u1.b bVar = this.f4477k != null ? (u1.b) this.f4477k.e() : null;
                                u1 u1Var = (u1) gVar.a(u1.j(), iVar2);
                                this.f4477k = u1Var;
                                if (bVar != null) {
                                    bVar.a(u1Var);
                                    this.f4477k = (u1) bVar.j();
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
                return new i();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4473m == null) {
                    synchronized (i.class) {
                        if (f4473m == null) {
                            f4473m = new k.c(f4472l);
                        }
                    }
                }
                return f4473m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4472l;
    }
}
