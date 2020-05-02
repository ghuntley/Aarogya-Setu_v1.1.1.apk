package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h.l.d.e;
import h.l.d.n;
import h.l.d.n0;
import h.l.d.o;
import h.l.d.r;
import h.l.d.t;
import h.l.d.v;
import h.o.b0;
import h.o.c0;
import h.o.d0;
import h.o.g;
import h.o.h;
import h.o.j;
import h.o.k;
import h.o.l;
import h.o.m;
import h.o.r;
import h.o.y;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, l, d0, g, h.t.c {
    public static final Object Z = new Object();
    public int A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H = true;
    public boolean I;
    public ViewGroup J;
    public View K;
    public boolean L;
    public boolean M = true;
    public b N;
    public boolean O;
    public boolean P;
    public float Q;
    public LayoutInflater R;
    public boolean S;
    public h.b T = h.b.RESUMED;
    public m U;
    public n0 V;
    public r<l> W = new r<>();
    public b0.b X;
    public h.t.b Y;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f228f;

    /* renamed from: g  reason: collision with root package name */
    public SparseArray<Parcelable> f229g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f230h;

    /* renamed from: i  reason: collision with root package name */
    public String f231i = UUID.randomUUID().toString();

    /* renamed from: j  reason: collision with root package name */
    public Bundle f232j;

    /* renamed from: k  reason: collision with root package name */
    public Fragment f233k;

    /* renamed from: l  reason: collision with root package name */
    public String f234l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f235m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f236n = null;

    /* renamed from: o  reason: collision with root package name */
    public boolean f237o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f238p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f239q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public h.l.d.r v;
    public o<?> w;
    public h.l.d.r x = new t();
    public Fragment y;
    public int z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.d();
        }
    }

    public static class b {
        public View a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f240b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public Object f241f = null;

        /* renamed from: g  reason: collision with root package name */
        public Object f242g;

        /* renamed from: h  reason: collision with root package name */
        public Object f243h;

        /* renamed from: i  reason: collision with root package name */
        public Object f244i;

        /* renamed from: j  reason: collision with root package name */
        public Object f245j;

        /* renamed from: k  reason: collision with root package name */
        public Object f246k;

        /* renamed from: l  reason: collision with root package name */
        public Boolean f247l;

        /* renamed from: m  reason: collision with root package name */
        public Boolean f248m;

        /* renamed from: n  reason: collision with root package name */
        public h.h.e.o f249n;

        /* renamed from: o  reason: collision with root package name */
        public h.h.e.o f250o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f251p;

        /* renamed from: q  reason: collision with root package name */
        public c f252q;
        public boolean r;

        public b() {
            Object obj = Fragment.Z;
            this.f242g = obj;
            this.f243h = null;
            this.f244i = obj;
            this.f245j = null;
            this.f246k = obj;
            this.f249n = null;
            this.f250o = null;
        }
    }

    public interface c {
    }

    public Fragment() {
        s();
    }

    public void A() {
        this.I = true;
    }

    public void B() {
        this.I = true;
    }

    public void C() {
        this.I = true;
    }

    public final e D() {
        e f2 = f();
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException(i.a.a.a.a.a("Fragment ", this, " not attached to an activity."));
    }

    public final Context E() {
        Context k2 = k();
        if (k2 != null) {
            return k2;
        }
        throw new IllegalStateException(i.a.a.a.a.a("Fragment ", this, " not attached to a context."));
    }

    public final View F() {
        View view = this.K;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(i.a.a.a.a.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void G() {
        h.l.d.r rVar = this.v;
        if (rVar == null || rVar.f2014n == null) {
            e().f251p = false;
        } else if (Looper.myLooper() != this.v.f2014n.f2002g.getLooper()) {
            this.v.f2014n.f2002g.postAtFrontOfQueue(new a());
        } else {
            d();
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public h a() {
        return this.U;
    }

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(View view, Bundle bundle) {
    }

    public void b(boolean z2) {
        if (this.H != z2) {
            this.H = z2;
        }
    }

    public final h.t.a c() {
        return this.Y.f2228b;
    }

    public void d() {
        b bVar = this.N;
        Object obj = null;
        if (bVar != null) {
            bVar.f251p = false;
            Object obj2 = bVar.f252q;
            bVar.f252q = null;
            obj = obj2;
        }
        if (obj != null) {
            r.g gVar = (r.g) obj;
            int i2 = gVar.c - 1;
            gVar.c = i2;
            if (i2 == 0) {
                gVar.f2020b.f1914q.l();
            }
        }
    }

    public void d(Bundle bundle) {
    }

    public void e(Bundle bundle) {
        boolean z2;
        h.l.d.r rVar = this.v;
        if (rVar != null) {
            if (rVar == null) {
                z2 = false;
            } else {
                z2 = rVar.h();
            }
            if (z2) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f232j = bundle;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final e f() {
        o<?> oVar = this.w;
        if (oVar == null) {
            return null;
        }
        return (e) oVar.e;
    }

    public View g() {
        b bVar = this.N;
        if (bVar == null) {
            return null;
        }
        return bVar.a;
    }

    public c0 h() {
        h.l.d.r rVar = this.v;
        if (rVar != null) {
            v vVar = rVar.C;
            c0 c0Var = vVar.e.get(this.f231i);
            if (c0Var != null) {
                return c0Var;
            }
            c0 c0Var2 = new c0();
            vVar.e.put(this.f231i, c0Var2);
            return c0Var2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final h.l.d.r i() {
        if (this.w != null) {
            return this.x;
        }
        throw new IllegalStateException(i.a.a.a.a.a("Fragment ", this, " has not been attached yet."));
    }

    public b0.b j() {
        if (this.v != null) {
            if (this.X == null) {
                this.X = new y(D().getApplication(), this, this.f232j);
            }
            return this.X;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public Context k() {
        o<?> oVar = this.w;
        if (oVar == null) {
            return null;
        }
        return oVar.f2001f;
    }

    public Object l() {
        b bVar = this.N;
        if (bVar == null) {
            return null;
        }
        return bVar.f241f;
    }

    public Object m() {
        b bVar = this.N;
        if (bVar == null) {
            return null;
        }
        return bVar.f243h;
    }

    public int n() {
        b bVar = this.N;
        if (bVar == null) {
            return 0;
        }
        return bVar.d;
    }

    public final h.l.d.r o() {
        h.l.d.r rVar = this.v;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException(i.a.a.a.a.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.I = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        D().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.I = true;
    }

    public final Resources p() {
        return E().getResources();
    }

    public Object q() {
        b bVar = this.N;
        if (bVar == null) {
            return null;
        }
        return bVar.f245j;
    }

    public int r() {
        b bVar = this.N;
        if (bVar == null) {
            return 0;
        }
        return bVar.c;
    }

    public final void s() {
        this.U = new m(this);
        this.Y = new h.t.b(this);
        this.U.a((k) new j() {
            public void a(l lVar, h.a aVar) {
                View view;
                if (aVar == h.a.ON_STOP && (view = Fragment.this.K) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
    }

    public final boolean t() {
        return this.w != null && this.f237o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f231i);
        sb.append(")");
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" ");
            sb.append(this.B);
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean u() {
        b bVar = this.N;
        if (bVar == null) {
            return false;
        }
        return bVar.r;
    }

    public final boolean v() {
        return this.u > 0;
    }

    public final boolean w() {
        Fragment fragment = this.y;
        return fragment != null && (fragment.f238p || fragment.w());
    }

    public void x() {
        this.I = true;
    }

    public void y() {
        this.I = true;
    }

    public void z() {
        this.I = true;
    }

    @Deprecated
    public static Fragment a(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) n.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.e(bundle);
            }
            return fragment;
        } catch (InstantiationException e2) {
            throw new InstantiationException(i.a.a.a.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (IllegalAccessException e3) {
            throw new InstantiationException(i.a.a.a.a.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException(i.a.a.a.a.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException(i.a.a.a.a.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        boolean z2 = true;
        this.I = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.x.a(parcelable);
            this.x.b();
        }
        if (this.x.f2013m < 1) {
            z2 = false;
        }
        if (!z2) {
            this.x.b();
        }
    }

    @Deprecated
    public void c(boolean z2) {
        if (!this.M && z2 && this.e < 3 && this.v != null && t() && this.S) {
            this.v.m(this);
        }
        this.M = z2;
        this.L = this.e < 3 && !z2;
        if (this.f228f != null) {
            this.f230h = Boolean.valueOf(z2);
        }
    }

    public final b e() {
        if (this.N == null) {
            this.N = new b();
        }
        return this.N;
    }

    public void b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x.i();
        boolean z2 = true;
        this.t = true;
        this.V = new n0();
        View a2 = a(layoutInflater, viewGroup, bundle);
        this.K = a2;
        if (a2 != null) {
            n0 n0Var = this.V;
            if (n0Var.e == null) {
                n0Var.e = new m(n0Var);
            }
            this.W.b(this.V);
            return;
        }
        if (this.V.e == null) {
            z2 = false;
        }
        if (!z2) {
            this.V = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public LayoutInflater c(Bundle bundle) {
        o<?> oVar = this.w;
        if (oVar != null) {
            e.a aVar = (e.a) oVar;
            LayoutInflater cloneInContext = e.this.getLayoutInflater().cloneInContext(e.this);
            cloneInContext.setFactory2(this.x.f2006f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final String a(int i2) {
        return p().getString(i2);
    }

    public void a(AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.I = true;
        o<?> oVar = this.w;
        if (oVar == null) {
            activity = null;
        } else {
            activity = oVar.e;
        }
        if (activity != null) {
            this.I = false;
            this.I = true;
        }
    }

    public void a(Context context) {
        Activity activity;
        this.I = true;
        o<?> oVar = this.w;
        if (oVar == null) {
            activity = null;
        } else {
            activity = oVar.e;
        }
        if (activity != null) {
            this.I = false;
            this.I = true;
        }
    }

    public void c(int i2) {
        e().c = i2;
    }

    public void a(Bundle bundle) {
        this.I = true;
    }

    public void b(int i2) {
        if (this.N != null || i2 != 0) {
            e().d = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0125, code lost:
        r1 = r2.f234l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.z
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.A
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.B
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.e
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f231i
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.u
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f237o
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f238p
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f239q
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.r
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.C
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.D
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.H
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            r0 = 0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.E
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.M
            r5.println(r0)
            h.l.d.r r0 = r2.v
            if (r0 == 0) goto L_0x00c7
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            h.l.d.r r0 = r2.v
            r5.println(r0)
        L_0x00c7:
            h.l.d.o<?> r0 = r2.w
            if (r0 == 0) goto L_0x00d8
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            h.l.d.o<?> r0 = r2.w
            r5.println(r0)
        L_0x00d8:
            androidx.fragment.app.Fragment r0 = r2.y
            if (r0 == 0) goto L_0x00e9
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.Fragment r0 = r2.y
            r5.println(r0)
        L_0x00e9:
            android.os.Bundle r0 = r2.f232j
            if (r0 == 0) goto L_0x00fa
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f232j
            r5.println(r0)
        L_0x00fa:
            android.os.Bundle r0 = r2.f228f
            if (r0 == 0) goto L_0x010b
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f228f
            r5.println(r0)
        L_0x010b:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f229g
            if (r0 == 0) goto L_0x011c
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f229g
            r5.println(r0)
        L_0x011c:
            androidx.fragment.app.Fragment r0 = r2.f233k
            if (r0 == 0) goto L_0x0121
            goto L_0x012f
        L_0x0121:
            h.l.d.r r0 = r2.v
            if (r0 == 0) goto L_0x012e
            java.lang.String r1 = r2.f234l
            if (r1 == 0) goto L_0x012e
            androidx.fragment.app.Fragment r0 = r0.a((java.lang.String) r1)
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            if (r0 == 0) goto L_0x0146
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f235m
            r5.println(r0)
        L_0x0146:
            int r0 = r2.n()
            if (r0 == 0) goto L_0x015b
            r5.print(r3)
            java.lang.String r0 = "mNextAnim="
            r5.print(r0)
            int r0 = r2.n()
            r5.println(r0)
        L_0x015b:
            android.view.ViewGroup r0 = r2.J
            if (r0 == 0) goto L_0x016c
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.J
            r5.println(r0)
        L_0x016c:
            android.view.View r0 = r2.K
            if (r0 == 0) goto L_0x017d
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.K
            r5.println(r0)
        L_0x017d:
            android.view.View r0 = r2.g()
            if (r0 == 0) goto L_0x01a1
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.g()
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mStateAfterAnimating="
            r5.print(r0)
            int r0 = r2.r()
            r5.println(r0)
        L_0x01a1:
            android.content.Context r0 = r2.k()
            if (r0 == 0) goto L_0x01ae
            h.p.a.a r0 = h.p.a.a.a(r2)
            r0.a(r3, r4, r5, r6)
        L_0x01ae:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            h.l.d.r r1 = r2.x
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            h.l.d.r r0 = r2.x
            java.lang.String r1 = "  "
            java.lang.String r3 = i.a.a.a.a.b((java.lang.String) r3, (java.lang.String) r1)
            r0.a((java.lang.String) r3, (java.io.FileDescriptor) r4, (java.io.PrintWriter) r5, (java.lang.String[]) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.a(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void a(c cVar) {
        e();
        c cVar2 = this.N.f252q;
        if (cVar != cVar2) {
            if (cVar == null || cVar2 == null) {
                b bVar = this.N;
                if (bVar.f251p) {
                    bVar.f252q = cVar;
                }
                if (cVar != null) {
                    ((r.g) cVar).c++;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void a(View view) {
        e().a = view;
    }

    public void a(Animator animator) {
        e().f240b = animator;
    }

    public void a(boolean z2) {
        e().r = z2;
    }
}
