package o.o0.j;

import com.crashlytics.android.core.CodedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.o0.j.n;
import p.a0;
import p.f;
import p.h;
import p.i;
import p.r;

/* compiled from: Hpack */
public final class c {
    public static final b[] a = {new b(b.f5489i, ""), new b(b.f5486f, "GET"), new b(b.f5486f, "POST"), new b(b.f5487g, "/"), new b(b.f5487g, "/index.html"), new b(b.f5488h, "http"), new b(b.f5488h, "https"), new b(b.e, "200"), new b(b.e, "204"), new b(b.e, "206"), new b(b.e, "304"), new b(b.e, "400"), new b(b.e, "404"), new b(b.e, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};

    /* renamed from: b  reason: collision with root package name */
    public static final Map<i, Integer> f5491b;

    static {
        int i2 = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a.length);
        while (true) {
            b[] bVarArr = a;
            if (i2 < bVarArr.length) {
                if (!linkedHashMap.containsKey(bVarArr[i2].a)) {
                    linkedHashMap.put(a[i2].a, Integer.valueOf(i2));
                }
                i2++;
            } else {
                f5491b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static i a(i iVar) {
        int h2 = iVar.h();
        int i2 = 0;
        while (i2 < h2) {
            byte a2 = iVar.a(i2);
            if (a2 < 65 || a2 > 90) {
                i2++;
            } else {
                StringBuilder a3 = i.a.a.a.a.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                a3.append(iVar.m());
                throw new IOException(a3.toString());
            }
        }
        return iVar;
    }

    /* compiled from: Hpack */
    public static final class a {
        public final List<b> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final h f5492b;
        public final int c;
        public int d;
        public b[] e = new b[8];

        /* renamed from: f  reason: collision with root package name */
        public int f5493f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f5494g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f5495h = 0;

        public a(int i2, a0 a0Var) {
            this.c = i2;
            this.d = i2;
            this.f5492b = r.a(a0Var);
        }

        public final void a() {
            Arrays.fill(this.e, (Object) null);
            this.f5493f = this.e.length - 1;
            this.f5494g = 0;
            this.f5495h = 0;
        }

        public final int b(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    if (length < this.f5493f || i2 <= 0) {
                        b[] bVarArr = this.e;
                        int i4 = this.f5493f;
                        System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i3, this.f5494g);
                        this.f5493f += i3;
                    } else {
                        b[] bVarArr2 = this.e;
                        i2 -= bVarArr2[length].c;
                        this.f5495h -= bVarArr2[length].c;
                        this.f5494g--;
                        i3++;
                    }
                }
                b[] bVarArr3 = this.e;
                int i42 = this.f5493f;
                System.arraycopy(bVarArr3, i42 + 1, bVarArr3, i42 + 1 + i3, this.f5494g);
                this.f5493f += i3;
            }
            return i3;
        }

        public final i c(int i2) {
            if (i2 >= 0 && i2 <= c.a.length + -1) {
                return c.a[i2].a;
            }
            int a2 = a(i2 - c.a.length);
            if (a2 >= 0) {
                b[] bVarArr = this.e;
                if (a2 < bVarArr.length) {
                    return bVarArr[a2].a;
                }
            }
            StringBuilder a3 = i.a.a.a.a.a("Header index too large ");
            a3.append(i2 + 1);
            throw new IOException(a3.toString());
        }

        public final int a(int i2) {
            return this.f5493f + 1 + i2;
        }

        public final void a(int i2, b bVar) {
            this.a.add(bVar);
            int i3 = bVar.c;
            if (i2 != -1) {
                i3 -= this.e[(this.f5493f + 1) + i2].c;
            }
            int i4 = this.d;
            if (i3 > i4) {
                a();
                return;
            }
            int b2 = b((this.f5495h + i3) - i4);
            if (i2 == -1) {
                int i5 = this.f5494g + 1;
                b[] bVarArr = this.e;
                if (i5 > bVarArr.length) {
                    b[] bVarArr2 = new b[(bVarArr.length * 2)];
                    System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                    this.f5493f = this.e.length - 1;
                    this.e = bVarArr2;
                }
                int i6 = this.f5493f;
                this.f5493f = i6 - 1;
                this.e[i6] = bVar;
                this.f5494g++;
            } else {
                this.e[this.f5493f + 1 + i2 + b2 + i2] = bVar;
            }
            this.f5495h += i3;
        }

        public i b() {
            byte readByte = this.f5492b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int a2 = a((int) readByte, 127);
            if (!z) {
                return this.f5492b.b((long) a2);
            }
            n nVar = n.d;
            byte[] i2 = this.f5492b.i((long) a2);
            if (nVar != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                n.a aVar = nVar.a;
                byte b2 = 0;
                int i3 = 0;
                for (byte b3 : i2) {
                    b2 = (b2 << 8) | (b3 & 255);
                    i3 += 8;
                    while (i3 >= 8) {
                        int i4 = i3 - 8;
                        aVar = aVar.a[(b2 >>> i4) & 255];
                        if (aVar.a == null) {
                            byteArrayOutputStream.write(aVar.f5591b);
                            i3 -= aVar.c;
                            aVar = nVar.a;
                        } else {
                            i3 = i4;
                        }
                    }
                }
                while (i3 > 0) {
                    n.a aVar2 = aVar.a[(b2 << (8 - i3)) & 255];
                    if (aVar2.a != null || aVar2.c > i3) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.f5591b);
                    i3 -= aVar2.c;
                    aVar = nVar.a;
                }
                return i.a(byteArrayOutputStream.toByteArray());
            }
            throw null;
        }

        public int a(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                byte readByte = this.f5492b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i3 + (readByte << i5);
                }
                i3 += (readByte & Byte.MAX_VALUE) << i5;
                i5 += 7;
            }
        }
    }

    /* compiled from: Hpack */
    public static final class b {
        public final f a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5496b = true;
        public int c = Integer.MAX_VALUE;
        public boolean d;
        public int e = CodedOutputStream.DEFAULT_BUFFER_SIZE;

        /* renamed from: f  reason: collision with root package name */
        public b[] f5497f = new b[8];

        /* renamed from: g  reason: collision with root package name */
        public int f5498g = 7;

        /* renamed from: h  reason: collision with root package name */
        public int f5499h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f5500i = 0;

        public b(f fVar) {
            this.a = fVar;
        }

        public final void a() {
            Arrays.fill(this.f5497f, (Object) null);
            this.f5498g = this.f5497f.length - 1;
            this.f5499h = 0;
            this.f5500i = 0;
        }

        public final int a(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f5497f.length;
                while (true) {
                    length--;
                    if (length < this.f5498g || i2 <= 0) {
                        b[] bVarArr = this.f5497f;
                        int i4 = this.f5498g;
                        System.arraycopy(bVarArr, i4 + 1, bVarArr, i4 + 1 + i3, this.f5499h);
                        b[] bVarArr2 = this.f5497f;
                        int i5 = this.f5498g;
                        Arrays.fill(bVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.f5498g += i3;
                    } else {
                        b[] bVarArr3 = this.f5497f;
                        i2 -= bVarArr3[length].c;
                        this.f5500i -= bVarArr3[length].c;
                        this.f5499h--;
                        i3++;
                    }
                }
                b[] bVarArr4 = this.f5497f;
                int i42 = this.f5498g;
                System.arraycopy(bVarArr4, i42 + 1, bVarArr4, i42 + 1 + i3, this.f5499h);
                b[] bVarArr22 = this.f5497f;
                int i52 = this.f5498g;
                Arrays.fill(bVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.f5498g += i3;
            }
            return i3;
        }

        public final void a(b bVar) {
            int i2 = bVar.c;
            int i3 = this.e;
            if (i2 > i3) {
                a();
                return;
            }
            a((this.f5500i + i2) - i3);
            int i4 = this.f5499h + 1;
            b[] bVarArr = this.f5497f;
            if (i4 > bVarArr.length) {
                b[] bVarArr2 = new b[(bVarArr.length * 2)];
                System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
                this.f5498g = this.f5497f.length - 1;
                this.f5497f = bVarArr2;
            }
            int i5 = this.f5498g;
            this.f5498g = i5 - 1;
            this.f5497f[i5] = bVar;
            this.f5499h++;
            this.f5500i += i2;
        }

        public void a(List<b> list) {
            int i2;
            int i3;
            if (this.d) {
                int i4 = this.c;
                if (i4 < this.e) {
                    a(i4, 31, 32);
                }
                this.d = false;
                this.c = Integer.MAX_VALUE;
                a(this.e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                b bVar = list.get(i5);
                i j2 = bVar.a.j();
                i iVar = bVar.f5490b;
                Integer num = c.f5491b.get(j2);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (Objects.equals(c.a[i3 - 1].f5490b, iVar)) {
                            i2 = i3;
                        } else if (Objects.equals(c.a[i3].f5490b, iVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i6 = this.f5498g + 1;
                    int length = this.f5497f.length;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f5497f[i6].a, j2)) {
                            if (Objects.equals(this.f5497f[i6].f5490b, iVar)) {
                                i3 = c.a.length + (i6 - this.f5498g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i6 - this.f5498g) + c.a.length;
                            }
                        }
                        i6++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else if (i2 == -1) {
                    this.a.writeByte(64);
                    a(j2);
                    a(iVar);
                    a(bVar);
                } else {
                    i iVar2 = b.d;
                    if (j2 == null) {
                        throw null;
                    } else if (!j2.a(0, iVar2, 0, iVar2.h()) || b.f5489i.equals(j2)) {
                        a(i2, 63, 64);
                        a(iVar);
                        a(bVar);
                    } else {
                        a(i2, 15, 0);
                        a(iVar);
                    }
                }
            }
        }

        public void a(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.a.writeByte(i2 | i4);
                return;
            }
            this.a.writeByte(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.a.writeByte(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.a.writeByte(i5);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(p.i r13) {
            /*
                r12 = this;
                boolean r0 = r12.f5496b
                r1 = 127(0x7f, float:1.78E-43)
                r2 = 0
                if (r0 == 0) goto L_0x0083
                o.o0.j.n r0 = o.o0.j.n.d
                r3 = 0
                if (r0 == 0) goto L_0x0082
                r4 = 0
                r6 = r4
                r0 = 0
            L_0x0010:
                int r8 = r13.h()
                r9 = 255(0xff, float:3.57E-43)
                if (r0 >= r8) goto L_0x0026
                byte r8 = r13.a((int) r0)
                r8 = r8 & r9
                byte[] r9 = o.o0.j.n.c
                byte r8 = r9[r8]
                long r8 = (long) r8
                long r6 = r6 + r8
                int r0 = r0 + 1
                goto L_0x0010
            L_0x0026:
                r10 = 7
                long r6 = r6 + r10
                r0 = 3
                long r6 = r6 >> r0
                int r0 = (int) r6
                int r6 = r13.h()
                if (r0 >= r6) goto L_0x0083
                p.f r0 = new p.f
                r0.<init>()
                o.o0.j.n r6 = o.o0.j.n.d
                if (r6 == 0) goto L_0x0081
                r3 = 0
            L_0x003c:
                int r6 = r13.h()
                r7 = 8
                if (r2 >= r6) goto L_0x0063
                byte r6 = r13.a((int) r2)
                r6 = r6 & r9
                int[] r8 = o.o0.j.n.f5590b
                r8 = r8[r6]
                byte[] r10 = o.o0.j.n.c
                byte r6 = r10[r6]
                long r4 = r4 << r6
                long r10 = (long) r8
                long r4 = r4 | r10
                int r3 = r3 + r6
            L_0x0055:
                if (r3 < r7) goto L_0x0060
                int r3 = r3 + -8
                long r10 = r4 >> r3
                int r6 = (int) r10
                r0.writeByte((int) r6)
                goto L_0x0055
            L_0x0060:
                int r2 = r2 + 1
                goto L_0x003c
            L_0x0063:
                if (r3 <= 0) goto L_0x006f
                int r7 = r7 - r3
                long r4 = r4 << r7
                int r13 = r9 >>> r3
                long r2 = (long) r13
                long r2 = r2 | r4
                int r13 = (int) r2
                r0.writeByte((int) r13)
            L_0x006f:
                p.i r13 = r0.q()
                byte[] r0 = r13.e
                int r0 = r0.length
                r2 = 128(0x80, float:1.794E-43)
                r12.a(r0, r1, r2)
                p.f r0 = r12.a
                r0.a((p.i) r13)
                goto L_0x008f
            L_0x0081:
                throw r3
            L_0x0082:
                throw r3
            L_0x0083:
                int r0 = r13.h()
                r12.a(r0, r1, r2)
                p.f r0 = r12.a
                r0.a((p.i) r13)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.o0.j.c.b.a(p.i):void");
        }
    }
}
