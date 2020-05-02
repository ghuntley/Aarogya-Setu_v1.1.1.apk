package o.p0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import o.a0;
import o.f0;
import o.i0;
import o.j0;
import o.l0;
import o.o0.g.d;
import o.o0.h.e;
import o.o0.k.f;
import o.x;
import o.z;
import p.h;

/* compiled from: HttpLoggingInterceptor */
public final class a implements z {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public final b f5612b;
    public volatile C0155a c = C0155a.NONE;

    /* renamed from: o.p0.a$a  reason: collision with other inner class name */
    /* compiled from: HttpLoggingInterceptor */
    public enum C0155a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor */
    public interface b {
        public static final b a = new C0156a();

        /* renamed from: o.p0.a$b$a  reason: collision with other inner class name */
        /* compiled from: HttpLoggingInterceptor */
        public class C0156a implements b {
            public void a(String str) {
                f.a.a(4, str, (Throwable) null);
            }
        }
    }

    public a() {
        b bVar = b.a;
        this.f5612b = bVar;
    }

    public j0 a(z.a aVar) {
        String str;
        String str2;
        String str3;
        long j2;
        char c2;
        String str4;
        String str5;
        String str6;
        C0155a aVar2 = this.c;
        f0 f0Var = ((o.o0.h.f) aVar).e;
        if (aVar2 == C0155a.NONE) {
            return ((o.o0.h.f) aVar).a(f0Var);
        }
        boolean z = true;
        boolean z2 = aVar2 == C0155a.BODY;
        boolean z3 = z2 || aVar2 == C0155a.HEADERS;
        i0 i0Var = f0Var.d;
        if (i0Var == null) {
            z = false;
        }
        o.o0.h.f fVar = (o.o0.h.f) aVar;
        d dVar = fVar.c;
        o.o0.g.f a = dVar != null ? dVar.a() : null;
        StringBuilder a2 = i.a.a.a.a.a("--> ");
        a2.append(f0Var.f5307b);
        a2.append(' ');
        a2.append(f0Var.a);
        if (a != null) {
            StringBuilder a3 = i.a.a.a.a.a(" ");
            a3.append(a.f5413g);
            str = a3.toString();
        } else {
            str = "";
        }
        a2.append(str);
        String sb = a2.toString();
        if (!z3 && z) {
            StringBuilder a4 = i.a.a.a.a.a(sb, " (");
            a4.append(i0Var.a());
            a4.append("-byte body)");
            sb = a4.toString();
        }
        ((b.C0156a) this.f5612b).a(sb);
        String str7 = ": ";
        if (z3) {
            if (z) {
                if (i0Var.b() != null) {
                    b bVar = this.f5612b;
                    StringBuilder a5 = i.a.a.a.a.a("Content-Type: ");
                    a5.append(i0Var.b());
                    ((b.C0156a) bVar).a(a5.toString());
                }
                if (i0Var.a() != -1) {
                    b bVar2 = this.f5612b;
                    StringBuilder a6 = i.a.a.a.a.a("Content-Length: ");
                    a6.append(i0Var.a());
                    ((b.C0156a) bVar2).a(a6.toString());
                }
            }
            x xVar = f0Var.c;
            int b2 = xVar.b();
            int i2 = 0;
            while (i2 < b2) {
                String a7 = xVar.a(i2);
                int i3 = b2;
                if ("Content-Type".equalsIgnoreCase(a7) || "Content-Length".equalsIgnoreCase(a7)) {
                    str6 = str7;
                } else {
                    b bVar3 = this.f5612b;
                    StringBuilder a8 = i.a.a.a.a.a(a7, str7);
                    str6 = str7;
                    a8.append(xVar.b(i2));
                    ((b.C0156a) bVar3).a(a8.toString());
                }
                i2++;
                b2 = i3;
                str7 = str6;
            }
            str2 = str7;
            if (!z2 || !z) {
                b bVar4 = this.f5612b;
                StringBuilder a9 = i.a.a.a.a.a("--> END ");
                a9.append(f0Var.f5307b);
                ((b.C0156a) bVar4).a(a9.toString());
            } else if (a(f0Var.c)) {
                ((b.C0156a) this.f5612b).a(i.a.a.a.a.a(i.a.a.a.a.a("--> END "), f0Var.f5307b, " (encoded body omitted)"));
            } else {
                p.f fVar2 = new p.f();
                i0Var.a(fVar2);
                Charset charset = d;
                a0 b3 = i0Var.b();
                if (b3 != null) {
                    charset = b3.a(d);
                }
                ((b.C0156a) this.f5612b).a("");
                if (a(fVar2)) {
                    ((b.C0156a) this.f5612b).a(fVar2.a(charset));
                    b bVar5 = this.f5612b;
                    StringBuilder a10 = i.a.a.a.a.a("--> END ");
                    a10.append(f0Var.f5307b);
                    a10.append(" (");
                    a10.append(i0Var.a());
                    a10.append("-byte body)");
                    ((b.C0156a) bVar5).a(a10.toString());
                } else {
                    b bVar6 = this.f5612b;
                    StringBuilder a11 = i.a.a.a.a.a("--> END ");
                    a11.append(f0Var.f5307b);
                    a11.append(" (binary ");
                    a11.append(i0Var.a());
                    a11.append("-byte body omitted)");
                    ((b.C0156a) bVar6).a(a11.toString());
                }
            }
        } else {
            str2 = str7;
        }
        long nanoTime = System.nanoTime();
        try {
            j0 a12 = fVar.a(f0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            l0 l0Var = a12.f5330k;
            long a13 = l0Var.a();
            if (a13 != -1) {
                str3 = a13 + "-byte";
            } else {
                str3 = "unknown-length";
            }
            b bVar7 = this.f5612b;
            StringBuilder a14 = i.a.a.a.a.a("<-- ");
            String str8 = "-byte body)";
            a14.append(a12.f5326g);
            if (a12.f5327h.isEmpty()) {
                str4 = "";
                j2 = a13;
                c2 = ' ';
            } else {
                StringBuilder sb2 = new StringBuilder();
                j2 = a13;
                c2 = ' ';
                sb2.append(' ');
                sb2.append(a12.f5327h);
                str4 = sb2.toString();
            }
            a14.append(str4);
            a14.append(c2);
            a14.append(a12.e.a);
            a14.append(" (");
            a14.append(millis);
            a14.append("ms");
            if (!z3) {
                str5 = i.a.a.a.a.a(", ", str3, " body");
            } else {
                str5 = "";
            }
            a14.append(str5);
            a14.append(')');
            ((b.C0156a) bVar7).a(a14.toString());
            if (z3) {
                x xVar2 = a12.f5329j;
                int b4 = xVar2.b();
                for (int i4 = 0; i4 < b4; i4++) {
                    ((b.C0156a) this.f5612b).a(xVar2.a(i4) + str2 + xVar2.b(i4));
                }
                if (!z2 || !e.b(a12)) {
                    ((b.C0156a) this.f5612b).a("<-- END HTTP");
                } else if (a(a12.f5329j)) {
                    ((b.C0156a) this.f5612b).a("<-- END HTTP (encoded body omitted)");
                } else {
                    h h2 = l0Var.h();
                    h2.d(RecyclerView.FOREVER_NS);
                    p.f b5 = h2.b();
                    Charset charset2 = d;
                    a0 f2 = l0Var.f();
                    if (f2 != null) {
                        charset2 = f2.a(d);
                    }
                    if (!a(b5)) {
                        ((b.C0156a) this.f5612b).a("");
                        b bVar8 = this.f5612b;
                        StringBuilder a15 = i.a.a.a.a.a("<-- END HTTP (binary ");
                        a15.append(b5.f5646f);
                        a15.append("-byte body omitted)");
                        ((b.C0156a) bVar8).a(a15.toString());
                        return a12;
                    }
                    if (j2 != 0) {
                        ((b.C0156a) this.f5612b).a("");
                        ((b.C0156a) this.f5612b).a(b5.clone().a(charset2));
                    }
                    b bVar9 = this.f5612b;
                    StringBuilder a16 = i.a.a.a.a.a("<-- END HTTP (");
                    a16.append(b5.f5646f);
                    a16.append(str8);
                    ((b.C0156a) bVar9).a(a16.toString());
                }
            }
            return a12;
        } catch (Exception e) {
            Exception exc = e;
            ((b.C0156a) this.f5612b).a("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    public static boolean a(p.f fVar) {
        try {
            p.f fVar2 = new p.f();
            fVar.a(fVar2, 0, fVar.f5646f < 64 ? fVar.f5646f : 64);
            for (int i2 = 0; i2 < 16; i2++) {
                if (fVar2.l()) {
                    return true;
                }
                int t = fVar2.t();
                if (Character.isISOControl(t) && !Character.isWhitespace(t)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public final boolean a(x xVar) {
        String a = xVar.a("Content-Encoding");
        return a != null && !a.equalsIgnoreCase("identity");
    }
}
