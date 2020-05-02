package h.r.d;

import androidx.recyclerview.widget.RecyclerView;
import h.h.l.c;
import h.h.l.d;
import h.r.d.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdapterHelper */
public class a implements q.a {
    public c<b> a = new d(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f2083b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public final C0061a d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final q f2084f;

    /* renamed from: g  reason: collision with root package name */
    public int f2085g = 0;

    /* renamed from: h.r.d.a$a  reason: collision with other inner class name */
    /* compiled from: AdapterHelper */
    public interface C0061a {
    }

    /* compiled from: AdapterHelper */
    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2086b;
        public Object c;
        public int d;

        public b(int i2, int i3, int i4, Object obj) {
            this.a = i2;
            this.f2086b = i3;
            this.d = i4;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.a;
            if (i2 != bVar.a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.d - this.f2086b) == 1 && this.d == bVar.f2086b && this.f2086b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f2086b != bVar.f2086b) {
                return false;
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.c)) {
                    return false;
                }
            } else if (bVar.c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.a * 31) + this.f2086b) * 31) + this.d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2086b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(C0061a aVar) {
        this.d = aVar;
        this.e = false;
        this.f2084f = new q(this);
    }

    public void a() {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((RecyclerView.f) this.d).a(this.c.get(i2));
        }
        a((List<b>) this.c);
        this.f2085g = 0;
    }

    public final int b(int i2, int i3) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f2086b;
                int i6 = bVar.d;
                if (i5 >= i6) {
                    int i7 = i6;
                    i6 = i5;
                    i5 = i7;
                }
                if (i2 < i5 || i2 > i6) {
                    int i8 = bVar.f2086b;
                    if (i2 < i8) {
                        if (i3 == 1) {
                            bVar.f2086b = i8 + 1;
                            bVar.d++;
                        } else if (i3 == 2) {
                            bVar.f2086b = i8 - 1;
                            bVar.d--;
                        }
                    }
                } else {
                    int i9 = bVar.f2086b;
                    if (i5 == i9) {
                        if (i3 == 1) {
                            bVar.d++;
                        } else if (i3 == 2) {
                            bVar.d--;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            bVar.f2086b = i9 + 1;
                        } else if (i3 == 2) {
                            bVar.f2086b = i9 - 1;
                        }
                        i2--;
                    }
                }
            } else {
                int i10 = bVar.f2086b;
                if (i10 <= i2) {
                    if (i4 == 1) {
                        i2 -= bVar.d;
                    } else if (i4 == 2) {
                        i2 += bVar.d;
                    }
                } else if (i3 == 1) {
                    bVar.f2086b = i10 + 1;
                } else if (i3 == 2) {
                    bVar.f2086b = i10 - 1;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i11 = bVar2.d;
                if (i11 == bVar2.f2086b || i11 < 0) {
                    this.c.remove(size2);
                    if (!this.e) {
                        bVar2.c = null;
                        this.a.a(bVar2);
                    }
                }
            } else if (bVar2.d <= 0) {
                this.c.remove(size2);
                if (!this.e) {
                    bVar2.c = null;
                    this.a.a(bVar2);
                }
            }
        }
        return i2;
    }

    public boolean c() {
        return this.f2083b.size() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:189:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r16 = this;
            r0 = r16
            h.r.d.q r1 = r0.f2084f
            java.util.ArrayList<h.r.d.a$b> r2 = r0.f2083b
            r3 = 0
            if (r1 == 0) goto L_0x02d7
        L_0x0009:
            int r4 = r2.size()
            r5 = 1
            int r4 = r4 - r5
            r7 = 0
        L_0x0010:
            r8 = 8
            r9 = -1
            if (r4 < 0) goto L_0x0026
            java.lang.Object r10 = r2.get(r4)
            h.r.d.a$b r10 = (h.r.d.a.b) r10
            int r10 = r10.a
            if (r10 != r8) goto L_0x0022
            if (r7 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r7 = 1
        L_0x0023:
            int r4 = r4 + -1
            goto L_0x0010
        L_0x0026:
            r4 = -1
        L_0x0027:
            r7 = 4
            r10 = 2
            if (r4 == r9) goto L_0x01ed
            int r8 = r4 + 1
            java.lang.Object r11 = r2.get(r4)
            h.r.d.a$b r11 = (h.r.d.a.b) r11
            java.lang.Object r12 = r2.get(r8)
            h.r.d.a$b r12 = (h.r.d.a.b) r12
            int r13 = r12.a
            if (r13 == r5) goto L_0x01b9
            if (r13 == r10) goto L_0x00b1
            if (r13 == r7) goto L_0x0042
            goto L_0x0009
        L_0x0042:
            int r6 = r11.d
            int r9 = r12.f2086b
            if (r6 >= r9) goto L_0x004d
            int r9 = r9 + -1
            r12.f2086b = r9
            goto L_0x0063
        L_0x004d:
            int r10 = r12.d
            int r9 = r9 + r10
            if (r6 >= r9) goto L_0x0063
            int r10 = r10 + -1
            r12.d = r10
            h.r.d.q$a r6 = r1.a
            int r9 = r11.f2086b
            java.lang.Object r10 = r12.c
            h.r.d.a r6 = (h.r.d.a) r6
            h.r.d.a$b r5 = r6.a(r7, r9, r5, r10)
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            int r6 = r11.f2086b
            int r9 = r12.f2086b
            if (r6 > r9) goto L_0x006f
            int r9 = r9 + 1
            r12.f2086b = r9
            goto L_0x0087
        L_0x006f:
            int r10 = r12.d
            int r9 = r9 + r10
            if (r6 >= r9) goto L_0x0087
            int r9 = r9 - r6
            h.r.d.q$a r10 = r1.a
            int r6 = r6 + 1
            java.lang.Object r13 = r12.c
            h.r.d.a r10 = (h.r.d.a) r10
            h.r.d.a$b r6 = r10.a(r7, r6, r9, r13)
            int r7 = r12.d
            int r7 = r7 - r9
            r12.d = r7
            goto L_0x0088
        L_0x0087:
            r6 = r3
        L_0x0088:
            r2.set(r8, r11)
            int r7 = r12.d
            if (r7 <= 0) goto L_0x0093
            r2.set(r4, r12)
            goto L_0x00a5
        L_0x0093:
            r2.remove(r4)
            h.r.d.q$a r7 = r1.a
            h.r.d.a r7 = (h.r.d.a) r7
            boolean r8 = r7.e
            if (r8 != 0) goto L_0x00a5
            r12.c = r3
            h.h.l.c<h.r.d.a$b> r7 = r7.a
            r7.a(r12)
        L_0x00a5:
            if (r5 == 0) goto L_0x00aa
            r2.add(r4, r5)
        L_0x00aa:
            if (r6 == 0) goto L_0x0009
            r2.add(r4, r6)
            goto L_0x0009
        L_0x00b1:
            int r7 = r11.f2086b
            int r9 = r11.d
            if (r7 >= r9) goto L_0x00c5
            int r13 = r12.f2086b
            if (r13 != r7) goto L_0x00c2
            int r13 = r12.d
            int r9 = r9 - r7
            if (r13 != r9) goto L_0x00c2
            r6 = 0
            goto L_0x00d1
        L_0x00c2:
            r6 = 0
            r7 = 0
            goto L_0x00d6
        L_0x00c5:
            int r13 = r12.f2086b
            int r14 = r9 + 1
            if (r13 != r14) goto L_0x00d4
            int r13 = r12.d
            int r7 = r7 - r9
            if (r13 != r7) goto L_0x00d4
            r6 = 1
        L_0x00d1:
            r7 = r6
            r6 = 1
            goto L_0x00d6
        L_0x00d4:
            r6 = 0
            r7 = 1
        L_0x00d6:
            int r9 = r11.d
            int r13 = r12.f2086b
            if (r9 >= r13) goto L_0x00e1
            int r13 = r13 + -1
            r12.f2086b = r13
            goto L_0x0106
        L_0x00e1:
            int r14 = r12.d
            int r13 = r13 + r14
            if (r9 >= r13) goto L_0x0106
            int r14 = r14 + -1
            r12.d = r14
            r11.a = r10
            r11.d = r5
            int r4 = r12.d
            if (r4 != 0) goto L_0x0009
            r2.remove(r8)
            h.r.d.q$a r4 = r1.a
            h.r.d.a r4 = (h.r.d.a) r4
            boolean r5 = r4.e
            if (r5 != 0) goto L_0x0009
            r12.c = r3
            h.h.l.c<h.r.d.a$b> r4 = r4.a
            r4.a(r12)
            goto L_0x0009
        L_0x0106:
            int r5 = r11.f2086b
            int r9 = r12.f2086b
            if (r5 > r9) goto L_0x0111
            int r9 = r9 + 1
            r12.f2086b = r9
            goto L_0x0129
        L_0x0111:
            int r13 = r12.d
            int r9 = r9 + r13
            if (r5 >= r9) goto L_0x0129
            int r9 = r9 - r5
            h.r.d.q$a r13 = r1.a
            int r5 = r5 + 1
            h.r.d.a r13 = (h.r.d.a) r13
            h.r.d.a$b r5 = r13.a(r10, r5, r9, r3)
            int r9 = r11.f2086b
            int r10 = r12.f2086b
            int r9 = r9 - r10
            r12.d = r9
            goto L_0x012a
        L_0x0129:
            r5 = r3
        L_0x012a:
            if (r6 == 0) goto L_0x0143
            r2.set(r4, r12)
            r2.remove(r8)
            h.r.d.q$a r4 = r1.a
            h.r.d.a r4 = (h.r.d.a) r4
            boolean r5 = r4.e
            if (r5 != 0) goto L_0x0009
            r11.c = r3
            h.h.l.c<h.r.d.a$b> r4 = r4.a
            r4.a(r11)
            goto L_0x0009
        L_0x0143:
            if (r7 == 0) goto L_0x0174
            if (r5 == 0) goto L_0x015d
            int r6 = r11.f2086b
            int r7 = r5.f2086b
            if (r6 <= r7) goto L_0x0152
            int r7 = r5.d
            int r6 = r6 - r7
            r11.f2086b = r6
        L_0x0152:
            int r6 = r11.d
            int r7 = r5.f2086b
            if (r6 <= r7) goto L_0x015d
            int r7 = r5.d
            int r6 = r6 - r7
            r11.d = r6
        L_0x015d:
            int r6 = r11.f2086b
            int r7 = r12.f2086b
            if (r6 <= r7) goto L_0x0168
            int r7 = r12.d
            int r6 = r6 - r7
            r11.f2086b = r6
        L_0x0168:
            int r6 = r11.d
            int r7 = r12.f2086b
            if (r6 <= r7) goto L_0x01a2
            int r7 = r12.d
            int r6 = r6 - r7
            r11.d = r6
            goto L_0x01a2
        L_0x0174:
            if (r5 == 0) goto L_0x018c
            int r6 = r11.f2086b
            int r7 = r5.f2086b
            if (r6 < r7) goto L_0x0181
            int r7 = r5.d
            int r6 = r6 - r7
            r11.f2086b = r6
        L_0x0181:
            int r6 = r11.d
            int r7 = r5.f2086b
            if (r6 < r7) goto L_0x018c
            int r7 = r5.d
            int r6 = r6 - r7
            r11.d = r6
        L_0x018c:
            int r6 = r11.f2086b
            int r7 = r12.f2086b
            if (r6 < r7) goto L_0x0197
            int r7 = r12.d
            int r6 = r6 - r7
            r11.f2086b = r6
        L_0x0197:
            int r6 = r11.d
            int r7 = r12.f2086b
            if (r6 < r7) goto L_0x01a2
            int r7 = r12.d
            int r6 = r6 - r7
            r11.d = r6
        L_0x01a2:
            r2.set(r4, r12)
            int r6 = r11.f2086b
            int r7 = r11.d
            if (r6 == r7) goto L_0x01af
            r2.set(r8, r11)
            goto L_0x01b2
        L_0x01af:
            r2.remove(r8)
        L_0x01b2:
            if (r5 == 0) goto L_0x0009
            r2.add(r4, r5)
            goto L_0x0009
        L_0x01b9:
            int r5 = r11.d
            int r7 = r12.f2086b
            if (r5 >= r7) goto L_0x01c1
            r6 = -1
            goto L_0x01c2
        L_0x01c1:
            r6 = 0
        L_0x01c2:
            int r5 = r11.f2086b
            int r7 = r12.f2086b
            if (r5 >= r7) goto L_0x01ca
            int r6 = r6 + 1
        L_0x01ca:
            int r5 = r12.f2086b
            int r7 = r11.f2086b
            if (r5 > r7) goto L_0x01d5
            int r5 = r12.d
            int r7 = r7 + r5
            r11.f2086b = r7
        L_0x01d5:
            int r5 = r12.f2086b
            int r7 = r11.d
            if (r5 > r7) goto L_0x01e0
            int r5 = r12.d
            int r7 = r7 + r5
            r11.d = r7
        L_0x01e0:
            int r5 = r12.f2086b
            int r5 = r5 + r6
            r12.f2086b = r5
            r2.set(r4, r12)
            r2.set(r8, r11)
            goto L_0x0009
        L_0x01ed:
            java.util.ArrayList<h.r.d.a$b> r1 = r0.f2083b
            int r1 = r1.size()
            r2 = 0
        L_0x01f4:
            if (r2 >= r1) goto L_0x02d1
            java.util.ArrayList<h.r.d.a$b> r4 = r0.f2083b
            java.lang.Object r4 = r4.get(r2)
            h.r.d.a$b r4 = (h.r.d.a.b) r4
            int r11 = r4.a
            if (r11 == r5) goto L_0x02ca
            if (r11 == r10) goto L_0x026c
            if (r11 == r7) goto L_0x020f
            if (r11 == r8) goto L_0x020a
            goto L_0x02cd
        L_0x020a:
            r0.b(r4)
            goto L_0x02cd
        L_0x020f:
            int r11 = r4.f2086b
            int r12 = r4.d
            int r12 = r12 + r11
            r13 = r11
            r14 = 0
            r15 = -1
        L_0x0217:
            if (r11 >= r12) goto L_0x024b
            h.r.d.a$a r6 = r0.d
            androidx.recyclerview.widget.RecyclerView$f r6 = (androidx.recyclerview.widget.RecyclerView.f) r6
            androidx.recyclerview.widget.RecyclerView$d0 r6 = r6.a((int) r11)
            if (r6 != 0) goto L_0x0239
            boolean r6 = r0.a((int) r11)
            if (r6 == 0) goto L_0x022a
            goto L_0x0239
        L_0x022a:
            if (r15 != r5) goto L_0x0237
            java.lang.Object r6 = r4.c
            h.r.d.a$b r6 = r0.a(r7, r13, r14, r6)
            r0.b(r6)
            r13 = r11
            r14 = 0
        L_0x0237:
            r15 = 0
            goto L_0x0247
        L_0x0239:
            if (r15 != 0) goto L_0x0246
            java.lang.Object r6 = r4.c
            h.r.d.a$b r6 = r0.a(r7, r13, r14, r6)
            r0.a((h.r.d.a.b) r6)
            r13 = r11
            r14 = 0
        L_0x0246:
            r15 = 1
        L_0x0247:
            int r14 = r14 + r5
            int r11 = r11 + 1
            goto L_0x0217
        L_0x024b:
            int r6 = r4.d
            if (r14 == r6) goto L_0x0260
            java.lang.Object r6 = r4.c
            boolean r11 = r0.e
            if (r11 != 0) goto L_0x025c
            r4.c = r3
            h.h.l.c<h.r.d.a$b> r11 = r0.a
            r11.a(r4)
        L_0x025c:
            h.r.d.a$b r4 = r0.a(r7, r13, r14, r6)
        L_0x0260:
            if (r15 != 0) goto L_0x0267
            r0.a((h.r.d.a.b) r4)
            goto L_0x02cd
        L_0x0267:
            r0.b(r4)
            goto L_0x02cd
        L_0x026c:
            int r6 = r4.f2086b
            int r11 = r4.d
            int r11 = r11 + r6
            r12 = r6
            r13 = 0
            r14 = -1
        L_0x0274:
            if (r12 >= r11) goto L_0x02ad
            h.r.d.a$a r15 = r0.d
            androidx.recyclerview.widget.RecyclerView$f r15 = (androidx.recyclerview.widget.RecyclerView.f) r15
            androidx.recyclerview.widget.RecyclerView$d0 r15 = r15.a((int) r12)
            if (r15 != 0) goto L_0x0295
            boolean r15 = r0.a((int) r12)
            if (r15 == 0) goto L_0x0287
            goto L_0x0295
        L_0x0287:
            if (r14 != r5) goto L_0x0292
            h.r.d.a$b r14 = r0.a(r10, r6, r13, r3)
            r0.b(r14)
            r14 = 1
            goto L_0x0293
        L_0x0292:
            r14 = 0
        L_0x0293:
            r15 = 0
            goto L_0x02a2
        L_0x0295:
            if (r14 != 0) goto L_0x02a0
            h.r.d.a$b r14 = r0.a(r10, r6, r13, r3)
            r0.a((h.r.d.a.b) r14)
            r14 = 1
            goto L_0x02a1
        L_0x02a0:
            r14 = 0
        L_0x02a1:
            r15 = 1
        L_0x02a2:
            if (r14 == 0) goto L_0x02a8
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
            goto L_0x02aa
        L_0x02a8:
            int r13 = r13 + 1
        L_0x02aa:
            int r12 = r12 + r5
            r14 = r15
            goto L_0x0274
        L_0x02ad:
            int r11 = r4.d
            if (r13 == r11) goto L_0x02c0
            boolean r11 = r0.e
            if (r11 != 0) goto L_0x02bc
            r4.c = r3
            h.h.l.c<h.r.d.a$b> r11 = r0.a
            r11.a(r4)
        L_0x02bc:
            h.r.d.a$b r4 = r0.a(r10, r6, r13, r3)
        L_0x02c0:
            if (r14 != 0) goto L_0x02c6
            r0.a((h.r.d.a.b) r4)
            goto L_0x02cd
        L_0x02c6:
            r0.b(r4)
            goto L_0x02cd
        L_0x02ca:
            r0.b(r4)
        L_0x02cd:
            int r2 = r2 + 1
            goto L_0x01f4
        L_0x02d1:
            java.util.ArrayList<h.r.d.a$b> r1 = r0.f2083b
            r1.clear()
            return
        L_0x02d7:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.r.d.a.d():void");
    }

    public void c(b bVar) {
        if (!this.e) {
            bVar.c = null;
            this.a.a(bVar);
        }
    }

    public final void a(b bVar) {
        int i2;
        int i3 = bVar.a;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.f2086b, i3);
        int i4 = bVar.f2086b;
        int i5 = bVar.a;
        if (i5 == 2) {
            i2 = 0;
        } else if (i5 == 4) {
            i2 = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.d; i7++) {
            int b3 = b((i2 * i7) + bVar.f2086b, bVar.a);
            int i8 = bVar.a;
            if (i8 == 2 ? b3 == b2 : i8 == 4 && b3 == b2 + 1) {
                i6++;
            } else {
                b a2 = a(bVar.a, b2, i6, bVar.c);
                a(a2, i4);
                if (!this.e) {
                    a2.c = null;
                    this.a.a(a2);
                }
                if (bVar.a == 4) {
                    i4 += i6;
                }
                b2 = b3;
                i6 = 1;
            }
        }
        Object obj = bVar.c;
        if (!this.e) {
            bVar.c = null;
            this.a.a(bVar);
        }
        if (i6 > 0) {
            b a3 = a(bVar.a, b2, i6, obj);
            a(a3, i4);
            if (!this.e) {
                a3.c = null;
                this.a.a(a3);
            }
        }
    }

    public void a(b bVar, int i2) {
        ((RecyclerView.f) this.d).a(bVar);
        int i3 = bVar.a;
        if (i3 == 2) {
            C0061a aVar = this.d;
            int i4 = bVar.d;
            RecyclerView.f fVar = (RecyclerView.f) aVar;
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i4, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.c += i4;
        } else if (i3 == 4) {
            RecyclerView.f fVar2 = (RecyclerView.f) this.d;
            RecyclerView.this.viewRangeUpdate(i2, bVar.d, bVar.c);
            RecyclerView.this.mItemsChanged = true;
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final void b(b bVar) {
        this.c.add(bVar);
        int i2 = bVar.a;
        if (i2 == 1) {
            C0061a aVar = this.d;
            RecyclerView.f fVar = (RecyclerView.f) aVar;
            RecyclerView.this.offsetPositionRecordsForInsert(bVar.f2086b, bVar.d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i2 == 2) {
            C0061a aVar2 = this.d;
            RecyclerView.f fVar2 = (RecyclerView.f) aVar2;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.f2086b, bVar.d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else if (i2 == 4) {
            ((RecyclerView.f) this.d).a(bVar.f2086b, bVar.d, bVar.c);
        } else if (i2 == 8) {
            C0061a aVar3 = this.d;
            RecyclerView.f fVar3 = (RecyclerView.f) aVar3;
            RecyclerView.this.offsetPositionRecordsForMove(bVar.f2086b, bVar.d);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public final boolean a(int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                if (a(bVar.d, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = bVar.f2086b;
                int i6 = bVar.d + i5;
                while (i5 < i6) {
                    if (a(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        a();
        int size = this.f2083b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2083b.get(i2);
            int i3 = bVar.a;
            if (i3 == 1) {
                ((RecyclerView.f) this.d).a(bVar);
                RecyclerView.f fVar = (RecyclerView.f) this.d;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.f2086b, bVar.d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            } else if (i3 == 2) {
                ((RecyclerView.f) this.d).a(bVar);
                C0061a aVar = this.d;
                int i4 = bVar.f2086b;
                int i5 = bVar.d;
                RecyclerView.f fVar2 = (RecyclerView.f) aVar;
                RecyclerView.this.offsetPositionRecordsForRemove(i4, i5, true);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mItemsAddedOrRemoved = true;
                recyclerView.mState.c += i5;
            } else if (i3 == 4) {
                ((RecyclerView.f) this.d).a(bVar);
                ((RecyclerView.f) this.d).a(bVar.f2086b, bVar.d, bVar.c);
            } else if (i3 == 8) {
                ((RecyclerView.f) this.d).a(bVar);
                RecyclerView.f fVar3 = (RecyclerView.f) this.d;
                RecyclerView.this.offsetPositionRecordsForMove(bVar.f2086b, bVar.d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        a((List<b>) this.f2083b);
        this.f2085g = 0;
    }

    public int a(int i2, int i3) {
        int size = this.c.size();
        while (i3 < size) {
            b bVar = this.c.get(i3);
            int i4 = bVar.a;
            if (i4 == 8) {
                int i5 = bVar.f2086b;
                if (i5 == i2) {
                    i2 = bVar.d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f2086b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.d;
                }
            }
            i3++;
        }
        return i2;
    }

    public b a(int i2, int i3, int i4, Object obj) {
        b a2 = this.a.a();
        if (a2 == null) {
            return new b(i2, i3, i4, obj);
        }
        a2.a = i2;
        a2.f2086b = i3;
        a2.d = i4;
        a2.c = obj;
        return a2;
    }

    public void a(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c(list.get(i2));
        }
        list.clear();
    }
}
