package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.i;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesCtrHmacStreamingKeyFormat */
public final class f extends k<f, b> implements g {

    /* renamed from: j  reason: collision with root package name */
    public static final f f4452j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile q<f> f4453k;

    /* renamed from: h  reason: collision with root package name */
    public i f4454h;

    /* renamed from: i  reason: collision with root package name */
    public int f4455i;

    /* compiled from: AesCtrHmacStreamingKeyFormat */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.f.a.<clinit>():void");
        }
    }

    /* compiled from: AesCtrHmacStreamingKeyFormat */
    public static final class b extends k.b<f, b> implements g {
        public /* synthetic */ b(a aVar) {
            super(f.f4452j);
        }
    }

    static {
        f fVar = new f();
        f4452j = fVar;
        fVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if (this.f4454h != null) {
            codedOutputStream.a(1, (o) i());
        }
        int i2 = this.f4455i;
        if (i2 != 0) {
            codedOutputStream.c(2, i2);
        }
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if (this.f4454h != null) {
            i3 = 0 + CodedOutputStream.b(1, (o) i());
        }
        int i4 = this.f4455i;
        if (i4 != 0) {
            i3 += CodedOutputStream.e(2, i4);
        }
        this.f4950g = i3;
        return i3;
    }

    public i i() {
        i iVar = this.f4454h;
        return iVar == null ? i.f4472l : iVar;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4452j;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                f fVar = (f) obj2;
                this.f4454h = (i) kVar.a(this.f4454h, fVar.f4454h);
                boolean z2 = this.f4455i != 0;
                int i2 = this.f4455i;
                if (fVar.f4455i != 0) {
                    z = true;
                }
                this.f4455i = kVar.a(z2, i2, z, fVar.f4455i);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 10) {
                                i.b bVar = this.f4454h != null ? (i.b) this.f4454h.e() : null;
                                i iVar2 = (i) gVar.a(i.f4472l.g(), iVar);
                                this.f4454h = iVar2;
                                if (bVar != null) {
                                    bVar.a(iVar2);
                                    this.f4454h = (i) bVar.j();
                                }
                            } else if (i3 == 16) {
                                this.f4455i = gVar.d();
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
                return new f();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4453k == null) {
                    synchronized (f.class) {
                        if (f4453k == null) {
                            f4453k = new k.c(f4452j);
                        }
                    }
                }
                return f4453k;
            default:
                throw new UnsupportedOperationException();
        }
        return f4452j;
    }
}
