package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.q;
import java.io.IOException;

/* compiled from: KeyData */
public final class w1 extends k<w1, b> implements x1 {

    /* renamed from: k  reason: collision with root package name */
    public static final w1 f4605k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<w1> f4606l;

    /* renamed from: h  reason: collision with root package name */
    public String f4607h = "";

    /* renamed from: i  reason: collision with root package name */
    public f f4608i = f.f4932f;

    /* renamed from: j  reason: collision with root package name */
    public int f4609j;

    /* compiled from: KeyData */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.w1.a.<clinit>():void");
        }
    }

    /* compiled from: KeyData */
    public enum c implements l.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        public final int e;

        /* access modifiers changed from: public */
        c(int i2) {
            this.e = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    static {
        w1 w1Var = new w1();
        f4605k = w1Var;
        w1Var.f();
    }

    public static /* synthetic */ void a(w1 w1Var, c cVar) {
        if (w1Var == null) {
            throw null;
        } else if (cVar != null) {
            w1Var.f4609j = cVar.e;
        } else {
            throw null;
        }
    }

    public static b i() {
        return (b) f4605k.e();
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.f4607h.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.f4607h);
        }
        if (!this.f4608i.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.f4608i);
        }
        int i4 = this.f4609j;
        if (i4 != c.UNKNOWN_KEYMATERIAL.e) {
            i3 += CodedOutputStream.d(3, i4);
        }
        this.f4950g = i3;
        return i3;
    }

    /* compiled from: KeyData */
    public static final class b extends k.b<w1, b> implements x1 {
        public b() {
            super(w1.f4605k);
        }

        public b a(c cVar) {
            k();
            w1.a((w1) this.f4951f, cVar);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            super(w1.f4605k);
        }
    }

    public static /* synthetic */ void a(w1 w1Var, String str) {
        if (str != null) {
            w1Var.f4607h = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(w1 w1Var, f fVar) {
        if (fVar != null) {
            w1Var.f4608i = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f4607h.isEmpty()) {
            codedOutputStream.a(1, this.f4607h);
        }
        if (!this.f4608i.isEmpty()) {
            codedOutputStream.a(2, this.f4608i);
        }
        int i2 = this.f4609j;
        if (i2 != c.UNKNOWN_KEYMATERIAL.e) {
            codedOutputStream.a(3, i2);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4605k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                w1 w1Var = (w1) obj2;
                this.f4607h = kVar.a(!this.f4607h.isEmpty(), this.f4607h, !w1Var.f4607h.isEmpty(), w1Var.f4607h);
                this.f4608i = kVar.a(this.f4608i != f.f4932f, this.f4608i, w1Var.f4608i != f.f4932f, w1Var.f4608i);
                boolean z2 = this.f4609j != 0;
                int i2 = this.f4609j;
                if (w1Var.f4609j != 0) {
                    z = true;
                }
                this.f4609j = kVar.a(z2, i2, z, w1Var.f4609j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 10) {
                                this.f4607h = gVar.h();
                            } else if (i3 == 18) {
                                this.f4608i = gVar.a();
                            } else if (i3 == 24) {
                                this.f4609j = gVar.d();
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
                return new w1();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4606l == null) {
                    synchronized (w1.class) {
                        if (f4606l == null) {
                            f4606l = new k.c(f4605k);
                        }
                    }
                }
                return f4606l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4605k;
    }
}
