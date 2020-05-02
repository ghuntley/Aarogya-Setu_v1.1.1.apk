package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import h.h.m.w.b;
import h.r.d.a;
import h.r.d.b;
import h.r.d.k;
import h.r.d.m;
import h.r.d.u;
import h.r.d.y;
import h.r.d.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecyclerView extends ViewGroup implements h.h.m.d, h.h.m.e {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (Build.VERSION.SDK_INT >= 23);
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    public static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    public static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    public static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    public static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    public static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    public static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new c();
    public h.r.d.u mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public g mAdapter;
    public h.r.d.a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public j mChildDrawingOrderCallback;
    public h.r.d.b mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public h.r.d.m mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public s mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public l mItemAnimator;
    public l.b mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList<n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastTouchX;
    public int mLastTouchY;
    public o mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final x mObserver;
    public List<q> mOnChildAttachStateListeners;
    public r mOnFlingListener;
    public final ArrayList<s> mOnItemTouchListeners;
    public final List<d0> mPendingAccessibilityImportanceChange;
    public y mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public m.b mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final v mRecycler;
    public w mRecyclerListener;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public t mScrollListener;
    public List<t> mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public h.h.m.g mScrollingChildHelper;
    public final a0 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final c0 mViewFlinger;
    public final z.b mViewInfoProcessCallback;
    public final h.r.d.z mViewInfoStore;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                h.r.d.k kVar = (h.r.d.k) lVar;
                boolean z = !kVar.f2098h.isEmpty();
                boolean z2 = !kVar.f2100j.isEmpty();
                boolean z3 = !kVar.f2101k.isEmpty();
                boolean z4 = !kVar.f2099i.isEmpty();
                if (z || z2 || z4 || z3) {
                    Iterator<d0> it = kVar.f2098h.iterator();
                    while (it.hasNext()) {
                        d0 next = it.next();
                        View view = next.e;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f2107q.add(next);
                        animate.setDuration(kVar.d).alpha(0.0f).setListener(new h.r.d.f(kVar, next, animate, view)).start();
                    }
                    kVar.f2098h.clear();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(kVar.f2100j);
                        kVar.f2103m.add(arrayList);
                        kVar.f2100j.clear();
                        h.r.d.c cVar = new h.r.d.c(kVar, arrayList);
                        if (z) {
                            h.h.m.m.a(((k.b) arrayList.get(0)).a.e, (Runnable) cVar, kVar.d);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z3) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(kVar.f2101k);
                        kVar.f2104n.add(arrayList2);
                        kVar.f2101k.clear();
                        h.r.d.d dVar = new h.r.d.d(kVar, arrayList2);
                        if (z) {
                            h.h.m.m.a(((k.a) arrayList2.get(0)).a.e, (Runnable) dVar, kVar.d);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(kVar.f2099i);
                        kVar.f2102l.add(arrayList3);
                        kVar.f2099i.clear();
                        h.r.d.e eVar = new h.r.d.e(kVar, arrayList3);
                        if (z || z2 || z3) {
                            long j2 = 0;
                            long j3 = z ? kVar.d : 0;
                            long j4 = z2 ? kVar.e : 0;
                            if (z3) {
                                j2 = kVar.f312f;
                            }
                            h.h.m.m.a(((d0) arrayList3.get(0)).e, (Runnable) eVar, Math.max(j4, j2) + j3);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
    }

    public static class c implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class d implements z.b {
        public d() {
        }
    }

    public static abstract class d0 {
        public static final List<Object> w = Collections.emptyList();
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<RecyclerView> f298f;

        /* renamed from: g  reason: collision with root package name */
        public int f299g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f300h = -1;

        /* renamed from: i  reason: collision with root package name */
        public long f301i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f302j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f303k = -1;

        /* renamed from: l  reason: collision with root package name */
        public d0 f304l = null;

        /* renamed from: m  reason: collision with root package name */
        public d0 f305m = null;

        /* renamed from: n  reason: collision with root package name */
        public int f306n;

        /* renamed from: o  reason: collision with root package name */
        public List<Object> f307o = null;

        /* renamed from: p  reason: collision with root package name */
        public List<Object> f308p = null;

        /* renamed from: q  reason: collision with root package name */
        public int f309q = 0;
        public v r = null;
        public boolean s = false;
        public int t = 0;
        public int u = -1;
        public RecyclerView v;

        public d0(View view) {
            if (view != null) {
                this.e = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void a(int i2, boolean z) {
            if (this.f300h == -1) {
                this.f300h = this.f299g;
            }
            if (this.f303k == -1) {
                this.f303k = this.f299g;
            }
            if (z) {
                this.f303k += i2;
            }
            this.f299g += i2;
            if (this.e.getLayoutParams() != null) {
                ((p) this.e.getLayoutParams()).c = true;
            }
        }

        public void b() {
            this.f306n &= -33;
        }

        public final int c() {
            RecyclerView recyclerView = this.v;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final int d() {
            int i2 = this.f303k;
            return i2 == -1 ? this.f299g : i2;
        }

        public List<Object> e() {
            if ((this.f306n & 1024) != 0) {
                return w;
            }
            List<Object> list = this.f307o;
            if (list == null || list.size() == 0) {
                return w;
            }
            return this.f308p;
        }

        public boolean f() {
            return (this.e.getParent() == null || this.e.getParent() == this.v) ? false : true;
        }

        public boolean g() {
            return (this.f306n & 1) != 0;
        }

        public boolean h() {
            return (this.f306n & 4) != 0;
        }

        public final boolean i() {
            return (this.f306n & 16) == 0 && !h.h.m.m.v(this.e);
        }

        public boolean j() {
            return (this.f306n & 8) != 0;
        }

        public boolean k() {
            return this.r != null;
        }

        public boolean l() {
            return (this.f306n & 256) != 0;
        }

        public boolean m() {
            return (this.f306n & 2) != 0;
        }

        public void n() {
            this.f306n = 0;
            this.f299g = -1;
            this.f300h = -1;
            this.f301i = -1;
            this.f303k = -1;
            this.f309q = 0;
            this.f304l = null;
            this.f305m = null;
            List<Object> list = this.f307o;
            if (list != null) {
                list.clear();
            }
            this.f306n &= -1025;
            this.t = 0;
            this.u = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public boolean o() {
            return (this.f306n & 128) != 0;
        }

        public boolean p() {
            return (this.f306n & 32) != 0;
        }

        public String toString() {
            StringBuilder a = i.a.a.a.a.a(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            a.append(Integer.toHexString(hashCode()));
            a.append(" position=");
            a.append(this.f299g);
            a.append(" id=");
            a.append(this.f301i);
            a.append(", oldPos=");
            a.append(this.f300h);
            a.append(", pLpos:");
            a.append(this.f303k);
            StringBuilder sb = new StringBuilder(a.toString());
            if (k()) {
                sb.append(" scrap ");
                sb.append(this.s ? "[changeScrap]" : "[attachedScrap]");
            }
            if (h()) {
                sb.append(" invalid");
            }
            if (!g()) {
                sb.append(" unbound");
            }
            boolean z = false;
            if ((this.f306n & 2) != 0) {
                sb.append(" update");
            }
            if (j()) {
                sb.append(" removed");
            }
            if (o()) {
                sb.append(" ignored");
            }
            if (l()) {
                sb.append(" tmpDetached");
            }
            if (!i()) {
                StringBuilder a2 = i.a.a.a.a.a(" not recyclable(");
                a2.append(this.f309q);
                a2.append(")");
                sb.append(a2.toString());
            }
            if ((this.f306n & 512) != 0 || h()) {
                z = true;
            }
            if (z) {
                sb.append(" undefined adapter position");
            }
            if (this.e.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean b(int i2) {
            return (i2 & this.f306n) != 0;
        }

        public void a() {
            this.f300h = -1;
            this.f303k = -1;
        }

        public void a(int i2, int i3) {
            this.f306n = (i2 & i3) | (this.f306n & (~i3));
        }

        public void a(int i2) {
            this.f306n = i2 | this.f306n;
        }

        public void a(Object obj) {
            if (obj == null) {
                a(1024);
            } else if ((1024 & this.f306n) == 0) {
                if (this.f307o == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f307o = arrayList;
                    this.f308p = Collections.unmodifiableList(arrayList);
                }
                this.f307o.add(obj);
            }
        }

        public final void a(boolean z) {
            int i2 = this.f309q;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f309q = i3;
            if (i3 < 0) {
                this.f309q = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i3 == 1) {
                this.f306n |= 16;
            } else if (z && this.f309q == 0) {
                this.f306n &= -17;
            }
        }
    }

    public class e implements b.C0062b {
        public e() {
        }

        public int a() {
            return RecyclerView.this.getChildCount();
        }

        public void b(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        public View a(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }
    }

    public static abstract class g<VH extends d0> {
        public final h a = new h();

        /* renamed from: b  reason: collision with root package name */
        public boolean f310b = false;

        public abstract int a();

        public long a(int i2) {
            return -1;
        }

        public abstract VH a(ViewGroup viewGroup, int i2);

        public abstract void a(VH vh, int i2);
    }

    public static class h extends Observable<i> {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                x xVar = (x) ((i) this.mObservers.get(size));
                RecyclerView.this.assertNotInLayoutOrScroll((String) null);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mState.f282f = true;
                recyclerView.processDataSetCompletelyChanged(true);
                if (!RecyclerView.this.mAdapterHelper.c()) {
                    RecyclerView.this.requestLayout();
                }
            }
        }
    }

    public static abstract class i {
    }

    public interface j {
        int a(int i2, int i3);
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public class m implements l.b {
        public m() {
        }
    }

    public static abstract class n {
        public void a(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
        }
    }

    public static abstract class o {
        public h.r.d.b a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f314b;
        public final y.b c = new a();
        public final y.b d = new b();
        public h.r.d.y e = new h.r.d.y(this.c);

        /* renamed from: f  reason: collision with root package name */
        public h.r.d.y f315f = new h.r.d.y(this.d);

        /* renamed from: g  reason: collision with root package name */
        public z f316g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f317h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f318i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f319j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f320k = true;

        /* renamed from: l  reason: collision with root package name */
        public boolean f321l = true;

        /* renamed from: m  reason: collision with root package name */
        public int f322m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f323n;

        /* renamed from: o  reason: collision with root package name */
        public int f324o;

        /* renamed from: p  reason: collision with root package name */
        public int f325p;

        /* renamed from: q  reason: collision with root package name */
        public int f326q;
        public int r;

        public class a implements y.b {
            public a() {
            }

            public View a(int i2) {
                return o.this.c(i2);
            }

            public int b() {
                return o.this.j();
            }

            public int a() {
                o oVar = o.this;
                return oVar.f326q - oVar.k();
            }

            public int b(View view) {
                return o.this.d(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int a(View view) {
                return o.this.g(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements y.b {
            public b() {
            }

            public View a(int i2) {
                return o.this.c(i2);
            }

            public int b() {
                return o.this.l();
            }

            public int a() {
                o oVar = o.this;
                return oVar.r - oVar.i();
            }

            public int b(View view) {
                return o.this.h(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int a(View view) {
                return o.this.c(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f327b;
            public boolean c;
            public boolean d;
        }

        public int a(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int a(a0 a0Var) {
            return 0;
        }

        public View a(View view, int i2, v vVar, a0 a0Var) {
            return null;
        }

        public void a(int i2, int i3) {
            this.f326q = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f324o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f326q = 0;
            }
            this.r = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f325p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.r = 0;
            }
        }

        public void a(int i2, int i3, a0 a0Var, c cVar) {
        }

        public void a(int i2, c cVar) {
        }

        public void a(Parcelable parcelable) {
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        }

        public void a(RecyclerView recyclerView, v vVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean a(p pVar) {
            return pVar != null;
        }

        public int b(int i2, v vVar, a0 a0Var) {
            return 0;
        }

        public int b(a0 a0Var) {
            return 0;
        }

        public void b(int i2, int i3) {
            int d2 = d();
            if (d2 == 0) {
                this.f314b.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            int i7 = RecyclerView.UNDEFINED_DURATION;
            for (int i8 = 0; i8 < d2; i8++) {
                View c2 = c(i8);
                Rect rect = this.f314b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(c2, rect);
                int i9 = rect.left;
                if (i9 < i4) {
                    i4 = i9;
                }
                int i10 = rect.right;
                if (i10 > i6) {
                    i6 = i10;
                }
                int i11 = rect.top;
                if (i11 < i5) {
                    i5 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.f314b.mTempRect.set(i4, i5, i6, i7);
            a(this.f314b.mTempRect, i2, i3);
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public boolean b() {
            return false;
        }

        public int c(a0 a0Var) {
            return 0;
        }

        public abstract p c();

        public void c(v vVar) {
            int size = vVar.a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = vVar.a.get(i2).e;
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.o()) {
                    childViewHolderInt.a(false);
                    if (childViewHolderInt.l()) {
                        this.f314b.removeDetachedView(view, false);
                    }
                    l lVar = this.f314b.mItemAnimator;
                    if (lVar != null) {
                        lVar.b(childViewHolderInt);
                    }
                    childViewHolderInt.a(true);
                    d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.r = null;
                    childViewHolderInt2.s = false;
                    childViewHolderInt2.b();
                    vVar.a(childViewHolderInt2);
                }
            }
            vVar.a.clear();
            ArrayList<d0> arrayList = vVar.f331b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f314b.invalidate();
            }
        }

        public int d() {
            h.r.d.b bVar = this.a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int d(a0 a0Var) {
            return 0;
        }

        public int e(a0 a0Var) {
            return 0;
        }

        public View e() {
            View focusedChild;
            RecyclerView recyclerView = this.f314b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int f() {
            return h.h.m.m.k(this.f314b);
        }

        public int f(a0 a0Var) {
            return 0;
        }

        public void f(int i2) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.a;
            r4 = r0.c(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.c((int) r4)
                if (r0 == 0) goto L_0x0029
                h.r.d.b r0 = r3.a
                int r4 = r0.c((int) r4)
                h.r.d.b$b r1 = r0.a
                androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.e) r1
                android.view.View r1 = r1.a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                h.r.d.b$a r2 = r0.f2087b
                boolean r2 = r2.d(r4)
                if (r2 == 0) goto L_0x0022
                r0.d((android.view.View) r1)
            L_0x0022:
                h.r.d.b$b r0 = r0.a
                androidx.recyclerview.widget.RecyclerView$e r0 = (androidx.recyclerview.widget.RecyclerView.e) r0
                r0.b(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.g(int):void");
        }

        public void g(a0 a0Var) {
        }

        public int h(View view) {
            return view.getTop() - ((p) view.getLayoutParams()).f328b.top;
        }

        public void h(int i2) {
        }

        public int i(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public int j() {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int k() {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int l() {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean m() {
            return this.f319j;
        }

        public Parcelable n() {
            return null;
        }

        public void o() {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public boolean p() {
            return false;
        }

        public boolean q() {
            return false;
        }

        public void d(int i2) {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public int f(View view) {
            Rect rect = ((p) view.getLayoutParams()).f328b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int i() {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int h() {
            return h.h.m.m.m(this.f314b);
        }

        public int d(View view) {
            return view.getLeft() - ((p) view.getLayoutParams()).f328b.left;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public int e(View view) {
            Rect rect = ((p) view.getLayoutParams()).f328b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int g(View view) {
            return view.getRight() + ((p) view.getLayoutParams()).f328b.right;
        }

        public void a(Rect rect, int i2, int i3) {
            int k2 = k() + j() + rect.width();
            int i4 = i() + l() + rect.height();
            this.f314b.setMeasuredDimension(a(i2, k2, h()), a(i3, i4, g()));
        }

        public int g() {
            return h.h.m.m.l(this.f314b);
        }

        public View b(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f314b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.a.c.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i3, i4) : size;
            }
            return Math.min(size, Math.max(i3, i4));
        }

        public View b(int i2) {
            int d2 = d();
            for (int i3 = 0; i3 < d2; i3++) {
                View c2 = c(i3);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c2);
                if (childViewHolderInt != null && childViewHolderInt.d() == i2 && !childViewHolderInt.o() && (this.f314b.mState.f283g || !childViewHolderInt.j())) {
                    return c2;
                }
            }
            return null;
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public p a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof p) {
                return new p((p) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new p((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new p(layoutParams);
        }

        public void c(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f314b = null;
                this.a = null;
                this.f326q = 0;
                this.r = 0;
            } else {
                this.f314b = recyclerView;
                this.a = recyclerView.mChildHelper;
                this.f326q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.f324o = 1073741824;
            this.f325p = 1073741824;
        }

        public boolean b(View view, int i2, int i3, p pVar) {
            return !this.f320k || !b(view.getMeasuredWidth(), i2, pVar.width) || !b(view.getMeasuredHeight(), i3, pVar.height);
        }

        public static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public p a(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void a(RecyclerView recyclerView, a0 a0Var, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(z zVar) {
            z zVar2 = this.f316g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.e)) {
                zVar2.a();
            }
            this.f316g = zVar;
            RecyclerView recyclerView = this.f314b;
            if (zVar != null) {
                recyclerView.mViewFlinger.b();
                if (zVar.f339h) {
                    StringBuilder a2 = i.a.a.a.a.a("An instance of ");
                    a2.append(zVar.getClass().getSimpleName());
                    a2.append(" was started more than once. Each instance of");
                    a2.append(zVar.getClass().getSimpleName());
                    a2.append(" is intended to only be used once. You should create a new instance for each use.");
                    Log.w(RecyclerView.TAG, a2.toString());
                }
                zVar.f336b = recyclerView;
                zVar.c = this;
                int i2 = zVar.a;
                if (i2 != -1) {
                    recyclerView.mState.a = i2;
                    zVar.e = true;
                    zVar.d = true;
                    zVar.f337f = recyclerView.mLayout.b(i2);
                    zVar.f336b.mViewFlinger.a();
                    zVar.f339h = true;
                    return;
                }
                throw new IllegalArgumentException("Invalid target position");
            }
            throw null;
        }

        public void b(v vVar) {
            for (int d2 = d() - 1; d2 >= 0; d2--) {
                if (!RecyclerView.getChildViewHolderInt(c(d2)).o()) {
                    a(d2, vVar);
                }
            }
        }

        public void c(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int b(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView == null || recyclerView.mAdapter == null || !b()) {
                return 1;
            }
            return this.f314b.mAdapter.a();
        }

        public View c(int i2) {
            h.r.d.b bVar = this.a;
            if (bVar == null) {
                return null;
            }
            return ((e) bVar.a).a(bVar.c(i2));
        }

        public void b(RecyclerView recyclerView) {
            a(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int c(View view) {
            return view.getBottom() + ((p) view.getLayoutParams()).f328b.bottom;
        }

        public void a(View view) {
            a(view, -1, false);
        }

        public final void a(View view, int i2, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.j()) {
                this.f314b.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.f314b.mViewInfoStore.c(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.p() || childViewHolderInt.k()) {
                if (childViewHolderInt.k()) {
                    childViewHolderInt.r.b(childViewHolderInt);
                } else {
                    childViewHolderInt.b();
                }
                this.a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f314b) {
                int b2 = this.a.b(view);
                if (i2 == -1) {
                    i2 = this.a.a();
                }
                if (b2 == -1) {
                    StringBuilder a2 = i.a.a.a.a.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    a2.append(this.f314b.indexOfChild(view));
                    throw new IllegalStateException(i.a.a.a.a.a(this.f314b, a2));
                } else if (b2 != i2) {
                    o oVar = this.f314b.mLayout;
                    View c2 = oVar.c(b2);
                    if (c2 != null) {
                        oVar.c(b2);
                        oVar.a.a(b2);
                        p pVar2 = (p) c2.getLayoutParams();
                        d0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(c2);
                        if (childViewHolderInt2.j()) {
                            oVar.f314b.mViewInfoStore.a(childViewHolderInt2);
                        } else {
                            oVar.f314b.mViewInfoStore.c(childViewHolderInt2);
                        }
                        oVar.a.a(c2, i2, pVar2, childViewHolderInt2.j());
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b2 + oVar.f314b.toString());
                    }
                }
            } else {
                this.a.a(view, i2, false);
                pVar.c = true;
                z zVar = this.f316g;
                if (zVar != null && zVar.e && zVar.f336b.getChildLayoutPosition(view) == zVar.a) {
                    zVar.f337f = view;
                }
            }
            if (pVar.d) {
                childViewHolderInt.e.invalidate();
                pVar.d = false;
            }
        }

        public void a(View view, v vVar) {
            h.r.d.b bVar = this.a;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f2087b.d(indexOfChild)) {
                    bVar.d(view);
                }
                ((e) bVar.a).b(indexOfChild);
            }
            vVar.a(view);
        }

        public void a(int i2, v vVar) {
            View c2 = c(i2);
            g(i2);
            vVar.a(c2);
        }

        public void a(v vVar) {
            for (int d2 = d() - 1; d2 >= 0; d2--) {
                View c2 = c(d2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c2);
                if (!childViewHolderInt.o()) {
                    if (!childViewHolderInt.h() || childViewHolderInt.j() || this.f314b.mAdapter.f310b) {
                        c(d2);
                        this.a.a(d2);
                        vVar.b(c2);
                        this.f314b.mViewInfoStore.c(childViewHolderInt);
                    } else {
                        g(d2);
                        vVar.a(childViewHolderInt);
                    }
                }
            }
        }

        public boolean a(View view, int i2, int i3, p pVar) {
            return view.isLayoutRequested() || !this.f320k || !b(view.getWidth(), i2, pVar.width) || !b(view.getHeight(), i3, pVar.height);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(int, int, int, int, boolean):int");
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f328b;
            view.layout(i2 + rect.left + pVar.leftMargin, i3 + rect.top + pVar.topMargin, (i4 - rect.right) - pVar.rightMargin, (i5 - rect.bottom) - pVar.bottomMargin);
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f328b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f314b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f314b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
            if (r14 == false) goto L_0x00ba;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.j()
                int r2 = r9.l()
                int r3 = r9.f326q
                int r4 = r9.k()
                int r3 = r3 - r4
                int r4 = r9.r
                int r5 = r9.i()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.f()
                r8 = 1
                if (r4 != r8) goto L_0x005f
                if (r3 == 0) goto L_0x005a
                goto L_0x0067
            L_0x005a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L_0x0067
            L_0x005f:
                if (r7 == 0) goto L_0x0062
                goto L_0x0066
            L_0x0062:
                int r7 = java.lang.Math.min(r5, r3)
            L_0x0066:
                r3 = r7
            L_0x0067:
                if (r2 == 0) goto L_0x006a
                goto L_0x006e
            L_0x006a:
                int r2 = java.lang.Math.min(r6, r12)
            L_0x006e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto L_0x00b5
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L_0x0080
            L_0x007e:
                r14 = 0
                goto L_0x00b3
            L_0x0080:
                int r0 = r9.j()
                int r2 = r9.l()
                int r3 = r9.f326q
                int r4 = r9.k()
                int r3 = r3 - r4
                int r4 = r9.r
                int r5 = r9.i()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f314b
                android.graphics.Rect r5 = r5.mTempRect
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L_0x007e
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L_0x007e
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L_0x007e
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto L_0x00b2
                goto L_0x007e
            L_0x00b2:
                r14 = 1
            L_0x00b3:
                if (r14 == 0) goto L_0x00ba
            L_0x00b5:
                if (r11 != 0) goto L_0x00bb
                if (r12 == 0) goto L_0x00ba
                goto L_0x00bb
            L_0x00ba:
                return r1
            L_0x00bb:
                if (r13 == 0) goto L_0x00c1
                r10.scrollBy(r11, r12)
                goto L_0x00c4
            L_0x00c1:
                r10.smoothScrollBy(r11, r12)
            L_0x00c4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f314b;
            v vVar = recyclerView.mRecycler;
            a0 a0Var = recyclerView.mState;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f314b.canScrollVertically(-1) && !this.f314b.canScrollHorizontally(-1) && !this.f314b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                g gVar = this.f314b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.a());
                }
            }
        }

        public void a(View view, h.h.m.w.b bVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.j() && !this.a.c(childViewHolderInt.e)) {
                RecyclerView recyclerView = this.f314b;
                a(recyclerView.mRecycler, recyclerView.mState, view, bVar);
            }
        }

        public void a(v vVar, a0 a0Var, View view, h.h.m.w.b bVar) {
            bVar.b((Object) b.c.a(b() ? i(view) : 0, 1, a() ? i(view) : 0, 1, false, false));
        }

        public int a(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f314b;
            if (recyclerView == null || recyclerView.mAdapter == null || !a()) {
                return 1;
            }
            return this.f314b.mAdapter.a();
        }

        public static d a(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.r.c.RecyclerView, i2, i3);
            dVar.a = obtainStyledAttributes.getInt(h.r.c.RecyclerView_android_orientation, 1);
            dVar.f327b = obtainStyledAttributes.getInt(h.r.c.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(h.r.c.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(h.r.c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }
    }

    public interface q {
        void a(View view);

        void b(View view);
    }

    public static abstract class r {
    }

    public interface s {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class t {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class u {
        public SparseArray<a> a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f329b = 0;

        public static class a {
            public final ArrayList<d0> a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f330b = 5;
            public long c = 0;
            public long d = 0;
        }

        public long a(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }

        public final a a(int i2) {
            a aVar = this.a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i2, aVar2);
            return aVar2;
        }
    }

    public interface w {
        void a(d0 d0Var);
    }

    public class x extends i {
        public x() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r1
            POST_UPDATES_ON_ANIMATION = r0
            ALLOW_THREAD_GAP_WORK = r0
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r3
            IGNORE_DETACHED_FOCUSED_CHILD = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.e;
        boolean z2 = view.getParent() == this;
        this.mRecycler.b(getChildViewHolder(view));
        if (d0Var.l()) {
            this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.a(view, -1, true);
        } else {
            h.r.d.b bVar = this.mChildHelper;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                bVar.f2087b.e(indexOfChild);
                bVar.a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.a(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.f304l = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.b(d0Var);
            d0Var2.a(false);
            d0Var2.f305m = d0Var;
        }
        if (this.mItemAnimator.a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f298f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.e) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.f298f = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f285i = false;
        startInterceptRequestLayout();
        h.r.d.z zVar = this.mViewInfoStore;
        zVar.a.clear();
        zVar.f2152b.b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        a0Var.f284h = a0Var.f286j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0 a0Var2 = this.mState;
        a0Var2.f283g = a0Var2.f287k;
        a0Var2.e = this.mAdapter.a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f286j) {
            int a2 = this.mChildHelper.a();
            for (int i2 = 0; i2 < a2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
                if (!childViewHolderInt.o() && (!childViewHolderInt.h() || this.mAdapter.f310b)) {
                    l lVar = this.mItemAnimator;
                    l.d(childViewHolderInt);
                    childViewHolderInt.e();
                    this.mViewInfoStore.b(childViewHolderInt, lVar.c(childViewHolderInt));
                    if (this.mState.f284h && childViewHolderInt.m() && !childViewHolderInt.j() && !childViewHolderInt.o() && !childViewHolderInt.h()) {
                        this.mViewInfoStore.f2152b.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f287k) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z2 = a0Var3.f282f;
            a0Var3.f282f = false;
            this.mLayout.c(this.mRecycler, a0Var3);
            this.mState.f282f = z2;
            for (int i3 = 0; i3 < this.mChildHelper.a(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.b(i3));
                if (!childViewHolderInt2.o()) {
                    z.a orDefault = this.mViewInfoStore.a.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.a & 4) == 0) ? false : true)) {
                        l.d(childViewHolderInt2);
                        boolean b2 = childViewHolderInt2.b(8192);
                        l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.e();
                        l.c c2 = lVar2.c(childViewHolderInt2);
                        if (b2) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c2);
                        } else {
                            h.r.d.z zVar2 = this.mViewInfoStore;
                            z.a orDefault2 = zVar2.a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = z.a.a();
                                zVar2.a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.a |= 2;
                            orDefault2.f2153b = c2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.b();
        this.mState.e = this.mAdapter.a();
        a0 a0Var = this.mState;
        a0Var.c = 0;
        a0Var.f283g = false;
        this.mLayout.c(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f282f = false;
        this.mPendingSavedState = null;
        a0Var2.f286j = a0Var2.f286j && this.mItemAnimator != null;
        this.mState.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        boolean z2;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.d = 1;
        if (a0Var.f286j) {
            for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(a2));
                if (!childViewHolderInt.o()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    if (this.mItemAnimator != null) {
                        l.c cVar = new l.c();
                        View view = childViewHolderInt.e;
                        cVar.a = view.getLeft();
                        cVar.f313b = view.getTop();
                        view.getRight();
                        view.getBottom();
                        d0 b2 = this.mViewInfoStore.f2152b.b(changedHolderKey, null);
                        if (b2 == null || b2.o()) {
                            this.mViewInfoStore.a(childViewHolderInt, cVar);
                        } else {
                            boolean b3 = this.mViewInfoStore.b(b2);
                            boolean b4 = this.mViewInfoStore.b(childViewHolderInt);
                            if (!b3 || b2 != childViewHolderInt) {
                                l.c a3 = this.mViewInfoStore.a(b2, 4);
                                this.mViewInfoStore.a(childViewHolderInt, cVar);
                                l.c a4 = this.mViewInfoStore.a(childViewHolderInt, 8);
                                if (a3 == null) {
                                    handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, b2);
                                } else {
                                    animateChange(b2, childViewHolderInt, a3, a4, b3, b4);
                                }
                            } else {
                                this.mViewInfoStore.a(childViewHolderInt, cVar);
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            }
            h.r.d.z zVar = this.mViewInfoStore;
            z.b bVar = this.mViewInfoProcessCallback;
            int i2 = zVar.a.f1570g;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                d0 c2 = zVar.a.c(i2);
                z.a d2 = zVar.a.d(i2);
                int i3 = d2.a;
                if ((i3 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.a(c2.e, recyclerView.mRecycler);
                } else if ((i3 & 1) != 0) {
                    l.c cVar2 = d2.f2153b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.a(c2.e, recyclerView2.mRecycler);
                    } else {
                        l.c cVar3 = d2.c;
                        d dVar = (d) bVar;
                        RecyclerView.this.mRecycler.b(c2);
                        RecyclerView.this.animateDisappearance(c2, cVar2, cVar3);
                    }
                } else if ((i3 & 14) == 14) {
                    RecyclerView.this.animateAppearance(c2, d2.f2153b, d2.c);
                } else if ((i3 & 12) == 12) {
                    l.c cVar4 = d2.f2153b;
                    l.c cVar5 = d2.c;
                    d dVar2 = (d) bVar;
                    if (dVar2 != null) {
                        c2.a(false);
                        RecyclerView recyclerView3 = RecyclerView.this;
                        if (!recyclerView3.mDataSetHasChangedAfterLayout) {
                            h.r.d.v vVar = (h.r.d.v) recyclerView3.mItemAnimator;
                            if (vVar != null) {
                                if (cVar4.a == cVar5.a && cVar4.f313b == cVar5.f313b) {
                                    vVar.a(c2);
                                    z2 = false;
                                } else {
                                    z2 = vVar.a(c2, cVar4.a, cVar4.f313b, cVar5.a, cVar5.f313b);
                                }
                                if (z2) {
                                    RecyclerView.this.postAnimationRunner();
                                }
                            } else {
                                throw null;
                            }
                        } else if (recyclerView3.mItemAnimator.a(c2, c2, cVar4, cVar5)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else {
                        throw null;
                    }
                } else if ((i3 & 4) != 0) {
                    l.c cVar6 = d2.f2153b;
                    d dVar3 = (d) bVar;
                    RecyclerView.this.mRecycler.b(c2);
                    RecyclerView.this.animateDisappearance(c2, cVar6, (l.c) null);
                } else if ((i3 & 8) != 0) {
                    RecyclerView.this.animateAppearance(c2, d2.f2153b, d2.c);
                }
                z.a.a(d2);
            }
        }
        this.mLayout.c(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f281b = a0Var2.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f286j = false;
        a0Var2.f287k = false;
        this.mLayout.f317h = false;
        ArrayList<d0> arrayList = this.mRecycler.f331b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.f323n) {
            oVar.f322m = 0;
            oVar.f323n = false;
            this.mRecycler.d();
        }
        this.mLayout.g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        h.r.d.z zVar2 = this.mViewInfoStore;
        zVar2.a.clear();
        zVar2.f2152b.b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i2 = 0;
        while (i2 < size) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (!sVar.a(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a2 = this.mChildHelper.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < a2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i4));
            if (!childViewHolderInt.o()) {
                int d2 = childViewHolderInt.d();
                if (d2 < i2) {
                    i2 = d2;
                }
                if (d2 > i3) {
                    i3 = d2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        int i2 = this.mState.f288l;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.mState.a();
        int i3 = i2;
        while (i3 < a2) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.e.hasFocusable()) {
                return findViewHolderForAdapterPosition2.e;
            } else {
                i3++;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.e.hasFocusable()) {
                return findViewHolderForAdapterPosition.e;
            }
        }
    }

    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f328b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private h.h.m.g getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new h.h.m.g(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.f310b) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(d0Var);
                    throw new IllegalStateException(i.a.a.a.a.a(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(d0Var);
                throw new IllegalStateException(i.a.a.a.a.a(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.b(i2));
            if (childViewHolderInt != null && !childViewHolderInt.o() && childViewHolderInt.m()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (h.h.m.m.j(this) == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new h.r.d.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.f() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        int i6 = this.mTempRect2.left;
        if ((i5 < i6 || rect.right <= i6) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i7 = rect2.right;
            int i8 = this.mTempRect2.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i9 = rect3.top;
        int i10 = this.mTempRect2.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i11 = rect4.bottom;
            int i12 = this.mTempRect2.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.mTempRect.top <= this.mTempRect2.top) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Invalid direction: ");
                                sb.append(i2);
                                throw new IllegalArgumentException(i.a.a.a.a.a(this, sb));
                            } else if (c2 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c2 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c2 > 0 || (c2 == 0 && i3 * i4 >= 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c2 < 0 || (c2 == 0 && i3 * i4 <= 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.q();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            h.r.d.a aVar = this.mAdapterHelper;
            aVar.a((List<a.b>) aVar.f2083b);
            aVar.a((List<a.b>) aVar.c);
            aVar.f2085g = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.a(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.d();
        } else {
            this.mAdapterHelper.b();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f286j = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z3 || this.mLayout.f317h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.f310b);
        a0 a0Var = this.mState;
        if (a0Var.f286j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.f287k = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            r3.onPull(r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            r3.onPull(r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            r9.onPull(r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            r9.onPull(r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            h.h.m.m.B(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.c(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.a() == 0) {
                        requestFocus();
                        return;
                    }
                }
                long j2 = this.mState.f289m;
                View view = null;
                d0 findViewHolderForItemId = (j2 == -1 || !this.mAdapter.f310b) ? null : findViewHolderForItemId(j2);
                if (findViewHolderForItemId != null && !this.mChildHelper.c(findViewHolderForItemId.e) && findViewHolderForItemId.e.hasFocusable()) {
                    view = findViewHolderForItemId.e;
                } else if (this.mChildHelper.a() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.f290n;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            h.h.m.m.B(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.f328b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.f289m = -1;
        a0Var.f288l = -1;
        a0Var.f290n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i2;
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f289m = this.mAdapter.f310b ? d0Var.f301i : -1;
        a0 a0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i2 = -1;
        } else if (d0Var.j()) {
            i2 = d0Var.f300h;
        } else {
            i2 = d0Var.c();
        }
        a0Var.f288l = i2;
        this.mState.f290n = getDeepestFocusedViewWithId(d0Var.e);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.a.unregisterObserver(this.mObserver);
            if (this.mAdapter == null) {
                throw null;
            }
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        h.r.d.a aVar = this.mAdapterHelper;
        aVar.a((List<a.b>) aVar.f2083b);
        aVar.a((List<a.b>) aVar.c);
        aVar.f2085g = 0;
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.a.registerObserver(this.mObserver);
        }
        o oVar = this.mLayout;
        v vVar = this.mRecycler;
        g gVar4 = this.mAdapter;
        vVar.a();
        u b2 = vVar.b();
        if (b2 != null) {
            if (gVar3 != null) {
                b2.f329b--;
            }
            if (!z2 && b2.f329b == 0) {
                for (int i2 = 0; i2 < b2.a.size(); i2++) {
                    b2.a.valueAt(i2).a.clear();
                }
            }
            if (gVar4 != null) {
                b2.f329b++;
            }
            this.mState.f282f = true;
            return;
        }
        throw null;
    }

    private void stopScrollersInternal() {
        z zVar;
        this.mViewFlinger.b();
        o oVar = this.mLayout;
        if (oVar != null && (zVar = oVar.f316g) != null) {
            zVar.a();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            h.h.m.m.B(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || oVar != null) {
            super.addFocusables(arrayList, i2, i3);
            return;
        }
        throw null;
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    public void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        boolean z2;
        d0Var.a(false);
        h.r.d.v vVar = (h.r.d.v) this.mItemAnimator;
        if (vVar != null) {
            if (cVar == null || (cVar.a == cVar2.a && cVar.f313b == cVar2.f313b)) {
                h.r.d.k kVar = (h.r.d.k) vVar;
                kVar.e(d0Var);
                d0Var.e.setAlpha(0.0f);
                kVar.f2099i.add(d0Var);
                z2 = true;
            } else {
                z2 = vVar.a(d0Var, cVar.a, cVar.f313b, cVar2.a, cVar2.f313b);
            }
            if (z2) {
                postAnimationRunner();
                return;
            }
            return;
        }
        throw null;
    }

    public void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        boolean z2;
        addAnimatingView(d0Var);
        d0Var.a(false);
        h.r.d.v vVar = (h.r.d.v) this.mItemAnimator;
        if (vVar != null) {
            int i2 = cVar.a;
            int i3 = cVar.f313b;
            View view = d0Var.e;
            int left = cVar2 == null ? view.getLeft() : cVar2.a;
            int top = cVar2 == null ? view.getTop() : cVar2.f313b;
            if (d0Var.j() || (i2 == left && i3 == top)) {
                h.r.d.k kVar = (h.r.d.k) vVar;
                kVar.e(d0Var);
                kVar.f2098h.add(d0Var);
                z2 = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z2 = vVar.a(d0Var, i2, i3, left, top);
            }
            if (z2) {
                postAnimationRunner();
                return;
            }
            return;
        }
        throw null;
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a(str)));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.a(d0Var, d0Var.e());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.a((p) layoutParams);
    }

    public void clearOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.o()) {
                childViewHolderInt.a();
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            vVar.c.get(i3).a();
        }
        int size2 = vVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            vVar.a.get(i4).a();
        }
        ArrayList<d0> arrayList = vVar.f331b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                vVar.f331b.get(i5).a();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.a(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.b(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.c(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.d(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.e(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.f(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            h.h.m.m.B(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            h.h.i.b.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
        } else if (this.mAdapterHelper.c()) {
            boolean z2 = false;
            if ((this.mAdapterHelper.f2085g & 4) != 0) {
                if ((this.mAdapterHelper.f2085g & 11) != 0) {
                    z2 = true;
                }
                if (!z2) {
                    h.h.i.b.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.d();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.a();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
            }
            if (this.mAdapterHelper.c()) {
                h.h.i.b.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    public void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.a(i2, getPaddingRight() + getPaddingLeft(), h.h.m.m.m(this)), o.a(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar == null || childViewHolderInt == null || gVar != null) {
            List<q> list = this.mOnChildAttachStateListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mOnChildAttachStateListeners.get(size).a(view);
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar == null || childViewHolderInt == null || gVar != null) {
            List<q> list = this.mOnChildAttachStateListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mOnChildAttachStateListeners.get(size).b(view);
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            a0 a0Var = this.mState;
            boolean z2 = false;
            a0Var.f285i = false;
            if (a0Var.d == 1) {
                dispatchLayoutStep1();
                this.mLayout.b(this);
                dispatchLayoutStep2();
            } else {
                h.r.d.a aVar = this.mAdapterHelper;
                if (!aVar.c.isEmpty() && !aVar.f2083b.isEmpty()) {
                    z2 = true;
                }
                if (!z2 && this.mLayout.f326q == getWidth() && this.mLayout.r == getHeight()) {
                    this.mLayout.b(this);
                } else {
                    this.mLayout.b(this);
                    dispatchLayoutStep2();
                }
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.e.getParent() == this && !d0Var.o() && (i2 = d0Var.u) != -1) {
                h.h.m.m.h(d0Var.e, i2);
                d0Var.u = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.c()) {
            z4 = z2;
        }
        if (z4) {
            h.h.m.m.B(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mBottomGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mLeftGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mRightGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mTopGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        StringBuilder a2 = i.a.a.a.a.a(" ");
        a2.append(super.toString());
        a2.append(", adapter:");
        a2.append(this.mAdapter);
        a2.append(", layout:");
        a2.append(this.mLayout);
        a2.append(", context:");
        a2.append(getContext());
        return a2.toString();
    }

    public final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f293g;
            a0Var.f291o = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        a0Var.f291o = 0;
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
            View b2 = this.mChildHelper.b(a2);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f2 >= ((float) b2.getLeft()) + translationX && f2 <= ((float) b2.getRight()) + translationX && f3 >= ((float) b2.getTop()) + translationY && f3 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b2 = this.mChildHelper.b();
        for (int i3 = 0; i3 < b2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.j() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.c(childViewHolderInt.e)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.f310b) {
            int b2 = this.mChildHelper.b();
            for (int i2 = 0; i2 < b2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (childViewHolderInt != null && !childViewHolderInt.j() && childViewHolderInt.f301i == j2) {
                    if (!this.mChildHelper.c(childViewHolderInt.e)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c2, code lost:
        r15 = r10 - 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0124 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$o r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 == 0) goto L_0x0014
            return r2
        L_0x0014:
            boolean r1 = r1.a()
            androidx.recyclerview.widget.RecyclerView$o r3 = r0.mLayout
            boolean r3 = r3.b()
            if (r1 == 0) goto L_0x002c
            int r4 = java.lang.Math.abs(r19)
            int r5 = r0.mMinFlingVelocity
            if (r4 >= r5) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r4 = r19
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            int r5 = java.lang.Math.abs(r20)
            int r6 = r0.mMinFlingVelocity
            if (r5 >= r6) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r5 = r20
            goto L_0x003c
        L_0x003b:
            r5 = 0
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            return r2
        L_0x0041:
            float r6 = (float) r4
            float r7 = (float) r5
            boolean r8 = r0.dispatchNestedPreFling(r6, r7)
            if (r8 != 0) goto L_0x0184
            if (r1 != 0) goto L_0x0050
            if (r3 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r9 = 0
            goto L_0x0051
        L_0x0050:
            r9 = 1
        L_0x0051:
            r0.dispatchNestedFling(r6, r7, r9)
            androidx.recyclerview.widget.RecyclerView$r r6 = r0.mOnFlingListener
            if (r6 == 0) goto L_0x0126
            h.r.d.w r6 = (h.r.d.w) r6
            androidx.recyclerview.widget.RecyclerView r7 = r6.a
            androidx.recyclerview.widget.RecyclerView$o r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0064
            goto L_0x0121
        L_0x0064:
            androidx.recyclerview.widget.RecyclerView r10 = r6.a
            androidx.recyclerview.widget.RecyclerView$g r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x006e
            goto L_0x0121
        L_0x006e:
            androidx.recyclerview.widget.RecyclerView r10 = r6.a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r5)
            if (r11 > r10) goto L_0x0080
            int r11 = java.lang.Math.abs(r4)
            if (r11 <= r10) goto L_0x0121
        L_0x0080:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.z.b
            if (r10 != 0) goto L_0x0086
            goto L_0x0115
        L_0x0086:
            r11 = 0
            if (r10 != 0) goto L_0x008b
            r12 = r11
            goto L_0x0096
        L_0x008b:
            h.r.d.x r12 = new h.r.d.x
            androidx.recyclerview.widget.RecyclerView r13 = r6.a
            android.content.Context r13 = r13.getContext()
            r12.<init>(r6, r13)
        L_0x0096:
            if (r12 != 0) goto L_0x009a
            goto L_0x0115
        L_0x009a:
            h.r.d.p r6 = (h.r.d.p) r6
            r13 = -1
            if (r10 != 0) goto L_0x00a1
            goto L_0x0107
        L_0x00a1:
            androidx.recyclerview.widget.RecyclerView r10 = r7.f314b
            if (r10 == 0) goto L_0x00a9
            androidx.recyclerview.widget.RecyclerView$g r11 = r10.getAdapter()
        L_0x00a9:
            if (r11 == 0) goto L_0x00b0
            int r10 = r11.a()
            goto L_0x00b1
        L_0x00b0:
            r10 = 0
        L_0x00b1:
            if (r10 != 0) goto L_0x00b4
            goto L_0x0107
        L_0x00b4:
            android.view.View r11 = r6.a(r7)
            if (r11 != 0) goto L_0x00bb
            goto L_0x0107
        L_0x00bb:
            int r11 = r7.i(r11)
            if (r11 != r13) goto L_0x00c2
            goto L_0x0107
        L_0x00c2:
            r14 = r7
            androidx.recyclerview.widget.RecyclerView$z$b r14 = (androidx.recyclerview.widget.RecyclerView.z.b) r14
            int r15 = r10 + -1
            android.graphics.PointF r14 = r14.a(r15)
            if (r14 != 0) goto L_0x00ce
            goto L_0x0107
        L_0x00ce:
            boolean r16 = r7.a()
            r17 = 0
            if (r16 == 0) goto L_0x00e6
            h.r.d.t r8 = r6.b(r7)
            int r8 = r6.a(r7, r8, r4, r2)
            float r13 = r14.x
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x00e7
            int r8 = -r8
            goto L_0x00e7
        L_0x00e6:
            r8 = 0
        L_0x00e7:
            boolean r13 = r7.b()
            if (r13 == 0) goto L_0x00fd
            h.r.d.t r13 = r6.c(r7)
            int r6 = r6.a(r7, r13, r2, r5)
            float r13 = r14.y
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x00fe
            int r6 = -r6
            goto L_0x00fe
        L_0x00fd:
            r6 = 0
        L_0x00fe:
            boolean r13 = r7.b()
            if (r13 == 0) goto L_0x0105
            r8 = r6
        L_0x0105:
            if (r8 != 0) goto L_0x010a
        L_0x0107:
            r6 = -1
            r15 = -1
            goto L_0x0113
        L_0x010a:
            int r11 = r11 + r8
            if (r11 >= 0) goto L_0x010e
            r11 = 0
        L_0x010e:
            if (r11 < r10) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r15 = r11
        L_0x0112:
            r6 = -1
        L_0x0113:
            if (r15 != r6) goto L_0x0117
        L_0x0115:
            r6 = 0
            goto L_0x011d
        L_0x0117:
            r12.a = r15
            r7.a((androidx.recyclerview.widget.RecyclerView.z) r12)
            r6 = 1
        L_0x011d:
            if (r6 == 0) goto L_0x0121
            r6 = 1
            goto L_0x0122
        L_0x0121:
            r6 = 0
        L_0x0122:
            if (r6 == 0) goto L_0x0126
            r6 = 1
            return r6
        L_0x0126:
            if (r9 == 0) goto L_0x0184
            if (r1 == 0) goto L_0x012c
            r1 = 1
            goto L_0x012d
        L_0x012c:
            r1 = 0
        L_0x012d:
            if (r3 == 0) goto L_0x0131
            r1 = r1 | 2
        L_0x0131:
            r3 = 1
            r0.startNestedScroll(r1, r3)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r9 = java.lang.Math.max(r3, r1)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r1)
            androidx.recyclerview.widget.RecyclerView$c0 r1 = r0.mViewFlinger
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            r4 = 2
            r3.setScrollState(r4)
            r1.f292f = r2
            r1.e = r2
            android.view.animation.Interpolator r2 = r1.f294h
            android.view.animation.Interpolator r3 = sQuinticInterpolator
            if (r2 == r3) goto L_0x016e
            r1.f294h = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            android.view.animation.Interpolator r4 = sQuinticInterpolator
            r2.<init>(r3, r4)
            r1.f293g = r2
        L_0x016e:
            android.widget.OverScroller r6 = r1.f293g
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a()
            r1 = 1
            return r1
        L_0x0184:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        o oVar = this.mLayout;
        if (oVar != null) {
            boolean z3 = true;
            boolean z4 = this.mAdapter != null && oVar != null && !isComputingLayout() && !this.mLayoutSuppressed;
            FocusFinder instance = FocusFinder.getInstance();
            if (!z4 || !(i2 == 2 || i2 == 1)) {
                View findNextFocus = instance.findNextFocus(this, view, i2);
                if (findNextFocus != null || !z4) {
                    view2 = findNextFocus;
                } else {
                    consumePendingUpdateOperations();
                    if (findContainingItemView(view) == null) {
                        return null;
                    }
                    startInterceptRequestLayout();
                    view2 = this.mLayout.a(view, i2, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
            } else {
                if (this.mLayout.b()) {
                    int i3 = i2 == 2 ? 130 : 33;
                    z2 = instance.findNextFocus(this, view, i3) == null;
                    if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                        i2 = i3;
                    }
                } else {
                    z2 = false;
                }
                if (!z2 && this.mLayout.a()) {
                    int i4 = (this.mLayout.f() == 1) ^ (i2 == 2) ? 66 : 17;
                    if (instance.findNextFocus(this, view, i4) != null) {
                        z3 = false;
                    }
                    if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                        i2 = i4;
                    }
                    z2 = z3;
                }
                if (z2) {
                    consumePendingUpdateOperations();
                    if (findContainingItemView(view) == null) {
                        return null;
                    }
                    startInterceptRequestLayout();
                    this.mLayout.a(view, i2, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                view2 = instance.findNextFocus(this, view, i2);
            }
            if (view2 == null || view2.hasFocusable()) {
                return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i2);
            }
            requestChildOnScreen(view2, (View) null);
            return view;
        }
        throw null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.c();
        }
        throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.b(524) || !d0Var.g()) {
            return -1;
        }
        h.r.d.a aVar = this.mAdapterHelper;
        int i2 = d0Var.f299g;
        int size = aVar.f2083b.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.b bVar = aVar.f2083b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.f2086b;
                    if (i5 <= i2) {
                        int i6 = bVar.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.f2086b;
                    if (i7 == i2) {
                        i2 = bVar.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.f2086b <= i2) {
                i2 += bVar.d;
            }
        }
        return i2;
    }

    public int getBaseline() {
        o oVar = this.mLayout;
        if (oVar == null) {
            return super.getBaseline();
        }
        if (oVar != null) {
            return -1;
        }
        throw null;
    }

    public long getChangedHolderKey(d0 d0Var) {
        if (this.mAdapter.f310b) {
            return d0Var.f301i;
        }
        return (long) d0Var.f299g;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.c();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.f310b || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.f301i;
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.d();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public h.r.d.u getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.c) {
            return pVar.f328b;
        }
        if (this.mState.f283g && (pVar.b() || pVar.a.h())) {
            return pVar.f328b;
        }
        Rect rect = pVar.f328b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        int i2 = 0;
        while (i2 < size) {
            this.mTempRect.set(0, 0, 0, 0);
            n nVar = this.mItemDecorations.get(i2);
            Rect rect2 = this.mTempRect;
            if (nVar != null) {
                ((p) view.getLayoutParams()).a();
                rect2.set(0, 0, 0, 0);
                int i3 = rect.left;
                Rect rect3 = this.mTempRect;
                rect.left = i3 + rect3.left;
                rect.top += rect3.top;
                rect.right += rect3.right;
                rect.bottom += rect3.bottom;
                i2++;
            } else {
                throw null;
            }
        }
        pVar.c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.b();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().b(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.c();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new h.r.d.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(i.a.a.a.a.a(this, i.a.a.a.a.a("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new h.r.d.l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(h.r.b.fastscroll_default_thickness), resources.getDimensionPixelSize(h.r.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(h.r.b.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            o oVar = this.mLayout;
            if (oVar != null) {
                oVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.c();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.h(i2);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((p) this.mChildHelper.d(i2).getLayoutParams()).c = true;
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = (p) vVar.c.get(i3).e.getLayoutParams();
            if (pVar != null) {
                pVar.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.o()) {
                childViewHolderInt.a(6);
            }
        }
        markItemDecorInsetsDirty();
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            d0 d0Var = vVar.c.get(i3);
            if (d0Var != null) {
                d0Var.a(6);
                d0Var.a((Object) null);
            }
        }
        g gVar = RecyclerView.this.mAdapter;
        if (gVar == null || !gVar.f310b) {
            vVar.c();
        }
    }

    public void offsetChildrenHorizontal(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.b(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.b(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int b2 = this.mChildHelper.b();
        for (int i4 = 0; i4 < b2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.o() && childViewHolderInt.f299g >= i2) {
                childViewHolderInt.a(i3, false);
                this.mState.f282f = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            d0 d0Var = vVar.c.get(i5);
            if (d0Var != null && d0Var.f299g >= i2) {
                d0Var.a(i3, true);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int b2 = this.mChildHelper.b();
        int i11 = -1;
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i12 = 0; i12 < b2; i12++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.f299g) >= i6 && i10 <= i5) {
                if (i10 == i2) {
                    childViewHolderInt.a(i3 - i2, false);
                } else {
                    childViewHolderInt.a(i4, false);
                }
                this.mState.f282f = true;
            }
        }
        v vVar = this.mRecycler;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = vVar.c.size();
        for (int i13 = 0; i13 < size; i13++) {
            d0 d0Var = vVar.c.get(i13);
            if (d0Var != null && (i9 = d0Var.f299g) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    d0Var.a(i3 - i2, false);
                } else {
                    d0Var.a(i11, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.mChildHelper.b();
        for (int i5 = 0; i5 < b2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
            if (childViewHolderInt != null && !childViewHolderInt.o()) {
                int i6 = childViewHolderInt.f299g;
                if (i6 >= i4) {
                    childViewHolderInt.a(-i3, z2);
                    this.mState.f282f = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.a(8);
                    childViewHolderInt.a(-i3, z2);
                    childViewHolderInt.f299g = i2 - 1;
                    this.mState.f282f = true;
                }
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                d0 d0Var = vVar.c.get(size);
                if (d0Var != null) {
                    int i7 = d0Var.f299g;
                    if (i7 >= i4) {
                        d0Var.a(-i3, z2);
                    } else if (i7 >= i2) {
                        d0Var.a(8);
                        vVar.b(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f318i = true;
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            h.r.d.m mVar = h.r.d.m.f2125i.get();
            this.mGapWorker = mVar;
            if (mVar == null) {
                this.mGapWorker = new h.r.d.m();
                Display f2 = h.h.m.m.f(this);
                float f3 = 60.0f;
                if (!isInEditMode() && f2 != null) {
                    float refreshRate = f2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f3 = refreshRate;
                    }
                }
                h.r.d.m mVar2 = this.mGapWorker;
                mVar2.f2128g = (long) (1.0E9f / f3);
                h.r.d.m.f2125i.set(mVar2);
            }
            this.mGapWorker.e.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        h.r.d.m mVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            v vVar = this.mRecycler;
            oVar.f318i = false;
            oVar.a(this, vVar);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        if (this.mViewInfoStore != null) {
            do {
            } while (z.a.d.a() != null);
            if (ALLOW_THREAD_GAP_WORK && (mVar = this.mGapWorker) != null) {
                mVar.e.remove(this);
                this.mGapWorker = null;
                return;
            }
            return;
        }
        throw null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).a(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.mLayout.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.b()) {
                        f3 = -axisValue;
                    } else if (this.mLayout.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            scrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a2 = oVar.a();
        boolean b2 = this.mLayout.b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder a3 = i.a.a.a.a.a("Error processing scroll; pointer index for id ");
                a3.append(this.mScrollPointerId);
                a3.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, a3.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!a2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        h.h.i.b.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.m()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.f314b.defaultOnMeasure(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.mAdapter != null) {
                if (this.mState.d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.a(i2, i3);
                this.mState.f285i = true;
                dispatchLayoutStep2();
                this.mLayout.b(i2, i3);
                if (this.mLayout.p()) {
                    this.mLayout.a(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f285i = true;
                    dispatchLayoutStep2();
                    this.mLayout.b(i2, i3);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.f314b.defaultOnMeasure(i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.f287k) {
                    a0Var.f283g = true;
                } else {
                    this.mAdapterHelper.b();
                    this.mState.f283g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f287k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.e = gVar.a();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.f314b.defaultOnMeasure(i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.f283g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y yVar = (y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.e);
        o oVar = this.mLayout;
        if (oVar != null && (parcelable2 = this.mPendingSavedState.f335g) != null) {
            oVar.a(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.f335g = yVar2.f335g;
        } else {
            o oVar = this.mLayout;
            if (oVar != null) {
                yVar.f335g = oVar.n();
            } else {
                yVar.f335g = null;
            }
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01e6
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01e6
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.a()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.b()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b5
            if (r0 == r9) goto L_0x0173
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01db
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01db
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01db
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01db
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ae
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00ae:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00db
            if (r0 <= 0) goto L_0x00d0
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d7
        L_0x00d0:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d7:
            if (r0 == 0) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            if (r11 == 0) goto L_0x00f2
            if (r1 <= 0) goto L_0x00e8
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00e8:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01db
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x010a
        L_0x0108:
            r0 = 0
            r1 = 0
        L_0x010a:
            if (r11 == 0) goto L_0x010f
            r2 = r16
            goto L_0x0111
        L_0x010f:
            r0 = 0
            r2 = 0
        L_0x0111:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            h.r.d.m r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01db
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01db
        L_0x016d:
            h.r.d.m r1 = r6.mGapWorker
            r1.a((androidx.recyclerview.widget.RecyclerView) r6, (int) r15, (int) r0)
            goto L_0x01db
        L_0x0173:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018f
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x0190
        L_0x018f:
            r1 = 0
        L_0x0190:
            if (r11 == 0) goto L_0x019c
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019d
        L_0x019c:
            r2 = 0
        L_0x019d:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ad
        L_0x01a5:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01b0
        L_0x01ad:
            r6.setScrollState(r8)
        L_0x01b0:
            r17.resetScroll()
            r8 = 1
            goto L_0x01db
        L_0x01b5:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r10 == 0) goto L_0x01d3
            r0 = 1
            goto L_0x01d4
        L_0x01d3:
            r0 = 0
        L_0x01d4:
            if (r11 == 0) goto L_0x01d8
            r0 = r0 | 2
        L_0x01d8:
            r6.startNestedScroll(r0, r8)
        L_0x01db:
            if (r8 != 0) goto L_0x01e2
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01e2:
            r12.recycle()
            return r9
        L_0x01e6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            h.h.m.m.a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.a(0, 8192);
        if (this.mState.f284h && d0Var.m() && !d0Var.j() && !d0Var.o()) {
            this.mViewInfoStore.f2152b.c(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.b(d0Var, cVar);
    }

    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.b(this.mRecycler);
            this.mLayout.c(this.mRecycler);
        }
        this.mRecycler.a();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        h.r.d.b bVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z2 = true;
        if (indexOfChild == -1) {
            bVar.d(view);
        } else if (bVar.f2087b.c(indexOfChild)) {
            bVar.f2087b.d(indexOfChild);
            bVar.d(view);
            ((e) bVar.a).b(indexOfChild);
        } else {
            z2 = false;
        }
        if (z2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.b(childViewHolderInt);
            this.mRecycler.a(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    public void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.l()) {
                childViewHolderInt.f306n &= -257;
            } else if (!childViewHolderInt.o()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(i.a.a.a.a.a(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i2));
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public void repositionShadowingViews() {
        d0 d0Var;
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View b2 = this.mChildHelper.b(i2);
            d0 childViewHolder = getChildViewHolder(b2);
            if (!(childViewHolder == null || (d0Var = childViewHolder.f305m) == null)) {
                View view = d0Var.e;
                int left = b2.getLeft();
                int top = b2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        z zVar = this.mLayout.f316g;
        boolean z2 = true;
        if (!(zVar != null && zVar.e) && !isComputingLayout()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.a(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.o() && childViewHolderInt.f300h == -1) {
                childViewHolderInt.f300h = childViewHolderInt.f299g;
            }
        }
    }

    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean a2 = oVar.a();
            boolean b2 = this.mLayout.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, (MotionEvent) null);
            }
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int i9 = i3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i8, i9, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        h.h.i.b.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a2 = i2 != 0 ? this.mLayout.a(i2, this.mRecycler, this.mState) : 0;
        int b2 = i3 != 0 ? this.mLayout.b(i3, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.h(i2);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(h.r.d.u uVar) {
        this.mAccessibilityDelegate = uVar;
        h.h.m.m.a((View) this, (h.h.m.a) uVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (isComputingLayout()) {
            d0Var.u = i2;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        h.h.m.m.h(d0Var.e, i2);
        return true;
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        if (kVar != null) {
            this.mEdgeEffectFactory = kVar;
            invalidateGlows();
            return;
        }
        throw null;
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.b();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i2) {
        v vVar = this.mRecycler;
        vVar.e = i2;
        vVar.d();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.b();
                }
                this.mLayout.b(this.mRecycler);
                this.mLayout.c(this.mRecycler);
                this.mRecycler.a();
                if (this.mIsAttached) {
                    o oVar2 = this.mLayout;
                    v vVar = this.mRecycler;
                    oVar2.f318i = false;
                    oVar2.a(this, vVar);
                }
                this.mLayout.c((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.a();
            }
            h.r.d.b bVar = this.mChildHelper;
            b.a aVar = bVar.f2087b;
            aVar.a = 0;
            b.a aVar2 = aVar.f2088b;
            if (aVar2 != null) {
                aVar2.b();
            }
            int size = bVar.c.size();
            while (true) {
                size--;
                if (size >= 0) {
                    b.C0062b bVar2 = bVar.a;
                    View view = bVar.c.get(size);
                    e eVar = (e) bVar2;
                    if (eVar != null) {
                        d0 childViewHolderInt = getChildViewHolderInt(view);
                        if (childViewHolderInt != null) {
                            RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.t);
                            childViewHolderInt.t = 0;
                        }
                        bVar.c.remove(size);
                    } else {
                        throw null;
                    }
                } else {
                    e eVar2 = (e) bVar.a;
                    int a2 = eVar2.a();
                    for (int i2 = 0; i2 < a2; i2++) {
                        View a3 = eVar2.a(i2);
                        RecyclerView.this.dispatchChildDetached(a3);
                        a3.clearAnimation();
                    }
                    RecyclerView.this.removeAllViews();
                    this.mLayout = oVar;
                    if (oVar != null) {
                        if (oVar.f314b == null) {
                            oVar.c(this);
                            if (this.mIsAttached) {
                                this.mLayout.f318i = true;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("LayoutManager ");
                            sb.append(oVar);
                            sb.append(" is already attached to a RecyclerView:");
                            throw new IllegalArgumentException(i.a.a.a.a.a(oVar.f314b, sb));
                        }
                    }
                    this.mRecycler.d();
                    requestLayout();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        h.h.m.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            h.h.m.m.D(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        v vVar = this.mRecycler;
        u uVar2 = vVar.f333g;
        if (uVar2 != null) {
            uVar2.f329b--;
        }
        vVar.f333g = uVar;
        if (uVar != null && RecyclerView.this.getAdapter() != null) {
            vVar.f333g.f329b++;
        }
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    public void setScrollState(int i2) {
        if (i2 != this.mScrollState) {
            this.mScrollState = i2;
            if (i2 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(b0 b0Var) {
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        if (contentChangeTypes != 0) {
            i2 = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.a(this, this.mState, i2);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().a(i2, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().c(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int b2 = this.mChildHelper.b();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < b2; i7++) {
            View d2 = this.mChildHelper.d(i7);
            d0 childViewHolderInt = getChildViewHolderInt(d2);
            if (childViewHolderInt != null && !childViewHolderInt.o() && (i5 = childViewHolderInt.f299g) >= i2 && i5 < i6) {
                childViewHolderInt.a(2);
                childViewHolderInt.a(obj);
                ((p) d2.getLayoutParams()).c = true;
            }
        }
        v vVar = this.mRecycler;
        int size = vVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                d0 d0Var = vVar.c.get(size);
                if (d0Var != null && (i4 = d0Var.f299g) >= i2 && i4 < i6) {
                    d0Var.a(2);
                    vVar.b(size);
                }
            } else {
                return;
            }
        }
    }

    public class f implements a.C0061a {
        public f() {
        }

        public d0 a(int i2) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.c(findViewHolderForPosition.e)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        public void a(int i2, int i3, Object obj) {
            RecyclerView.this.viewRangeUpdate(i2, i3, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        public void a(a.b bVar) {
            int i2 = bVar.a;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.a(recyclerView, bVar.f2086b, bVar.d);
            } else if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.b(recyclerView2, bVar.f2086b, bVar.d);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.a(recyclerView3, bVar.f2086b, bVar.d, bVar.c);
            } else if (i2 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.a(recyclerView4, bVar.f2086b, bVar.d, 1);
            }
        }
    }

    public final class v {
        public final ArrayList<d0> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<d0> f331b = null;
        public final ArrayList<d0> c = new ArrayList<>();
        public final List<d0> d = Collections.unmodifiableList(this.a);
        public int e = 2;

        /* renamed from: f  reason: collision with root package name */
        public int f332f = 2;

        /* renamed from: g  reason: collision with root package name */
        public u f333g;

        public v() {
        }

        public void a() {
            this.a.clear();
            c();
        }

        public void b(int i2) {
            a(this.c.get(i2), true);
            this.c.remove(i2);
        }

        public void c() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                b(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                m.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public void d() {
            o oVar = RecyclerView.this.mLayout;
            this.f332f = this.e + (oVar != null ? oVar.f322m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f332f; size--) {
                b(size);
            }
        }

        public int a(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.mState.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i2);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.mState.a());
                throw new IndexOutOfBoundsException(i.a.a.a.a.a(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mState.f283g) {
                return i2;
            }
            return recyclerView.mAdapterHelper.a(i2, 0);
        }

        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.b(12) && childViewHolderInt.m() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f331b == null) {
                    this.f331b = new ArrayList<>();
                }
                childViewHolderInt.r = this;
                childViewHolderInt.s = true;
                this.f331b.add(childViewHolderInt);
            } else if (!childViewHolderInt.h() || childViewHolderInt.j() || RecyclerView.this.mAdapter.f310b) {
                childViewHolderInt.r = this;
                childViewHolderInt.s = false;
                this.a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, i.a.a.a.a.a("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:107:0x01e5, code lost:
            if (r7.f302j != 0) goto L_0x01fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x044f, code lost:
            if (r7.h() == false) goto L_0x0485;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x0483, code lost:
            if ((r11 == 0 || r11 + r9 < r19) == false) goto L_0x0485;
         */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0248  */
        /* JADX WARNING: Removed duplicated region for block: B:231:0x0417  */
        /* JADX WARNING: Removed duplicated region for block: B:236:0x0438  */
        /* JADX WARNING: Removed duplicated region for block: B:237:0x043b  */
        /* JADX WARNING: Removed duplicated region for block: B:289:0x0529  */
        /* JADX WARNING: Removed duplicated region for block: B:290:0x0537  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.d0 a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                if (r0 < 0) goto L_0x055a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.a()
                if (r0 >= r2) goto L_0x055a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                boolean r2 = r2.f283g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r2 = r1.f331b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = 0
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.f331b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$d0 r7 = (androidx.recyclerview.widget.RecyclerView.d0) r7
                boolean r8 = r7.p()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.d()
                if (r8 != r0) goto L_0x0042
                r7.a((int) r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r6.mAdapter
                boolean r7 = r7.f310b
                if (r7 == 0) goto L_0x0086
                h.r.d.a r6 = r6.mAdapterHelper
                int r6 = r6.a((int) r0, (int) r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r7.mAdapter
                int r7 = r7.a()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r7 = r7.mAdapter
                long r6 = r7.a(r6)
                r8 = 0
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.f331b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.d0) r9
                boolean r10 = r9.p()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f301i
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0083
                r9.a((int) r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = 0
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x0245
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.a
                int r7 = r7.size()
                r8 = 0
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.d0) r9
                boolean r10 = r9.p()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.d()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r10 = r10.mState
                boolean r10 = r10.f283g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.a((int) r3)
                goto L_0x01b4
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                if (r18 != 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.b r7 = r7.mChildHelper
                java.util.List<android.view.View> r8 = r7.c
                int r8 = r8.size()
                r9 = 0
            L_0x00d6:
                if (r9 >= r8) goto L_0x0101
                java.util.List<android.view.View> r10 = r7.c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                h.r.d.b$b r11 = r7.a
                androidx.recyclerview.widget.RecyclerView$e r11 = (androidx.recyclerview.widget.RecyclerView.e) r11
                if (r11 == 0) goto L_0x0100
                androidx.recyclerview.widget.RecyclerView$d0 r11 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
                int r12 = r11.d()
                if (r12 != r0) goto L_0x00fd
                boolean r12 = r11.h()
                if (r12 != 0) goto L_0x00fd
                boolean r11 = r11.j()
                if (r11 != 0) goto L_0x00fd
                goto L_0x0102
            L_0x00fd:
                int r9 = r9 + 1
                goto L_0x00d6
            L_0x0100:
                throw r4
            L_0x0101:
                r10 = r4
            L_0x0102:
                if (r10 == 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView$d0 r7 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.b r8 = r8.mChildHelper
                h.r.d.b$b r9 = r8.a
                androidx.recyclerview.widget.RecyclerView$e r9 = (androidx.recyclerview.widget.RecyclerView.e) r9
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0173
                h.r.d.b$a r11 = r8.f2087b
                boolean r11 = r11.c(r9)
                if (r11 == 0) goto L_0x015c
                h.r.d.b$a r11 = r8.f2087b
                r11.a(r9)
                r8.d((android.view.View) r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.b r8 = r8.mChildHelper
                int r8 = r8.b((android.view.View) r10)
                if (r8 == r6) goto L_0x0143
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.b r9 = r9.mChildHelper
                r9.a((int) r8)
                r1.b((android.view.View) r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.a((int) r8)
                goto L_0x01ba
            L_0x0143:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = i.a.a.a.a.a((androidx.recyclerview.widget.RecyclerView) r3, (java.lang.StringBuilder) r2)
                r0.<init>(r2)
                throw r0
            L_0x015c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0173:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x018a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.c
                int r7 = r7.size()
                r8 = 0
            L_0x0191:
                if (r8 >= r7) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r9 = (androidx.recyclerview.widget.RecyclerView.d0) r9
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x01b6
                int r10 = r9.d()
                if (r10 != r0) goto L_0x01b6
                boolean r10 = r9.f()
                if (r10 != 0) goto L_0x01b6
                if (r18 != 0) goto L_0x01b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.c
                r7.remove(r8)
            L_0x01b4:
                r7 = r9
                goto L_0x01ba
            L_0x01b6:
                int r8 = r8 + 1
                goto L_0x0191
            L_0x01b9:
                r7 = r4
            L_0x01ba:
                if (r7 == 0) goto L_0x0245
                boolean r8 = r7.j()
                if (r8 == 0) goto L_0x01c9
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r8 = r8.mState
                boolean r8 = r8.f283g
                goto L_0x0201
            L_0x01c9:
                int r8 = r7.f299g
                if (r8 < 0) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.a()
                if (r8 >= r9) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r9 = r8.mState
                boolean r9 = r9.f283g
                if (r9 != 0) goto L_0x01e9
                androidx.recyclerview.widget.RecyclerView$g r8 = r8.mAdapter
                if (r8 == 0) goto L_0x01e8
                int r8 = r7.f302j
                if (r8 == 0) goto L_0x01e9
                goto L_0x01fe
            L_0x01e8:
                throw r4
            L_0x01e9:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r8 = r8.mAdapter
                boolean r9 = r8.f310b
                if (r9 == 0) goto L_0x0200
                long r9 = r7.f301i
                int r11 = r7.f299g
                long r11 = r8.a(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fe
                goto L_0x0200
            L_0x01fe:
                r8 = 0
                goto L_0x0201
            L_0x0200:
                r8 = 1
            L_0x0201:
                if (r8 != 0) goto L_0x022a
                if (r18 != 0) goto L_0x0228
                r8 = 4
                r7.a((int) r8)
                boolean r8 = r7.k()
                if (r8 == 0) goto L_0x021c
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.e
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$v r8 = r7.r
                r8.b((androidx.recyclerview.widget.RecyclerView.d0) r7)
                goto L_0x0225
            L_0x021c:
                boolean r8 = r7.p()
                if (r8 == 0) goto L_0x0225
                r7.b()
            L_0x0225:
                r1.a((androidx.recyclerview.widget.RecyclerView.d0) r7)
            L_0x0228:
                r7 = r4
                goto L_0x0245
            L_0x022a:
                r2 = 1
                goto L_0x0245
            L_0x022c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = i.a.a.a.a.a((androidx.recyclerview.widget.RecyclerView) r3, (java.lang.StringBuilder) r2)
                r0.<init>(r2)
                throw r0
            L_0x0245:
                r8 = 2
                if (r7 != 0) goto L_0x03fa
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.a r11 = r11.mAdapterHelper
                int r11 = r11.a((int) r0, (int) r5)
                if (r11 < 0) goto L_0x03c9
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r12 = r12.mAdapter
                int r12 = r12.a()
                if (r11 >= r12) goto L_0x03c9
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r12 = r12.mAdapter
                if (r12 == 0) goto L_0x03c8
                boolean r13 = r12.f310b
                if (r13 == 0) goto L_0x02fc
                long r12 = r12.a(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0271:
                if (r7 < 0) goto L_0x02c4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r14 = r1.a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r14 = (androidx.recyclerview.widget.RecyclerView.d0) r14
                long r9 = r14.f301i
                int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r15 != 0) goto L_0x02c1
                boolean r9 = r14.p()
                if (r9 != 0) goto L_0x02c1
                int r9 = r14.f302j
                if (r9 != 0) goto L_0x02a3
                r14.a((int) r3)
                boolean r3 = r14.j()
                if (r3 == 0) goto L_0x02a1
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f283g
                if (r3 != 0) goto L_0x02a1
                r3 = 14
                r14.a((int) r8, (int) r3)
            L_0x02a1:
                r7 = r14
                goto L_0x02f7
            L_0x02a3:
                if (r18 != 0) goto L_0x02c1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r14.e
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r14.e
                androidx.recyclerview.widget.RecyclerView$d0 r9 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r9)
                r9.r = r4
                r9.s = r5
                r9.b()
                r1.a((androidx.recyclerview.widget.RecyclerView.d0) r9)
            L_0x02c1:
                int r7 = r7 + -1
                goto L_0x0271
            L_0x02c4:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r3 = r1.c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02cb:
                if (r3 < 0) goto L_0x02f6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r1.c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$d0 r7 = (androidx.recyclerview.widget.RecyclerView.d0) r7
                long r9 = r7.f301i
                int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x02f3
                boolean r9 = r7.f()
                if (r9 != 0) goto L_0x02f3
                int r9 = r7.f302j
                if (r9 != 0) goto L_0x02ed
                if (r18 != 0) goto L_0x02f7
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r9 = r1.c
                r9.remove(r3)
                goto L_0x02f7
            L_0x02ed:
                if (r18 != 0) goto L_0x02f3
                r1.b((int) r3)
                goto L_0x02f6
            L_0x02f3:
                int r3 = r3 + -1
                goto L_0x02cb
            L_0x02f6:
                r7 = r4
            L_0x02f7:
                if (r7 == 0) goto L_0x02fc
                r7.f299g = r11
                r2 = 1
            L_0x02fc:
                if (r7 != 0) goto L_0x0349
                androidx.recyclerview.widget.RecyclerView$u r3 = r16.b()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$u$a> r3 = r3.a
                java.lang.Object r3 = r3.get(r5)
                androidx.recyclerview.widget.RecyclerView$u$a r3 = (androidx.recyclerview.widget.RecyclerView.u.a) r3
                if (r3 == 0) goto L_0x0333
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r7 = r3.a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0333
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$d0> r3 = r3.a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x031b:
                if (r7 < 0) goto L_0x0333
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r6 = (androidx.recyclerview.widget.RecyclerView.d0) r6
                boolean r6 = r6.f()
                if (r6 != 0) goto L_0x0330
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$d0 r3 = (androidx.recyclerview.widget.RecyclerView.d0) r3
                goto L_0x0334
            L_0x0330:
                int r7 = r7 + -1
                goto L_0x031b
            L_0x0333:
                r3 = r4
            L_0x0334:
                if (r3 == 0) goto L_0x0348
                r3.n()
                boolean r6 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r6 == 0) goto L_0x0348
                android.view.View r6 = r3.e
                boolean r7 = r6 instanceof android.view.ViewGroup
                if (r7 == 0) goto L_0x0348
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                r1.a((android.view.ViewGroup) r6, (boolean) r5)
            L_0x0348:
                r7 = r3
            L_0x0349:
                if (r7 != 0) goto L_0x03fa
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x0374
                androidx.recyclerview.widget.RecyclerView$u r3 = r1.f333g
                androidx.recyclerview.widget.RecyclerView$u$a r3 = r3.a(r5)
                long r9 = r3.c
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x0370
                long r9 = r9 + r6
                int r3 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r3 >= 0) goto L_0x036e
                goto L_0x0370
            L_0x036e:
                r3 = 0
                goto L_0x0371
            L_0x0370:
                r3 = 1
            L_0x0371:
                if (r3 != 0) goto L_0x0374
                return r4
            L_0x0374:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r3.mAdapter
                if (r9 == 0) goto L_0x03c7
                java.lang.String r10 = "RV CreateView"
                h.h.i.b.a(r10)     // Catch:{ all -> 0x03c2 }
                androidx.recyclerview.widget.RecyclerView$d0 r3 = r9.a((android.view.ViewGroup) r3, (int) r5)     // Catch:{ all -> 0x03c2 }
                android.view.View r9 = r3.e     // Catch:{ all -> 0x03c2 }
                android.view.ViewParent r9 = r9.getParent()     // Catch:{ all -> 0x03c2 }
                if (r9 != 0) goto L_0x03ba
                r3.f302j = r5     // Catch:{ all -> 0x03c2 }
                android.os.Trace.endSection()
                boolean r9 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r9 == 0) goto L_0x03a3
                android.view.View r9 = r3.e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r9)
                if (r9 == 0) goto L_0x03a3
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r9)
                r3.f298f = r10
            L_0x03a3:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r9.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r11 = r1.f333g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r11.a(r5)
                long r12 = r6.c
                long r9 = r11.a(r12, r9)
                r6.c = r9
                r7 = r3
                goto L_0x03fa
            L_0x03ba:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03c2 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03c2 }
                throw r0     // Catch:{ all -> 0x03c2 }
            L_0x03c2:
                r0 = move-exception
                h.h.i.b.a()
                throw r0
            L_0x03c7:
                throw r4
            L_0x03c8:
                throw r4
            L_0x03c9:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                int r0 = r0.a()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = i.a.a.a.a.a((androidx.recyclerview.widget.RecyclerView) r0, (java.lang.StringBuilder) r3)
                r2.<init>(r0)
                throw r2
            L_0x03fa:
                if (r2 == 0) goto L_0x042a
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f283g
                if (r3 != 0) goto L_0x042a
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r7.b(r3)
                if (r6 == 0) goto L_0x042a
                r7.a((int) r5, (int) r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f286j
                if (r3 == 0) goto L_0x042a
                androidx.recyclerview.widget.RecyclerView.l.d(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r3 = r3.mItemAnimator
                r7.e()
                androidx.recyclerview.widget.RecyclerView$l$c r3 = r3.c(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.recordAnimationInfoIfBouncedHiddenView(r7, r3)
            L_0x042a:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f283g
                if (r3 == 0) goto L_0x043b
                boolean r3 = r7.g()
                if (r3 == 0) goto L_0x043b
                r7.f303k = r0
                goto L_0x0485
            L_0x043b:
                boolean r3 = r7.g()
                if (r3 == 0) goto L_0x0451
                int r3 = r7.f306n
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0448
                r3 = 1
                goto L_0x0449
            L_0x0448:
                r3 = 0
            L_0x0449:
                if (r3 != 0) goto L_0x0451
                boolean r3 = r7.h()
                if (r3 == 0) goto L_0x0485
            L_0x0451:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.a r3 = r3.mAdapterHelper
                int r3 = r3.a((int) r0, (int) r5)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r7.v = r6
                int r8 = r7.f302j
                long r9 = r6.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0488
                androidx.recyclerview.widget.RecyclerView$u r6 = r1.f333g
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r6.a(r8)
                long r11 = r6.d
                r13 = 0
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 == 0) goto L_0x0482
                long r11 = r11 + r9
                int r6 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
                if (r6 >= 0) goto L_0x0480
                goto L_0x0482
            L_0x0480:
                r6 = 0
                goto L_0x0483
            L_0x0482:
                r6 = 1
            L_0x0483:
                if (r6 != 0) goto L_0x0488
            L_0x0485:
                r0 = 0
                goto L_0x0521
            L_0x0488:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r6 = r6.mAdapter
                if (r6 == 0) goto L_0x0559
                r7.f299g = r3
                boolean r8 = r6.f310b
                if (r8 == 0) goto L_0x049a
                long r11 = r6.a(r3)
                r7.f301i = r11
            L_0x049a:
                r8 = 519(0x207, float:7.27E-43)
                r11 = 1
                r7.a((int) r11, (int) r8)
                java.lang.String r8 = "RV OnBindView"
                h.h.i.b.a(r8)
                r7.e()
                r6.a(r7, (int) r3)
                java.util.List<java.lang.Object> r3 = r7.f307o
                if (r3 == 0) goto L_0x04b2
                r3.clear()
            L_0x04b2:
                int r3 = r7.f306n
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f306n = r3
                android.view.View r3 = r7.e
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r6 = r3 instanceof androidx.recyclerview.widget.RecyclerView.p
                if (r6 == 0) goto L_0x04c7
                androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.p) r3
                r6 = 1
                r3.c = r6
            L_0x04c7:
                android.os.Trace.endSection()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r3 = r1.f333g
                int r6 = r7.f302j
                long r11 = r11 - r9
                androidx.recyclerview.widget.RecyclerView$u$a r6 = r3.a(r6)
                long r8 = r6.d
                long r8 = r3.a(r8, r11)
                r6.d = r8
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                boolean r3 = r3.isAccessibilityEnabled()
                if (r3 == 0) goto L_0x0516
                android.view.View r3 = r7.e
                int r6 = h.h.m.m.i(r3)
                r8 = 1
                if (r6 != 0) goto L_0x04f5
                r3.setImportantForAccessibility(r8)
            L_0x04f5:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                h.r.d.u r6 = r6.mAccessibilityDelegate
                if (r6 != 0) goto L_0x04fc
                goto L_0x0516
            L_0x04fc:
                h.r.d.u$a r6 = r6.e
                boolean r8 = r6 instanceof h.r.d.u.a
                if (r8 == 0) goto L_0x0513
                if (r6 == 0) goto L_0x0512
                h.h.m.a r4 = h.h.m.m.b(r3)
                if (r4 == 0) goto L_0x0513
                if (r4 == r6) goto L_0x0513
                java.util.Map<android.view.View, h.h.m.a> r8 = r6.e
                r8.put(r3, r4)
                goto L_0x0513
            L_0x0512:
                throw r4
            L_0x0513:
                h.h.m.m.a((android.view.View) r3, (h.h.m.a) r6)
            L_0x0516:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r3.mState
                boolean r3 = r3.f283g
                if (r3 == 0) goto L_0x0520
                r7.f303k = r0
            L_0x0520:
                r0 = 1
            L_0x0521:
                android.view.View r3 = r7.e
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L_0x0537
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.p) r3
                android.view.View r4 = r7.e
                r4.setLayoutParams(r3)
                goto L_0x054f
            L_0x0537:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.checkLayoutParams(r3)
                if (r4 != 0) goto L_0x054d
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
                androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.p) r3
                android.view.View r4 = r7.e
                r4.setLayoutParams(r3)
                goto L_0x054f
            L_0x054d:
                androidx.recyclerview.widget.RecyclerView$p r3 = (androidx.recyclerview.widget.RecyclerView.p) r3
            L_0x054f:
                r3.a = r7
                if (r2 == 0) goto L_0x0556
                if (r0 == 0) goto L_0x0556
                r5 = 1
            L_0x0556:
                r3.d = r5
                return r7
            L_0x0559:
                throw r4
            L_0x055a:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                int r0 = r0.a()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = i.a.a.a.a.a((androidx.recyclerview.widget.RecyclerView) r0, (java.lang.StringBuilder) r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        public void b(d0 d0Var) {
            if (d0Var.s) {
                this.f331b.remove(d0Var);
            } else {
                this.a.remove(d0Var);
            }
            d0Var.r = null;
            d0Var.s = false;
            d0Var.b();
        }

        public u b() {
            if (this.f333g == null) {
                this.f333g = new u();
            }
            return this.f333g;
        }

        public final void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.l()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.k()) {
                childViewHolderInt.r.b(childViewHolderInt);
            } else if (childViewHolderInt.p()) {
                childViewHolderInt.b();
            }
            a(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.i()) {
                RecyclerView.this.mItemAnimator.b(childViewHolderInt);
            }
        }

        public void a(d0 d0Var) {
            boolean z = false;
            boolean z2 = true;
            if (d0Var.k() || d0Var.e.getParent() != null) {
                StringBuilder a2 = i.a.a.a.a.a("Scrapped or attached views may not be recycled. isScrap:");
                a2.append(d0Var.k());
                a2.append(" isAttached:");
                if (d0Var.e.getParent() != null) {
                    z = true;
                }
                a2.append(z);
                throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, a2));
            } else if (d0Var.l()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(d0Var);
                throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, sb));
            } else if (!d0Var.o()) {
                boolean z3 = (d0Var.f306n & 16) == 0 && h.h.m.m.v(d0Var.e);
                g gVar = RecyclerView.this.mAdapter;
                if (gVar == null || !z3 || gVar != null) {
                    if (d0Var.i()) {
                        if (this.f332f <= 0 || d0Var.b(526)) {
                            z = false;
                        } else {
                            int size = this.c.size();
                            if (size >= this.f332f && size > 0) {
                                b(0);
                                size--;
                            }
                            if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.a(d0Var.f299g)) {
                                do {
                                    size--;
                                    if (size < 0) {
                                        break;
                                    }
                                } while (RecyclerView.this.mPrefetchRegistry.a(this.c.get(size).f299g));
                                size++;
                            }
                            this.c.add(size, d0Var);
                            z = true;
                        }
                        if (!z) {
                            a(d0Var, true);
                            RecyclerView.this.mViewInfoStore.d(d0Var);
                            if (!z && !z2 && z3) {
                                d0Var.v = null;
                                return;
                            }
                            return;
                        }
                    }
                    z2 = false;
                    RecyclerView.this.mViewInfoStore.d(d0Var);
                    if (!z) {
                        return;
                    }
                    return;
                }
                throw null;
            } else {
                throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, i.a.a.a.a.a("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.e;
            h.r.d.u uVar = RecyclerView.this.mAccessibilityDelegate;
            if (uVar != null) {
                u.a aVar = uVar.e;
                h.h.m.m.a(view, aVar instanceof u.a ? aVar.e.remove(view) : null);
            }
            if (z) {
                w wVar = RecyclerView.this.mRecyclerListener;
                if (wVar != null) {
                    wVar.a(d0Var);
                }
                g gVar = RecyclerView.this.mAdapter;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(d0Var);
                }
            }
            d0Var.v = null;
            u b2 = b();
            if (b2 != null) {
                int i2 = d0Var.f302j;
                ArrayList<d0> arrayList = b2.a(i2).a;
                if (b2.a.get(i2).f330b > arrayList.size()) {
                    d0Var.n();
                    arrayList.add(d0Var);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.r.a.recyclerViewStyle);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, (int[]) null);
    }

    public d0 findViewHolderForPosition(int i2, boolean z2) {
        int b2 = this.mChildHelper.b();
        d0 d0Var = null;
        for (int i3 = 0; i3 < b2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.j()) {
                if (z2) {
                    if (childViewHolderInt.f299g != i2) {
                        continue;
                    }
                } else if (childViewHolderInt.d() != i2) {
                    continue;
                }
                if (!this.mChildHelper.c(childViewHolderInt.e)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new h.r.d.z();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new h.r.d.k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new m.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = h.h.m.q.b(viewConfiguration, context);
        if (Build.VERSION.SDK_INT >= 26) {
            f2 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            f2 = h.h.m.q.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = f2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (h.h.m.m.i(this) == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h.r.d.u(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.r.c.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, h.r.c.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(h.r.c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(h.r.c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(h.r.c.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(h.r.c.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(h.r.c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(h.r.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(h.r.c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(h.r.c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().a(i2) != null;
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().c(i2);
    }

    public static class a0 {
        public int a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f281b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f282f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f283g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f284h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f285i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f286j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f287k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f288l;

        /* renamed from: m  reason: collision with root package name */
        public long f289m;

        /* renamed from: n  reason: collision with root package name */
        public int f290n;

        /* renamed from: o  reason: collision with root package name */
        public int f291o;

        public void a(int i2) {
            if ((this.d & i2) == 0) {
                StringBuilder a2 = i.a.a.a.a.a("Layout state should be one of ");
                a2.append(Integer.toBinaryString(i2));
                a2.append(" but it is ");
                a2.append(Integer.toBinaryString(this.d));
                throw new IllegalStateException(a2.toString());
            }
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("State{mTargetPosition=");
            a2.append(this.a);
            a2.append(", mData=");
            a2.append((Object) null);
            a2.append(", mItemCount=");
            a2.append(this.e);
            a2.append(", mIsMeasuring=");
            a2.append(this.f285i);
            a2.append(", mPreviousLayoutItemCount=");
            a2.append(this.f281b);
            a2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a2.append(this.c);
            a2.append(", mStructureChanged=");
            a2.append(this.f282f);
            a2.append(", mInPreLayout=");
            a2.append(this.f283g);
            a2.append(", mRunSimpleAnimations=");
            a2.append(this.f286j);
            a2.append(", mRunPredictiveAnimations=");
            a2.append(this.f287k);
            a2.append('}');
            return a2.toString();
        }

        public int a() {
            return this.f283g ? this.f281b - this.c : this.e;
        }
    }

    public class c0 implements Runnable {
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f292f;

        /* renamed from: g  reason: collision with root package name */
        public OverScroller f293g;

        /* renamed from: h  reason: collision with root package name */
        public Interpolator f294h = RecyclerView.sQuinticInterpolator;

        /* renamed from: i  reason: collision with root package name */
        public boolean f295i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f296j = false;

        public c0() {
            this.f293g = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        public void a() {
            if (this.f295i) {
                this.f296j = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            h.h.m.m.a((View) RecyclerView.this, (Runnable) this);
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f293g.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                b();
                return;
            }
            this.f296j = false;
            this.f295i = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f293g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.e;
                int i5 = currY - this.f292f;
                this.e = currX;
                this.f292f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    z zVar = recyclerView4.mLayout.f316g;
                    if (zVar != null && !zVar.d && zVar.e) {
                        int a = recyclerView4.mState.a();
                        if (a == 0) {
                            zVar.a();
                        } else if (zVar.a >= a) {
                            zVar.a = a - 1;
                            zVar.a(i2, i3);
                        } else {
                            zVar.a(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i3, i4, i5, (int[]) null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                z zVar2 = RecyclerView.this.mLayout.f316g;
                if ((zVar2 != null && zVar2.d) || !z) {
                    a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    h.r.d.m mVar = recyclerView6.mGapWorker;
                    if (mVar != null) {
                        mVar.a(recyclerView6, i2, i3);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        m.b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.f316g;
            if (zVar3 != null && zVar3.d) {
                zVar3.a(0, 0);
            }
            this.f295i = false;
            if (this.f296j) {
                RecyclerView.this.removeCallbacks(this);
                h.h.m.m.a((View) RecyclerView.this, (Runnable) this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        public void a(int i2, int i3, int i4, Interpolator interpolator) {
            int i5;
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i2 * i2)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                int i6 = width / 2;
                float f2 = (float) width;
                float f3 = (float) i6;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                if (sqrt > 0) {
                    i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z) {
                        abs = abs2;
                    }
                    i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
                }
                i4 = Math.min(i5, RecyclerView.MAX_SCROLL_DURATION);
            }
            int i7 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f294h != interpolator) {
                this.f294h = interpolator;
                this.f293g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f292f = 0;
            this.e = 0;
            RecyclerView.this.setScrollState(2);
            this.f293g.startScroll(0, 0, i2, i3, i7);
            if (Build.VERSION.SDK_INT < 23) {
                this.f293g.computeScrollOffset();
            }
            a();
        }
    }

    public static class p extends ViewGroup.MarginLayoutParams {
        public d0 a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f328b = new Rect();
        public boolean c = true;
        public boolean d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.d();
        }

        public boolean b() {
            return this.a.m();
        }

        public boolean c() {
            return this.a.j();
        }

        public p(int i2, int i3) {
            super(i2, i3);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    public static class y extends h.j.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public Parcelable f335g;

        public static class a implements Parcelable.ClassLoaderCreator<y> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new y[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new y(parcel, (ClassLoader) null);
            }
        }

        public y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f335g = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeParcelable(this.f335g, 0);
        }

        public y(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(layoutParams);
        }
        throw new IllegalStateException(i.a.a.a.a.a(this, i.a.a.a.a.a("RecyclerView has no LayoutManager")));
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i5 = 0;
            if (!oVar.a()) {
                i2 = 0;
            }
            if (!this.mLayout.b()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        startNestedScroll(i5, 1);
                    }
                    this.mViewFlinger.a(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public static abstract class z {
        public int a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f336b;
        public o c;
        public boolean d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public View f337f;

        /* renamed from: g  reason: collision with root package name */
        public final a f338g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f339h;

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            o oVar = this.c;
            if (oVar instanceof b) {
                return ((b) oVar).a(i2);
            }
            StringBuilder a2 = i.a.a.a.a.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a2.append(b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, a2.toString());
            return null;
        }

        public abstract void a(View view, a0 a0Var, a aVar);

        public final void a() {
            if (this.e) {
                this.e = false;
                h.r.d.o oVar = (h.r.d.o) this;
                oVar.f2144p = 0;
                oVar.f2143o = 0;
                oVar.f2139k = null;
                this.f336b.mState.a = -1;
                this.f337f = null;
                this.a = -1;
                this.d = false;
                o oVar2 = this.c;
                if (oVar2.f316g == this) {
                    oVar2.f316g = null;
                }
                this.c = null;
                this.f336b = null;
            }
        }

        public static class a {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f340b;
            public int c;
            public int d = -1;
            public Interpolator e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f341f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f342g = 0;

            public a(int i2, int i3) {
                this.a = i2;
                this.f340b = i3;
                this.c = RecyclerView.UNDEFINED_DURATION;
                this.e = null;
            }

            public void a(RecyclerView recyclerView) {
                int i2 = this.d;
                if (i2 >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.f341f = false;
                } else if (!this.f341f) {
                    this.f342g = 0;
                } else if (this.e == null || this.c >= 1) {
                    int i3 = this.c;
                    if (i3 >= 1) {
                        recyclerView.mViewFlinger.a(this.a, this.f340b, i3, this.e);
                        int i4 = this.f342g + 1;
                        this.f342g = i4;
                        if (i4 > 10) {
                            Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f341f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }

            public void a(int i2, int i3, int i4, Interpolator interpolator) {
                this.a = i2;
                this.f340b = i3;
                this.c = i4;
                this.e = interpolator;
                this.f341f = true;
            }
        }

        public void a(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.f336b;
            if (this.a == -1 || recyclerView == null) {
                a();
            }
            if (!(!this.d || this.f337f != null || this.c == null || (a2 = a(this.a)) == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
            }
            boolean z = false;
            this.d = false;
            View view = this.f337f;
            if (view != null) {
                if (this.f336b.getChildLayoutPosition(view) == this.a) {
                    a(this.f337f, recyclerView.mState, this.f338g);
                    this.f338g.a(recyclerView);
                    a();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f337f = null;
                }
            }
            if (this.e) {
                a0 a0Var = recyclerView.mState;
                a aVar = this.f338g;
                h.r.d.o oVar = (h.r.d.o) this;
                if (oVar.f336b.mLayout.d() == 0) {
                    oVar.a();
                } else {
                    int i4 = oVar.f2143o;
                    int i5 = i4 - i2;
                    if (i4 * i5 <= 0) {
                        i5 = 0;
                    }
                    oVar.f2143o = i5;
                    int i6 = oVar.f2144p;
                    int i7 = i6 - i3;
                    if (i6 * i7 <= 0) {
                        i7 = 0;
                    }
                    oVar.f2144p = i7;
                    if (oVar.f2143o == 0 && i7 == 0) {
                        PointF a3 = oVar.a(oVar.a);
                        if (a3 == null || (a3.x == 0.0f && a3.y == 0.0f)) {
                            aVar.d = oVar.a;
                            oVar.a();
                        } else {
                            float f2 = a3.x;
                            float f3 = a3.y;
                            float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                            float f4 = a3.x / sqrt;
                            a3.x = f4;
                            float f5 = a3.y / sqrt;
                            a3.y = f5;
                            oVar.f2139k = a3;
                            oVar.f2143o = (int) (f4 * 10000.0f);
                            oVar.f2144p = (int) (f5 * 10000.0f);
                            aVar.a((int) (((float) oVar.f2143o) * 1.2f), (int) (((float) oVar.f2144p) * 1.2f), (int) (((float) oVar.b(l.a.a.a.o.b.a.DEFAULT_TIMEOUT)) * 1.2f), oVar.f2137i);
                        }
                    }
                }
                if (this.f338g.d >= 0) {
                    z = true;
                }
                this.f338g.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    public static abstract class l {
        public b a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f311b = new ArrayList<>();
        public long c = 120;
        public long d = 120;
        public long e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f312f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public int f313b;
        }

        public static int d(d0 d0Var) {
            int i2 = d0Var.f306n & 14;
            if (d0Var.h()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int i3 = d0Var.f300h;
            int c2 = d0Var.c();
            return (i3 == -1 || c2 == -1 || i3 == c2) ? i2 : i2 | 2048;
        }

        public final void a(d0 d0Var) {
            b bVar = this.a;
            if (bVar != null) {
                m mVar = (m) bVar;
                if (mVar != null) {
                    boolean z = true;
                    d0Var.a(true);
                    if (d0Var.f304l != null && d0Var.f305m == null) {
                        d0Var.f304l = null;
                    }
                    d0Var.f305m = null;
                    if ((d0Var.f306n & 16) == 0) {
                        z = false;
                    }
                    if (!z && !RecyclerView.this.removeAnimatingView(d0Var.e) && d0Var.l()) {
                        RecyclerView.this.removeDetachedView(d0Var.e, false);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }

        public abstract boolean a(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract void b();

        public abstract void b(d0 d0Var);

        public c c(d0 d0Var) {
            c cVar = new c();
            View view = d0Var.e;
            cVar.a = view.getLeft();
            cVar.f313b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }

        public abstract boolean c();

        public boolean a(d0 d0Var, List<Object> list) {
            return !((h.r.d.v) this).f2146g || d0Var.h();
        }

        public final void a() {
            int size = this.f311b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f311b.get(i2).a();
            }
            this.f311b.clear();
        }
    }
}
