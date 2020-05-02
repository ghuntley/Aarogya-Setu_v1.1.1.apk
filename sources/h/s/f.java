package h.s;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.Log;
import h.c.a.b.b;
import h.s.g;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: InvalidationTracker */
public class f {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f2163k = {"UPDATE", "DELETE", "INSERT"};
    public final HashMap<String, Integer> a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f2164b;
    public Map<String, Set<String>> c;
    public final h d;
    public AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f2165f = false;

    /* renamed from: g  reason: collision with root package name */
    public volatile h.v.a.f.f f2166g;

    /* renamed from: h  reason: collision with root package name */
    public b f2167h;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: i  reason: collision with root package name */
    public final h.c.a.b.b<c, d> f2168i = new h.c.a.b.b<>();

    /* renamed from: j  reason: collision with root package name */
    public Runnable f2169j = new a();

    /* compiled from: InvalidationTracker */
    public class a implements Runnable {
        public a() {
        }

        /* JADX INFO: finally extract failed */
        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor a = f.this.d.a(new h.v.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), (CancellationSignal) null);
            while (a.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(a.getInt(0)));
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            a.close();
            if (!hashSet.isEmpty()) {
                f.this.f2166g.f();
            }
            return hashSet;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.database.sqlite.SQLiteDatabase} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.util.Set<java.lang.Integer>} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                h.s.f r0 = h.s.f.this
                h.s.h r0 = r0.d
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f2185h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.s.f r4 = h.s.f.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.a()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 != 0) goto L_0x001c
                r0.unlock()
                return
            L_0x001c:
                h.s.f r4 = h.s.f.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.compareAndSet(r1, r2)     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 != 0) goto L_0x002a
                r0.unlock()
                return
            L_0x002a:
                h.s.f r4 = h.s.f.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.s.h r4 = r4.d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.f()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 == 0) goto L_0x0038
                r0.unlock()
                return
            L_0x0038:
                h.s.f r4 = h.s.f.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.s.h r4 = r4.d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                boolean r4 = r4.f2183f     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                if (r4 == 0) goto L_0x0076
                h.s.f r4 = h.s.f.this     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.s.h r4 = r4.d     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.v.a.c r4 = r4.c     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                h.v.a.b r4 = r4.getWritableDatabase()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r5 = r4
                h.v.a.f.a r5 = (h.v.a.f.a) r5     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                android.database.sqlite.SQLiteDatabase r5 = r5.e     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                r5.beginTransaction()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                java.util.Set r5 = r11.a()     // Catch:{ all -> 0x0068 }
                r6 = r4
                h.v.a.f.a r6 = (h.v.a.f.a) r6     // Catch:{ all -> 0x0066 }
                android.database.sqlite.SQLiteDatabase r6 = r6.e     // Catch:{ all -> 0x0066 }
                r6.setTransactionSuccessful()     // Catch:{ all -> 0x0066 }
                h.v.a.f.a r4 = (h.v.a.f.a) r4     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                android.database.sqlite.SQLiteDatabase r4 = r4.e     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                goto L_0x0089
            L_0x0066:
                r6 = move-exception
                goto L_0x006a
            L_0x0068:
                r6 = move-exception
                r5 = r3
            L_0x006a:
                h.v.a.f.a r4 = (h.v.a.f.a) r4     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                android.database.sqlite.SQLiteDatabase r4 = r4.e     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                r4.endTransaction()     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
                throw r6     // Catch:{ IllegalStateException -> 0x0074, SQLiteException -> 0x0072 }
            L_0x0072:
                r4 = move-exception
                goto L_0x0082
            L_0x0074:
                r4 = move-exception
                goto L_0x0082
            L_0x0076:
                java.util.Set r5 = r11.a()     // Catch:{ IllegalStateException -> 0x0080, SQLiteException -> 0x007e }
                goto L_0x0089
            L_0x007b:
                r1 = move-exception
                goto L_0x00ef
            L_0x007e:
                r4 = move-exception
                goto L_0x0081
            L_0x0080:
                r4 = move-exception
            L_0x0081:
                r5 = r3
            L_0x0082:
                java.lang.String r6 = "ROOM"
                java.lang.String r7 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r6, r7, r4)     // Catch:{ all -> 0x007b }
            L_0x0089:
                r0.unlock()
                if (r5 == 0) goto L_0x00ee
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x00ee
                h.s.f r0 = h.s.f.this
                h.c.a.b.b<h.s.f$c, h.s.f$d> r0 = r0.f2168i
                monitor-enter(r0)
                h.s.f r4 = h.s.f.this     // Catch:{ all -> 0x00eb }
                h.c.a.b.b<h.s.f$c, h.s.f$d> r4 = r4.f2168i     // Catch:{ all -> 0x00eb }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00eb }
            L_0x00a1:
                r6 = r4
                h.c.a.b.b$e r6 = (h.c.a.b.b.e) r6
                boolean r7 = r6.hasNext()     // Catch:{ all -> 0x00eb }
                if (r7 == 0) goto L_0x00e9
                java.lang.Object r6 = r6.next()     // Catch:{ all -> 0x00eb }
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x00eb }
                java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x00eb }
                h.s.f$d r6 = (h.s.f.d) r6     // Catch:{ all -> 0x00eb }
                int[] r7 = r6.a     // Catch:{ all -> 0x00eb }
                int r7 = r7.length     // Catch:{ all -> 0x00eb }
                r9 = r3
                r8 = 0
            L_0x00bb:
                if (r8 >= r7) goto L_0x00e1
                int[] r10 = r6.a     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00eb }
                boolean r10 = r5.contains(r10)     // Catch:{ all -> 0x00eb }
                if (r10 == 0) goto L_0x00de
                if (r7 != r1) goto L_0x00d0
                java.util.Set<java.lang.String> r9 = r6.d     // Catch:{ all -> 0x00eb }
                goto L_0x00de
            L_0x00d0:
                if (r9 != 0) goto L_0x00d7
                java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x00eb }
                r9.<init>(r7)     // Catch:{ all -> 0x00eb }
            L_0x00d7:
                java.lang.String[] r10 = r6.f2171b     // Catch:{ all -> 0x00eb }
                r10 = r10[r8]     // Catch:{ all -> 0x00eb }
                r9.add(r10)     // Catch:{ all -> 0x00eb }
            L_0x00de:
                int r8 = r8 + 1
                goto L_0x00bb
            L_0x00e1:
                if (r9 == 0) goto L_0x00a1
                h.s.f$c r6 = r6.c     // Catch:{ all -> 0x00eb }
                r6.a(r9)     // Catch:{ all -> 0x00eb }
                goto L_0x00a1
            L_0x00e9:
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                goto L_0x00ee
            L_0x00eb:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00eb }
                throw r1
            L_0x00ee:
                return
            L_0x00ef:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h.s.f.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {
        public final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker */
    public static class d {
        public final int[] a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f2171b;
        public final c c;
        public final Set<String> d;

        public d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.f2171b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(this.f2171b[0]);
                this.d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.d = null;
        }
    }

    public f(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.d = hVar;
        this.f2167h = new b(strArr.length);
        this.a = new HashMap<>();
        this.c = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f2164b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase = strArr[i2].toLowerCase(Locale.US);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str = map.get(strArr[i2]);
            if (str != null) {
                this.f2164b[i2] = str.toLowerCase(Locale.US);
            } else {
                this.f2164b[i2] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            String lowerCase2 = ((String) next.getValue()).toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(Locale.US);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public void a(h.v.a.b bVar) {
        synchronized (this) {
            if (this.f2165f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ((h.v.a.f.a) bVar).e.execSQL("PRAGMA temp_store = MEMORY;");
            ((h.v.a.f.a) bVar).e.execSQL("PRAGMA recursive_triggers='ON';");
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            b(bVar);
            this.f2166g = new h.v.a.f.f(((h.v.a.f.a) bVar).e.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
            this.f2165f = true;
        }
    }

    public final void b(h.v.a.b bVar, int i2) {
        String str = this.f2164b[i2];
        StringBuilder sb = new StringBuilder();
        for (String append : f2163k) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append(l.a.a.a.o.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(append);
            sb.append("`");
            ((h.v.a.f.a) bVar).e.execSQL(sb.toString());
        }
    }

    /* compiled from: InvalidationTracker */
    public static class b {
        public final long[] a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f2170b;
        public final int[] c;
        public boolean d;
        public boolean e;

        public b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            this.f2170b = new boolean[i2];
            this.c = new int[i2];
            Arrays.fill(jArr, 0);
            Arrays.fill(this.f2170b, false);
        }

        public boolean a(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long j2 = this.a[i2];
                    this.a[i2] = 1 + j2;
                    if (j2 == 0) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public boolean b(int... iArr) {
            boolean z;
            synchronized (this) {
                z = false;
                for (int i2 : iArr) {
                    long j2 = this.a[i2];
                    this.a[i2] = j2 - 1;
                    if (j2 == 1) {
                        this.d = true;
                        z = true;
                    }
                }
            }
            return z;
        }

        public int[] a() {
            synchronized (this) {
                if (this.d) {
                    if (!this.e) {
                        int length = this.a.length;
                        int i2 = 0;
                        while (true) {
                            int i3 = 1;
                            if (i2 < length) {
                                boolean z = this.a[i2] > 0;
                                if (z != this.f2170b[i2]) {
                                    int[] iArr = this.c;
                                    if (!z) {
                                        i3 = 2;
                                    }
                                    iArr[i2] = i3;
                                } else {
                                    this.c[i2] = 0;
                                }
                                this.f2170b[i2] = z;
                                i2++;
                            } else {
                                this.e = true;
                                this.d = false;
                                int[] iArr2 = this.c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        public void b() {
            synchronized (this) {
                this.e = false;
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void b(c cVar) {
        d remove;
        synchronized (this.f2168i) {
            remove = this.f2168i.remove(cVar);
        }
        if (remove != null && this.f2167h.b(remove.a)) {
            b();
        }
    }

    public final void a(h.v.a.b bVar, int i2) {
        h.v.a.f.a aVar = (h.v.a.f.a) bVar;
        aVar.e.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i2 + ", 0)");
        String str = this.f2164b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2163k) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append(l.a.a.a.o.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.e.execSQL(sb.toString());
        }
    }

    public void b(h.v.a.b bVar) {
        if (!((h.v.a.f.a) bVar).e.inTransaction()) {
            while (true) {
                try {
                    ReentrantReadWriteLock.ReadLock readLock = this.d.f2185h.readLock();
                    readLock.lock();
                    try {
                        int[] a2 = this.f2167h.a();
                        if (a2 == null) {
                            readLock.unlock();
                            return;
                        }
                        int length = a2.length;
                        ((h.v.a.f.a) bVar).e.beginTransaction();
                        for (int i2 = 0; i2 < length; i2++) {
                            int i3 = a2[i2];
                            if (i3 == 1) {
                                a(bVar, i2);
                            } else if (i3 == 2) {
                                b(bVar, i2);
                            }
                        }
                        ((h.v.a.f.a) bVar).e.setTransactionSuccessful();
                        ((h.v.a.f.a) bVar).e.endTransaction();
                        this.f2167h.b();
                        readLock.unlock();
                    } catch (Throwable th) {
                        readLock.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException e2) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                    return;
                }
            }
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d b2;
        String[] strArr = cVar.a;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        String[] strArr2 = (String[]) hashSet.toArray(new String[hashSet.size()]);
        int[] iArr = new int[strArr2.length];
        int length = strArr2.length;
        while (i2 < length) {
            Integer num = this.a.get(strArr2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
                i2++;
            } else {
                StringBuilder a2 = i.a.a.a.a.a("There is no table with name ");
                a2.append(strArr2[i2]);
                throw new IllegalArgumentException(a2.toString());
            }
        }
        d dVar = new d(cVar, iArr, strArr2);
        synchronized (this.f2168i) {
            b2 = this.f2168i.b(cVar, dVar);
        }
        if (b2 == null && this.f2167h.a(iArr)) {
            b();
        }
    }

    public void b() {
        if (this.d.g()) {
            b(this.d.c.getWritableDatabase());
        }
    }

    public boolean a() {
        if (!this.d.g()) {
            return false;
        }
        if (!this.f2165f) {
            this.d.c.getWritableDatabase();
        }
        if (this.f2165f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void a(String... strArr) {
        synchronized (this.f2168i) {
            Iterator<Map.Entry<c, d>> it = this.f2168i.iterator();
            while (true) {
                b.e eVar = (b.e) it;
                if (eVar.hasNext()) {
                    if (((g.e) ((c) ((Map.Entry) eVar.next()).getKey())) == null) {
                        throw null;
                    }
                }
            }
        }
    }
}
