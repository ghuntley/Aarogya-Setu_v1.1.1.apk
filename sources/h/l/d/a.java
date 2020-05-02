package h.l.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import h.l.d.a0;
import h.l.d.r;
import h.o.h;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
public final class a extends a0 implements r.e {

    /* renamed from: q  reason: collision with root package name */
    public final r f1914q;
    public boolean r;
    public int s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(h.l.d.r r3) {
        /*
            r2 = this;
            h.l.d.n r0 = r3.g()
            h.l.d.o<?> r1 = r3.f2014n
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f2001f
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.s = r0
            r2.f1914q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.a.<init>(h.l.d.r):void");
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1918h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f1916f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1916f));
            }
            if (!(this.f1915b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1915b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f1919i == 0 && this.f1920j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1919i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1920j);
            }
            if (!(this.f1921k == 0 && this.f1922l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1921k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1922l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                a0.a aVar = this.a.get(i2);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a = i.a.a.a.a.a("cmd=");
                        a.append(aVar.a);
                        str2 = a.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1927b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f1928f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1928f));
                    }
                }
            }
        }
    }

    public boolean b(int i2) {
        int size = this.a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.a.get(i3).f1927b;
            int i4 = fragment != null ? fragment.A : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            a0.a aVar = this.a.get(i2);
            Fragment fragment = aVar.f1927b;
            if (fragment != null) {
                int i3 = this.f1916f;
                if (!(fragment.N == null && i3 == 0)) {
                    fragment.e();
                    fragment.N.e = i3;
                }
            }
            switch (aVar.a) {
                case 1:
                    fragment.b(aVar.c);
                    this.f1914q.a(fragment, false);
                    this.f1914q.a(fragment);
                    break;
                case 3:
                    fragment.b(aVar.d);
                    this.f1914q.n(fragment);
                    break;
                case 4:
                    fragment.b(aVar.d);
                    this.f1914q.h(fragment);
                    break;
                case 5:
                    fragment.b(aVar.c);
                    this.f1914q.a(fragment, false);
                    this.f1914q.r(fragment);
                    break;
                case 6:
                    fragment.b(aVar.d);
                    this.f1914q.e(fragment);
                    break;
                case 7:
                    fragment.b(aVar.c);
                    this.f1914q.a(fragment, false);
                    this.f1914q.b(fragment);
                    break;
                case 8:
                    this.f1914q.p(fragment);
                    break;
                case 9:
                    this.f1914q.p((Fragment) null);
                    break;
                case 10:
                    this.f1914q.a(fragment, aVar.f1930h);
                    break;
                default:
                    StringBuilder a = i.a.a.a.a.a("Unknown cmd: ");
                    a.append(aVar.a);
                    throw new IllegalArgumentException(a.toString());
            }
            if (!(this.f1925o || aVar.a == 1 || fragment == null)) {
                this.f1914q.l(fragment);
            }
        }
        if (!this.f1925o) {
            r rVar = this.f1914q;
            rVar.a(rVar.f2013m, true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.f1918h != null) {
            sb.append(" ");
            sb.append(this.f1918h);
        }
        sb.append("}");
        return sb.toString();
    }

    public void b(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            a0.a aVar = this.a.get(size);
            Fragment fragment = aVar.f1927b;
            if (fragment != null) {
                int i2 = this.f1916f;
                int i3 = 8194;
                if (i2 != 4097) {
                    i3 = i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099;
                }
                if (!(fragment.N == null && i3 == 0)) {
                    fragment.e();
                    fragment.N.e = i3;
                }
            }
            switch (aVar.a) {
                case 1:
                    fragment.b(aVar.f1928f);
                    this.f1914q.a(fragment, true);
                    this.f1914q.n(fragment);
                    break;
                case 3:
                    fragment.b(aVar.e);
                    this.f1914q.a(fragment);
                    break;
                case 4:
                    fragment.b(aVar.e);
                    this.f1914q.r(fragment);
                    break;
                case 5:
                    fragment.b(aVar.f1928f);
                    this.f1914q.a(fragment, true);
                    this.f1914q.h(fragment);
                    break;
                case 6:
                    fragment.b(aVar.e);
                    this.f1914q.b(fragment);
                    break;
                case 7:
                    fragment.b(aVar.f1928f);
                    this.f1914q.a(fragment, true);
                    this.f1914q.e(fragment);
                    break;
                case 8:
                    this.f1914q.p((Fragment) null);
                    break;
                case 9:
                    this.f1914q.p(fragment);
                    break;
                case 10:
                    this.f1914q.a(fragment, aVar.f1929g);
                    break;
                default:
                    StringBuilder a = i.a.a.a.a.a("Unknown cmd: ");
                    a.append(aVar.a);
                    throw new IllegalArgumentException(a.toString());
            }
            if (!(this.f1925o || aVar.a == 3 || fragment == null)) {
                this.f1914q.l(fragment);
            }
        }
        if (!this.f1925o && z) {
            r rVar = this.f1914q;
            rVar.a(rVar.f2013m, true);
        }
    }

    public static boolean b(a0.a aVar) {
        boolean z;
        Fragment fragment = aVar.f1927b;
        if (fragment == null || !fragment.f237o || fragment.K == null || fragment.D || fragment.C) {
            return false;
        }
        Fragment.b bVar = fragment.N;
        if (bVar == null) {
            z = false;
        } else {
            z = bVar.f251p;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public void b() {
        if (!this.f1917g) {
            r rVar = this.f1914q;
            if (rVar.f2014n != null && !rVar.w) {
                rVar.c(true);
                if (a(rVar.y, rVar.z)) {
                    rVar.f2005b = true;
                    try {
                        rVar.c(rVar.y, rVar.z);
                    } finally {
                        rVar.a();
                    }
                }
                rVar.n();
                rVar.e();
                rVar.c.a();
                return;
            }
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void a(int i2, Fragment fragment, String str, int i3) {
        super.a(i2, fragment, str, i3);
        fragment.v = this.f1914q;
    }

    public a0 a(Fragment fragment) {
        r rVar = fragment.v;
        if (rVar == null || rVar == this.f1914q) {
            super.a(fragment);
            return this;
        }
        StringBuilder a = i.a.a.a.a.a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        a.append(fragment.toString());
        a.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(a.toString());
    }

    public a0 a(Fragment fragment, h.b bVar) {
        if (fragment.v != this.f1914q) {
            StringBuilder a = i.a.a.a.a.a("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            a.append(this.f1914q);
            throw new IllegalArgumentException(a.toString());
        } else if (bVar.a(h.b.CREATED)) {
            super.a(fragment, bVar);
            return this;
        } else {
            StringBuilder a2 = i.a.a.a.a.a("Cannot set maximum Lifecycle below ");
            a2.append(h.b.CREATED);
            throw new IllegalArgumentException(a2.toString());
        }
    }

    public void a(int i2) {
        if (this.f1917g) {
            if (r.c(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.a.size();
            for (int i3 = 0; i3 < size; i3++) {
                a0.a aVar = this.a.get(i3);
                Fragment fragment = aVar.f1927b;
                if (fragment != null) {
                    fragment.u += i2;
                    if (r.c(2)) {
                        StringBuilder a = i.a.a.a.a.a("Bump nesting of ");
                        a.append(aVar.f1927b);
                        a.append(" to ");
                        a.append(aVar.f1927b.u);
                        Log.v("FragmentManager", a.toString());
                    }
                }
            }
        }
    }

    public int a() {
        return a(true);
    }

    public int a(boolean z) {
        if (!this.r) {
            if (r.c(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new h.h.l.a("FragmentManager"));
                a("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            if (this.f1917g) {
                this.s = this.f1914q.f2009i.getAndIncrement();
            } else {
                this.s = -1;
            }
            this.f1914q.a((r.e) this, z);
            return this.s;
        }
        throw new IllegalStateException("commit already called");
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (r.c(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1917g) {
            return true;
        }
        r rVar = this.f1914q;
        if (rVar.d == null) {
            rVar.d = new ArrayList<>();
        }
        rVar.d.add(this);
        return true;
    }

    public boolean a(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.a.get(i5).f1927b;
            int i6 = fragment != null ? fragment.A : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.a.get(i8).f1927b;
                        if ((fragment2 != null ? fragment2.A : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }
}
