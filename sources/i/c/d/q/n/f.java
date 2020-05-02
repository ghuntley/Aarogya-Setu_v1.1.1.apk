package i.c.d.q.n;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class f extends k<f, a> implements g {

    /* renamed from: l  reason: collision with root package name */
    public static final f f4821l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<f> f4822m;

    /* renamed from: h  reason: collision with root package name */
    public int f4823h;

    /* renamed from: i  reason: collision with root package name */
    public int f4824i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4825j;

    /* renamed from: k  reason: collision with root package name */
    public long f4826k;

    static {
        f fVar = new f();
        f4821l = fVar;
        fVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if ((this.f4823h & 1) == 1) {
            codedOutputStream.a(1, this.f4824i);
        }
        if ((this.f4823h & 2) == 2) {
            codedOutputStream.a(2, this.f4825j);
        }
        if ((this.f4823h & 4) == 4) {
            codedOutputStream.a(3, this.f4826k);
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f4823h & 1) == 1) {
            int i4 = this.f4824i;
            i3 = 0 + CodedOutputStream.c(1) + (i4 >= 0 ? CodedOutputStream.d(i4) : 10);
        }
        if ((this.f4823h & 2) == 2) {
            i3 += CodedOutputStream.c(2) + 1;
        }
        if ((this.f4823h & 4) == 4) {
            i3 += CodedOutputStream.c(3, this.f4826k);
        }
        int a2 = this.f4949f.a() + i3;
        this.f4950g = a2;
        return a2;
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<f, a> implements g {
        public a() {
            super(f.f4821l);
        }

        public /* synthetic */ a(a aVar) {
            super(f.f4821l);
        }
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        switch (jVar.ordinal()) {
            case 0:
                return f4821l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                f fVar = (f) obj2;
                this.f4824i = kVar.a((this.f4823h & 1) == 1, this.f4824i, (fVar.f4823h & 1) == 1, fVar.f4824i);
                this.f4825j = kVar.a((this.f4823h & 2) == 2, this.f4825j, (fVar.f4823h & 2) == 2, fVar.f4825j);
                this.f4826k = kVar.a((this.f4823h & 4) == 4, this.f4826k, (fVar.f4823h & 4) == 4, fVar.f4826k);
                if (kVar == k.i.a) {
                    this.f4823h |= fVar.f4823h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4823h |= 1;
                                this.f4824i = gVar.d();
                            } else if (i2 == 16) {
                                this.f4823h |= 2;
                                this.f4825j = gVar.e() != 0;
                            } else if (i2 == 25) {
                                this.f4823h |= 4;
                                this.f4826k = gVar.b();
                            } else if (!a(i2, gVar)) {
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
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4822m == null) {
                    synchronized (f.class) {
                        if (f4822m == null) {
                            f4822m = new k.c(f4821l);
                        }
                    }
                }
                return f4822m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4821l;
    }
}
