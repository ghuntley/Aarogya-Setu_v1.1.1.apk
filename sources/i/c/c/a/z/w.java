package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.a0;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesGcmHkdfStreamingKey */
public final class w extends k<w, b> implements z {

    /* renamed from: k  reason: collision with root package name */
    public static final w f4597k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<w> f4598l;

    /* renamed from: h  reason: collision with root package name */
    public int f4599h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f4600i;

    /* renamed from: j  reason: collision with root package name */
    public f f4601j = f.f4932f;

    /* compiled from: AesGcmHkdfStreamingKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.w.a.<clinit>():void");
        }
    }

    static {
        w wVar = new w();
        f4597k = wVar;
        wVar.f();
    }

    public static /* synthetic */ void a(w wVar, a0 a0Var) {
        if (a0Var != null) {
            wVar.f4600i = a0Var;
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
        int i4 = this.f4599h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4600i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4601j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4601j);
        }
        this.f4950g = i3;
        return i3;
    }

    public a0 i() {
        a0 a0Var = this.f4600i;
        return a0Var == null ? a0.f4386k : a0Var;
    }

    /* compiled from: AesGcmHkdfStreamingKey */
    public static final class b extends k.b<w, b> implements z {
        public b() {
            super(w.f4597k);
        }

        public /* synthetic */ b(a aVar) {
            super(w.f4597k);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4599h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4600i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4601j.isEmpty()) {
            codedOutputStream.a(3, this.f4601j);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4597k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                w wVar = (w) obj2;
                this.f4599h = kVar.a(this.f4599h != 0, this.f4599h, wVar.f4599h != 0, wVar.f4599h);
                this.f4600i = (a0) kVar.a(this.f4600i, wVar.f4600i);
                boolean z2 = this.f4601j != f.f4932f;
                f fVar = this.f4601j;
                if (wVar.f4601j != f.f4932f) {
                    z = true;
                }
                this.f4601j = kVar.a(z2, fVar, z, wVar.f4601j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4599h = gVar.d();
                            } else if (i2 == 18) {
                                a0.b bVar = this.f4600i != null ? (a0.b) this.f4600i.e() : null;
                                a0 a0Var = (a0) gVar.a(a0.f4386k.g(), iVar);
                                this.f4600i = a0Var;
                                if (bVar != null) {
                                    bVar.a(a0Var);
                                    this.f4600i = (a0) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4601j = gVar.a();
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
                return new w();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4598l == null) {
                    synchronized (w.class) {
                        if (f4598l == null) {
                            f4598l = new k.c(f4597k);
                        }
                    }
                }
                return f4598l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4597k;
    }
}
