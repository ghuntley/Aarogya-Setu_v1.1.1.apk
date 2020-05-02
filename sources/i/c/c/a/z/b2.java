package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: KeyTypeEntry */
public final class b2 extends k<b2, b> implements c2 {

    /* renamed from: m  reason: collision with root package name */
    public static final b2 f4400m;

    /* renamed from: n  reason: collision with root package name */
    public static volatile q<b2> f4401n;

    /* renamed from: h  reason: collision with root package name */
    public String f4402h = "";

    /* renamed from: i  reason: collision with root package name */
    public String f4403i = "";

    /* renamed from: j  reason: collision with root package name */
    public int f4404j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4405k;

    /* renamed from: l  reason: collision with root package name */
    public String f4406l = "";

    /* compiled from: KeyTypeEntry */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.b2.a.<clinit>():void");
        }
    }

    static {
        b2 b2Var = new b2();
        f4400m = b2Var;
        b2Var.f();
    }

    public static /* synthetic */ void a(b2 b2Var, String str) {
        if (str != null) {
            b2Var.f4402h = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void b(b2 b2Var, String str) {
        if (str != null) {
            b2Var.f4406l = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ void c(b2 b2Var, String str) {
        if (str != null) {
            b2Var.f4403i = str;
            return;
        }
        throw null;
    }

    /* compiled from: KeyTypeEntry */
    public static final class b extends k.b<b2, b> implements c2 {
        public b() {
            super(b2.f4400m);
        }

        public /* synthetic */ b(a aVar) {
            super(b2.f4400m);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f4402h.isEmpty()) {
            codedOutputStream.a(1, this.f4402h);
        }
        if (!this.f4403i.isEmpty()) {
            codedOutputStream.a(2, this.f4403i);
        }
        int i2 = this.f4404j;
        if (i2 != 0) {
            codedOutputStream.c(3, i2);
        }
        boolean z = this.f4405k;
        if (z) {
            codedOutputStream.a(4, z);
        }
        if (!this.f4406l.isEmpty()) {
            codedOutputStream.a(5, this.f4406l);
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (!this.f4402h.isEmpty()) {
            i3 = 0 + CodedOutputStream.b(1, this.f4402h);
        }
        if (!this.f4403i.isEmpty()) {
            i3 += CodedOutputStream.b(2, this.f4403i);
        }
        int i4 = this.f4404j;
        if (i4 != 0) {
            i3 += CodedOutputStream.e(3, i4);
        }
        if (this.f4405k) {
            i3 += CodedOutputStream.c(4) + 1;
        }
        if (!this.f4406l.isEmpty()) {
            i3 += CodedOutputStream.b(5, this.f4406l);
        }
        this.f4950g = i3;
        return i3;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4400m;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                b2 b2Var = (b2) obj2;
                this.f4402h = kVar.a(!this.f4402h.isEmpty(), this.f4402h, !b2Var.f4402h.isEmpty(), b2Var.f4402h);
                this.f4403i = kVar.a(!this.f4403i.isEmpty(), this.f4403i, !b2Var.f4403i.isEmpty(), b2Var.f4403i);
                boolean z2 = this.f4404j != 0;
                int i2 = this.f4404j;
                if (b2Var.f4404j != 0) {
                    z = true;
                }
                this.f4404j = kVar.a(z2, i2, z, b2Var.f4404j);
                boolean z3 = this.f4405k;
                boolean z4 = b2Var.f4405k;
                this.f4405k = kVar.a(z3, z3, z4, z4);
                this.f4406l = kVar.a(!this.f4406l.isEmpty(), this.f4406l, true ^ b2Var.f4406l.isEmpty(), b2Var.f4406l);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 10) {
                                this.f4402h = gVar.h();
                            } else if (i3 == 18) {
                                this.f4403i = gVar.h();
                            } else if (i3 == 24) {
                                this.f4404j = gVar.d();
                            } else if (i3 == 32) {
                                this.f4405k = gVar.e() != 0;
                            } else if (i3 == 42) {
                                this.f4406l = gVar.h();
                            } else if (!gVar.e(i3)) {
                            }
                        }
                        z5 = true;
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
                return new b2();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4401n == null) {
                    synchronized (b2.class) {
                        if (f4401n == null) {
                            f4401n = new k.c(f4400m);
                        }
                    }
                }
                return f4401n;
            default:
                throw new UnsupportedOperationException();
        }
        return f4400m;
    }
}
