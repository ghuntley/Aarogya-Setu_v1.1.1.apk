package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.c.a.z.i;
import i.c.f.f;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.o;
import i.c.f.q;
import java.io.IOException;

/* compiled from: AesCtrHmacStreamingKey */
public final class e extends k<e, b> implements h {

    /* renamed from: k  reason: collision with root package name */
    public static final e f4430k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<e> f4431l;

    /* renamed from: h  reason: collision with root package name */
    public int f4432h;

    /* renamed from: i  reason: collision with root package name */
    public i f4433i;

    /* renamed from: j  reason: collision with root package name */
    public f f4434j = f.f4932f;

    /* compiled from: AesCtrHmacStreamingKey */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.e.a.<clinit>():void");
        }
    }

    static {
        e eVar = new e();
        f4430k = eVar;
        eVar.f();
    }

    public static /* synthetic */ void a(e eVar, i iVar) {
        if (iVar != null) {
            eVar.f4433i = iVar;
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
        int i4 = this.f4432h;
        if (i4 != 0) {
            i3 = 0 + CodedOutputStream.e(1, i4);
        }
        if (this.f4433i != null) {
            i3 += CodedOutputStream.b(2, (o) i());
        }
        if (!this.f4434j.isEmpty()) {
            i3 += CodedOutputStream.b(3, this.f4434j);
        }
        this.f4950g = i3;
        return i3;
    }

    public i i() {
        i iVar = this.f4433i;
        return iVar == null ? i.f4472l : iVar;
    }

    /* compiled from: AesCtrHmacStreamingKey */
    public static final class b extends k.b<e, b> implements h {
        public b() {
            super(e.f4430k);
        }

        public /* synthetic */ b(a aVar) {
            super(e.f4430k);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4432h;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        if (this.f4433i != null) {
            codedOutputStream.a(2, (o) i());
        }
        if (!this.f4434j.isEmpty()) {
            codedOutputStream.a(3, this.f4434j);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4430k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                e eVar = (e) obj2;
                this.f4432h = kVar.a(this.f4432h != 0, this.f4432h, eVar.f4432h != 0, eVar.f4432h);
                this.f4433i = (i) kVar.a(this.f4433i, eVar.f4433i);
                boolean z2 = this.f4434j != f.f4932f;
                f fVar = this.f4434j;
                if (eVar.f4434j != f.f4932f) {
                    z = true;
                }
                this.f4434j = kVar.a(z2, fVar, z, eVar.f4434j);
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4432h = gVar.d();
                            } else if (i2 == 18) {
                                i.b bVar = this.f4433i != null ? (i.b) this.f4433i.e() : null;
                                i iVar2 = (i) gVar.a(i.f4472l.g(), iVar);
                                this.f4433i = iVar2;
                                if (bVar != null) {
                                    bVar.a(iVar2);
                                    this.f4433i = (i) bVar.j();
                                }
                            } else if (i2 == 26) {
                                this.f4434j = gVar.a();
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
                return new e();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4431l == null) {
                    synchronized (e.class) {
                        if (f4431l == null) {
                            f4431l = new k.c(f4430k);
                        }
                    }
                }
                return f4431l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4430k;
    }
}
