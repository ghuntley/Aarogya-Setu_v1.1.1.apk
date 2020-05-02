package h.l.d;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import h.l.d.a0;
import h.l.d.h0;
import h.o.h;
import h.o.l;
import h.p.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentManager */
public abstract class r {
    public ArrayList<Fragment> A;
    public ArrayList<g> B;
    public v C;
    public Runnable D = new d();
    public final ArrayList<e> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2005b;
    public final z c = new z();
    public ArrayList<a> d;
    public ArrayList<Fragment> e;

    /* renamed from: f  reason: collision with root package name */
    public final p f2006f = new p(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f2007g;

    /* renamed from: h  reason: collision with root package name */
    public final h.a.b f2008h = new a(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2009i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public ConcurrentHashMap<Fragment, HashSet<h.h.i.a>> f2010j = new ConcurrentHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public final h0.a f2011k = new b();

    /* renamed from: l  reason: collision with root package name */
    public final q f2012l = new q(this);

    /* renamed from: m  reason: collision with root package name */
    public int f2013m = -1;

    /* renamed from: n  reason: collision with root package name */
    public o<?> f2014n;

    /* renamed from: o  reason: collision with root package name */
    public k f2015o;

    /* renamed from: p  reason: collision with root package name */
    public Fragment f2016p;

    /* renamed from: q  reason: collision with root package name */
    public Fragment f2017q;
    public n r = null;
    public n s = new c();
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a> y;
    public ArrayList<Boolean> z;

    /* compiled from: FragmentManager */
    public class a extends h.a.b {
        public a(boolean z) {
            super(z);
        }
    }

    /* compiled from: FragmentManager */
    public class b implements h0.a {
        public b() {
        }

        public void a(Fragment fragment, h.h.i.a aVar) {
            if (!aVar.b()) {
                r rVar = r.this;
                HashSet hashSet = rVar.f2010j.get(fragment);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    rVar.f2010j.remove(fragment);
                    if (fragment.e < 3) {
                        rVar.d(fragment);
                        rVar.a(fragment, fragment.r());
                    }
                }
            }
        }

        public void b(Fragment fragment, h.h.i.a aVar) {
            r rVar = r.this;
            if (rVar.f2010j.get(fragment) == null) {
                rVar.f2010j.put(fragment, new HashSet());
            }
            rVar.f2010j.get(fragment).add(aVar);
        }
    }

    /* compiled from: FragmentManager */
    public class c extends n {
        public c() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            o<?> oVar = r.this.f2014n;
            Context context = oVar.f2001f;
            if (oVar != null) {
                return Fragment.a(context, str, (Bundle) null);
            }
            throw null;
        }
    }

    /* compiled from: FragmentManager */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            r.this.d(true);
        }
    }

    /* compiled from: FragmentManager */
    public interface e {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager */
    public class f implements e {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2019b;
        public final int c;

        public f(String str, int i2, int i3) {
            this.a = str;
            this.f2019b = i2;
            this.c = i3;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = r.this.f2017q;
            if (fragment != null && this.f2019b < 0 && this.a == null && fragment.i().j()) {
                return false;
            }
            return r.this.a(arrayList, arrayList2, this.a, this.f2019b, this.c);
        }
    }

    /* compiled from: FragmentManager */
    public static class g implements Fragment.c {
        public final boolean a;

        /* renamed from: b  reason: collision with root package name */
        public final a f2020b;
        public int c;

        public g(a aVar, boolean z) {
            this.a = z;
            this.f2020b = aVar;
        }

        public void a() {
            boolean z;
            boolean z2 = this.c > 0;
            for (Fragment next : this.f2020b.f1914q.c.c()) {
                next.a((Fragment.c) null);
                if (z2) {
                    Fragment.b bVar = next.N;
                    if (bVar == null) {
                        z = false;
                    } else {
                        z = bVar.f251p;
                    }
                    if (z) {
                        next.G();
                    }
                }
            }
            a aVar = this.f2020b;
            aVar.f1914q.a(aVar, this.a, !z2, true);
        }
    }

    public static boolean c(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String b2 = i.a.a.a.a.b(str, "    ");
        z zVar = this.c;
        if (zVar != null) {
            String b3 = i.a.a.a.a.b(str, "    ");
            if (!zVar.f2044b.isEmpty()) {
                printWriter.print(str);
                printWriter.print("Active Fragments:");
                for (y next : zVar.f2044b.values()) {
                    printWriter.print(str);
                    if (next != null) {
                        Fragment fragment = next.f2043b;
                        printWriter.println(fragment);
                        fragment.a(b3, fileDescriptor, printWriter, strArr);
                    } else {
                        printWriter.println("null");
                    }
                }
            }
            int size3 = zVar.a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (int i2 = 0; i2 < size3; i2++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(zVar.a.get(i2).toString());
                }
            }
            ArrayList<Fragment> arrayList = this.e;
            if (arrayList != null && (size2 = arrayList.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i3 = 0; i3 < size2; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.e.get(i3).toString());
                }
            }
            ArrayList<a> arrayList2 = this.d;
            if (arrayList2 != null && (size = arrayList2.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i4 = 0; i4 < size; i4++) {
                    a aVar = this.d.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.a(b2, printWriter, true);
                }
            }
            printWriter.print(str);
            printWriter.println("Back Stack Index: " + this.f2009i.get());
            synchronized (this.a) {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(this.a.get(i5));
                    }
                }
            }
            printWriter.print(str);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(str);
            printWriter.print("  mHost=");
            printWriter.println(this.f2014n);
            printWriter.print(str);
            printWriter.print("  mContainer=");
            printWriter.println(this.f2015o);
            if (this.f2016p != null) {
                printWriter.print(str);
                printWriter.print("  mParent=");
                printWriter.println(this.f2016p);
            }
            printWriter.print(str);
            printWriter.print("  mCurState=");
            printWriter.print(this.f2013m);
            printWriter.print(" mStateSaved=");
            printWriter.print(this.u);
            printWriter.print(" mStopped=");
            printWriter.print(this.v);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.w);
            if (this.t) {
                printWriter.print(str);
                printWriter.print("  mNeedMenuInvalidate=");
                printWriter.println(this.t);
                return;
            }
            return;
        }
        throw null;
    }

    public void b(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.D) {
            fragment.D = false;
            if (!fragment.f237o) {
                this.c.a(fragment);
                if (c(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (i(fragment)) {
                    this.t = true;
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean d(boolean z2) {
        c(z2);
        boolean z3 = false;
        while (b(this.y, this.z)) {
            this.f2005b = true;
            try {
                c(this.y, this.z);
                a();
                z3 = true;
            } catch (Throwable th) {
                a();
                throw th;
            }
        }
        n();
        e();
        this.c.a();
        return z3;
    }

    public void e(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.D) {
            fragment.D = true;
            if (fragment.f237o) {
                if (c(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.b(fragment);
                if (i(fragment)) {
                    this.t = true;
                }
                q(fragment);
            }
        }
    }

    public final void f() {
        if (!this.f2010j.isEmpty()) {
            for (Fragment next : this.f2010j.keySet()) {
                c(next);
                a(next, next.r());
            }
        }
    }

    public final ViewGroup g(Fragment fragment) {
        if (fragment.A > 0 && this.f2015o.d()) {
            View a2 = this.f2015o.a(fragment.A);
            if (a2 instanceof ViewGroup) {
                return (ViewGroup) a2;
            }
        }
        return null;
    }

    public void h(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.C) {
            fragment.C = true;
            fragment.P = true ^ fragment.P;
            q(fragment);
        }
    }

    public void i() {
        this.u = false;
        this.v = false;
        for (Fragment next : this.c.c()) {
            if (next != null) {
                next.x.i();
            }
        }
    }

    public boolean j(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        r rVar = fragment.v;
        if (!fragment.equals(rVar.f2017q) || !j(rVar.f2016p)) {
            return false;
        }
        return true;
    }

    public void k(Fragment fragment) {
        boolean z2;
        if (!this.c.a(fragment.f231i)) {
            y yVar = new y(this.f2012l, fragment);
            yVar.a(this.f2014n.f2001f.getClassLoader());
            this.c.f2044b.put(yVar.f2043b.f231i, yVar);
            if (fragment.F) {
                if (!fragment.E) {
                    o(fragment);
                } else if (!h()) {
                    v vVar = this.C;
                    if (vVar.c.containsKey(fragment.f231i)) {
                        z2 = false;
                    } else {
                        vVar.c.put(fragment.f231i, fragment);
                        z2 = true;
                    }
                    if (z2 && c(2)) {
                        Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
                    }
                } else if (c(2)) {
                    Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                }
                fragment.F = false;
            }
            yVar.c = this.f2013m;
            if (c(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r0 = r4.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(androidx.fragment.app.Fragment r9) {
        /*
            r8 = this;
            h.l.d.z r0 = r8.c
            java.lang.String r1 = r9.f231i
            boolean r0 = r0.a((java.lang.String) r1)
            if (r0 != 0) goto L_0x003a
            r0 = 3
            boolean r0 = c((int) r0)
            if (r0 == 0) goto L_0x0039
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring moving "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " to state "
            r0.append(r9)
            int r9 = r8.f2013m
            r0.append(r9)
            java.lang.String r9 = "since it is not added to "
            r0.append(r9)
            r0.append(r8)
            java.lang.String r9 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r9)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r8.f2013m
            r8.a((androidx.fragment.app.Fragment) r9, (int) r0)
            android.view.View r0 = r9.K
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00c2
            h.l.d.z r3 = r8.c
            r4 = 0
            if (r3 == 0) goto L_0x00c1
            android.view.ViewGroup r5 = r9.J
            if (r5 == 0) goto L_0x006c
            if (r0 != 0) goto L_0x0051
            goto L_0x006c
        L_0x0051:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.a
            int r0 = r0.indexOf(r9)
        L_0x0057:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x006c
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r3.a
            java.lang.Object r6 = r6.get(r0)
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            android.view.ViewGroup r7 = r6.J
            if (r7 != r5) goto L_0x0057
            android.view.View r7 = r6.K
            if (r7 == 0) goto L_0x0057
            r4 = r6
        L_0x006c:
            if (r4 == 0) goto L_0x0086
            android.view.View r0 = r4.K
            android.view.ViewGroup r3 = r9.J
            int r0 = r3.indexOfChild(r0)
            android.view.View r4 = r9.K
            int r4 = r3.indexOfChild(r4)
            if (r4 >= r0) goto L_0x0086
            r3.removeViewAt(r4)
            android.view.View r4 = r9.K
            r3.addView(r4, r0)
        L_0x0086:
            boolean r0 = r9.O
            if (r0 == 0) goto L_0x00c2
            android.view.ViewGroup r0 = r9.J
            if (r0 == 0) goto L_0x00c2
            float r0 = r9.Q
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x009a
            android.view.View r4 = r9.K
            r4.setAlpha(r0)
        L_0x009a:
            r9.Q = r3
            r9.O = r2
            h.l.d.o<?> r0 = r8.f2014n
            android.content.Context r0 = r0.f2001f
            h.l.d.k r3 = r8.f2015o
            h.l.d.i r0 = g.a.a.b.a.a((android.content.Context) r0, (h.l.d.k) r3, (androidx.fragment.app.Fragment) r9, (boolean) r1)
            if (r0 == 0) goto L_0x00c2
            android.view.animation.Animation r3 = r0.a
            if (r3 == 0) goto L_0x00b4
            android.view.View r0 = r9.K
            r0.startAnimation(r3)
            goto L_0x00c2
        L_0x00b4:
            android.animation.Animator r3 = r0.f1984b
            android.view.View r4 = r9.K
            r3.setTarget(r4)
            android.animation.Animator r0 = r0.f1984b
            r0.start()
            goto L_0x00c2
        L_0x00c1:
            throw r4
        L_0x00c2:
            boolean r0 = r9.P
            if (r0 == 0) goto L_0x0145
            android.view.View r0 = r9.K
            if (r0 == 0) goto L_0x0137
            h.l.d.o<?> r0 = r8.f2014n
            android.content.Context r0 = r0.f2001f
            h.l.d.k r3 = r8.f2015o
            boolean r4 = r9.C
            r4 = r4 ^ r1
            h.l.d.i r0 = g.a.a.b.a.a((android.content.Context) r0, (h.l.d.k) r3, (androidx.fragment.app.Fragment) r9, (boolean) r4)
            if (r0 == 0) goto L_0x010d
            android.animation.Animator r3 = r0.f1984b
            if (r3 == 0) goto L_0x010d
            android.view.View r4 = r9.K
            r3.setTarget(r4)
            boolean r3 = r9.C
            if (r3 == 0) goto L_0x0102
            boolean r3 = r9.u()
            if (r3 == 0) goto L_0x00f0
            r9.a((boolean) r2)
            goto L_0x0107
        L_0x00f0:
            android.view.ViewGroup r3 = r9.J
            android.view.View r4 = r9.K
            r3.startViewTransition(r4)
            android.animation.Animator r5 = r0.f1984b
            h.l.d.s r6 = new h.l.d.s
            r6.<init>(r8, r3, r4, r9)
            r5.addListener(r6)
            goto L_0x0107
        L_0x0102:
            android.view.View r3 = r9.K
            r3.setVisibility(r2)
        L_0x0107:
            android.animation.Animator r0 = r0.f1984b
            r0.start()
            goto L_0x0137
        L_0x010d:
            if (r0 == 0) goto L_0x011b
            android.view.View r3 = r9.K
            android.view.animation.Animation r4 = r0.a
            r3.startAnimation(r4)
            android.view.animation.Animation r0 = r0.a
            r0.start()
        L_0x011b:
            boolean r0 = r9.C
            if (r0 == 0) goto L_0x0128
            boolean r0 = r9.u()
            if (r0 != 0) goto L_0x0128
            r0 = 8
            goto L_0x0129
        L_0x0128:
            r0 = 0
        L_0x0129:
            android.view.View r3 = r9.K
            r3.setVisibility(r0)
            boolean r0 = r9.u()
            if (r0 == 0) goto L_0x0137
            r9.a((boolean) r2)
        L_0x0137:
            boolean r0 = r9.f237o
            if (r0 == 0) goto L_0x0143
            boolean r0 = r8.i(r9)
            if (r0 == 0) goto L_0x0143
            r8.t = r1
        L_0x0143:
            r9.P = r2
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.r.l(androidx.fragment.app.Fragment):void");
    }

    public void m(Fragment fragment) {
        if (!fragment.L) {
            return;
        }
        if (this.f2005b) {
            this.x = true;
            return;
        }
        fragment.L = false;
        a(fragment, this.f2013m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (j(r4.f2016p) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f2008h;
        r1 = r4.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r4 = this;
            java.util.ArrayList<h.l.d.r$e> r0 = r4.a
            monitor-enter(r0)
            java.util.ArrayList<h.l.d.r$e> r1 = r4.a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            h.a.b r1 = r4.f2008h     // Catch:{ all -> 0x002f }
            r1.a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            h.a.b r0 = r4.f2008h
            java.util.ArrayList<h.l.d.a> r1 = r4.d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.f2016p
            boolean r1 = r4.j(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.r.n():void");
    }

    public void o(Fragment fragment) {
        if (!h()) {
            if ((this.C.c.remove(fragment.f231i) != null) && c(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (c(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public void p(Fragment fragment) {
        if (fragment == null || (fragment.equals(a(fragment.f231i)) && (fragment.w == null || fragment.v == this))) {
            Fragment fragment2 = this.f2017q;
            this.f2017q = fragment;
            f(fragment2);
            f(this.f2017q);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void q(Fragment fragment) {
        ViewGroup g2 = g(fragment);
        if (g2 != null) {
            if (g2.getTag(h.l.b.visible_removing_fragment_view_tag) == null) {
                g2.setTag(h.l.b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) g2.getTag(h.l.b.visible_removing_fragment_view_tag)).b(fragment.n());
        }
    }

    public void r(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            fragment.P = !fragment.P;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2016p;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2016p)));
            sb.append("}");
        } else {
            sb.append(this.f2014n.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2014n)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void c(Fragment fragment) {
        HashSet hashSet = this.f2010j.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((h.h.i.a) it.next()).a();
            }
            hashSet.clear();
            d(fragment);
            this.f2010j.remove(fragment);
        }
    }

    public final void f(Fragment fragment) {
        if (fragment != null && fragment.equals(a(fragment.f231i))) {
            boolean j2 = fragment.v.j(fragment);
            Boolean bool = fragment.f236n;
            if (bool == null || bool.booleanValue() != j2) {
                fragment.f236n = Boolean.valueOf(j2);
                r rVar = fragment.x;
                rVar.n();
                rVar.f(rVar.f2017q);
            }
        }
    }

    public final boolean i(Fragment fragment) {
        boolean z2;
        if (fragment.G && fragment.H) {
            return true;
        }
        r rVar = fragment.x;
        Iterator it = ((ArrayList) rVar.c.b()).iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z3 = rVar.i(fragment2);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public boolean j() {
        d(false);
        c(true);
        Fragment fragment = this.f2017q;
        if (fragment != null && fragment.i().j()) {
            return true;
        }
        boolean a2 = a(this.y, this.z, (String) null, -1, 0);
        if (a2) {
            this.f2005b = true;
            try {
                c(this.y, this.z);
            } finally {
                a();
            }
        }
        n();
        e();
        this.c.a();
        return a2;
    }

    public n g() {
        n nVar = this.r;
        if (nVar != null) {
            return nVar;
        }
        Fragment fragment = this.f2016p;
        if (fragment != null) {
            return fragment.v.g();
        }
        return this.s;
    }

    public boolean h() {
        return this.u || this.v;
    }

    public final void m() {
        Iterator it = ((ArrayList) this.c.b()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                m(fragment);
            }
        }
    }

    public Fragment c(String str) {
        for (y next : this.c.f2044b.values()) {
            if (next != null) {
                Fragment fragment = next.f2043b;
                if (!str.equals(fragment.f231i)) {
                    fragment = fragment.x.c(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public Fragment b(int i2) {
        z zVar = this.c;
        int size = zVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = zVar.a.get(size);
                if (fragment != null && fragment.z == i2) {
                    return fragment;
                }
            } else {
                for (y next : zVar.f2044b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f2043b;
                        if (fragment2.z == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public void d() {
        for (Fragment next : this.c.c()) {
            if (next != null) {
                next.I = true;
                next.x.d();
            }
        }
    }

    public final void e() {
        if (this.x) {
            this.x = false;
            m();
        }
    }

    public final void c(boolean z2) {
        if (this.f2005b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2014n == null) {
            if (this.w) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f2014n.f2002g.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !h()) {
            if (this.y == null) {
                this.y = new ArrayList<>();
                this.z = new ArrayList<>();
            }
            this.f2005b = true;
            try {
                a((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2005b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void d(Fragment fragment) {
        fragment.x.a(1);
        if (fragment.K != null) {
            n0 n0Var = fragment.V;
            n0Var.e.a(h.a.ON_DESTROY);
        }
        fragment.e = 1;
        fragment.I = false;
        fragment.y();
        if (fragment.I) {
            b.c cVar = ((h.p.a.b) h.p.a.a.a(fragment)).f2078b;
            int c2 = cVar.c.c();
            for (int i2 = 0; i2 < c2; i2++) {
                l lVar = cVar.c.d(i2).f2079k;
            }
            fragment.t = false;
            this.f2012l.g(fragment, false);
            fragment.J = null;
            fragment.K = null;
            fragment.V = null;
            fragment.W.b(null);
            fragment.r = false;
            return;
        }
        throw new o0(i.a.a.a.a.a("Fragment ", fragment, " did not call through to super.onDestroyView()"));
    }

    public void n(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.u);
        }
        boolean z2 = !fragment.v();
        if (!fragment.D || z2) {
            this.c.b(fragment);
            if (i(fragment)) {
                this.t = true;
            }
            fragment.f238p = true;
            q(fragment);
        }
    }

    public Fragment b(String str) {
        z zVar = this.c;
        if (zVar != null) {
            if (str != null) {
                int size = zVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Fragment fragment = zVar.a.get(size);
                    if (fragment != null && str.equals(fragment.B)) {
                        return fragment;
                    }
                }
            }
            if (str == null) {
                return null;
            }
            for (y next : zVar.f2044b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.f2043b;
                    if (str.equals(fragment2.B)) {
                        return fragment2;
                    }
                }
            }
            return null;
        }
        throw null;
    }

    public final boolean b(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            int size = this.a.size();
            boolean z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                z2 |= this.a.get(i2).a(arrayList, arrayList2);
            }
            this.a.clear();
            this.f2014n.f2002g.removeCallbacks(this.D);
            return z2;
        }
    }

    public Parcelable k() {
        int size;
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                this.B.remove(0).a();
            }
        }
        f();
        d(true);
        this.u = true;
        z zVar = this.c;
        b[] bVarArr = null;
        if (zVar != null) {
            ArrayList<x> arrayList = new ArrayList<>(zVar.f2044b.size());
            for (y next : zVar.f2044b.values()) {
                if (next != null) {
                    Fragment fragment = next.f2043b;
                    x xVar = new x(next.f2043b);
                    if (next.f2043b.e <= -1 || xVar.f2042q != null) {
                        xVar.f2042q = next.f2043b.f228f;
                    } else {
                        Bundle bundle = new Bundle();
                        Fragment fragment2 = next.f2043b;
                        fragment2.d(bundle);
                        fragment2.Y.b(bundle);
                        Parcelable k2 = fragment2.x.k();
                        if (k2 != null) {
                            bundle.putParcelable("android:support:fragments", k2);
                        }
                        next.a.d(next.f2043b, bundle, false);
                        if (bundle.isEmpty()) {
                            bundle = null;
                        }
                        if (next.f2043b.K != null) {
                            next.a();
                        }
                        if (next.f2043b.f229g != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", next.f2043b.f229g);
                        }
                        if (!next.f2043b.M) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", next.f2043b.M);
                        }
                        xVar.f2042q = bundle;
                        if (next.f2043b.f234l != null) {
                            if (bundle == null) {
                                xVar.f2042q = new Bundle();
                            }
                            xVar.f2042q.putString("android:target_state", next.f2043b.f234l);
                            int i2 = next.f2043b.f235m;
                            if (i2 != 0) {
                                xVar.f2042q.putInt("android:target_req_state", i2);
                            }
                        }
                    }
                    arrayList.add(xVar);
                    if (c(2)) {
                        Log.v("FragmentManager", "Saved state of " + fragment + ": " + xVar.f2042q);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (c(2)) {
                    Log.v("FragmentManager", "saveAllState: no fragments!");
                }
                return null;
            }
            ArrayList<String> d2 = this.c.d();
            ArrayList<a> arrayList2 = this.d;
            if (arrayList2 != null && (size = arrayList2.size()) > 0) {
                bVarArr = new b[size];
                for (int i3 = 0; i3 < size; i3++) {
                    bVarArr[i3] = new b(this.d.get(i3));
                    if (c(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.d.get(i3));
                    }
                }
            }
            u uVar = new u();
            uVar.e = arrayList;
            uVar.f2022f = d2;
            uVar.f2023g = bVarArr;
            uVar.f2024h = this.f2009i.get();
            Fragment fragment3 = this.f2017q;
            if (fragment3 != null) {
                uVar.f2025i = fragment3.f231i;
            }
            return uVar;
        }
        throw null;
    }

    public final void c(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                a(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).f1925o) {
                        if (i3 != i2) {
                            a(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1925o) {
                                i3++;
                            }
                        }
                        a(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    a(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public void b() {
        this.u = false;
        this.v = false;
        a(1);
    }

    public void b(boolean z2) {
        for (Fragment next : this.c.c()) {
            if (next != null) {
                next.x.b(z2);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.f2013m < 1) {
            return false;
        }
        boolean z2 = false;
        for (Fragment next : this.c.c()) {
            if (next != null) {
                if (!next.C ? next.x.b(menu) | false : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public boolean b(MenuItem menuItem) {
        if (this.f2013m < 1) {
            return false;
        }
        for (Fragment next : this.c.c()) {
            if (next != null) {
                if (!next.C && next.x.b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        this.w = true;
        d(true);
        f();
        a(-1);
        this.f2014n = null;
        this.f2015o = null;
        this.f2016p = null;
        if (this.f2007g != null) {
            Iterator<h.a.a> it = this.f2008h.f890b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f2007g = null;
        }
    }

    public void l() {
        synchronized (this.a) {
            boolean z2 = false;
            boolean z3 = this.B != null && !this.B.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f2014n.f2002g.removeCallbacks(this.D);
                this.f2014n.f2002g.post(this.D);
                n();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5, types: [android.view.LayoutInflater, androidx.fragment.app.Fragment, java.lang.String, h.l.d.o<?>, h.l.d.r] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v56, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r4v68 */
    /* JADX WARNING: type inference failed for: r4v69 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r4v71 */
    /* JADX WARNING: type inference failed for: r4v72 */
    /* JADX WARNING: type inference failed for: r4v73 */
    /* JADX WARNING: type inference failed for: r4v74 */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        if (r1 != 3) goto L_0x0845;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x060a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0614  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0618  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0620  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.fragment.app.Fragment r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r7 = r19
            h.l.d.z r1 = r0.c
            java.lang.String r2 = r7.f231i
            java.util.HashMap<java.lang.String, h.l.d.y> r1 = r1.f2044b
            java.lang.Object r1 = r1.get(r2)
            h.l.d.y r1 = (h.l.d.y) r1
            r2 = 1
            if (r1 != 0) goto L_0x001c
            h.l.d.y r1 = new h.l.d.y
            h.l.d.q r3 = r0.f2012l
            r1.<init>(r3, r7)
            r1.c = r2
        L_0x001c:
            r8 = r1
            int r1 = r8.c
            androidx.fragment.app.Fragment r3 = r8.f2043b
            boolean r4 = r3.f239q
            if (r4 == 0) goto L_0x0032
            boolean r3 = r3.r
            if (r3 == 0) goto L_0x002e
            int r1 = java.lang.Math.max(r1, r2)
            goto L_0x0032
        L_0x002e:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x0032:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            boolean r3 = r3.f237o
            if (r3 != 0) goto L_0x003c
            int r1 = java.lang.Math.min(r1, r2)
        L_0x003c:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            boolean r4 = r3.f238p
            r5 = -1
            if (r4 == 0) goto L_0x0052
            boolean r3 = r3.v()
            if (r3 == 0) goto L_0x004e
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0052
        L_0x004e:
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0052:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            boolean r4 = r3.L
            r6 = 3
            r9 = 2
            if (r4 == 0) goto L_0x0062
            int r3 = r3.e
            if (r3 >= r6) goto L_0x0062
            int r1 = java.lang.Math.min(r1, r9)
        L_0x0062:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            h.o.h$b r3 = r3.T
            int r3 = r3.ordinal()
            r4 = 4
            if (r3 == r9) goto L_0x007b
            if (r3 == r6) goto L_0x0076
            if (r3 == r4) goto L_0x007f
            int r1 = java.lang.Math.min(r1, r5)
            goto L_0x007f
        L_0x0076:
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x007f
        L_0x007b:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x007f:
            r3 = r20
            int r10 = java.lang.Math.min(r3, r1)
            int r1 = r7.e
            java.lang.String r11 = "Fragment "
            java.lang.String r12 = "FragmentManager"
            r3 = 0
            r4 = 0
            if (r1 > r10) goto L_0x0492
            if (r1 >= r10) goto L_0x009c
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<h.h.i.a>> r1 = r0.f2010j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x009c
            r18.c((androidx.fragment.app.Fragment) r19)
        L_0x009c:
            int r1 = r7.e
            if (r1 == r5) goto L_0x00aa
            if (r1 == 0) goto L_0x018f
            if (r1 == r2) goto L_0x0201
            if (r1 == r9) goto L_0x03d1
            if (r1 == r6) goto L_0x042d
            goto L_0x0845
        L_0x00aa:
            if (r10 <= r5) goto L_0x018f
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x00c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r9 = "moveto ATTACHED: "
            r1.append(r9)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r12, r1)
        L_0x00c6:
            androidx.fragment.app.Fragment r1 = r7.f233k
            java.lang.String r9 = " that does not belong to this FragmentManager!"
            java.lang.String r13 = " declared target fragment "
            if (r1 == 0) goto L_0x010c
            java.lang.String r14 = r1.f231i
            androidx.fragment.app.Fragment r14 = r0.a((java.lang.String) r14)
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x00ec
            androidx.fragment.app.Fragment r1 = r7.f233k
            int r14 = r1.e
            if (r14 >= r2) goto L_0x00e3
            r0.a((androidx.fragment.app.Fragment) r1, (int) r2)
        L_0x00e3:
            androidx.fragment.app.Fragment r1 = r7.f233k
            java.lang.String r1 = r1.f231i
            r7.f234l = r1
            r7.f233k = r4
            goto L_0x010c
        L_0x00ec:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r7)
            r2.append(r13)
            androidx.fragment.app.Fragment r3 = r7.f233k
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x010c:
            java.lang.String r1 = r7.f234l
            if (r1 == 0) goto L_0x013a
            h.l.d.z r14 = r0.c
            androidx.fragment.app.Fragment r1 = r14.b((java.lang.String) r1)
            if (r1 == 0) goto L_0x0120
            int r9 = r1.e
            if (r9 >= r2) goto L_0x013a
            r0.a((androidx.fragment.app.Fragment) r1, (int) r2)
            goto L_0x013a
        L_0x0120:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r7)
            r2.append(r13)
            java.lang.String r3 = r7.f234l
            java.lang.String r2 = i.a.a.a.a.a((java.lang.StringBuilder) r2, (java.lang.String) r3, (java.lang.String) r9)
            r1.<init>(r2)
            throw r1
        L_0x013a:
            h.l.d.o<?> r1 = r0.f2014n
            androidx.fragment.app.Fragment r9 = r0.f2016p
            androidx.fragment.app.Fragment r13 = r8.f2043b
            r13.w = r1
            r13.y = r9
            r13.v = r0
            h.l.d.q r9 = r8.a
            android.content.Context r14 = r1.f2001f
            r9.b((androidx.fragment.app.Fragment) r13, (android.content.Context) r14, (boolean) r3)
            androidx.fragment.app.Fragment r9 = r8.f2043b
            h.l.d.r r13 = r9.x
            h.l.d.o<?> r14 = r9.w
            h.l.d.d r15 = new h.l.d.d
            r15.<init>(r9)
            r13.a(r14, r15, r9)
            r9.e = r3
            r9.I = r3
            h.l.d.o<?> r13 = r9.w
            android.content.Context r13 = r13.f2001f
            r9.a((android.content.Context) r13)
            boolean r13 = r9.I
            if (r13 == 0) goto L_0x0183
            androidx.fragment.app.Fragment r9 = r8.f2043b
            androidx.fragment.app.Fragment r9 = r9.y
            if (r9 != 0) goto L_0x0179
            r9 = r1
            h.l.d.e$a r9 = (h.l.d.e.a) r9
            h.l.d.e r9 = h.l.d.e.this
            if (r9 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            throw r4
        L_0x0179:
            h.l.d.q r9 = r8.a
            androidx.fragment.app.Fragment r13 = r8.f2043b
            android.content.Context r1 = r1.f2001f
            r9.a((androidx.fragment.app.Fragment) r13, (android.content.Context) r1, (boolean) r3)
            goto L_0x018f
        L_0x0183:
            h.l.d.o0 r1 = new h.l.d.o0
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.String r2 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r9, (java.lang.String) r2)
            r1.<init>(r2)
            throw r1
        L_0x018f:
            if (r10 <= 0) goto L_0x0201
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x01a2
            java.lang.String r1 = "moveto CREATED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r9 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r9, (java.lang.String) r12)
        L_0x01a2:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            boolean r9 = r1.S
            if (r9 != 0) goto L_0x01e7
            h.l.d.q r9 = r8.a
            android.os.Bundle r13 = r1.f228f
            r9.c(r1, r13, r3)
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.os.Bundle r9 = r1.f228f
            h.l.d.r r13 = r1.x
            r13.i()
            r1.e = r2
            r1.I = r3
            h.t.b r13 = r1.Y
            r13.a(r9)
            r1.b((android.os.Bundle) r9)
            r1.S = r2
            boolean r9 = r1.I
            if (r9 == 0) goto L_0x01db
            h.o.m r1 = r1.U
            h.o.h$a r9 = h.o.h.a.ON_CREATE
            r1.a((h.o.h.a) r9)
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r9 = r8.f2043b
            android.os.Bundle r13 = r9.f228f
            r1.b((androidx.fragment.app.Fragment) r9, (android.os.Bundle) r13, (boolean) r3)
            goto L_0x0201
        L_0x01db:
            h.l.d.o0 r2 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onCreate()"
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r1, (java.lang.String) r3)
            r2.<init>(r1)
            throw r2
        L_0x01e7:
            android.os.Bundle r9 = r1.f228f
            if (r9 == 0) goto L_0x01fd
            java.lang.String r13 = "android:support:fragments"
            android.os.Parcelable r9 = r9.getParcelable(r13)
            if (r9 == 0) goto L_0x01fd
            h.l.d.r r13 = r1.x
            r13.a((android.os.Parcelable) r9)
            h.l.d.r r1 = r1.x
            r1.b()
        L_0x01fd:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            r1.e = r2
        L_0x0201:
            r1 = 8
            java.lang.String r9 = "moveto CREATE_VIEW: "
            if (r10 <= r5) goto L_0x025d
            androidx.fragment.app.Fragment r13 = r8.f2043b
            boolean r14 = r13.f239q
            if (r14 == 0) goto L_0x025d
            boolean r14 = r13.r
            if (r14 == 0) goto L_0x025d
            boolean r13 = r13.t
            if (r13 != 0) goto L_0x025d
            boolean r13 = c((int) r6)
            if (r13 == 0) goto L_0x0224
            java.lang.StringBuilder r13 = i.a.a.a.a.a(r9)
            androidx.fragment.app.Fragment r14 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r13, (androidx.fragment.app.Fragment) r14, (java.lang.String) r12)
        L_0x0224:
            androidx.fragment.app.Fragment r13 = r8.f2043b
            android.os.Bundle r14 = r13.f228f
            android.view.LayoutInflater r14 = r13.c((android.os.Bundle) r14)
            r13.R = r14
            androidx.fragment.app.Fragment r15 = r8.f2043b
            android.os.Bundle r15 = r15.f228f
            r13.b(r14, r4, r15)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r4 = r4.K
            if (r4 == 0) goto L_0x025d
            r4.setSaveFromParentEnabled(r3)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            boolean r13 = r4.C
            if (r13 == 0) goto L_0x0249
            android.view.View r4 = r4.K
            r4.setVisibility(r1)
        L_0x0249:
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r13 = r4.K
            android.os.Bundle r14 = r4.f228f
            r4.a((android.view.View) r13, (android.os.Bundle) r14)
            h.l.d.q r4 = r8.a
            androidx.fragment.app.Fragment r13 = r8.f2043b
            android.view.View r14 = r13.K
            android.os.Bundle r15 = r13.f228f
            r4.a(r13, r14, r15, r3)
        L_0x025d:
            if (r10 <= r2) goto L_0x03d1
            h.l.d.k r4 = r0.f2015o
            androidx.fragment.app.Fragment r13 = r8.f2043b
            boolean r13 = r13.f239q
            if (r13 == 0) goto L_0x0269
            goto L_0x0355
        L_0x0269:
            boolean r13 = c((int) r6)
            if (r13 == 0) goto L_0x0278
            java.lang.StringBuilder r9 = i.a.a.a.a.a(r9)
            androidx.fragment.app.Fragment r13 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r9, (androidx.fragment.app.Fragment) r13, (java.lang.String) r12)
        L_0x0278:
            androidx.fragment.app.Fragment r9 = r8.f2043b
            android.view.ViewGroup r13 = r9.J
            if (r13 == 0) goto L_0x027f
            goto L_0x02ec
        L_0x027f:
            int r9 = r9.A
            if (r9 == 0) goto L_0x02eb
            if (r9 == r5) goto L_0x02d1
            android.view.View r4 = r4.a(r9)
            r13 = r4
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            if (r13 != 0) goto L_0x02ec
            androidx.fragment.app.Fragment r4 = r8.f2043b
            boolean r5 = r4.s
            if (r5 == 0) goto L_0x0295
            goto L_0x02ec
        L_0x0295:
            android.content.res.Resources r1 = r4.p()     // Catch:{ NotFoundException -> 0x02a2 }
            androidx.fragment.app.Fragment r2 = r8.f2043b     // Catch:{ NotFoundException -> 0x02a2 }
            int r2 = r2.A     // Catch:{ NotFoundException -> 0x02a2 }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x02a2 }
            goto L_0x02a4
        L_0x02a2:
            java.lang.String r1 = "unknown"
        L_0x02a4:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "No view found for id 0x"
            java.lang.StringBuilder r3 = i.a.a.a.a.a(r3)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            int r4 = r4.A
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            androidx.fragment.app.Fragment r1 = r8.f2043b
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x02d1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot create fragment "
            java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
            androidx.fragment.app.Fragment r3 = r8.f2043b
            r2.append(r3)
            java.lang.String r3 = " for a container view with no id"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x02eb:
            r13 = 0
        L_0x02ec:
            androidx.fragment.app.Fragment r4 = r8.f2043b
            r4.J = r13
            android.os.Bundle r5 = r4.f228f
            android.view.LayoutInflater r5 = r4.c((android.os.Bundle) r5)
            r4.R = r5
            androidx.fragment.app.Fragment r9 = r8.f2043b
            android.os.Bundle r9 = r9.f228f
            r4.b(r5, r13, r9)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r4 = r4.K
            if (r4 == 0) goto L_0x0355
            r4.setSaveFromParentEnabled(r3)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r5 = r4.K
            int r9 = h.l.b.fragment_container_view_tag
            r5.setTag(r9, r4)
            if (r13 == 0) goto L_0x031a
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r4 = r4.K
            r13.addView(r4)
        L_0x031a:
            androidx.fragment.app.Fragment r4 = r8.f2043b
            boolean r5 = r4.C
            if (r5 == 0) goto L_0x0325
            android.view.View r4 = r4.K
            r4.setVisibility(r1)
        L_0x0325:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.view.View r1 = r1.K
            h.h.m.m.C(r1)
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.view.View r4 = r1.K
            android.os.Bundle r5 = r1.f228f
            r1.a((android.view.View) r4, (android.os.Bundle) r5)
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.View r5 = r4.K
            android.os.Bundle r9 = r4.f228f
            r1.a(r4, r5, r9, r3)
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.view.View r4 = r1.K
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0352
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.view.ViewGroup r4 = r4.J
            if (r4 == 0) goto L_0x0352
            r4 = 1
            goto L_0x0353
        L_0x0352:
            r4 = 0
        L_0x0353:
            r1.O = r4
        L_0x0355:
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x0366
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r4, (java.lang.String) r12)
        L_0x0366:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.os.Bundle r4 = r1.f228f
            h.l.d.r r5 = r1.x
            r5.i()
            r5 = 2
            r1.e = r5
            r1.I = r3
            r1.a((android.os.Bundle) r4)
            boolean r4 = r1.I
            if (r4 == 0) goto L_0x03c5
            h.l.d.r r1 = r1.x
            r1.u = r3
            r1.v = r3
            r1.a((int) r5)
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r4 = r8.f2043b
            android.os.Bundle r5 = r4.f228f
            r1.a((androidx.fragment.app.Fragment) r4, (android.os.Bundle) r5, (boolean) r3)
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x039e
            java.lang.String r1 = "moveto RESTORE_VIEW_STATE: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r4, (java.lang.String) r12)
        L_0x039e:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            android.view.View r4 = r1.K
            if (r4 == 0) goto L_0x03bf
            android.util.SparseArray<android.os.Parcelable> r5 = r1.f229g
            if (r5 == 0) goto L_0x03ae
            r4.restoreHierarchyState(r5)
            r4 = 0
            r1.f229g = r4
        L_0x03ae:
            r1.I = r3
            r1.I = r2
            android.view.View r4 = r1.K
            if (r4 == 0) goto L_0x03bf
            h.l.d.n0 r1 = r1.V
            h.o.h$a r4 = h.o.h.a.ON_CREATE
            h.o.m r1 = r1.e
            r1.a((h.o.h.a) r4)
        L_0x03bf:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            r4 = 0
            r1.f228f = r4
            goto L_0x03d1
        L_0x03c5:
            h.l.d.o0 r2 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onActivityCreated()"
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r1, (java.lang.String) r3)
            r2.<init>(r1)
            throw r2
        L_0x03d1:
            r1 = 2
            if (r10 <= r1) goto L_0x042d
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x03e5
            java.lang.String r1 = "moveto STARTED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r4, (java.lang.String) r12)
        L_0x03e5:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            h.l.d.r r4 = r1.x
            r4.i()
            h.l.d.r r4 = r1.x
            r4.d((boolean) r2)
            r1.e = r6
            r1.I = r3
            r1.B()
            boolean r4 = r1.I
            if (r4 == 0) goto L_0x0421
            h.o.m r4 = r1.U
            h.o.h$a r5 = h.o.h.a.ON_START
            r4.a((h.o.h.a) r5)
            android.view.View r4 = r1.K
            if (r4 == 0) goto L_0x0410
            h.l.d.n0 r4 = r1.V
            h.o.h$a r5 = h.o.h.a.ON_START
            h.o.m r4 = r4.e
            r4.a((h.o.h.a) r5)
        L_0x0410:
            h.l.d.r r1 = r1.x
            r1.u = r3
            r1.v = r3
            r1.a((int) r6)
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r4 = r8.f2043b
            r1.e(r4, r3)
            goto L_0x042d
        L_0x0421:
            h.l.d.o0 r2 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onStart()"
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r1, (java.lang.String) r3)
            r2.<init>(r1)
            throw r2
        L_0x042d:
            if (r10 <= r6) goto L_0x0845
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x0440
            java.lang.String r1 = "moveto RESUMED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r4 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r4, (java.lang.String) r12)
        L_0x0440:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            h.l.d.r r4 = r1.x
            r4.i()
            h.l.d.r r4 = r1.x
            r4.d((boolean) r2)
            r2 = 4
            r1.e = r2
            r1.I = r3
            r1.A()
            boolean r2 = r1.I
            if (r2 == 0) goto L_0x0486
            h.o.m r2 = r1.U
            h.o.h$a r4 = h.o.h.a.ON_RESUME
            r2.a((h.o.h.a) r4)
            android.view.View r2 = r1.K
            if (r2 == 0) goto L_0x046c
            h.l.d.n0 r2 = r1.V
            h.o.h$a r4 = h.o.h.a.ON_RESUME
            h.o.m r2 = r2.e
            r2.a((h.o.h.a) r4)
        L_0x046c:
            h.l.d.r r1 = r1.x
            r1.u = r3
            r1.v = r3
            r2 = 4
            r1.a((int) r2)
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r2 = r8.f2043b
            r1.d(r2, r3)
            androidx.fragment.app.Fragment r1 = r8.f2043b
            r2 = 0
            r1.f228f = r2
            r1.f229g = r2
            goto L_0x0845
        L_0x0486:
            h.l.d.o0 r2 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r1, (java.lang.String) r3)
            r2.<init>(r1)
            throw r2
        L_0x0492:
            if (r1 <= r10) goto L_0x0845
            if (r1 == 0) goto L_0x0796
            if (r1 == r2) goto L_0x061c
            r9 = 2
            if (r1 == r9) goto L_0x052e
            if (r1 == r6) goto L_0x04dd
            r9 = 4
            if (r1 == r9) goto L_0x04a2
            goto L_0x0845
        L_0x04a2:
            if (r10 >= r9) goto L_0x04dd
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x04b5
            java.lang.String r1 = "movefrom RESUMED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r9 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r9, (java.lang.String) r12)
        L_0x04b5:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            h.l.d.r r9 = r1.x
            r9.a((int) r6)
            android.view.View r9 = r1.K
            if (r9 == 0) goto L_0x04c9
            h.l.d.n0 r9 = r1.V
            h.o.h$a r13 = h.o.h.a.ON_PAUSE
            h.o.m r9 = r9.e
            r9.a((h.o.h.a) r13)
        L_0x04c9:
            h.o.m r9 = r1.U
            h.o.h$a r13 = h.o.h.a.ON_PAUSE
            r9.a((h.o.h.a) r13)
            r1.e = r6
            r1.I = r3
            r1.I = r2
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r9 = r8.f2043b
            r1.c(r9, r3)
        L_0x04dd:
            if (r10 >= r6) goto L_0x052e
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x04f0
            java.lang.String r1 = "movefrom STARTED: "
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            androidx.fragment.app.Fragment r9 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r1, (androidx.fragment.app.Fragment) r9, (java.lang.String) r12)
        L_0x04f0:
            androidx.fragment.app.Fragment r1 = r8.f2043b
            h.l.d.r r9 = r1.x
            r9.v = r2
            r13 = 2
            r9.a((int) r13)
            android.view.View r9 = r1.K
            if (r9 == 0) goto L_0x0507
            h.l.d.n0 r9 = r1.V
            h.o.h$a r13 = h.o.h.a.ON_STOP
            h.o.m r9 = r9.e
            r9.a((h.o.h.a) r13)
        L_0x0507:
            h.o.m r9 = r1.U
            h.o.h$a r13 = h.o.h.a.ON_STOP
            r9.a((h.o.h.a) r13)
            r9 = 2
            r1.e = r9
            r1.I = r3
            r1.C()
            boolean r9 = r1.I
            if (r9 == 0) goto L_0x0522
            h.l.d.q r1 = r8.a
            androidx.fragment.app.Fragment r9 = r8.f2043b
            r1.f(r9, r3)
            goto L_0x052e
        L_0x0522:
            h.l.d.o0 r2 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onStop()"
            java.lang.String r1 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r1, (java.lang.String) r3)
            r2.<init>(r1)
            throw r2
        L_0x052e:
            r1 = 2
            if (r10 >= r1) goto L_0x061c
            boolean r1 = c((int) r6)
            if (r1 == 0) goto L_0x054b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r12, r1)
        L_0x054b:
            android.view.View r1 = r7.K
            if (r1 == 0) goto L_0x0563
            h.l.d.o<?> r1 = r0.f2014n
            h.l.d.e$a r1 = (h.l.d.e.a) r1
            h.l.d.e r1 = h.l.d.e.this
            boolean r1 = r1.isFinishing()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0563
            android.util.SparseArray<android.os.Parcelable> r1 = r7.f229g
            if (r1 != 0) goto L_0x0563
            r8.a()
        L_0x0563:
            android.view.View r1 = r7.K
            if (r1 == 0) goto L_0x060b
            android.view.ViewGroup r2 = r7.J
            if (r2 == 0) goto L_0x060b
            r2.endViewTransition(r1)
            android.view.View r1 = r7.K
            r1.clearAnimation()
            boolean r1 = r19.w()
            if (r1 != 0) goto L_0x060b
            int r1 = r0.f2013m
            r2 = 0
            if (r1 <= r5) goto L_0x059b
            boolean r1 = r0.w
            if (r1 != 0) goto L_0x059b
            android.view.View r1 = r7.K
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x059b
            float r1 = r7.Q
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x059b
            h.l.d.o<?> r1 = r0.f2014n
            android.content.Context r1 = r1.f2001f
            h.l.d.k r5 = r0.f2015o
            h.l.d.i r1 = g.a.a.b.a.a((android.content.Context) r1, (h.l.d.k) r5, (androidx.fragment.app.Fragment) r7, (boolean) r3)
            goto L_0x059c
        L_0x059b:
            r1 = r4
        L_0x059c:
            r7.Q = r2
            android.view.ViewGroup r9 = r7.J
            android.view.View r13 = r7.K
            if (r1 == 0) goto L_0x0602
            r7.c((int) r10)
            h.l.d.h0$a r2 = r0.f2011k
            android.view.View r3 = r7.K
            android.view.ViewGroup r4 = r7.J
            r4.startViewTransition(r3)
            h.h.i.a r6 = new h.h.i.a
            r6.<init>()
            h.l.d.f r5 = new h.l.d.f
            r5.<init>(r7)
            r6.a(r5)
            r5 = r2
            h.l.d.r$b r5 = (h.l.d.r.b) r5
            r5.b(r7, r6)
            android.view.animation.Animation r2 = r1.a
            if (r2 == 0) goto L_0x05e3
            h.l.d.j r2 = new h.l.d.j
            android.view.animation.Animation r1 = r1.a
            r2.<init>(r1, r4, r3)
            android.view.View r1 = r7.K
            r7.a((android.view.View) r1)
            h.l.d.g r1 = new h.l.d.g
            r1.<init>(r4, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.K
            r1.startAnimation(r2)
            r1 = 0
            r4 = 0
            goto L_0x0603
        L_0x05e3:
            android.animation.Animator r14 = r1.f1984b
            r7.a((android.animation.Animator) r14)
            h.l.d.h r15 = new h.l.d.h
            r16 = 0
            r17 = 0
            r1 = r15
            r2 = r4
            r4 = r19
            r1.<init>(r2, r3, r4, r5, r6)
            r14.addListener(r15)
            android.view.View r1 = r7.K
            r14.setTarget(r1)
            r14.start()
            r4 = r16
        L_0x0602:
            r1 = 0
        L_0x0603:
            r9.removeView(r13)
            android.view.ViewGroup r2 = r7.J
            if (r9 == r2) goto L_0x060c
            return
        L_0x060b:
            r1 = 0
        L_0x060c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<h.h.i.a>> r2 = r0.f2010j
            java.lang.Object r2 = r2.get(r7)
            if (r2 != 0) goto L_0x0618
            r18.d((androidx.fragment.app.Fragment) r19)
            goto L_0x061d
        L_0x0618:
            r7.c((int) r10)
            goto L_0x061d
        L_0x061c:
            r1 = 0
        L_0x061d:
            r2 = 1
            if (r10 >= r2) goto L_0x0797
            boolean r2 = r7.f238p
            if (r2 == 0) goto L_0x062c
            boolean r2 = r19.v()
            if (r2 != 0) goto L_0x062c
            r2 = 1
            goto L_0x062d
        L_0x062c:
            r2 = 0
        L_0x062d:
            if (r2 != 0) goto L_0x064b
            h.l.d.v r2 = r0.C
            boolean r2 = r2.a(r7)
            if (r2 == 0) goto L_0x0638
            goto L_0x064b
        L_0x0638:
            java.lang.String r2 = r7.f234l
            if (r2 == 0) goto L_0x06b6
            h.l.d.z r3 = r0.c
            androidx.fragment.app.Fragment r2 = r3.b((java.lang.String) r2)
            if (r2 == 0) goto L_0x06b6
            boolean r3 = r2.E
            if (r3 == 0) goto L_0x06b6
            r7.f233k = r2
            goto L_0x06b6
        L_0x064b:
            androidx.fragment.app.Fragment r2 = r8.f2043b
            h.l.d.z r3 = r0.c
            java.lang.String r5 = r2.f231i
            boolean r3 = r3.a((java.lang.String) r5)
            if (r3 != 0) goto L_0x0658
            goto L_0x06b6
        L_0x0658:
            r3 = 2
            boolean r3 = c((int) r3)
            if (r3 == 0) goto L_0x0673
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Removed fragment from active set "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r12, r3)
        L_0x0673:
            h.l.d.z r3 = r0.c
            if (r3 == 0) goto L_0x0795
            androidx.fragment.app.Fragment r5 = r8.f2043b
            java.util.HashMap<java.lang.String, h.l.d.y> r6 = r3.f2044b
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        L_0x0683:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x06a2
            java.lang.Object r9 = r6.next()
            h.l.d.y r9 = (h.l.d.y) r9
            if (r9 == 0) goto L_0x0683
            androidx.fragment.app.Fragment r9 = r9.f2043b
            java.lang.String r13 = r5.f231i
            java.lang.String r14 = r9.f234l
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0683
            r9.f233k = r5
            r9.f234l = r4
            goto L_0x0683
        L_0x06a2:
            java.util.HashMap<java.lang.String, h.l.d.y> r6 = r3.f2044b
            java.lang.String r9 = r5.f231i
            r6.put(r9, r4)
            java.lang.String r6 = r5.f234l
            if (r6 == 0) goto L_0x06b3
            androidx.fragment.app.Fragment r3 = r3.b((java.lang.String) r6)
            r5.f233k = r3
        L_0x06b3:
            r0.o(r2)
        L_0x06b6:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<h.h.i.a>> r2 = r0.f2010j
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L_0x06c5
            r7.c((int) r10)
            r2 = 1
            r10 = 1
            goto L_0x0797
        L_0x06c5:
            h.l.d.o<?> r2 = r0.f2014n
            h.l.d.v r3 = r0.C
            r5 = 3
            boolean r5 = c((int) r5)
            if (r5 == 0) goto L_0x06db
            java.lang.String r5 = "movefrom CREATED: "
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            androidx.fragment.app.Fragment r6 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r5, (androidx.fragment.app.Fragment) r6, (java.lang.String) r12)
        L_0x06db:
            androidx.fragment.app.Fragment r5 = r8.f2043b
            boolean r6 = r5.f238p
            if (r6 == 0) goto L_0x06e9
            boolean r5 = r5.v()
            if (r5 != 0) goto L_0x06e9
            r5 = 1
            goto L_0x06ea
        L_0x06e9:
            r5 = 0
        L_0x06ea:
            if (r5 != 0) goto L_0x06f7
            androidx.fragment.app.Fragment r6 = r8.f2043b
            boolean r6 = r3.a(r6)
            if (r6 == 0) goto L_0x06f5
            goto L_0x06f7
        L_0x06f5:
            r6 = 0
            goto L_0x06f8
        L_0x06f7:
            r6 = 1
        L_0x06f8:
            if (r6 == 0) goto L_0x0790
            boolean r6 = r2 instanceof h.o.d0
            if (r6 == 0) goto L_0x0701
            boolean r2 = r3.f2028g
            goto L_0x0711
        L_0x0701:
            android.content.Context r2 = r2.f2001f
            boolean r6 = r2 instanceof android.app.Activity
            if (r6 == 0) goto L_0x0710
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isChangingConfigurations()
            r2 = r2 ^ 1
            goto L_0x0711
        L_0x0710:
            r2 = 1
        L_0x0711:
            if (r5 != 0) goto L_0x0715
            if (r2 == 0) goto L_0x0760
        L_0x0715:
            androidx.fragment.app.Fragment r2 = r8.f2043b
            if (r3 == 0) goto L_0x078f
            r5 = 3
            boolean r5 = c((int) r5)
            if (r5 == 0) goto L_0x0734
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Clearing non-config state for "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r12, r5)
        L_0x0734:
            java.util.HashMap<java.lang.String, h.l.d.v> r5 = r3.d
            java.lang.String r6 = r2.f231i
            java.lang.Object r5 = r5.get(r6)
            h.l.d.v r5 = (h.l.d.v) r5
            if (r5 == 0) goto L_0x074a
            r5.b()
            java.util.HashMap<java.lang.String, h.l.d.v> r5 = r3.d
            java.lang.String r6 = r2.f231i
            r5.remove(r6)
        L_0x074a:
            java.util.HashMap<java.lang.String, h.o.c0> r5 = r3.e
            java.lang.String r6 = r2.f231i
            java.lang.Object r5 = r5.get(r6)
            h.o.c0 r5 = (h.o.c0) r5
            if (r5 == 0) goto L_0x0760
            r5.a()
            java.util.HashMap<java.lang.String, h.o.c0> r3 = r3.e
            java.lang.String r2 = r2.f231i
            r3.remove(r2)
        L_0x0760:
            androidx.fragment.app.Fragment r2 = r8.f2043b
            h.l.d.r r3 = r2.x
            r3.c()
            h.o.m r3 = r2.U
            h.o.h$a r5 = h.o.h.a.ON_DESTROY
            r3.a((h.o.h.a) r5)
            r2.e = r1
            r2.I = r1
            r2.S = r1
            r2.x()
            boolean r3 = r2.I
            if (r3 == 0) goto L_0x0783
            h.l.d.q r2 = r8.a
            androidx.fragment.app.Fragment r3 = r8.f2043b
            r2.a(r3, r1)
            goto L_0x0797
        L_0x0783:
            h.l.d.o0 r1 = new h.l.d.o0
            java.lang.String r3 = " did not call through to super.onDestroy()"
            java.lang.String r2 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r2, (java.lang.String) r3)
            r1.<init>(r2)
            throw r1
        L_0x078f:
            throw r4
        L_0x0790:
            androidx.fragment.app.Fragment r2 = r8.f2043b
            r2.e = r1
            goto L_0x0797
        L_0x0795:
            throw r4
        L_0x0796:
            r1 = 0
        L_0x0797:
            if (r10 >= 0) goto L_0x0845
            h.l.d.v r2 = r0.C
            r3 = 3
            boolean r3 = c((int) r3)
            if (r3 == 0) goto L_0x07ad
            java.lang.String r3 = "movefrom ATTACHED: "
            java.lang.StringBuilder r3 = i.a.a.a.a.a(r3)
            androidx.fragment.app.Fragment r5 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r3, (androidx.fragment.app.Fragment) r5, (java.lang.String) r12)
        L_0x07ad:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            r5 = -1
            r3.e = r5
            r3.I = r1
            r3.z()
            r3.R = r4
            boolean r5 = r3.I
            if (r5 == 0) goto L_0x0839
            h.l.d.r r5 = r3.x
            boolean r6 = r5.w
            if (r6 != 0) goto L_0x07cd
            r5.c()
            h.l.d.t r5 = new h.l.d.t
            r5.<init>()
            r3.x = r5
        L_0x07cd:
            h.l.d.q r3 = r8.a
            androidx.fragment.app.Fragment r5 = r8.f2043b
            r3.b(r5, r1)
            androidx.fragment.app.Fragment r3 = r8.f2043b
            r5 = -1
            r3.e = r5
            r3.w = r4
            r3.y = r4
            r3.v = r4
            boolean r5 = r3.f238p
            if (r5 == 0) goto L_0x07eb
            boolean r3 = r3.v()
            if (r3 != 0) goto L_0x07eb
            r3 = 1
            goto L_0x07ec
        L_0x07eb:
            r3 = 0
        L_0x07ec:
            if (r3 != 0) goto L_0x07f6
            androidx.fragment.app.Fragment r3 = r8.f2043b
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x0845
        L_0x07f6:
            r2 = 3
            boolean r2 = c((int) r2)
            if (r2 == 0) goto L_0x0808
            java.lang.String r2 = "initState called for fragment: "
            java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
            androidx.fragment.app.Fragment r3 = r8.f2043b
            i.a.a.a.a.a((java.lang.StringBuilder) r2, (androidx.fragment.app.Fragment) r3, (java.lang.String) r12)
        L_0x0808:
            androidx.fragment.app.Fragment r2 = r8.f2043b
            r2.s()
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r2.f231i = r3
            r2.f237o = r1
            r2.f238p = r1
            r2.f239q = r1
            r2.r = r1
            r2.s = r1
            r2.u = r1
            r2.v = r4
            h.l.d.t r3 = new h.l.d.t
            r3.<init>()
            r2.x = r3
            r2.w = r4
            r2.z = r1
            r2.A = r1
            r2.B = r4
            r2.C = r1
            r2.D = r1
            goto L_0x0845
        L_0x0839:
            h.l.d.o0 r1 = new h.l.d.o0
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.String r2 = i.a.a.a.a.a((java.lang.String) r11, (androidx.fragment.app.Fragment) r3, (java.lang.String) r2)
            r1.<init>(r2)
            throw r1
        L_0x0845:
            int r1 = r7.e
            if (r1 == r10) goto L_0x0878
            r1 = 3
            boolean r1 = c((int) r1)
            if (r1 == 0) goto L_0x0876
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r12, r1)
        L_0x0876:
            r7.e = r10
        L_0x0878:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.r.a(androidx.fragment.app.Fragment, int):void");
    }

    public void a(Fragment fragment, boolean z2) {
        ViewGroup g2 = g(fragment);
        if (g2 != null && (g2 instanceof l)) {
            ((l) g2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public void a(int i2, boolean z2) {
        o<?> oVar;
        if (this.f2014n == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f2013m) {
            this.f2013m = i2;
            for (Fragment l2 : this.c.c()) {
                l(l2);
            }
            Iterator it = ((ArrayList) this.c.b()).iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment != null && !fragment.O) {
                    l(fragment);
                }
            }
            m();
            if (this.t && (oVar = this.f2014n) != null && this.f2013m == 4) {
                e.this.l();
                this.t = false;
            }
        }
    }

    public void a(Fragment fragment) {
        if (c(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        k(fragment);
        if (!fragment.D) {
            this.c.a(fragment);
            fragment.f238p = false;
            if (fragment.K == null) {
                fragment.P = false;
            }
            if (i(fragment)) {
                this.t = true;
            }
        }
    }

    public Fragment a(String str) {
        return this.c.b(str);
    }

    public void a(e eVar, boolean z2) {
        if (!z2) {
            if (this.f2014n == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (h()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.f2014n != null) {
                this.a.add(eVar);
                l();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void a() {
        this.f2005b = false;
        this.z.clear();
        this.y.clear();
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<g> arrayList3 = this.B;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            g gVar = this.B.get(i2);
            if (arrayList == null || gVar.a || (indexOf2 = arrayList.indexOf(gVar.f2020b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((gVar.c == 0) || (arrayList != null && gVar.f2020b.a(arrayList, 0, arrayList.size()))) {
                    this.B.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || gVar.a || (indexOf = arrayList.indexOf(gVar.f2020b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        gVar.a();
                    } else {
                        a aVar = gVar.f2020b;
                        aVar.f1914q.a(aVar, gVar.a, false, false);
                    }
                }
            } else {
                this.B.remove(i2);
                i2--;
                size--;
                a aVar2 = gVar.f2020b;
                aVar2.f1914q.a(aVar2, gVar.a, false, false);
            }
            i2++;
        }
    }

    public final void a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i8 = i2;
        int i9 = i3;
        boolean z3 = arrayList3.get(i8).f1925o;
        ArrayList<Fragment> arrayList5 = this.A;
        if (arrayList5 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.A.addAll(this.c.c());
        Fragment fragment = this.f2017q;
        int i10 = i8;
        boolean z4 = false;
        while (true) {
            int i11 = 1;
            if (i10 < i9) {
                a aVar = arrayList3.get(i10);
                int i12 = 3;
                if (!arrayList4.get(i10).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.A;
                    int i13 = 0;
                    while (i13 < aVar.a.size()) {
                        a0.a aVar2 = aVar.a.get(i13);
                        int i14 = aVar2.a;
                        if (i14 != i11) {
                            if (i14 == 2) {
                                Fragment fragment2 = aVar2.f1927b;
                                int i15 = fragment2.A;
                                int size = arrayList6.size() - 1;
                                boolean z5 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.A != i15) {
                                        i7 = i15;
                                    } else if (fragment3 == fragment2) {
                                        i7 = i15;
                                        z5 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i7 = i15;
                                            aVar.a.add(i13, new a0.a(9, fragment3));
                                            i13++;
                                            fragment = null;
                                        } else {
                                            i7 = i15;
                                        }
                                        a0.a aVar3 = new a0.a(3, fragment3);
                                        aVar3.c = aVar2.c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f1928f = aVar2.f1928f;
                                        aVar.a.add(i13, aVar3);
                                        arrayList6.remove(fragment3);
                                        i13++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i15 = i7;
                                }
                                if (z5) {
                                    aVar.a.remove(i13);
                                    i13--;
                                } else {
                                    i6 = 1;
                                    aVar2.a = 1;
                                    arrayList6.add(fragment2);
                                    i13 += i6;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i16 = i2;
                                    i12 = 3;
                                    i11 = 1;
                                }
                            } else if (i14 == i12 || i14 == 6) {
                                arrayList6.remove(aVar2.f1927b);
                                Fragment fragment4 = aVar2.f1927b;
                                if (fragment4 == fragment) {
                                    aVar.a.add(i13, new a0.a(9, fragment4));
                                    i13++;
                                    fragment = null;
                                }
                            } else if (i14 != 7) {
                                if (i14 == 8) {
                                    aVar.a.add(i13, new a0.a(9, fragment));
                                    i13++;
                                    fragment = aVar2.f1927b;
                                }
                            }
                            i6 = 1;
                            i13 += i6;
                            ArrayList<Boolean> arrayList82 = arrayList2;
                            int i162 = i2;
                            i12 = 3;
                            i11 = 1;
                        }
                        i6 = 1;
                        arrayList6.add(aVar2.f1927b);
                        i13 += i6;
                        ArrayList<Boolean> arrayList822 = arrayList2;
                        int i1622 = i2;
                        i12 = 3;
                        i11 = 1;
                    }
                } else {
                    ArrayList<Fragment> arrayList9 = this.A;
                    for (int size2 = aVar.a.size() - 1; size2 >= 0; size2--) {
                        a0.a aVar4 = aVar.a.get(size2);
                        int i17 = aVar4.a;
                        if (i17 != 1) {
                            if (i17 != 3) {
                                switch (i17) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f1927b;
                                        break;
                                    case 10:
                                        aVar4.f1930h = aVar4.f1929g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.f1927b);
                        }
                        arrayList9.remove(aVar4.f1927b);
                    }
                }
                z4 = z4 || aVar.f1917g;
                i10++;
                arrayList4 = arrayList2;
                int i18 = i2;
            } else {
                this.A.clear();
                if (!z3) {
                    h0.a(this, arrayList, arrayList2, i2, i3, false, this.f2011k);
                }
                int i19 = i2;
                while (i19 < i9) {
                    a aVar5 = arrayList3.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        aVar5.a(-1);
                        aVar5.b(i19 == i9 + -1);
                    } else {
                        aVar5.a(1);
                        aVar5.c();
                    }
                    i19++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                if (z3) {
                    h.e.c cVar = new h.e.c();
                    a((h.e.c<Fragment>) cVar);
                    i4 = i2;
                    int i20 = i9;
                    for (int i21 = i9 - 1; i21 >= i4; i21--) {
                        a aVar6 = arrayList3.get(i21);
                        boolean booleanValue = arrayList10.get(i21).booleanValue();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= aVar6.a.size()) {
                                z2 = false;
                            } else if (a.b(aVar6.a.get(i22))) {
                                z2 = true;
                            } else {
                                i22++;
                            }
                        }
                        if (z2 && !aVar6.a(arrayList3, i21 + 1, i9)) {
                            if (this.B == null) {
                                this.B = new ArrayList<>();
                            }
                            g gVar = new g(aVar6, booleanValue);
                            this.B.add(gVar);
                            for (int i23 = 0; i23 < aVar6.a.size(); i23++) {
                                a0.a aVar7 = aVar6.a.get(i23);
                                if (a.b(aVar7)) {
                                    aVar7.f1927b.a((Fragment.c) gVar);
                                }
                            }
                            if (booleanValue) {
                                aVar6.c();
                            } else {
                                aVar6.b(false);
                            }
                            i20--;
                            if (i21 != i20) {
                                arrayList3.remove(i21);
                                arrayList3.add(i20, aVar6);
                            }
                            a((h.e.c<Fragment>) cVar);
                        }
                    }
                    int i24 = cVar.f1547g;
                    for (int i25 = 0; i25 < i24; i25++) {
                        Fragment fragment5 = (Fragment) cVar.f1546f[i25];
                        if (!fragment5.f237o) {
                            View F = fragment5.F();
                            fragment5.Q = F.getAlpha();
                            F.setAlpha(0.0f);
                        }
                    }
                    i5 = i20;
                } else {
                    i4 = i2;
                    i5 = i9;
                }
                if (i5 != i4 && z3) {
                    h0.a(this, arrayList, arrayList2, i2, i5, true, this.f2011k);
                    a(this.f2013m, true);
                }
                while (i4 < i9) {
                    a aVar8 = arrayList3.get(i4);
                    if (arrayList10.get(i4).booleanValue() && aVar8.s >= 0) {
                        aVar8.s = -1;
                    }
                    if (aVar8.f1926p != null) {
                        for (int i26 = 0; i26 < aVar8.f1926p.size(); i26++) {
                            aVar8.f1926p.get(i26).run();
                        }
                        aVar8.f1926p = null;
                    }
                    i4++;
                }
                return;
            }
        }
    }

    public void a(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.b(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            h0.a(this, arrayList, arrayList2, 0, 1, true, this.f2011k);
        }
        if (z4) {
            a(this.f2013m, true);
        }
        Iterator it = ((ArrayList) this.c.b()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.K != null && fragment.O && aVar.b(fragment.A)) {
                float f2 = fragment.Q;
                if (f2 > 0.0f) {
                    fragment.K.setAlpha(f2);
                }
                if (z4) {
                    fragment.Q = 0.0f;
                } else {
                    fragment.Q = -1.0f;
                    fragment.O = false;
                }
            }
        }
    }

    public final void a(h.e.c<Fragment> cVar) {
        int i2 = this.f2013m;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            for (Fragment next : this.c.c()) {
                if (next.e < min) {
                    a(next, min);
                    if (next.K != null && !next.C && next.O) {
                        cVar.add(next);
                    }
                }
            }
        }
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(true);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.f1918h)) || (i2 >= 0 && i2 == aVar.s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1918h)) && (i2 < 0 || i2 != aVar2.s)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r3v47 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.os.Parcelable r19) {
        /*
            r18 = this;
            r0 = r18
            if (r19 != 0) goto L_0x0005
            return
        L_0x0005:
            r1 = r19
            h.l.d.u r1 = (h.l.d.u) r1
            java.util.ArrayList<h.l.d.x> r2 = r1.e
            if (r2 != 0) goto L_0x000e
            return
        L_0x000e:
            h.l.d.z r2 = r0.c
            java.util.HashMap<java.lang.String, h.l.d.y> r2 = r2.f2044b
            r2.clear()
            java.util.ArrayList<h.l.d.x> r2 = r1.e
            java.util.Iterator r2 = r2.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "): "
            r5 = 2
            java.lang.String r6 = "FragmentManager"
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r2.next()
            h.l.d.x r3 = (h.l.d.x) r3
            if (r3 == 0) goto L_0x001b
            h.l.d.v r7 = r0.C
            java.lang.String r8 = r3.f2031f
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r7 = r7.c
            java.lang.Object r7 = r7.get(r8)
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            if (r7 == 0) goto L_0x005e
            boolean r8 = c((int) r5)
            if (r8 == 0) goto L_0x0056
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "restoreSaveState: re-attaching retained "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L_0x0056:
            h.l.d.y r8 = new h.l.d.y
            h.l.d.q r9 = r0.f2012l
            r8.<init>(r9, r7, r3)
            goto L_0x0071
        L_0x005e:
            h.l.d.y r8 = new h.l.d.y
            h.l.d.q r7 = r0.f2012l
            h.l.d.o<?> r9 = r0.f2014n
            android.content.Context r9 = r9.f2001f
            java.lang.ClassLoader r9 = r9.getClassLoader()
            h.l.d.n r10 = r18.g()
            r8.<init>(r7, r9, r10, r3)
        L_0x0071:
            androidx.fragment.app.Fragment r3 = r8.f2043b
            r3.v = r0
            boolean r5 = c((int) r5)
            if (r5 == 0) goto L_0x0093
            java.lang.String r5 = "restoreSaveState: active ("
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            java.lang.String r7 = r3.f231i
            r5.append(r7)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.v(r6, r3)
        L_0x0093:
            h.l.d.o<?> r3 = r0.f2014n
            android.content.Context r3 = r3.f2001f
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r8.a(r3)
            h.l.d.z r3 = r0.c
            java.util.HashMap<java.lang.String, h.l.d.y> r3 = r3.f2044b
            androidx.fragment.app.Fragment r4 = r8.f2043b
            java.lang.String r4 = r4.f231i
            r3.put(r4, r8)
            int r3 = r0.f2013m
            r8.c = r3
            goto L_0x001b
        L_0x00af:
            h.l.d.v r2 = r0.C
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r2.c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x00bb:
            boolean r3 = r2.hasNext()
            r7 = 1
            if (r3 == 0) goto L_0x0100
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            h.l.d.z r8 = r0.c
            java.lang.String r9 = r3.f231i
            boolean r8 = r8.a((java.lang.String) r9)
            if (r8 != 0) goto L_0x00bb
            boolean r8 = c((int) r5)
            if (r8 == 0) goto L_0x00f6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Discarding retained Fragment "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " that was not found in the set of active Fragments "
            r8.append(r9)
            java.util.ArrayList<h.l.d.x> r9 = r1.e
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L_0x00f6:
            r0.a((androidx.fragment.app.Fragment) r3, (int) r7)
            r3.f238p = r7
            r7 = -1
            r0.a((androidx.fragment.app.Fragment) r3, (int) r7)
            goto L_0x00bb
        L_0x0100:
            h.l.d.z r2 = r0.c
            java.util.ArrayList<java.lang.String> r3 = r1.f2022f
            java.util.ArrayList<androidx.fragment.app.Fragment> r8 = r2.a
            r8.clear()
            if (r3 == 0) goto L_0x0153
            java.util.Iterator r3 = r3.iterator()
        L_0x010f:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0153
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            androidx.fragment.app.Fragment r9 = r2.b((java.lang.String) r8)
            if (r9 == 0) goto L_0x0145
            boolean r10 = c((int) r5)
            if (r10 == 0) goto L_0x0141
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "restoreSaveState: added ("
            r10.append(r11)
            r10.append(r8)
            r10.append(r4)
            r10.append(r9)
            java.lang.String r8 = r10.toString()
            android.util.Log.v(r6, r8)
        L_0x0141:
            r2.a((androidx.fragment.app.Fragment) r9)
            goto L_0x010f
        L_0x0145:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No instantiated fragment for ("
            java.lang.String r3 = ")"
            java.lang.String r2 = i.a.a.a.a.a((java.lang.String) r2, (java.lang.String) r8, (java.lang.String) r3)
            r1.<init>(r2)
            throw r1
        L_0x0153:
            h.l.d.b[] r2 = r1.f2023g
            r3 = 0
            if (r2 == 0) goto L_0x0281
            java.util.ArrayList r2 = new java.util.ArrayList
            h.l.d.b[] r8 = r1.f2023g
            int r8 = r8.length
            r2.<init>(r8)
            r0.d = r2
            r2 = 0
            r8 = 0
        L_0x0164:
            h.l.d.b[] r9 = r1.f2023g
            int r10 = r9.length
            if (r8 >= r10) goto L_0x0283
            r9 = r9[r8]
            if (r9 == 0) goto L_0x0280
            h.l.d.a r10 = new h.l.d.a
            r10.<init>(r0)
            r11 = 0
            r12 = 0
        L_0x0174:
            int[] r13 = r9.e
            int r13 = r13.length
            if (r11 >= r13) goto L_0x020d
            h.l.d.a0$a r13 = new h.l.d.a0$a
            r13.<init>()
            int[] r14 = r9.e
            int r15 = r11 + 1
            r11 = r14[r11]
            r13.a = r11
            boolean r11 = c((int) r5)
            if (r11 == 0) goto L_0x01b4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = "Instantiate "
            r11.append(r14)
            r11.append(r10)
            java.lang.String r14 = " op #"
            r11.append(r14)
            r11.append(r12)
            java.lang.String r14 = " base fragment #"
            r11.append(r14)
            int[] r14 = r9.e
            r14 = r14[r15]
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            android.util.Log.v(r6, r11)
        L_0x01b4:
            java.util.ArrayList<java.lang.String> r11 = r9.f1931f
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x01c7
            h.l.d.z r3 = r0.c
            androidx.fragment.app.Fragment r3 = r3.b((java.lang.String) r11)
            r13.f1927b = r3
            goto L_0x01c9
        L_0x01c7:
            r13.f1927b = r3
        L_0x01c9:
            h.o.h$b[] r3 = h.o.h.b.values()
            int[] r11 = r9.f1932g
            r11 = r11[r12]
            r3 = r3[r11]
            r13.f1929g = r3
            h.o.h$b[] r3 = h.o.h.b.values()
            int[] r11 = r9.f1933h
            r11 = r11[r12]
            r3 = r3[r11]
            r13.f1930h = r3
            int[] r3 = r9.e
            int r11 = r15 + 1
            r14 = r3[r15]
            r13.c = r14
            int r15 = r11 + 1
            r11 = r3[r11]
            r13.d = r11
            int r16 = r15 + 1
            r15 = r3[r15]
            r13.e = r15
            int r17 = r16 + 1
            r3 = r3[r16]
            r13.f1928f = r3
            r10.f1915b = r14
            r10.c = r11
            r10.d = r15
            r10.e = r3
            r10.a((h.l.d.a0.a) r13)
            int r12 = r12 + 1
            r3 = 0
            r11 = r17
            goto L_0x0174
        L_0x020d:
            int r3 = r9.f1934i
            r10.f1916f = r3
            java.lang.String r3 = r9.f1935j
            r10.f1918h = r3
            int r3 = r9.f1936k
            r10.s = r3
            r10.f1917g = r7
            int r3 = r9.f1937l
            r10.f1919i = r3
            java.lang.CharSequence r3 = r9.f1938m
            r10.f1920j = r3
            int r3 = r9.f1939n
            r10.f1921k = r3
            java.lang.CharSequence r3 = r9.f1940o
            r10.f1922l = r3
            java.util.ArrayList<java.lang.String> r3 = r9.f1941p
            r10.f1923m = r3
            java.util.ArrayList<java.lang.String> r3 = r9.f1942q
            r10.f1924n = r3
            boolean r3 = r9.r
            r10.f1925o = r3
            r10.a((int) r7)
            boolean r3 = c((int) r5)
            if (r3 == 0) goto L_0x0276
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "restoreAllState: back stack #"
            r3.append(r9)
            r3.append(r8)
            java.lang.String r9 = " (index "
            r3.append(r9)
            int r9 = r10.s
            r3.append(r9)
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r6, r3)
            h.h.l.a r3 = new h.h.l.a
            r3.<init>(r6)
            java.io.PrintWriter r9 = new java.io.PrintWriter
            r9.<init>(r3)
            java.lang.String r3 = "  "
            r10.a((java.lang.String) r3, (java.io.PrintWriter) r9, (boolean) r2)
            r9.close()
        L_0x0276:
            java.util.ArrayList<h.l.d.a> r3 = r0.d
            r3.add(r10)
            int r8 = r8 + 1
            r3 = 0
            goto L_0x0164
        L_0x0280:
            throw r3
        L_0x0281:
            r0.d = r3
        L_0x0283:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f2009i
            int r3 = r1.f2024h
            r2.set(r3)
            java.lang.String r1 = r1.f2025i
            if (r1 == 0) goto L_0x0299
            h.l.d.z r2 = r0.c
            androidx.fragment.app.Fragment r1 = r2.b((java.lang.String) r1)
            r0.f2017q = r1
            r0.f(r1)
        L_0x0299:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.r.a(android.os.Parcelable):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: h.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h.l.d.o<?> r5, h.l.d.k r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            h.l.d.o<?> r0 = r4.f2014n
            if (r0 != 0) goto L_0x00c8
            r4.f2014n = r5
            r4.f2015o = r6
            r4.f2016p = r7
            if (r7 == 0) goto L_0x000f
            r4.n()
        L_0x000f:
            boolean r6 = r5 instanceof h.a.c
            if (r6 == 0) goto L_0x0040
            r6 = r5
            h.a.c r6 = (h.a.c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.b()
            r4.f2007g = r0
            if (r7 == 0) goto L_0x001f
            r6 = r7
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r4.f2007g
            h.a.b r1 = r4.f2008h
            if (r0 == 0) goto L_0x003e
            h.o.h r6 = r6.a()
            r2 = r6
            h.o.m r2 = (h.o.m) r2
            h.o.h$b r2 = r2.f2058b
            h.o.h$b r3 = h.o.h.b.DESTROYED
            if (r2 != r3) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r2 = new androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable
            r2.<init>(r6, r1)
            java.util.concurrent.CopyOnWriteArrayList<h.a.a> r6 = r1.f890b
            r6.add(r2)
            goto L_0x0040
        L_0x003e:
            r5 = 0
            throw r5
        L_0x0040:
            if (r7 == 0) goto L_0x0063
            h.l.d.r r5 = r7.v
            h.l.d.v r5 = r5.C
            java.util.HashMap<java.lang.String, h.l.d.v> r6 = r5.d
            java.lang.String r0 = r7.f231i
            java.lang.Object r6 = r6.get(r0)
            h.l.d.v r6 = (h.l.d.v) r6
            if (r6 != 0) goto L_0x0060
            h.l.d.v r6 = new h.l.d.v
            boolean r0 = r5.f2027f
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, h.l.d.v> r5 = r5.d
            java.lang.String r7 = r7.f231i
            r5.put(r7, r6)
        L_0x0060:
            r4.C = r6
            goto L_0x00c7
        L_0x0063:
            boolean r6 = r5 instanceof h.o.d0
            if (r6 == 0) goto L_0x00bf
            h.o.d0 r5 = (h.o.d0) r5
            h.o.c0 r5 = r5.h()
            h.o.b0$b r6 = h.l.d.v.f2026i
            java.lang.Class<h.l.d.v> r7 = h.l.d.v.class
            java.lang.String r0 = r7.getCanonicalName()
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r1, (java.lang.String) r0)
            java.util.HashMap<java.lang.String, h.o.a0> r1 = r5.a
            java.lang.Object r1 = r1.get(r0)
            h.o.a0 r1 = (h.o.a0) r1
            boolean r2 = r7.isInstance(r1)
            if (r2 == 0) goto L_0x0095
            boolean r5 = r6 instanceof h.o.b0.e
            if (r5 == 0) goto L_0x00b2
            h.o.b0$e r6 = (h.o.b0.e) r6
            r6.a(r1)
            goto L_0x00b2
        L_0x0095:
            boolean r1 = r6 instanceof h.o.b0.c
            if (r1 == 0) goto L_0x00a0
            h.o.b0$c r6 = (h.o.b0.c) r6
            h.o.a0 r6 = r6.a(r0, r7)
            goto L_0x00a4
        L_0x00a0:
            h.o.a0 r6 = r6.a(r7)
        L_0x00a4:
            r1 = r6
            java.util.HashMap<java.lang.String, h.o.a0> r5 = r5.a
            java.lang.Object r5 = r5.put(r0, r1)
            h.o.a0 r5 = (h.o.a0) r5
            if (r5 == 0) goto L_0x00b2
            r5.b()
        L_0x00b2:
            h.l.d.v r1 = (h.l.d.v) r1
            r4.C = r1
            goto L_0x00c7
        L_0x00b7:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00bf:
            h.l.d.v r5 = new h.l.d.v
            r6 = 0
            r5.<init>(r6)
            r4.C = r5
        L_0x00c7:
            return
        L_0x00c8:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.r.a(h.l.d.o, h.l.d.k, androidx.fragment.app.Fragment):void");
    }

    /* JADX INFO: finally extract failed */
    public final void a(int i2) {
        try {
            this.f2005b = true;
            this.c.a(i2);
            a(i2, false);
            this.f2005b = false;
            d(true);
        } catch (Throwable th) {
            this.f2005b = false;
            throw th;
        }
    }

    public void a(boolean z2) {
        for (Fragment next : this.c.c()) {
            if (next != null) {
                next.x.a(z2);
            }
        }
    }

    public void a(Configuration configuration) {
        for (Fragment next : this.c.c()) {
            if (next != null) {
                next.I = true;
                next.x.a(configuration);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.f2013m < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.c()) {
            if (next != null) {
                if (!next.C ? next.x.a(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment = this.e.get(i2);
                if ((arrayList == null || !arrayList.contains(fragment)) && fragment == null) {
                    throw null;
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public boolean a(MenuItem menuItem) {
        if (this.f2013m < 1) {
            return false;
        }
        for (Fragment next : this.c.c()) {
            if (next != null) {
                if (!next.C && next.x.a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(Menu menu) {
        if (this.f2013m >= 1) {
            for (Fragment next : this.c.c()) {
                if (next != null && !next.C) {
                    next.x.a(menu);
                }
            }
        }
    }

    public void a(Fragment fragment, h.b bVar) {
        if (!fragment.equals(a(fragment.f231i)) || !(fragment.w == null || fragment.v == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.T = bVar;
    }
}
