package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.o;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesCtrKey */
public final class k extends i.c.f.k<k, b> implements n {

    /* renamed from: k  reason: collision with root package name */
    public static final k f4486k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<k> f4487l;

    /* renamed from: h  reason: collision with root package name */
    public int f4488h;

    /* renamed from: i  reason: collision with root package name */
    public o f4489i;

    /* renamed from: j  reason: collision with root package name */
    public f f4490j = f.f4932f;

    /* compiled from: AesCtrKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.k.a.<clinit>():void");
        }
    }

    static {
        k kVar = new k();
        f4486k = kVar;
        kVar.f();
    }

    public static /* synthetic */ void a(k kVar, o oVar) {
        if (oVar != null) {
            kVar.f4489i = oVar;
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
        int i4 = this.f4488h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4489i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4490j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4490j);
        }
        this.f4950g = i3;
        return i3;
    }

    public o i() {
        o oVar = this.f4489i;
        return oVar == null ? o.f4530i : oVar;
    }

    /* compiled from: AesCtrKey */
    public static final class b extends k.b<k, b> implements n {
        public b() {
            super(k.f4486k);
        }

        public /* synthetic */ b(a aVar) {
            super(k.f4486k);
        }
    }

    public static /* synthetic */ void a(k kVar, f fVar) {
        if (fVar != null) {
            kVar.f4490j = fVar;
            return;
        }
        throw null;
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4488h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4489i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4490j.isEmpty()) {
            codedOutputStream.a(3, this.f4490j);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4486k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                k kVar2 = (k) obj2;
                this.f4488h = kVar.a(this.f4488h != 0, this.f4488h, kVar2.f4488h != 0, kVar2.f4488h);
                this.f4489i = (o) kVar.a(this.f4489i, kVar2.f4489i);
                boolean z2 = this.f4490j != f.f4932f;
                f fVar = this.f4490j;
                if (kVar2.f4490j != f.f4932f) {
                    z = true;
                }
                this.f4490j = kVar.a(z2, fVar, z, kVar2.f4490j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4488h = gVar.d();
                            } else if (i2 == 18) {
                                o.b bVar = this.f4489i != null ? (o.b) this.f4489i.e() : null;
                                o oVar = (o) gVar.a(o.f4530i.g(), iVar);
                                this.f4489i = oVar;
                                if (bVar != null) {
                                    bVar.a(oVar);
                                    this.f4489i = (o) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4490j = gVar.a();
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
                return new k();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4487l == null) {
                    synchronized (k.class) {
                        if (f4487l == null) {
                            f4487l = new k.c(f4486k);
                        }
                    }
                }
                return f4487l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4486k;
    }
}
