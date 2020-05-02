package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.c;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;

/* compiled from: RegistryConfig */
public final class q2 extends k<q2, b> implements r2 {

    /* renamed from: k  reason: collision with root package name */
    public static final q2 f4561k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<q2> f4562l;

    /* renamed from: h  reason: collision with root package name */
    public int f4563h;

    /* renamed from: i  reason: collision with root package name */
    public String f4564i = "";

    /* renamed from: j  reason: collision with root package name */
    public l.b<b2> f4565j = r.f4965g;

    /* compiled from: RegistryConfig */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.q2.a.<clinit>():void");
        }
    }

    static {
        q2 q2Var = new q2();
        f4561k = q2Var;
        q2Var.f();
    }

    public static /* synthetic */ void a(q2 q2Var, String str) {
        if (str != null) {
            q2Var.f4564i = str;
            return;
        }
        throw null;
    }

    public static b i() {
        return (b) f4561k.e();
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int b2 = !this.f4564i.isEmpty() ? CodedOutputStream.b(1, this.f4564i) + 0 : 0;
        for (int i3 = 0; i3 < this.f4565j.size(); i3++) {
            b2 += CodedOutputStream.b(2, (o) this.f4565j.get(i3));
        }
        this.f4950g = b2;
        return b2;
    }

    /* compiled from: RegistryConfig */
    public static final class b extends k.b<q2, b> implements r2 {
        public b() {
            super(q2.f4561k);
        }

        public b a(b2 b2Var) {
            k();
            q2.a((q2) this.f4951f, b2Var);
            return this;
        }

        public /* synthetic */ b(a aVar) {
            super(q2.f4561k);
        }
    }

    public static /* synthetic */ void a(q2 q2Var, b2 b2Var) {
        if (b2Var != null) {
            l.b<b2> bVar = q2Var.f4565j;
            if (!((c) bVar).e) {
                q2Var.f4565j = k.a(bVar);
            }
            q2Var.f4565j.add(b2Var);
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (!this.f4564i.isEmpty()) {
            codedOutputStream.a(1, this.f4564i);
        }
        for (int i2 = 0; i2 < this.f4565j.size(); i2++) {
            codedOutputStream.a(2, (o) this.f4565j.get(i2));
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4561k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                q2 q2Var = (q2) obj2;
                this.f4564i = kVar.a(!this.f4564i.isEmpty(), this.f4564i, true ^ q2Var.f4564i.isEmpty(), q2Var.f4564i);
                this.f4565j = kVar.a(this.f4565j, q2Var.f4565j);
                if (kVar == k.i.a) {
                    this.f4563h |= q2Var.f4563h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 10) {
                                this.f4564i = gVar.h();
                            } else if (i2 == 18) {
                                if (!((c) this.f4565j).e) {
                                    this.f4565j = k.a(this.f4565j);
                                }
                                this.f4565j.add(gVar.a(b2.f4400m.g(), iVar));
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
                ((c) this.f4565j).e = false;
                return null;
            case 4:
                return new q2();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4562l == null) {
                    synchronized (q2.class) {
                        if (f4562l == null) {
                            f4562l = new k.c(f4561k);
                        }
                    }
                }
                return f4562l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4561k;
    }
}
