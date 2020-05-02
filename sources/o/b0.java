package o;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import o.o0.e;
import p.g;
import p.i;

/* compiled from: MultipartBody */
public final class b0 extends i0 {
    public static final a0 e = a0.a("multipart/mixed");

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f5253f = a0.a("multipart/form-data");

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f5254g = {58, 32};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f5255h = {13, 10};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f5256i = {45, 45};
    public final i a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f5257b;
    public final List<b> c;
    public long d = -1;

    /* compiled from: MultipartBody */
    public static final class a {
        public final i a;

        /* renamed from: b  reason: collision with root package name */
        public a0 f5258b = b0.e;
        public final List<b> c = new ArrayList();

        public a() {
            String uuid = UUID.randomUUID().toString();
            this.a = i.d(uuid);
        }
    }

    /* compiled from: MultipartBody */
    public static final class b {
        @Nullable
        public final x a;

        /* renamed from: b  reason: collision with root package name */
        public final i0 f5259b;

        public b(@Nullable x xVar, i0 i0Var) {
            this.a = xVar;
            this.f5259b = i0Var;
        }
    }

    static {
        a0.a("multipart/alternative");
        a0.a("multipart/digest");
        a0.a("multipart/parallel");
    }

    public b0(i iVar, a0 a0Var, List<b> list) {
        this.a = iVar;
        this.f5257b = a0.a(a0Var + "; boundary=" + iVar.m());
        this.c = e.a(list);
    }

    public long a() {
        long j2 = this.d;
        if (j2 != -1) {
            return j2;
        }
        long a2 = a((g) null, true);
        this.d = a2;
        return a2;
    }

    public a0 b() {
        return this.f5257b;
    }

    public void a(g gVar) {
        a(gVar, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: p.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: p.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: p.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: p.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: p.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(@javax.annotation.Nullable p.g r13, boolean r14) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            p.f r13 = new p.f
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<o.b0$b> r1 = r12.c
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x0014:
            if (r5 >= r1) goto L_0x00a4
            java.util.List<o.b0$b> r6 = r12.c
            java.lang.Object r6 = r6.get(r5)
            o.b0$b r6 = (o.b0.b) r6
            o.x r7 = r6.a
            o.i0 r6 = r6.f5259b
            byte[] r8 = f5256i
            r13.write(r8)
            p.i r8 = r12.a
            r13.a((p.i) r8)
            byte[] r8 = f5255h
            r13.write(r8)
            if (r7 == 0) goto L_0x0058
            int r8 = r7.b()
            r9 = 0
        L_0x0038:
            if (r9 >= r8) goto L_0x0058
            java.lang.String r10 = r7.a((int) r9)
            p.g r10 = r13.a((java.lang.String) r10)
            byte[] r11 = f5254g
            p.g r10 = r10.write(r11)
            java.lang.String r11 = r7.b((int) r9)
            p.g r10 = r10.a((java.lang.String) r11)
            byte[] r11 = f5255h
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0038
        L_0x0058:
            o.a0 r7 = r6.b()
            if (r7 == 0) goto L_0x006f
            java.lang.String r8 = "Content-Type: "
            p.g r8 = r13.a((java.lang.String) r8)
            java.lang.String r7 = r7.a
            p.g r7 = r8.a((java.lang.String) r7)
            byte[] r8 = f5255h
            r7.write(r8)
        L_0x006f:
            long r7 = r6.a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0089
            java.lang.String r9 = "Content-Length: "
            p.g r9 = r13.a((java.lang.String) r9)
            p.g r9 = r9.h(r7)
            byte[] r10 = f5255h
            r9.write(r10)
            goto L_0x008f
        L_0x0089:
            if (r14 == 0) goto L_0x008f
            r0.h()
            return r9
        L_0x008f:
            byte[] r9 = f5255h
            r13.write(r9)
            if (r14 == 0) goto L_0x0098
            long r3 = r3 + r7
            goto L_0x009b
        L_0x0098:
            r6.a(r13)
        L_0x009b:
            byte[] r6 = f5255h
            r13.write(r6)
            int r5 = r5 + 1
            goto L_0x0014
        L_0x00a4:
            byte[] r1 = f5256i
            r13.write(r1)
            p.i r1 = r12.a
            r13.a((p.i) r1)
            byte[] r1 = f5256i
            r13.write(r1)
            byte[] r1 = f5255h
            r13.write(r1)
            if (r14 == 0) goto L_0x00c0
            long r13 = r0.f5646f
            long r3 = r3 + r13
            r0.h()
        L_0x00c0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.b0.a(p.g, boolean):long");
    }
}
