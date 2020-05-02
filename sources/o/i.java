package o;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: CacheControl */
public final class i {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5312b;
    public final int c;
    public final int d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5313f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5314g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5315h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5316i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5317j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5318k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5319l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public String f5320m;

    /* compiled from: CacheControl */
    public static final class a {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5321b;
        public int c = -1;
        public int d = -1;
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5322f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5323g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5324h;
    }

    static {
        a aVar = new a();
        aVar.a = true;
        new i(aVar);
        a aVar2 = new a();
        aVar2.f5322f = true;
        int i2 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        aVar2.d = i2;
        new i(aVar2);
    }

    public i(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.a = z;
        this.f5312b = z2;
        this.c = i2;
        this.d = i3;
        this.e = z3;
        this.f5313f = z4;
        this.f5314g = z5;
        this.f5315h = i4;
        this.f5316i = i5;
        this.f5317j = z6;
        this.f5318k = z7;
        this.f5319l = z8;
        this.f5320m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 191 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.i a(o.x r22) {
        /*
            r0 = r22
            int r1 = r22.b()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0150
            java.lang.String r2 = r0.a((int) r6)
            java.lang.String r4 = r0.b((int) r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0149
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x0149
            java.lang.String r3 = "=,;"
            int r3 = o.o0.h.e.a((java.lang.String) r4, (int) r2, (java.lang.String) r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x00a9
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x00a9
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0079
            goto L_0x00a9
        L_0x0066:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x007c
            char r0 = r4.charAt(r3)
            r5 = 32
            if (r0 == r5) goto L_0x0079
            r5 = 9
            if (r0 == r5) goto L_0x0079
            goto L_0x007c
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0066
        L_0x007c:
            int r0 = r4.length()
            if (r3 >= r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 34
            if (r0 != r5) goto L_0x0099
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = o.o0.h.e.a((java.lang.String) r4, (int) r3, (java.lang.String) r0)
            java.lang.String r3 = r4.substring(r3, r0)
            r5 = 1
            int r0 = r0 + r5
            goto L_0x00ae
        L_0x0099:
            r5 = 1
            java.lang.String r0 = ",;"
            int r0 = o.o0.h.e.a((java.lang.String) r4, (int) r3, (java.lang.String) r0)
            java.lang.String r3 = r4.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00ae
        L_0x00a9:
            r5 = 1
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00ae:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ba
            r5 = -1
            r9 = 1
            goto L_0x0144
        L_0x00ba:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c6
            r5 = -1
            r10 = 1
            goto L_0x0144
        L_0x00c6:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d5
            r5 = -1
            int r11 = o.o0.h.e.a(r3, r5)
            goto L_0x0144
        L_0x00d5:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e3
            r5 = -1
            int r12 = o.o0.h.e.a(r3, r5)
            goto L_0x0144
        L_0x00e3:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00ee
            r5 = -1
            r13 = 1
            goto L_0x0144
        L_0x00ee:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f9
            r5 = -1
            r14 = 1
            goto L_0x0144
        L_0x00f9:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0104
            r5 = -1
            r15 = 1
            goto L_0x0144
        L_0x0104:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0115
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = o.o0.h.e.a(r3, r2)
            r5 = -1
            goto L_0x0144
        L_0x0115:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0123
            r5 = -1
            int r17 = o.o0.h.e.a(r3, r5)
            goto L_0x0144
        L_0x0123:
            r5 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x012f
            r18 = 1
            goto L_0x0144
        L_0x012f:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x013a
            r19 = 1
            goto L_0x0144
        L_0x013a:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0144
            r20 = 1
        L_0x0144:
            r2 = r0
            r0 = r22
            goto L_0x003b
        L_0x0149:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0150:
            if (r7 != 0) goto L_0x0155
            r21 = 0
            goto L_0x0157
        L_0x0155:
            r21 = r8
        L_0x0157:
            o.i r0 = new o.i
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i.a(o.x):o.i");
    }

    public String toString() {
        String str = this.f5320m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.f5312b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.d != -1) {
                sb.append("s-maxage=");
                sb.append(this.d);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f5313f) {
                sb.append("public, ");
            }
            if (this.f5314g) {
                sb.append("must-revalidate, ");
            }
            if (this.f5315h != -1) {
                sb.append("max-stale=");
                sb.append(this.f5315h);
                sb.append(", ");
            }
            if (this.f5316i != -1) {
                sb.append("min-fresh=");
                sb.append(this.f5316i);
                sb.append(", ");
            }
            if (this.f5317j) {
                sb.append("only-if-cached, ");
            }
            if (this.f5318k) {
                sb.append("no-transform, ");
            }
            if (this.f5319l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f5320m = str;
        }
        return str;
    }

    public i(a aVar) {
        this.a = aVar.a;
        this.f5312b = aVar.f5321b;
        this.c = aVar.c;
        this.d = -1;
        this.e = false;
        this.f5313f = false;
        this.f5314g = false;
        this.f5315h = aVar.d;
        this.f5316i = aVar.e;
        this.f5317j = aVar.f5322f;
        this.f5318k = aVar.f5323g;
        this.f5319l = aVar.f5324h;
    }
}
