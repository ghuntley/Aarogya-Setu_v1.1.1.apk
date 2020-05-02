package i.c.d.q.n;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.g;
import i.c.f.i;
import i.c.f.k;
import i.c.f.q;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final class l extends k<l, a> implements m {

    /* renamed from: l  reason: collision with root package name */
    public static final l f4840l;

    /* renamed from: m  reason: collision with root package name */
    public static volatile q<l> f4841m;

    /* renamed from: h  reason: collision with root package name */
    public int f4842h;

    /* renamed from: i  reason: collision with root package name */
    public int f4843i;

    /* renamed from: j  reason: collision with root package name */
    public long f4844j;

    /* renamed from: k  reason: collision with root package name */
    public String f4845k = "";

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static final class a extends k.b<l, a> implements m {
        public /* synthetic */ a(a aVar) {
            super(l.f4840l);
        }
    }

    static {
        l lVar = new l();
        f4840l = lVar;
        lVar.f();
    }

    public void a(CodedOutputStream codedOutputStream) {
        if ((this.f4842h & 1) == 1) {
            codedOutputStream.a(1, this.f4843i);
        }
        if ((this.f4842h & 2) == 2) {
            codedOutputStream.a(2, this.f4844j);
        }
        if ((this.f4842h & 4) == 4) {
            codedOutputStream.a(3, this.f4845k);
        }
        this.f4949f.a(codedOutputStream);
    }

    public int c() {
        int i2 = this.f4950g;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f4842h & 1) == 1) {
            int i4 = this.f4843i;
            i3 = 0 + CodedOutputStream.c(1) + (i4 >= 0 ? CodedOutputStream.d(i4) : 10);
        }
        if ((this.f4842h & 2) == 2) {
            i3 += CodedOutputStream.c(2, this.f4844j);
        }
        if ((this.f4842h & 4) == 4) {
            i3 += CodedOutputStream.b(3, this.f4845k);
        }
        int a2 = this.f4949f.a() + i3;
        this.f4950g = a2;
        return a2;
    }

    public final Object a(k.j jVar, Object obj, Object obj2) {
        boolean z = false;
        switch (jVar.ordinal()) {
            case 0:
                return f4840l;
            case 1:
                k.C0142k kVar = (k.C0142k) obj;
                l lVar = (l) obj2;
                this.f4843i = kVar.a((this.f4842h & 1) == 1, this.f4843i, (lVar.f4842h & 1) == 1, lVar.f4843i);
                this.f4844j = kVar.a((this.f4842h & 2) == 2, this.f4844j, (lVar.f4842h & 2) == 2, lVar.f4844j);
                boolean z2 = (this.f4842h & 4) == 4;
                String str = this.f4845k;
                if ((lVar.f4842h & 4) == 4) {
                    z = true;
                }
                this.f4845k = kVar.a(z2, str, z, lVar.f4845k);
                if (kVar == k.i.a) {
                    this.f4842h |= lVar.f4842h;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                i iVar = (i) obj2;
                while (!z) {
                    try {
                        int i2 = gVar.i();
                        if (i2 != 0) {
                            if (i2 == 8) {
                                this.f4842h |= 1;
                                this.f4843i = gVar.d();
                            } else if (i2 == 17) {
                                this.f4842h |= 2;
                                this.f4844j = gVar.b();
                            } else if (i2 == 26) {
                                String g2 = gVar.g();
                                this.f4842h |= 4;
                                this.f4845k = g2;
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
                return new l();
            case 5:
                return new a((a) null);
            case 6:
                break;
            case 7:
                if (f4841m == null) {
                    synchronized (l.class) {
                        if (f4841m == null) {
                            f4841m = new k.c(f4840l);
                        }
                    }
                }
                return f4841m;
            default:
                throw new UnsupportedOperationException();
        }
        return f4840l;
    }
}
