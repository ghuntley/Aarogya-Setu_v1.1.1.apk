package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import com.google.android.gms.internal.measurement.zzfo;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.i3;
import i.c.a.b.g.g.w3;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class j5<T> implements t5<T> {
    public final f5 a;

    /* renamed from: b  reason: collision with root package name */
    public final g6<?, ?> f3325b;
    public final boolean c;
    public final k3<?> d;

    public j5(g6<?, ?> g6Var, k3<?> k3Var, f5 f5Var) {
        this.f3325b = g6Var;
        if (((m3) k3Var) != null) {
            this.c = f5Var instanceof w3.d;
            this.d = k3Var;
            this.a = f5Var;
            return;
        }
        throw null;
    }

    public final T a() {
        return ((w3.b) this.a.b()).j();
    }

    public final void b(T t, T t2) {
        u5.a(this.f3325b, t, t2);
        if (this.c) {
            u5.a(this.d, t, t2);
        }
    }

    public final int c(T t) {
        if (((h6) this.f3325b) != null) {
            i6 i6Var = ((w3) t).zzb;
            int i2 = i6Var.d;
            if (i2 == -1) {
                i2 = 0;
                for (int i3 = 0; i3 < i6Var.a; i3++) {
                    int c2 = zzen.c(2, i6Var.f3318b[i3] >>> 3);
                    i2 += zzen.a(3, (u2) i6Var.c[i3]) + c2 + (zzen.f(1) << 1);
                }
                i6Var.d = i2;
            }
            int i4 = i2 + 0;
            if (!this.c) {
                return i4;
            }
            if (((m3) this.d) != null) {
                o3<w3.c> o3Var = ((w3.d) t).zzc;
                int i5 = 0;
                for (int i6 = 0; i6 < o3Var.a.b(); i6++) {
                    i5 += o3.c(o3Var.a.a(i6));
                }
                for (Map.Entry<T, Object> c3 : o3Var.a.c()) {
                    i5 += o3.c(c3);
                }
                return i4 + i5;
            }
            throw null;
        }
        throw null;
    }

    public final boolean d(T t) {
        if (((m3) this.d) != null) {
            return ((w3.d) t).zzc.c();
        }
        throw null;
    }

    public final boolean a(T t, T t2) {
        g6<?, ?> g6Var = this.f3325b;
        if (((h6) g6Var) != null) {
            i6 i6Var = ((w3) t).zzb;
            if (((h6) g6Var) == null) {
                throw null;
            } else if (!i6Var.equals(((w3) t2).zzb)) {
                return false;
            } else {
                if (!this.c) {
                    return true;
                }
                k3<?> k3Var = this.d;
                if (((m3) k3Var) != null) {
                    o3<w3.c> o3Var = ((w3.d) t).zzc;
                    if (((m3) k3Var) != null) {
                        return o3Var.equals(((w3.d) t2).zzc);
                    }
                    throw null;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }

    public final void b(T t) {
        if (((h6) this.f3325b) != null) {
            ((w3) t).zzb.e = false;
            if (((m3) this.d) != null) {
                ((w3.d) t).zzc.a();
                return;
            }
            throw null;
        }
        throw null;
    }

    public final int a(T t) {
        if (((h6) this.f3325b) != null) {
            int hashCode = ((w3) t).zzb.hashCode();
            if (!this.c) {
                return hashCode;
            }
            if (((m3) this.d) != null) {
                return (hashCode * 53) + ((w3.d) t).zzc.hashCode();
            }
            throw null;
        }
        throw null;
    }

    public final void a(T t, b7 b7Var) {
        if (((m3) this.d) != null) {
            Iterator<Map.Entry<w3.c, Object>> b2 = ((w3.d) t).zzc.b();
            while (b2.hasNext()) {
                Map.Entry next = b2.next();
                q3 q3Var = (q3) next.getKey();
                if (q3Var.c() != y6.MESSAGE || q3Var.d() || q3Var.e()) {
                    throw new IllegalStateException("Found invalid MessageSet item.");
                } else if (next instanceof h4) {
                    ((h3) b7Var).a(q3Var.a(), (Object) ((h4) next).e.getValue().b());
                } else {
                    ((h3) b7Var).a(q3Var.a(), next.getValue());
                }
            }
            if (((h6) this.f3325b) != null) {
                i6 i6Var = ((w3) t).zzb;
                if (i6Var != null) {
                    h3 h3Var = (h3) b7Var;
                    if (h3Var != null) {
                        for (int i2 = 0; i2 < i6Var.a; i2++) {
                            h3Var.a(i6Var.f3318b[i2] >>> 3, i6Var.c[i2]);
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void a(T t, byte[] bArr, int i2, int i3, t2 t2Var) {
        w3 w3Var = (w3) t;
        i6 i6Var = w3Var.zzb;
        if (i6Var == i6.f3317f) {
            i6Var = i6.b();
            w3Var.zzb = i6Var;
        }
        ((w3.d) t).a();
        w3.f fVar = null;
        while (i2 < i3) {
            int a2 = q.a(bArr, i2, t2Var);
            int i4 = t2Var.a;
            if (i4 == 11) {
                int i5 = 0;
                u2 u2Var = null;
                while (a2 < i3) {
                    a2 = q.a(bArr, a2, t2Var);
                    int i6 = t2Var.a;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != 2) {
                        if (i7 == 3) {
                            if (fVar != null) {
                                o5 o5Var = o5.c;
                                throw new NoSuchMethodError();
                            } else if (i8 == 2) {
                                a2 = q.e(bArr, a2, t2Var);
                                u2Var = (u2) t2Var.c;
                            }
                        }
                    } else if (i8 == 0) {
                        a2 = q.a(bArr, a2, t2Var);
                        i5 = t2Var.a;
                        k3<?> k3Var = this.d;
                        i3 i3Var = t2Var.d;
                        f5 f5Var = this.a;
                        if (((m3) k3Var) != null) {
                            fVar = i3Var.a.get(new i3.a(f5Var, i5));
                        } else {
                            throw null;
                        }
                    }
                    if (i6 == 12) {
                        break;
                    }
                    a2 = q.a(i6, bArr, a2, i3, t2Var);
                }
                if (u2Var != null) {
                    i6Var.a((i5 << 3) | 2, u2Var);
                }
                i2 = a2;
            } else if ((i4 & 7) == 2) {
                k3<?> k3Var2 = this.d;
                i3 i3Var2 = t2Var.d;
                f5 f5Var2 = this.a;
                int i9 = i4 >>> 3;
                if (((m3) k3Var2) != null) {
                    fVar = i3Var2.a.get(new i3.a(f5Var2, i9));
                    if (fVar == null) {
                        i2 = q.a(i4, bArr, a2, i3, i6Var, t2Var);
                    } else {
                        o5 o5Var2 = o5.c;
                        throw new NoSuchMethodError();
                    }
                } else {
                    throw null;
                }
            } else {
                i2 = q.a(i4, bArr, a2, i3, t2Var);
            }
        }
        if (i2 != i3) {
            throw zzfo.e();
        }
    }
}
