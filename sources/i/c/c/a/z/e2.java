package i.c.c.a.z;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.l;
import i.c.f.o;
import i.c.f.p;
import i.c.f.q;
import i.c.f.r;
import java.io.IOException;

/* compiled from: KeysetInfo */
public final class e2 extends k<e2, b> implements f2 {

    /* renamed from: k  reason: collision with root package name */
    public static final e2 f4441k;

    /* renamed from: l  reason: collision with root package name */
    public static volatile q<e2> f4442l;

    /* renamed from: h  reason: collision with root package name */
    public int f4443h;

    /* renamed from: i  reason: collision with root package name */
    public int f4444i;

    /* renamed from: j  reason: collision with root package name */
    public l.b<c> f4445j = r.f4965g;

    /* compiled from: KeysetInfo */
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
            throw new UnsupportedOperationException("Method not decompiled: i.c.c.a.z.e2.a.<clinit>():void");
        }
    }

    /* compiled from: KeysetInfo */
    public static final class c extends k<c, a> implements d {

        /* renamed from: l  reason: collision with root package name */
        public static final c f4446l;

        /* renamed from: m  reason: collision with root package name */
        public static volatile q<c> f4447m;

        /* renamed from: h  reason: collision with root package name */
        public String f4448h = "";

        /* renamed from: i  reason: collision with root package name */
        public int f4449i;

        /* renamed from: j  reason: collision with root package name */
        public int f4450j;

        /* renamed from: k  reason: collision with root package name */
        public int f4451k;

        static {
            c cVar = new c();
            f4446l = cVar;
            cVar.f();
        }

        public static /* synthetic */ void a(c cVar, y1 y1Var) {
            if (cVar == null) {
                throw null;
            } else if (y1Var != null) {
                cVar.f4449i = y1Var.e;
            } else {
                throw null;
            }
        }

        public int c() {
            int i2 = this.f4950g;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if (!this.f4448h.isEmpty()) {
                i3 = 0 + CodedOutputStream.b(1, this.f4448h);
            }
            int i4 = this.f4449i;
            if (i4 != y1.UNKNOWN_STATUS.e) {
                i3 += CodedOutputStream.d(2, i4);
            }
            int i5 = this.f4450j;
            if (i5 != 0) {
                i3 += CodedOutputStream.e(3, i5);
            }
            int i6 = this.f4451k;
            if (i6 != p2.UNKNOWN_PREFIX.e) {
                i3 += CodedOutputStream.d(4, i6);
            }
            this.f4950g = i3;
            return i3;
        }

        /* compiled from: KeysetInfo */
        public static final class a extends k.b<c, a> implements d {
            public a() {
                super(c.f4446l);
            }

            public /* synthetic */ a(a aVar) {
                super(c.f4446l);
            }
        }

        public static /* synthetic */ void a(c cVar, p2 p2Var) {
            if (cVar == null) {
                throw null;
            } else if (p2Var != null) {
                cVar.f4451k = p2Var.e;
            } else {
                throw null;
            }
        }

        public static /* synthetic */ void a(c cVar, String str) {
            if (str != null) {
                cVar.f4448h = str;
                return;
            }
            throw null;
        }

        public void a(CodedOutputStream codedOutputStream) {
            if (!this.f4448h.isEmpty()) {
                codedOutputStream.a(1, this.f4448h);
            }
            int i2 = this.f4449i;
            if (i2 != y1.UNKNOWN_STATUS.e) {
                codedOutputStream.a(2, i2);
            }
            int i3 = this.f4450j;
            if (i3 != 0) {
                codedOutputStream.c(3, i3);
            }
            int i4 = this.f4451k;
            if (i4 != p2.UNKNOWN_PREFIX.e) {
                codedOutputStream.a(4, i4);
            }
        }

        public final Object a(k.j jVar, Object obj, Object obj2) {
            boolean z = false;
            switch (jVar.ordinal()) {
                case 0:
                    return f4446l;
                case 1:
                    k.C0142k kVar = (k.C0142k) obj;
                    c cVar = (c) obj2;
                    this.f4448h = kVar.a(!this.f4448h.isEmpty(), this.f4448h, !cVar.f4448h.isEmpty(), cVar.f4448h);
                    this.f4449i = kVar.a(this.f4449i != 0, this.f4449i, cVar.f4449i != 0, cVar.f4449i);
                    this.f4450j = kVar.a(this.f4450j != 0, this.f4450j, cVar.f4450j != 0, cVar.f4450j);
                    boolean z2 = this.f4451k != 0;
                    int i2 = this.f4451k;
                    if (cVar.f4451k != 0) {
                        z = true;
                    }
                    this.f4451k = kVar.a(z2, i2, z, cVar.f4451k);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    i iVar = (i) obj2;
                    while (!z) {
                        try {
                            int i3 = gVar.i();
                            if (i3 != 0) {
                                if (i3 == 10) {
                                    this.f4448h = gVar.h();
                                } else if (i3 == 16) {
                                    this.f4449i = gVar.d();
                                } else if (i3 == 24) {
                                    this.f4450j = gVar.d();
                                } else if (i3 == 32) {
                                    this.f4451k = gVar.d();
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
                    return new c();
                case 5:
                    return new a((a) null);
                case 6:
                    break;
                case 7:
                    if (f4447m == null) {
                        synchronized (c.class) {
                            if (f4447m == null) {
                                f4447m = new k.c(f4446l);
                            }
                        }
                    }
                    return f4447m;
                default:
                    throw new UnsupportedOperationException();
            }
            return f4446l;
        }
    }

    /* compiled from: KeysetInfo */
    public interface d extends p {
    }

    static {
        e2 e2Var = new e2();
        f4441k = e2Var;
        e2Var.f();
    }

    public static /* synthetic */ void a(e2 e2Var, c cVar) {
        if (cVar != null) {
            l.b<c> bVar = e2Var.f4445j;
            if (!((i.c.f.c) bVar).e) {
                e2Var.f4445j = k.a(bVar);
            }
            e2Var.f4445j.add(cVar);
            return;
        }
        throw null;
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.f4444i;
        int e = i3 != 0 ? CodedOutputStream.e(1, i3) + 0 : 0;
        for (int i4 = 0; i4 < this.f4445j.size(); i4++) {
            e += CodedOutputStream.b(2, (o) this.f4445j.get(i4));
        }
        this.f4950g = e;
        return e;
    }

    /* compiled from: KeysetInfo */
    public static final class b extends k.b<e2, b> implements f2 {
        public b() {
            super(e2.f4441k);
        }

        public /* synthetic */ b(a aVar) {
            super(e2.f4441k);
        }
    }

    public void a(CodedOutputStream codedOutputStream) {
        int i2 = this.f4444i;
        if (i2 != 0) {
            codedOutputStream.c(1, i2);
        }
        for (int i3 = 0; i3 < this.f4445j.size(); i3++) {
            codedOutputStream.a(2, (o) this.f4445j.get(i3));
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4441k;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                e2 e2Var = (e2) obj2;
                boolean z2 = this.f4444i != 0;
                int i2 = this.f4444i;
                if (e2Var.f4444i != 0) {
                    z = true;
                }
                this.f4444i = kVar.a(z2, i2, z, e2Var.f4444i);
                this.f4445j = kVar.a(this.f4445j, e2Var.f4445j);
                if (kVar == k.i.a) {
                    this.f4443h |= e2Var.f4443h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i3 = gVar.i();
                        if (i3 != 0) {
                            if (i3 == 8) {
                                this.f4444i = gVar.d();
                            } else if (i3 == 18) {
                                if (!((i.c.f.c) this.f4445j).e) {
                                    this.f4445j = k.a(this.f4445j);
                                }
                                this.f4445j.add(gVar.a(c.f4446l.g(), iVar));
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
                ((i.c.f.c) this.f4445j).e = false;
                return null;
            case 4:
                return new e2();
            case 5:
                return new b((a) null);
            case 6:
                break;
            case 7:
                if (f4442l == null) {
                    synchronized (e2.class) {
                        if (f4442l == null) {
                            f4442l = new k.c(f4441k);
                        }
                    }
                }
                return f4442l;
            default:
                throw new UnsupportedOperationException();
        }
        return f4441k;
    }
}
