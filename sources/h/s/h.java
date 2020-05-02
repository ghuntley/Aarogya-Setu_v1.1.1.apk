package h.s;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import com.crashlytics.android.answers.SessionEvent;
import h.v.a.c;
import h.v.a.e;
import h.v.a.f.f;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase */
public abstract class h {
    @Deprecated
    public volatile h.v.a.b a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f2182b;
    public h.v.a.c c;
    public final f d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2183f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public List<b> f2184g;

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f2185h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f2186i = new ThreadLocal<>();

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(h.v.a.b bVar) {
        }

        public void b(h.v.a.b bVar) {
        }
    }

    /* compiled from: RoomDatabase */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* compiled from: RoomDatabase */
    public static class d {
        public HashMap<Integer, TreeMap<Integer, h.s.m.a>> a = new HashMap<>();
    }

    public h() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public abstract h.v.a.c a(a aVar);

    public void a() {
        if (!this.e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public void b() {
        if (!f() && this.f2186i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        h.v.a.b writableDatabase = this.c.getWritableDatabase();
        this.d.b(writableDatabase);
        ((h.v.a.f.a) writableDatabase).e.beginTransaction();
    }

    public abstract f d();

    @Deprecated
    public void e() {
        ((h.v.a.f.a) this.c.getWritableDatabase()).e.endTransaction();
        if (!f()) {
            f fVar = this.d;
            if (fVar.e.compareAndSet(false, true)) {
                fVar.d.f2182b.execute(fVar.f2169j);
            }
        }
    }

    public boolean f() {
        return ((h.v.a.f.a) this.c.getWritableDatabase()).e.inTransaction();
    }

    public boolean g() {
        h.v.a.b bVar = this.a;
        return bVar != null && ((h.v.a.f.a) bVar).e.isOpen();
    }

    @Deprecated
    public void h() {
        ((h.v.a.f.a) this.c.getWritableDatabase()).e.setTransactionSuccessful();
    }

    public Cursor a(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null) {
            return ((h.v.a.f.a) this.c.getWritableDatabase()).a(eVar);
        }
        h.v.a.f.a aVar = (h.v.a.f.a) this.c.getWritableDatabase();
        return aVar.e.rawQueryWithFactory(new h.v.a.f.b(aVar, eVar), eVar.a(), h.v.a.f.a.f2244f, (String) null, cancellationSignal);
    }

    public f a(String str) {
        a();
        b();
        return new f(((h.v.a.f.a) this.c.getWritableDatabase()).e.compileStatement(str));
    }

    /* compiled from: RoomDatabase */
    public static class a<T extends h> {
        public final Class<T> a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2187b;
        public final Context c;
        public ArrayList<b> d;
        public Executor e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f2188f;

        /* renamed from: g  reason: collision with root package name */
        public c.C0069c f2189g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2190h;

        /* renamed from: i  reason: collision with root package name */
        public c f2191i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2192j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2193k;

        /* renamed from: l  reason: collision with root package name */
        public final d f2194l = new d();

        /* renamed from: m  reason: collision with root package name */
        public Set<Integer> f2195m;

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.f2187b = str;
        }

        public a<T> a(h.s.m.a... aVarArr) {
            if (this.f2195m == null) {
                this.f2195m = new HashSet();
            }
            for (h.s.m.a aVar : aVarArr) {
                this.f2195m.add(Integer.valueOf(aVar.a));
                this.f2195m.add(Integer.valueOf(aVar.f2216b));
            }
            d dVar = this.f2194l;
            if (dVar != null) {
                for (h.s.m.a aVar2 : aVarArr) {
                    int i2 = aVar2.a;
                    int i3 = aVar2.f2216b;
                    TreeMap treeMap = dVar.a.get(Integer.valueOf(i2));
                    if (treeMap == null) {
                        treeMap = new TreeMap();
                        dVar.a.put(Integer.valueOf(i2), treeMap);
                    }
                    h.s.m.a aVar3 = (h.s.m.a) treeMap.get(Integer.valueOf(i3));
                    if (aVar3 != null) {
                        Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                    }
                    treeMap.put(Integer.valueOf(i3), aVar2);
                }
                return this;
            }
            throw null;
        }

        @SuppressLint({"RestrictedApi"})
        public T a() {
            String str;
            Executor executor;
            if (this.c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.a != null) {
                if (this.e == null && this.f2188f == null) {
                    Executor executor2 = h.c.a.a.a.d;
                    this.f2188f = executor2;
                    this.e = executor2;
                } else {
                    Executor executor3 = this.e;
                    if (executor3 != null && this.f2188f == null) {
                        this.f2188f = executor3;
                    } else if (this.e == null && (executor = this.f2188f) != null) {
                        this.e = executor;
                    }
                }
                if (this.f2189g == null) {
                    this.f2189g = new h.v.a.f.d();
                }
                Context context = this.c;
                String str2 = this.f2187b;
                c.C0069c cVar = this.f2189g;
                d dVar = this.f2194l;
                ArrayList<b> arrayList = this.d;
                boolean z = this.f2190h;
                c cVar2 = this.f2191i;
                if (cVar2 != null) {
                    if (cVar2 == c.AUTOMATIC) {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService(SessionEvent.ACTIVITY_KEY);
                        if (activityManager == null || activityManager.isLowRamDevice()) {
                            cVar2 = c.TRUNCATE;
                        } else {
                            cVar2 = c.WRITE_AHEAD_LOGGING;
                        }
                    }
                    a aVar = new a(context, str2, cVar, dVar, arrayList, z, cVar2, this.e, this.f2188f, false, this.f2192j, this.f2193k, (Set<Integer>) null, (String) null, (File) null);
                    Class<T> cls = this.a;
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    boolean z2 = true;
                    if (!name.isEmpty()) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    String str3 = canonicalName.replace('.', '_') + "_Impl";
                    try {
                        if (name.isEmpty()) {
                            str = str3;
                        } else {
                            str = name + "." + str3;
                        }
                        T t = (h) Class.forName(str).newInstance();
                        h.v.a.c a2 = t.a(aVar);
                        t.c = a2;
                        if (a2 instanceof k) {
                            ((k) a2).f2213j = aVar;
                        }
                        if (aVar.f2156g != c.WRITE_AHEAD_LOGGING) {
                            z2 = false;
                        }
                        t.c.setWriteAheadLoggingEnabled(z2);
                        t.f2184g = aVar.e;
                        t.f2182b = aVar.f2157h;
                        new ArrayDeque();
                        t.e = aVar.f2155f;
                        t.f2183f = z2;
                        if (aVar.f2159j) {
                            f fVar = t.d;
                            new g(aVar.f2154b, aVar.c, fVar, fVar.d.f2182b);
                        }
                        return t;
                    } catch (ClassNotFoundException unused) {
                        StringBuilder a3 = i.a.a.a.a.a("cannot find implementation for ");
                        a3.append(cls.getCanonicalName());
                        a3.append(". ");
                        a3.append(str3);
                        a3.append(" does not exist");
                        throw new RuntimeException(a3.toString());
                    } catch (IllegalAccessException unused2) {
                        StringBuilder a4 = i.a.a.a.a.a("Cannot access the constructor");
                        a4.append(cls.getCanonicalName());
                        throw new RuntimeException(a4.toString());
                    } catch (InstantiationException unused3) {
                        StringBuilder a5 = i.a.a.a.a.a("Failed to create an instance of ");
                        a5.append(cls.getCanonicalName());
                        throw new RuntimeException(a5.toString());
                    }
                } else {
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }
    }
}
