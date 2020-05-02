package h.s;

import h.v.a.c;

/* compiled from: RoomOpenHelper */
public class i extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public a f2199b;
    public final a c;
    public final String d;
    public final String e;

    /* compiled from: RoomOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public abstract void a(h.v.a.b bVar);

        public abstract void b(h.v.a.b bVar);

        public abstract void c(h.v.a.b bVar);

        public abstract void d(h.v.a.b bVar);

        public abstract void e(h.v.a.b bVar);

        public abstract void f(h.v.a.b bVar);

        public abstract b g(h.v.a.b bVar);
    }

    /* compiled from: RoomOpenHelper */
    public static class b {
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2200b;

        public b(boolean z, String str) {
            this.a = z;
            this.f2200b = str;
        }
    }

    public i(a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.f2199b = aVar;
        this.c = aVar2;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h.v.a.b r11, int r12, int r13) {
        /*
            r10 = this;
            h.s.a r0 = r10.f2199b
            r1 = 1
            if (r0 == 0) goto L_0x00bd
            h.s.h$d r0 = r0.d
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            if (r12 != r13) goto L_0x0012
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x0079
        L_0x0012:
            if (r13 <= r12) goto L_0x0016
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r12
        L_0x001d:
            if (r3 == 0) goto L_0x0022
            if (r5 >= r13) goto L_0x0077
            goto L_0x0024
        L_0x0022:
            if (r5 <= r13) goto L_0x0077
        L_0x0024:
            java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, h.s.m.a>> r6 = r0.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            if (r6 != 0) goto L_0x0033
            goto L_0x0078
        L_0x0033:
            if (r3 == 0) goto L_0x003a
            java.util.NavigableSet r7 = r6.descendingKeySet()
            goto L_0x003e
        L_0x003a:
            java.util.Set r7 = r6.keySet()
        L_0x003e:
            java.util.Iterator r7 = r7.iterator()
        L_0x0042:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x006f
            java.lang.Object r8 = r7.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 == 0) goto L_0x0059
            if (r8 > r13) goto L_0x005f
            if (r8 <= r5) goto L_0x005f
            goto L_0x005d
        L_0x0059:
            if (r8 < r13) goto L_0x005f
            if (r8 >= r5) goto L_0x005f
        L_0x005d:
            r9 = 1
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            if (r9 == 0) goto L_0x0042
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object r5 = r6.get(r5)
            r4.add(r5)
            r5 = 1
            goto L_0x0072
        L_0x006f:
            r6 = 0
            r8 = r5
            r5 = 0
        L_0x0072:
            if (r5 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r5 = r8
            goto L_0x001d
        L_0x0077:
            r2 = r4
        L_0x0078:
            r0 = r2
        L_0x0079:
            if (r0 == 0) goto L_0x00bd
            h.s.i$a r2 = r10.c
            r2.f(r11)
            java.util.Iterator r0 = r0.iterator()
        L_0x0084:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r0.next()
            h.s.m.a r2 = (h.s.m.a) r2
            r2.a(r11)
            goto L_0x0084
        L_0x0094:
            h.s.i$a r0 = r10.c
            h.s.i$b r0 = r0.g(r11)
            boolean r2 = r0.a
            if (r2 == 0) goto L_0x00a7
            h.s.i$a r0 = r10.c
            r0.e(r11)
            r10.a(r11)
            goto L_0x00be
        L_0x00a7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Migration didn't properly handle: "
            java.lang.StringBuilder r12 = i.a.a.a.a.a(r12)
            java.lang.String r13 = r0.f2200b
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x00bc:
            throw r2
        L_0x00bd:
            r1 = 0
        L_0x00be:
            if (r1 != 0) goto L_0x00f9
            h.s.a r0 = r10.f2199b
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.a(r12, r13)
            if (r0 != 0) goto L_0x00d5
            h.s.i$a r12 = r10.c
            r12.b(r11)
            h.s.i$a r12 = r10.c
            r12.a(r11)
            goto L_0x00f9
        L_0x00d5:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " to "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.s.i.a(h.v.a.b, int, int):void");
    }

    public final void a(h.v.a.b bVar) {
        h.v.a.f.a aVar = (h.v.a.f.a) bVar;
        aVar.e.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.e.execSQL(i.a.a.a.a.a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.d, "')"));
    }
}
