package h.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.crashlytics.android.core.CodedOutputStream;
import h.b.k.u;
import h.b.o.a;
import h.b.o.i.g;
import h.b.o.i.m;
import h.b.p.c0;
import h.b.p.d1;
import h.b.p.x0;
import h.h.m.r;
import h.h.m.s;
import h.h.m.t;
import h.h.m.v;
import java.lang.Thread;
import java.util.Calendar;
import java.util.List;

/* compiled from: AppCompatDelegateImpl */
public class k extends j implements g.a, LayoutInflater.Factory2 {
    public static final h.e.h<String, Integer> d0 = new h.e.h<>();
    public static final boolean e0 = false;
    public static final int[] f0 = {16842836};
    public static final boolean g0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean h0 = true;
    public static boolean i0 = true;
    public View A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public j[] J;
    public j K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q = -100;
    public int R;
    public boolean S;
    public boolean T;
    public g U;
    public g V;
    public boolean W;
    public int X;
    public final Runnable Y = new b();
    public boolean Z;
    public Rect a0;
    public Rect b0;
    public s c0;

    /* renamed from: g  reason: collision with root package name */
    public final Object f1125g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f1126h;

    /* renamed from: i  reason: collision with root package name */
    public Window f1127i;

    /* renamed from: j  reason: collision with root package name */
    public e f1128j;

    /* renamed from: k  reason: collision with root package name */
    public final i f1129k;

    /* renamed from: l  reason: collision with root package name */
    public a f1130l;

    /* renamed from: m  reason: collision with root package name */
    public MenuInflater f1131m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1132n;

    /* renamed from: o  reason: collision with root package name */
    public c0 f1133o;

    /* renamed from: p  reason: collision with root package name */
    public c f1134p;

    /* renamed from: q  reason: collision with root package name */
    public C0031k f1135q;
    public h.b.o.a r;
    public ActionBarContextView s;
    public PopupWindow t;
    public Runnable u;
    public r v = null;
    public boolean w = true;
    public boolean x;
    public ViewGroup y;
    public TextView z;

    /* compiled from: AppCompatDelegateImpl */
    public static class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            k kVar = k.this;
            if ((kVar.X & 1) != 0) {
                kVar.c(0);
            }
            k kVar2 = k.this;
            if ((kVar2.X & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
                kVar2.c(108);
            }
            k kVar3 = k.this;
            kVar3.W = false;
            kVar3.X = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class f extends g {
        public final PowerManager c;

        public f(Context context) {
            super();
            this.c = (PowerManager) context.getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        public void d() {
            k.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public abstract class g {
        public BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    k.this.f1126h.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                k.this.f1126h.registerReceiver(this.a, b2);
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class h extends g {
        public final u c;

        public h(u uVar) {
            super();
            this.c = uVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            boolean z;
            long j2;
            u uVar = this.c;
            u.a aVar = uVar.c;
            boolean z2 = false;
            if (aVar.f1160b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Location location = null;
                Location a = g.a.a.b.a.a(uVar.a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? uVar.a("network") : null;
                if (g.a.a.b.a.a(uVar.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = uVar.a("gps");
                }
                if (location == null || a == null ? location != null : location.getTime() > a.getTime()) {
                    a = location;
                }
                if (a != null) {
                    u.a aVar2 = uVar.c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (t.d == null) {
                        t.d = new t();
                    }
                    t tVar = t.d;
                    t tVar2 = tVar;
                    tVar2.a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
                    tVar2.a(currentTimeMillis, a.getLatitude(), a.getLongitude());
                    if (tVar.c == 1) {
                        z2 = true;
                    }
                    long j3 = tVar.f1158b;
                    long j4 = tVar.a;
                    long j5 = j3;
                    tVar.a(currentTimeMillis + 86400000, a.getLatitude(), a.getLongitude());
                    long j6 = tVar.f1158b;
                    if (j5 == -1 || j4 == -1) {
                        j2 = 43200000 + currentTimeMillis;
                    } else {
                        j2 = (currentTimeMillis > j4 ? j6 + 0 : currentTimeMillis > j5 ? j4 + 0 : j5 + 0) + 60000;
                    }
                    aVar2.a = z2;
                    aVar2.f1160b = j2;
                    z = aVar.a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i2 = Calendar.getInstance().get(11);
                    if (i2 < 6 || i2 >= 22) {
                        z2 = true;
                    }
                    z = z2;
                }
            }
            if (z) {
                return 2;
            }
            return 1;
        }

        public void d() {
            k.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    k kVar = k.this;
                    kVar.a(kVar.d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(h.b.l.a.a.c(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public static final class j {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f1140b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f1141f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f1142g;

        /* renamed from: h  reason: collision with root package name */
        public View f1143h;

        /* renamed from: i  reason: collision with root package name */
        public View f1144i;

        /* renamed from: j  reason: collision with root package name */
        public h.b.o.i.g f1145j;

        /* renamed from: k  reason: collision with root package name */
        public h.b.o.i.e f1146k;

        /* renamed from: l  reason: collision with root package name */
        public Context f1147l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1148m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1149n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1150o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1151p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f1152q = false;
        public boolean r;
        public Bundle s;

        public j(int i2) {
            this.a = i2;
        }

        public void a(h.b.o.i.g gVar) {
            h.b.o.i.e eVar;
            h.b.o.i.g gVar2 = this.f1145j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.a((m) this.f1146k);
                }
                this.f1145j = gVar;
                if (gVar != null && (eVar = this.f1146k) != null) {
                    gVar.a((m) eVar, gVar.a);
                }
            }
        }
    }

    static {
        if (e0 && !i0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public k(Context context, Window window, i iVar, Object obj) {
        Integer orDefault;
        h hVar;
        this.f1126h = context;
        this.f1129k = iVar;
        this.f1125g = obj;
        if (this.Q == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof h)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        hVar = (h) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            hVar = null;
            if (hVar != null) {
                this.Q = ((k) hVar.m()).Q;
            }
        }
        if (this.Q == -100 && (orDefault = d0.getOrDefault(this.f1125g.getClass().getName(), null)) != null) {
            this.Q = orDefault.intValue();
            d0.remove(this.f1125g.getClass().getName());
        }
        if (window != null) {
            a(window);
        }
        h.b.p.j.b();
    }

    public void a(Bundle bundle) {
        this.M = true;
        a(false);
        g();
        Object obj = this.f1125g;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = g.a.a.b.a.b((Context) activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.f1130l;
                if (aVar == null) {
                    this.Z = true;
                } else {
                    aVar.b(true);
                }
            }
        }
        j.a((j) this);
        this.N = true;
    }

    public void b() {
        i();
        a aVar = this.f1130l;
        e(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r3 = this;
            h.b.k.j.b((h.b.k.j) r3)
            boolean r0 = r3.W
            if (r0 == 0) goto L_0x0012
            android.view.Window r0 = r3.f1127i
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Y
            r0.removeCallbacks(r1)
        L_0x0012:
            r0 = 0
            r3.O = r0
            r0 = 1
            r3.P = r0
            int r0 = r3.Q
            r1 = -100
            if (r0 == r1) goto L_0x0042
            java.lang.Object r0 = r3.f1125g
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0042
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0042
            h.e.h<java.lang.String, java.lang.Integer> r0 = d0
            java.lang.Object r1 = r3.f1125g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0051
        L_0x0042:
            h.e.h<java.lang.String, java.lang.Integer> r0 = d0
            java.lang.Object r1 = r3.f1125g
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0051:
            h.b.k.a r0 = r3.f1130l
            if (r0 == 0) goto L_0x005a
            if (r0 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r0 = 0
            throw r0
        L_0x005a:
            h.b.k.k$g r0 = r3.U
            if (r0 == 0) goto L_0x0061
            r0.a()
        L_0x0061:
            h.b.k.k$g r0 = r3.V
            if (r0 == 0) goto L_0x0068
            r0.a()
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.c():void");
    }

    public j d(int i2) {
        j[] jVarArr = this.J;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[(i2 + 1)];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.J = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(i2);
        jVarArr[i2] = jVar2;
        return jVar2;
    }

    public void e() {
        r rVar = this.v;
        if (rVar != null) {
            rVar.a();
        }
    }

    public final void f() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.x) {
            TypedArray obtainStyledAttributes = this.f1126h.obtainStyledAttributes(h.b.j.AppCompatTheme);
            if (obtainStyledAttributes.hasValue(h.b.j.AppCompatTheme_windowActionBar)) {
                if (obtainStyledAttributes.getBoolean(h.b.j.AppCompatTheme_windowNoTitle, false)) {
                    a(1);
                } else if (obtainStyledAttributes.getBoolean(h.b.j.AppCompatTheme_windowActionBar, false)) {
                    a(108);
                }
                if (obtainStyledAttributes.getBoolean(h.b.j.AppCompatTheme_windowActionBarOverlay, false)) {
                    a(109);
                }
                if (obtainStyledAttributes.getBoolean(h.b.j.AppCompatTheme_windowActionModeOverlay, false)) {
                    a(10);
                }
                this.G = obtainStyledAttributes.getBoolean(h.b.j.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                g();
                this.f1127i.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f1126h);
                if (this.H) {
                    viewGroup = this.F ? (ViewGroup) from.inflate(h.b.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(h.b.g.abc_screen_simple, (ViewGroup) null);
                } else if (this.G) {
                    viewGroup = (ViewGroup) from.inflate(h.b.g.abc_dialog_title_material, (ViewGroup) null);
                    this.E = false;
                    this.D = false;
                } else if (this.D) {
                    TypedValue typedValue = new TypedValue();
                    this.f1126h.getTheme().resolveAttribute(h.b.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new h.b.o.c(this.f1126h, typedValue.resourceId);
                    } else {
                        context = this.f1126h;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(h.b.g.abc_screen_toolbar, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(h.b.f.decor_content_parent);
                    this.f1133o = c0Var;
                    c0Var.setWindowCallback(h());
                    if (this.E) {
                        this.f1133o.a(109);
                    }
                    if (this.B) {
                        this.f1133o.a(2);
                    }
                    if (this.C) {
                        this.f1133o.a(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    h.h.m.m.a((View) viewGroup, (h.h.m.k) new l(this));
                    if (this.f1133o == null) {
                        this.z = (TextView) viewGroup.findViewById(h.b.f.title);
                    }
                    d1.b(viewGroup);
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.b.f.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f1127i.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f1127i.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new n(this));
                    this.y = viewGroup;
                    Object obj = this.f1125g;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f1132n;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        c0 c0Var2 = this.f1133o;
                        if (c0Var2 != null) {
                            c0Var2.setWindowTitle(charSequence);
                        } else {
                            a aVar = this.f1130l;
                            if (aVar != null) {
                                aVar.a(charSequence);
                            } else {
                                TextView textView = this.z;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.y.findViewById(16908290);
                    View decorView = this.f1127i.getDecorView();
                    contentFrameLayout2.f126k.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (h.h.m.m.x(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f1126h.obtainStyledAttributes(h.b.j.AppCompatTheme);
                    obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(h.b.j.AppCompatTheme_windowFixedWidthMajor)) {
                        obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(h.b.j.AppCompatTheme_windowFixedWidthMinor)) {
                        obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(h.b.j.AppCompatTheme_windowFixedHeightMajor)) {
                        obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(h.b.j.AppCompatTheme_windowFixedHeightMinor)) {
                        obtainStyledAttributes2.getValue(h.b.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.x = true;
                    j d2 = d(0);
                    if (this.P) {
                        return;
                    }
                    if (d2 == null || d2.f1145j == null) {
                        e(108);
                        return;
                    }
                    return;
                }
                StringBuilder a2 = i.a.a.a.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a2.append(this.D);
                a2.append(", windowActionBarOverlay: ");
                a2.append(this.E);
                a2.append(", android:windowIsFloating: ");
                a2.append(this.G);
                a2.append(", windowActionModeOverlay: ");
                a2.append(this.F);
                a2.append(", windowNoTitle: ");
                a2.append(this.H);
                a2.append(" }");
                throw new IllegalArgumentException(a2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void g() {
        if (this.f1127i == null) {
            Object obj = this.f1125g;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f1127i == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Window.Callback h() {
        return this.f1127i.getCallback();
    }

    public final void i() {
        f();
        if (this.D && this.f1130l == null) {
            Object obj = this.f1125g;
            if (obj instanceof Activity) {
                this.f1130l = new v((Activity) this.f1125g, this.E);
            } else if (obj instanceof Dialog) {
                this.f1130l = new v((Dialog) this.f1125g);
            }
            a aVar = this.f1130l;
            if (aVar != null) {
                aVar.b(this.Z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j() {
        /*
            r1 = this;
            boolean r0 = r1.x
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.y
            if (r0 == 0) goto L_0x0010
            boolean r0 = h.h.m.m.x(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.j():boolean");
    }

    public final void k() {
        if (this.x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: h.b.o.c} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r12).getDepth() > 1) goto L_0x0076;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r8 = this;
            h.b.k.s r0 = r8.c0
            r1 = 0
            if (r0 != 0) goto L_0x0055
            android.content.Context r0 = r8.f1126h
            int[] r2 = h.b.j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = h.b.j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            h.b.k.s r0 = new h.b.k.s
            r0.<init>()
            r8.c0 = r0
            goto L_0x0055
        L_0x001d:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0032 }
            h.b.k.s r2 = (h.b.k.s) r2     // Catch:{ all -> 0x0032 }
            r8.c0 = r2     // Catch:{ all -> 0x0032 }
            goto L_0x0055
        L_0x0032:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            h.b.k.s r0 = new h.b.k.s
            r0.<init>()
            r8.c0 = r0
        L_0x0055:
            boolean r0 = e0
            r2 = 1
            if (r0 == 0) goto L_0x008d
            boolean r0 = r12 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L_0x0068
            r0 = r12
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x008d
            goto L_0x0076
        L_0x0068:
            r0 = r9
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x006e
            goto L_0x008d
        L_0x006e:
            android.view.Window r3 = r8.f1127i
            android.view.View r3 = r3.getDecorView()
        L_0x0074:
            if (r0 != 0) goto L_0x0078
        L_0x0076:
            r0 = 1
            goto L_0x008e
        L_0x0078:
            if (r0 == r3) goto L_0x008d
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L_0x008d
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = h.h.m.m.w(r4)
            if (r4 == 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0074
        L_0x008d:
            r0 = 0
        L_0x008e:
            h.b.k.s r3 = r8.c0
            boolean r4 = e0
            h.b.p.c1.a()
            r5 = 0
            if (r3 == 0) goto L_0x0285
            if (r0 == 0) goto L_0x00a1
            if (r9 == 0) goto L_0x00a1
            android.content.Context r9 = r9.getContext()
            goto L_0x00a2
        L_0x00a1:
            r9 = r11
        L_0x00a2:
            int[] r0 = h.b.j.View
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r12, r0, r1, r1)
            if (r4 == 0) goto L_0x00b1
            int r4 = h.b.j.View_android_theme
            int r4 = r0.getResourceId(r4, r1)
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            if (r4 != 0) goto L_0x00c3
            int r4 = h.b.j.View_theme
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L_0x00c3
            java.lang.String r6 = "AppCompatViewInflater"
            java.lang.String r7 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r6, r7)
        L_0x00c3:
            r0.recycle()
            if (r4 == 0) goto L_0x00d9
            boolean r0 = r9 instanceof h.b.o.c
            if (r0 == 0) goto L_0x00d3
            r0 = r9
            h.b.o.c r0 = (h.b.o.c) r0
            int r0 = r0.a
            if (r0 == r4) goto L_0x00d9
        L_0x00d3:
            h.b.o.c r0 = new h.b.o.c
            r0.<init>((android.content.Context) r9, (int) r4)
            r9 = r0
        L_0x00d9:
            int r0 = r10.hashCode()
            r4 = -1
            switch(r0) {
                case -1946472170: goto L_0x016e;
                case -1455429095: goto L_0x0163;
                case -1346021293: goto L_0x0158;
                case -938935918: goto L_0x014e;
                case -937446323: goto L_0x0144;
                case -658531749: goto L_0x0139;
                case -339785223: goto L_0x012f;
                case 776382189: goto L_0x0125;
                case 799298502: goto L_0x011a;
                case 1125864064: goto L_0x0110;
                case 1413872058: goto L_0x0104;
                case 1601505219: goto L_0x00f9;
                case 1666676343: goto L_0x00ee;
                case 2001146706: goto L_0x00e3;
                default: goto L_0x00e1;
            }
        L_0x00e1:
            goto L_0x0179
        L_0x00e3:
            java.lang.String r0 = "Button"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 2
            goto L_0x017a
        L_0x00ee:
            java.lang.String r0 = "EditText"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 3
            goto L_0x017a
        L_0x00f9:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 6
            goto L_0x017a
        L_0x0104:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 9
            goto L_0x017a
        L_0x0110:
            java.lang.String r0 = "ImageView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 1
            goto L_0x017a
        L_0x011a:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 13
            goto L_0x017a
        L_0x0125:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 7
            goto L_0x017a
        L_0x012f:
            java.lang.String r0 = "Spinner"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 4
            goto L_0x017a
        L_0x0139:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 12
            goto L_0x017a
        L_0x0144:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 5
            goto L_0x017a
        L_0x014e:
            java.lang.String r0 = "TextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 0
            goto L_0x017a
        L_0x0158:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 10
            goto L_0x017a
        L_0x0163:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 8
            goto L_0x017a
        L_0x016e:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0179
            r0 = 11
            goto L_0x017a
        L_0x0179:
            r0 = -1
        L_0x017a:
            switch(r0) {
                case 0: goto L_0x01f4;
                case 1: goto L_0x01eb;
                case 2: goto L_0x01e3;
                case 3: goto L_0x01da;
                case 4: goto L_0x01cf;
                case 5: goto L_0x01c6;
                case 6: goto L_0x01be;
                case 7: goto L_0x01b6;
                case 8: goto L_0x01ad;
                case 9: goto L_0x01a5;
                case 10: goto L_0x019c;
                case 11: goto L_0x0193;
                case 12: goto L_0x0189;
                case 13: goto L_0x017f;
                default: goto L_0x017d;
            }
        L_0x017d:
            goto L_0x01fc
        L_0x017f:
            h.b.p.b0 r0 = new h.b.p.b0
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x0189:
            h.b.p.t r0 = new h.b.p.t
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x0193:
            h.b.p.s r0 = new h.b.p.s
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x019c:
            h.b.p.o r0 = new h.b.p.o
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01a5:
            h.b.p.d r0 = r3.a((android.content.Context) r9, (android.util.AttributeSet) r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01ad:
            h.b.p.h r0 = new h.b.p.h
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01b6:
            h.b.p.r r0 = r3.d(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01be:
            h.b.p.g r0 = r3.c(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01c6:
            h.b.p.l r0 = new h.b.p.l
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01cf:
            h.b.p.w r0 = new h.b.p.w
            int r6 = h.b.a.spinnerStyle
            r0.<init>(r9, r12, r6)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01da:
            h.b.p.k r0 = new h.b.p.k
            r0.<init>(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01e3:
            h.b.p.f r0 = r3.b(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01eb:
            h.b.p.n r0 = new h.b.p.n
            r0.<init>(r9, r12, r1)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01f4:
            h.b.p.z r0 = r3.e(r9, r12)
            r3.a((android.view.View) r0, (java.lang.String) r10)
            goto L_0x01fd
        L_0x01fc:
            r0 = r5
        L_0x01fd:
            if (r0 != 0) goto L_0x025c
            if (r11 == r9) goto L_0x025c
            java.lang.String r11 = "view"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x020f
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r5, r10)
        L_0x020f:
            java.lang.Object[] r11 = r3.a     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            r11[r1] = r9     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            java.lang.Object[] r11 = r3.a     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            r11[r2] = r12     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            r11 = 46
            int r11 = r10.indexOf(r11)     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            if (r4 != r11) goto L_0x0241
            r11 = 0
        L_0x0220:
            java.lang.String[] r0 = h.b.k.s.d     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            int r0 = r0.length     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            if (r11 >= r0) goto L_0x023a
            java.lang.String[] r0 = h.b.k.s.d     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            r0 = r0[r11]     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            android.view.View r0 = r3.a(r9, r10, r0)     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            if (r0 == 0) goto L_0x0237
            java.lang.Object[] r9 = r3.a
            r9[r1] = r5
            r9[r2] = r5
            r5 = r0
            goto L_0x025b
        L_0x0237:
            int r11 = r11 + 1
            goto L_0x0220
        L_0x023a:
            java.lang.Object[] r9 = r3.a
            r9[r1] = r5
            r9[r2] = r5
            goto L_0x025b
        L_0x0241:
            android.view.View r9 = r3.a(r9, r10, r5)     // Catch:{ Exception -> 0x0255, all -> 0x024d }
            java.lang.Object[] r10 = r3.a
            r10[r1] = r5
            r10[r2] = r5
            r5 = r9
            goto L_0x025b
        L_0x024d:
            r9 = move-exception
            java.lang.Object[] r10 = r3.a
            r10[r1] = r5
            r10[r2] = r5
            throw r9
        L_0x0255:
            java.lang.Object[] r9 = r3.a
            r9[r1] = r5
            r9[r2] = r5
        L_0x025b:
            r0 = r5
        L_0x025c:
            if (r0 == 0) goto L_0x0284
            android.content.Context r9 = r0.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L_0x0284
            boolean r10 = h.h.m.m.t(r0)
            if (r10 != 0) goto L_0x026d
            goto L_0x0284
        L_0x026d:
            int[] r10 = h.b.k.s.c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r1)
            if (r10 == 0) goto L_0x0281
            h.b.k.s$a r11 = new h.b.k.s$a
            r11.<init>(r0, r10)
            r0.setOnClickListener(r11)
        L_0x0281:
            r9.recycle()
        L_0x0284:
            return r0
        L_0x0285:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* compiled from: AppCompatDelegateImpl */
    public final class c implements m.a {
        public c() {
        }

        public boolean a(h.b.o.i.g gVar) {
            Window.Callback h2 = k.this.h();
            if (h2 == null) {
                return true;
            }
            h2.onMenuOpened(108, gVar);
            return true;
        }

        public void a(h.b.o.i.g gVar, boolean z) {
            k.this.b(gVar);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class d implements a.C0035a {
        public a.C0035a a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends t {
            public a() {
            }

            public void a(View view) {
                k.this.s.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.t;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.s.getParent() instanceof View) {
                    h.h.m.m.C((View) k.this.s.getParent());
                }
                k.this.s.removeAllViews();
                k.this.v.a((s) null);
                k kVar2 = k.this;
                kVar2.v = null;
                h.h.m.m.C(kVar2.y);
            }
        }

        public d(a.C0035a aVar) {
            this.a = aVar;
        }

        public boolean a(h.b.o.a aVar, Menu menu) {
            h.h.m.m.C(k.this.y);
            return this.a.a(aVar, menu);
        }

        public boolean b(h.b.o.a aVar, Menu menu) {
            return this.a.b(aVar, menu);
        }

        public boolean a(h.b.o.a aVar, MenuItem menuItem) {
            return this.a.a(aVar, menuItem);
        }

        public void a(h.b.o.a aVar) {
            this.a.a(aVar);
            k kVar = k.this;
            if (kVar.t != null) {
                kVar.f1127i.getDecorView().removeCallbacks(k.this.u);
            }
            k kVar2 = k.this;
            if (kVar2.s != null) {
                kVar2.e();
                k kVar3 = k.this;
                r a2 = h.h.m.m.a(kVar3.s);
                a2.a(0.0f);
                kVar3.v = a2;
                r rVar = k.this.v;
                a aVar2 = new a();
                View view = (View) rVar.a.get();
                if (view != null) {
                    rVar.a(view, aVar2);
                }
            }
            k kVar4 = k.this;
            i iVar = kVar4.f1129k;
            if (iVar != null) {
                iVar.b(kVar4.r);
            }
            k kVar5 = k.this;
            kVar5.r = null;
            h.h.m.m.C(kVar5.y);
        }
    }

    public final void e(int i2) {
        this.X = (1 << i2) | this.X;
        if (!this.W) {
            h.h.m.m.a(this.f1127i.getDecorView(), this.Y);
            this.W = true;
        }
    }

    public void b(int i2) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1126h).inflate(i2, viewGroup);
        this.f1128j.e.onContentChanged();
    }

    /* compiled from: AppCompatDelegateImpl */
    public class e extends h.b.o.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                h.b.o.e$a r0 = new h.b.o.e$a
                h.b.k.k r1 = h.b.k.k.this
                android.content.Context r1 = r1.f1126h
                r0.<init>(r1, r10)
                h.b.k.k r10 = h.b.k.k.this
                r1 = 0
                if (r10 == 0) goto L_0x01ba
                h.b.o.a r2 = r10.r
                if (r2 == 0) goto L_0x0015
                r2.a()
            L_0x0015:
                h.b.k.k$d r2 = new h.b.k.k$d
                r2.<init>(r0)
                r10.i()
                h.b.k.a r3 = r10.f1130l
                if (r3 == 0) goto L_0x0030
                h.b.o.a r3 = r3.a((h.b.o.a.C0035a) r2)
                r10.r = r3
                if (r3 == 0) goto L_0x0030
                h.b.k.i r4 = r10.f1129k
                if (r4 == 0) goto L_0x0030
                r4.a((h.b.o.a) r3)
            L_0x0030:
                h.b.o.a r3 = r10.r
                if (r3 != 0) goto L_0x01b0
                r10.e()
                h.b.o.a r3 = r10.r
                if (r3 == 0) goto L_0x003e
                r3.a()
            L_0x003e:
                h.b.k.i r3 = r10.f1129k
                if (r3 == 0) goto L_0x004b
                boolean r4 = r10.P
                if (r4 != 0) goto L_0x004b
                h.b.o.a r3 = r3.a((h.b.o.a.C0035a) r2)     // Catch:{ AbstractMethodError -> 0x004b }
                goto L_0x004c
            L_0x004b:
                r3 = r1
            L_0x004c:
                if (r3 == 0) goto L_0x0052
                r10.r = r3
                goto L_0x01a1
            L_0x0052:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.s
                r4 = 1
                r5 = 0
                if (r3 != 0) goto L_0x010a
                boolean r3 = r10.G
                if (r3 == 0) goto L_0x00de
                android.util.TypedValue r3 = new android.util.TypedValue
                r3.<init>()
                android.content.Context r6 = r10.f1126h
                android.content.res.Resources$Theme r6 = r6.getTheme()
                int r7 = h.b.a.actionBarTheme
                r6.resolveAttribute(r7, r3, r4)
                int r7 = r3.resourceId
                if (r7 == 0) goto L_0x0091
                android.content.Context r7 = r10.f1126h
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r3.resourceId
                r7.applyStyle(r6, r4)
                h.b.o.c r6 = new h.b.o.c
                android.content.Context r8 = r10.f1126h
                r6.<init>((android.content.Context) r8, (int) r5)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x0093
            L_0x0091:
                android.content.Context r6 = r10.f1126h
            L_0x0093:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6)
                r10.s = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                int r8 = h.b.a.actionModePopupWindowStyle
                r7.<init>(r6, r1, r8)
                r10.t = r7
                r8 = 2
                g.a.a.b.a.a((android.widget.PopupWindow) r7, (int) r8)
                android.widget.PopupWindow r7 = r10.t
                androidx.appcompat.widget.ActionBarContextView r8 = r10.s
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.t
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                int r8 = h.b.a.actionBarSize
                r7.resolveAttribute(r8, r3, r4)
                int r3 = r3.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.s
                r6.setContentHeight(r3)
                android.widget.PopupWindow r3 = r10.t
                r6 = -2
                r3.setHeight(r6)
                h.b.k.o r3 = new h.b.k.o
                r3.<init>(r10)
                r10.u = r3
                goto L_0x010a
            L_0x00de:
                android.view.ViewGroup r3 = r10.y
                int r6 = h.b.f.action_mode_bar_stub
                android.view.View r3 = r3.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r3 = (androidx.appcompat.widget.ViewStubCompat) r3
                if (r3 == 0) goto L_0x010a
                r10.i()
                h.b.k.a r6 = r10.f1130l
                if (r6 == 0) goto L_0x00f6
                android.content.Context r6 = r6.c()
                goto L_0x00f7
            L_0x00f6:
                r6 = r1
            L_0x00f7:
                if (r6 != 0) goto L_0x00fb
                android.content.Context r6 = r10.f1126h
            L_0x00fb:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r3.setLayoutInflater(r6)
                android.view.View r3 = r3.a()
                androidx.appcompat.widget.ActionBarContextView r3 = (androidx.appcompat.widget.ActionBarContextView) r3
                r10.s = r3
            L_0x010a:
                androidx.appcompat.widget.ActionBarContextView r3 = r10.s
                if (r3 == 0) goto L_0x01a1
                r10.e()
                androidx.appcompat.widget.ActionBarContextView r3 = r10.s
                r3.b()
                h.b.o.d r3 = new h.b.o.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.s
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.s
                android.widget.PopupWindow r8 = r10.t
                if (r8 != 0) goto L_0x0125
                goto L_0x0126
            L_0x0125:
                r4 = 0
            L_0x0126:
                r3.<init>(r6, r7, r2, r4)
                h.b.o.i.g r4 = r3.f1215l
                h.b.o.a$a r2 = r2.a
                boolean r2 = r2.b(r3, r4)
                if (r2 == 0) goto L_0x019f
                r3.g()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                r2.a(r3)
                r10.r = r3
                boolean r2 = r10.j()
                r3 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0169
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                r4 = 0
                r2.setAlpha(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                h.h.m.r r2 = h.h.m.m.a(r2)
                r2.a((float) r3)
                r10.v = r2
                h.b.k.p r3 = new h.b.k.p
                r3.<init>(r10)
                java.lang.ref.WeakReference<android.view.View> r4 = r2.a
                java.lang.Object r4 = r4.get()
                android.view.View r4 = (android.view.View) r4
                if (r4 == 0) goto L_0x018f
                r2.a(r4, r3)
                goto L_0x018f
            L_0x0169:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                r2.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                r2.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                r3 = 32
                r2.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                android.view.ViewParent r2 = r2.getParent()
                boolean r2 = r2 instanceof android.view.View
                if (r2 == 0) goto L_0x018f
                androidx.appcompat.widget.ActionBarContextView r2 = r10.s
                android.view.ViewParent r2 = r2.getParent()
                android.view.View r2 = (android.view.View) r2
                r2.requestApplyInsets()
            L_0x018f:
                android.widget.PopupWindow r2 = r10.t
                if (r2 == 0) goto L_0x01a1
                android.view.Window r2 = r10.f1127i
                android.view.View r2 = r2.getDecorView()
                java.lang.Runnable r3 = r10.u
                r2.post(r3)
                goto L_0x01a1
            L_0x019f:
                r10.r = r1
            L_0x01a1:
                h.b.o.a r2 = r10.r
                if (r2 == 0) goto L_0x01ac
                h.b.k.i r3 = r10.f1129k
                if (r3 == 0) goto L_0x01ac
                r3.a((h.b.o.a) r2)
            L_0x01ac:
                h.b.o.a r2 = r10.r
                r10.r = r2
            L_0x01b0:
                h.b.o.a r10 = r10.r
                if (r10 == 0) goto L_0x01b9
                android.view.ActionMode r10 = r0.b(r10)
                return r10
            L_0x01b9:
                return r1
            L_0x01ba:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || this.e.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.e
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                h.b.k.k r0 = h.b.k.k.this
                int r3 = r6.getKeyCode()
                r0.i()
                h.b.k.a r4 = r0.f1130l
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.a(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = 1
                goto L_0x004d
            L_0x001f:
                h.b.k.k$j r3 = r0.K
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.a(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                h.b.k.k$j r6 = r0.K
                if (r6 == 0) goto L_0x001d
                r6.f1149n = r2
                goto L_0x001d
            L_0x0034:
                h.b.k.k$j r3 = r0.K
                if (r3 != 0) goto L_0x004c
                h.b.k.k$j r3 = r0.d(r1)
                r0.b((h.b.k.k.j) r3, (android.view.KeyEvent) r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.a(r3, r4, r6, r2)
                r3.f1148m = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = 0
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = 1
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof h.b.o.i.g)) {
                return this.e.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            this.e.onMenuOpened(i2, menu);
            k kVar = k.this;
            if (kVar != null) {
                if (i2 == 108) {
                    kVar.i();
                    a aVar = kVar.f1130l;
                    if (aVar != null) {
                        aVar.a(true);
                    }
                }
                return true;
            }
            throw null;
        }

        public void onPanelClosed(int i2, Menu menu) {
            this.e.onPanelClosed(i2, menu);
            k kVar = k.this;
            if (kVar == null) {
                throw null;
            } else if (i2 == 108) {
                kVar.i();
                a aVar = kVar.f1130l;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i2 == 0) {
                j d = kVar.d(i2);
                if (d.f1150o) {
                    kVar.a(d, false);
                }
            }
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            h.b.o.i.g gVar = menu instanceof h.b.o.i.g ? (h.b.o.i.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.e.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            h.b.o.i.g gVar;
            j d = k.this.d(0);
            if (d == null || (gVar = d.f1145j) == null) {
                this.e.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                this.e.onProvideKeyboardShortcuts(list, gVar, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (k.this.w) {
                return a(callback);
            }
            return this.e.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (!k.this.w || i2 != 0) {
                return this.e.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }

    /* renamed from: h.b.k.k$k  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    public final class C0031k implements m.a {
        public C0031k() {
        }

        public void a(h.b.o.i.g gVar, boolean z) {
            h.b.o.i.g c = gVar.c();
            boolean z2 = c != gVar;
            k kVar = k.this;
            if (z2) {
                gVar = c;
            }
            j a = kVar.a((Menu) gVar);
            if (a == null) {
                return;
            }
            if (z2) {
                k.this.a(a.a, a, (Menu) c);
                k.this.a(a, true);
                return;
            }
            k.this.a(a, z);
        }

        public boolean a(h.b.o.i.g gVar) {
            Window.Callback h2;
            if (gVar != null) {
                return true;
            }
            k kVar = k.this;
            if (!kVar.D || (h2 = kVar.h()) == null || k.this.P) {
                return true;
            }
            h2.onMenuOpened(108, gVar);
            return true;
        }
    }

    public boolean d() {
        return a(true);
    }

    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1128j.e.onContentChanged();
    }

    public void a(View view) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1128j.e.onContentChanged();
    }

    public void c(int i2) {
        j d2;
        j d3 = d(i2);
        if (d3.f1145j != null) {
            Bundle bundle = new Bundle();
            d3.f1145j.b(bundle);
            if (bundle.size() > 0) {
                d3.s = bundle;
            }
            d3.f1145j.j();
            d3.f1145j.clear();
        }
        d3.r = true;
        d3.f1152q = true;
        if ((i2 == 108 || i2 == 0) && this.f1133o != null && (d2 = d(0)) != null) {
            d2.f1148m = false;
            b(d2, (KeyEvent) null);
        }
    }

    public final boolean b(j jVar, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        Resources.Theme theme;
        c0 c0Var3;
        if (this.P) {
            return false;
        }
        if (jVar.f1148m) {
            return true;
        }
        j jVar2 = this.K;
        if (!(jVar2 == null || jVar2 == jVar)) {
            a(jVar2, false);
        }
        Window.Callback h2 = h();
        if (h2 != null) {
            jVar.f1144i = h2.onCreatePanelView(jVar.a);
        }
        int i2 = jVar.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var3 = this.f1133o) != null) {
            c0Var3.f();
        }
        if (jVar.f1144i == null) {
            if (jVar.f1145j == null || jVar.r) {
                if (jVar.f1145j == null) {
                    Context context = this.f1126h;
                    int i3 = jVar.a;
                    if ((i3 == 0 || i3 == 108) && this.f1133o != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(h.b.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(h.b.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(h.b.a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            h.b.o.c cVar = new h.b.o.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    h.b.o.i.g gVar = new h.b.o.i.g(context);
                    gVar.e = this;
                    jVar.a(gVar);
                    if (jVar.f1145j == null) {
                        return false;
                    }
                }
                if (z2 && this.f1133o != null) {
                    if (this.f1134p == null) {
                        this.f1134p = new c();
                    }
                    this.f1133o.a(jVar.f1145j, this.f1134p);
                }
                jVar.f1145j.j();
                if (!h2.onCreatePanelMenu(jVar.a, jVar.f1145j)) {
                    jVar.a((h.b.o.i.g) null);
                    if (z2 && (c0Var2 = this.f1133o) != null) {
                        c0Var2.a((Menu) null, this.f1134p);
                    }
                    return false;
                }
                jVar.r = false;
            }
            jVar.f1145j.j();
            Bundle bundle = jVar.s;
            if (bundle != null) {
                jVar.f1145j.a(bundle);
                jVar.s = null;
            }
            if (!h2.onPreparePanel(0, jVar.f1144i, jVar.f1145j)) {
                if (z2 && (c0Var = this.f1133o) != null) {
                    c0Var.a((Menu) null, this.f1134p);
                }
                jVar.f1145j.i();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.f1151p = z3;
            jVar.f1145j.setQwertyMode(z3);
            jVar.f1145j.i();
        }
        jVar.f1148m = true;
        jVar.f1149n = false;
        this.K = jVar;
        return true;
    }

    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ((ViewGroup) this.y.findViewById(16908290)).addView(view, layoutParams);
        this.f1128j.e.onContentChanged();
    }

    public final void a(Window window) {
        if (this.f1127i == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.f1128j = eVar;
                window.setCallback(eVar);
                x0 a2 = x0.a(this.f1126h, (AttributeSet) null, f0);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.f1492b.recycle();
                this.f1127i = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void a(CharSequence charSequence) {
        this.f1132n = charSequence;
        c0 c0Var = this.f1133o;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f1130l;
        if (aVar != null) {
            aVar.a(charSequence);
            return;
        }
        TextView textView = this.z;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean a(h.b.o.i.g gVar, MenuItem menuItem) {
        j a2;
        Window.Callback h2 = h();
        if (h2 == null || this.P || (a2 = a((Menu) gVar.c())) == null) {
            return false;
        }
        return h2.onMenuItemSelected(a2.a, menuItem);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1125g
            boolean r1 = r0 instanceof h.h.m.c.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof h.b.k.q
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f1127i
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = h.h.m.m.b((android.view.View) r0, (android.view.KeyEvent) r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            h.b.k.k$e r0 = r6.f1128j
            android.view.Window$Callback r0 = r0.e
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0119
            h.b.k.k$j r0 = r6.d(r4)
            boolean r1 = r0.f1150o
            if (r1 != 0) goto L_0x0119
            r6.b((h.b.k.k.j) r0, (android.view.KeyEvent) r7)
            goto L_0x0119
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r6.L = r2
        L_0x0062:
            r2 = 0
            goto L_0x0119
        L_0x0065:
            if (r0 == r5) goto L_0x00eb
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            h.b.o.a r0 = r6.r
            if (r0 == 0) goto L_0x0070
            goto L_0x0119
        L_0x0070:
            h.b.k.k$j r0 = r6.d(r4)
            h.b.p.c0 r1 = r6.f1133o
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f1126h
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            h.b.p.c0 r1 = r6.f1133o
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.P
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.b((h.b.k.k.j) r0, (android.view.KeyEvent) r7)
            if (r7 == 0) goto L_0x00ca
            h.b.p.c0 r7 = r6.f1133o
            boolean r7 = r7.e()
            goto L_0x00d1
        L_0x00a3:
            h.b.p.c0 r7 = r6.f1133o
            boolean r7 = r7.d()
            goto L_0x00d1
        L_0x00aa:
            boolean r1 = r0.f1150o
            if (r1 != 0) goto L_0x00cc
            boolean r1 = r0.f1149n
            if (r1 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f1148m
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x00c2
            r0.f1148m = r4
            boolean r1 = r6.b((h.b.k.k.j) r0, (android.view.KeyEvent) r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.a((h.b.k.k.j) r0, (android.view.KeyEvent) r7)
            r7 = 1
            goto L_0x00d1
        L_0x00ca:
            r7 = 0
            goto L_0x00d1
        L_0x00cc:
            boolean r7 = r0.f1150o
            r6.a((h.b.k.k.j) r0, (boolean) r2)
        L_0x00d1:
            if (r7 == 0) goto L_0x0119
            android.content.Context r7 = r6.f1126h
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e3
            r7.playSoundEffect(r4)
            goto L_0x0119
        L_0x00e3:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x0119
        L_0x00eb:
            boolean r7 = r6.L
            r6.L = r4
            h.b.k.k$j r0 = r6.d(r4)
            if (r0 == 0) goto L_0x00ff
            boolean r1 = r0.f1150o
            if (r1 == 0) goto L_0x00ff
            if (r7 != 0) goto L_0x0119
            r6.a((h.b.k.k.j) r0, (boolean) r2)
            goto L_0x0119
        L_0x00ff:
            h.b.o.a r7 = r6.r
            if (r7 == 0) goto L_0x0107
            r7.a()
            goto L_0x0114
        L_0x0107:
            r6.i()
            h.b.k.a r7 = r6.f1130l
            if (r7 == 0) goto L_0x0116
            boolean r7 = r7.a()
            if (r7 == 0) goto L_0x0116
        L_0x0114:
            r7 = 1
            goto L_0x0117
        L_0x0116:
            r7 = 0
        L_0x0117:
            if (r7 == 0) goto L_0x0062
        L_0x0119:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.a(android.view.KeyEvent):boolean");
    }

    public void b(h.b.o.i.g gVar) {
        if (!this.I) {
            this.I = true;
            this.f1133o.h();
            Window.Callback h2 = h();
            if (h2 != null && !this.P) {
                h2.onPanelClosed(108, gVar);
            }
            this.I = false;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void a() {
        LayoutInflater from = LayoutInflater.from(this.f1126h);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015c, code lost:
        if (r4 != null) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.b.k.k.j r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f1150o
            if (r0 != 0) goto L_0x01dd
            boolean r0 = r12.P
            if (r0 == 0) goto L_0x000a
            goto L_0x01dd
        L_0x000a:
            int r0 = r13.a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f1126h
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.h()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.a
            h.b.o.i.g r4 = r13.f1145j
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.a((h.b.k.k.j) r13, (boolean) r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f1126h
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.b((h.b.k.k.j) r13, (android.view.KeyEvent) r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f1142g
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r14 = r13.f1152q
            if (r14 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f1144i
            if (r14 == 0) goto L_0x01b8
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01b8
            int r14 = r14.width
            if (r14 != r4) goto L_0x01b8
            r5 = -1
            goto L_0x01b9
        L_0x006b:
            android.view.ViewGroup r14 = r13.f1142g
            r4 = 0
            if (r14 != 0) goto L_0x00e8
            r12.i()
            h.b.k.a r14 = r12.f1130l
            if (r14 == 0) goto L_0x007c
            android.content.Context r14 = r14.c()
            goto L_0x007d
        L_0x007c:
            r14 = r4
        L_0x007d:
            if (r14 != 0) goto L_0x0081
            android.content.Context r14 = r12.f1126h
        L_0x0081:
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources r6 = r14.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            android.content.res.Resources$Theme r7 = r14.getTheme()
            r6.setTo(r7)
            int r7 = h.b.a.actionBarPopupTheme
            r6.resolveAttribute(r7, r5, r1)
            int r7 = r5.resourceId
            if (r7 == 0) goto L_0x00a1
            r6.applyStyle(r7, r1)
        L_0x00a1:
            int r7 = h.b.a.panelMenuListTheme
            r6.resolveAttribute(r7, r5, r1)
            int r5 = r5.resourceId
            if (r5 == 0) goto L_0x00ae
            r6.applyStyle(r5, r1)
            goto L_0x00b3
        L_0x00ae:
            int r5 = h.b.i.Theme_AppCompat_CompactMenu
            r6.applyStyle(r5, r1)
        L_0x00b3:
            h.b.o.c r5 = new h.b.o.c
            r5.<init>((android.content.Context) r14, (int) r2)
            android.content.res.Resources$Theme r14 = r5.getTheme()
            r14.setTo(r6)
            r13.f1147l = r5
            int[] r14 = h.b.j.AppCompatTheme
            android.content.res.TypedArray r14 = r5.obtainStyledAttributes(r14)
            int r5 = h.b.j.AppCompatTheme_panelBackground
            int r5 = r14.getResourceId(r5, r2)
            r13.f1140b = r5
            int r5 = h.b.j.AppCompatTheme_android_windowAnimationStyle
            int r5 = r14.getResourceId(r5, r2)
            r13.f1141f = r5
            r14.recycle()
            h.b.k.k$i r14 = new h.b.k.k$i
            android.content.Context r5 = r13.f1147l
            r14.<init>(r5)
            r13.f1142g = r14
            r14 = 81
            r13.c = r14
            goto L_0x00f7
        L_0x00e8:
            boolean r5 = r13.f1152q
            if (r5 == 0) goto L_0x00f7
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f7
            android.view.ViewGroup r14 = r13.f1142g
            r14.removeAllViews()
        L_0x00f7:
            android.view.View r14 = r13.f1144i
            if (r14 == 0) goto L_0x00fe
            r13.f1143h = r14
            goto L_0x015e
        L_0x00fe:
            h.b.o.i.g r14 = r13.f1145j
            if (r14 != 0) goto L_0x0103
            goto L_0x0160
        L_0x0103:
            h.b.k.k$k r14 = r12.f1135q
            if (r14 != 0) goto L_0x010e
            h.b.k.k$k r14 = new h.b.k.k$k
            r14.<init>()
            r12.f1135q = r14
        L_0x010e:
            h.b.k.k$k r14 = r12.f1135q
            h.b.o.i.g r5 = r13.f1145j
            if (r5 != 0) goto L_0x0115
            goto L_0x015a
        L_0x0115:
            h.b.o.i.e r4 = r13.f1146k
            if (r4 != 0) goto L_0x012d
            h.b.o.i.e r4 = new h.b.o.i.e
            android.content.Context r5 = r13.f1147l
            int r6 = h.b.g.abc_list_menu_item_layout
            r4.<init>(r5, r6)
            r13.f1146k = r4
            r4.f1280l = r14
            h.b.o.i.g r14 = r13.f1145j
            android.content.Context r5 = r14.a
            r14.a((h.b.o.i.m) r4, (android.content.Context) r5)
        L_0x012d:
            h.b.o.i.e r14 = r13.f1146k
            android.view.ViewGroup r4 = r13.f1142g
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f1276h
            if (r5 != 0) goto L_0x0158
            android.view.LayoutInflater r5 = r14.f1274f
            int r6 = h.b.g.abc_expanded_menu_layout
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f1276h = r4
            h.b.o.i.e$a r4 = r14.f1281m
            if (r4 != 0) goto L_0x014c
            h.b.o.i.e$a r4 = new h.b.o.i.e$a
            r4.<init>()
            r14.f1281m = r4
        L_0x014c:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f1276h
            h.b.o.i.e$a r5 = r14.f1281m
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f1276h
            r4.setOnItemClickListener(r14)
        L_0x0158:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f1276h
        L_0x015a:
            r13.f1143h = r4
            if (r4 == 0) goto L_0x0160
        L_0x015e:
            r14 = 1
            goto L_0x0161
        L_0x0160:
            r14 = 0
        L_0x0161:
            if (r14 == 0) goto L_0x01db
            android.view.View r14 = r13.f1143h
            if (r14 != 0) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            android.view.View r14 = r13.f1144i
            if (r14 == 0) goto L_0x016d
            goto L_0x0179
        L_0x016d:
            h.b.o.i.e r14 = r13.f1146k
            android.widget.ListAdapter r14 = r14.a()
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x017b
        L_0x0179:
            r14 = 1
            goto L_0x017c
        L_0x017b:
            r14 = 0
        L_0x017c:
            if (r14 != 0) goto L_0x017f
            goto L_0x01db
        L_0x017f:
            android.view.View r14 = r13.f1143h
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x018c
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x018c:
            int r4 = r13.f1140b
            android.view.ViewGroup r5 = r13.f1142g
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f1143h
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x01a4
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f1143h
            r4.removeView(r5)
        L_0x01a4:
            android.view.ViewGroup r4 = r13.f1142g
            android.view.View r5 = r13.f1143h
            r4.addView(r5, r14)
            android.view.View r14 = r13.f1143h
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01b8
            android.view.View r14 = r13.f1143h
            r14.requestFocus()
        L_0x01b8:
            r5 = -2
        L_0x01b9:
            r13.f1149n = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            int r7 = r13.d
            int r8 = r13.e
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.c
            r14.gravity = r2
            int r2 = r13.f1141f
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f1142g
            r0.addView(r2, r14)
            r13.f1150o = r1
            return
        L_0x01db:
            r13.f1152q = r1
        L_0x01dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.a(h.b.k.k$j, android.view.KeyEvent):void");
    }

    public void a(h.b.o.i.g gVar) {
        c0 c0Var = this.f1133o;
        if (c0Var == null || !c0Var.g() || (ViewConfiguration.get(this.f1126h).hasPermanentMenuKey() && !this.f1133o.a())) {
            j d2 = d(0);
            d2.f1152q = true;
            a(d2, false);
            a(d2, (KeyEvent) null);
            return;
        }
        Window.Callback h2 = h();
        if (this.f1133o.b()) {
            this.f1133o.d();
            if (!this.P) {
                h2.onPanelClosed(108, d(0).f1145j);
            }
        } else if (h2 != null && !this.P) {
            if (this.W && (1 & this.X) != 0) {
                this.f1127i.getDecorView().removeCallbacks(this.Y);
                this.Y.run();
            }
            j d3 = d(0);
            h.b.o.i.g gVar2 = d3.f1145j;
            if (gVar2 != null && !d3.r && h2.onPreparePanel(0, d3.f1144i, gVar2)) {
                h2.onMenuOpened(108, d3.f1145j);
                this.f1133o.e();
            }
        }
    }

    public void a(j jVar, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || jVar.a != 0 || (c0Var = this.f1133o) == null || !c0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f1126h.getSystemService("window");
            if (!(windowManager == null || !jVar.f1150o || (viewGroup = jVar.f1142g) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    a(jVar.a, jVar, (Menu) null);
                }
            }
            jVar.f1148m = false;
            jVar.f1149n = false;
            jVar.f1150o = false;
            jVar.f1143h = null;
            jVar.f1152q = true;
            if (this.K == jVar) {
                this.K = null;
                return;
            }
            return;
        }
        b(jVar.f1145j);
    }

    public void a(int i2, j jVar, Menu menu) {
        if (menu == null) {
            if (jVar == null && i2 >= 0) {
                j[] jVarArr = this.J;
                if (i2 < jVarArr.length) {
                    jVar = jVarArr[i2];
                }
            }
            if (jVar != null) {
                menu = jVar.f1145j;
            }
        }
        if ((jVar == null || jVar.f1150o) && !this.P) {
            this.f1128j.e.onPanelClosed(i2, menu);
        }
    }

    public j a(Menu menu) {
        j[] jVarArr = this.J;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.f1145j == menu) {
                return jVar;
            }
        }
        return null;
    }

    public final boolean a(j jVar, int i2, KeyEvent keyEvent, int i3) {
        h.b.o.i.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.f1148m || b(jVar, keyEvent)) && (gVar = jVar.f1145j) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f1133o == null) {
            a(jVar, true);
        }
        return z2;
    }

    public final int a(v vVar, Rect rect) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6 = 0;
        if (vVar != null) {
            i2 = vVar.d();
        } else {
            i2 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.s;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
            boolean z4 = true;
            if (this.s.isShown()) {
                if (this.a0 == null) {
                    this.a0 = new Rect();
                    this.b0 = new Rect();
                }
                Rect rect2 = this.a0;
                Rect rect3 = this.b0;
                if (vVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(vVar.b(), vVar.d(), vVar.c(), vVar.a());
                }
                d1.a(this.y, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                v p2 = h.h.m.m.p(this.y);
                if (p2 == null) {
                    i3 = 0;
                } else {
                    i3 = p2.b();
                }
                if (p2 == null) {
                    i4 = 0;
                } else {
                    i4 = p2.c();
                }
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z3 = true;
                }
                if (i7 <= 0 || this.A != null) {
                    View view = this.A;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i3 && marginLayoutParams2.rightMargin == i4)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i3;
                            marginLayoutParams2.rightMargin = i4;
                            this.A.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f1126h);
                    this.A = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i3;
                    layoutParams.rightMargin = i4;
                    this.y.addView(this.A, -1, layoutParams);
                }
                z2 = this.A != null;
                if (z2 && this.A.getVisibility() != 0) {
                    View view3 = this.A;
                    if ((h.h.m.m.r(view3) & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        i5 = h.h.f.a.a(this.f1126h, h.b.c.abc_decor_view_status_guard_light);
                    } else {
                        i5 = h.h.f.a.a(this.f1126h, h.b.c.abc_decor_view_status_guard);
                    }
                    view3.setBackgroundColor(i5);
                }
                if (!this.F && z2) {
                    i2 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.s.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.A;
        if (view4 != null) {
            if (!z2) {
                i6 = 8;
            }
            view4.setVisibility(i6);
        }
        return i2;
    }

    public boolean a(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.H && i2 == 108) {
            return false;
        }
        if (this.D && i2 == 1) {
            this.D = false;
        }
        if (i2 == 1) {
            k();
            this.H = true;
            return true;
        } else if (i2 == 2) {
            k();
            this.B = true;
            return true;
        } else if (i2 == 5) {
            k();
            this.C = true;
            return true;
        } else if (i2 == 10) {
            k();
            this.F = true;
            return true;
        } else if (i2 == 108) {
            k();
            this.D = true;
            return true;
        } else if (i2 != 109) {
            return this.f1127i.requestFeature(i2);
        } else {
            k();
            this.E = true;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.P
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.Q
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = -100
        L_0x000f:
            android.content.Context r2 = r11.f1126h
            int r2 = r11.a((android.content.Context) r2, (int) r0)
            android.content.Context r3 = r11.f1126h
            r4 = 0
            android.content.res.Configuration r2 = r11.a((android.content.Context) r3, (int) r2, (android.content.res.Configuration) r4)
            boolean r3 = r11.T
            r5 = 24
            r6 = 1
            if (r3 != 0) goto L_0x006d
            java.lang.Object r3 = r11.f1125g
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x006d
            android.content.Context r3 = r11.f1126h
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L_0x0033
            r3 = 0
            goto L_0x0071
        L_0x0033:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0063 }
            r8 = 29
            if (r7 < r8) goto L_0x003c
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0044
        L_0x003c:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0063 }
            if (r7 < r5) goto L_0x0043
            r7 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.Context r9 = r11.f1126h     // Catch:{ NameNotFoundException -> 0x0063 }
            java.lang.Object r10 = r11.f1125g     // Catch:{ NameNotFoundException -> 0x0063 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0063 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0063 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0063 }
            if (r3 == 0) goto L_0x005f
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0063 }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x005f
            r3 = 1
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            r11.S = r3     // Catch:{ NameNotFoundException -> 0x0063 }
            goto L_0x006d
        L_0x0063:
            r3 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r3)
            r11.S = r1
        L_0x006d:
            r11.T = r6
            boolean r3 = r11.S
        L_0x0071:
            android.content.Context r7 = r11.f1126h
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            if (r7 == r2) goto L_0x00ab
            if (r12 == 0) goto L_0x00ab
            if (r3 != 0) goto L_0x00ab
            boolean r12 = r11.M
            if (r12 == 0) goto L_0x00ab
            boolean r12 = g0
            if (r12 != 0) goto L_0x0095
            boolean r12 = r11.N
            if (r12 == 0) goto L_0x00ab
        L_0x0095:
            java.lang.Object r12 = r11.f1125g
            boolean r8 = r12 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00ab
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00ab
            java.lang.Object r12 = r11.f1125g
            android.app.Activity r12 = (android.app.Activity) r12
            h.h.e.a.b(r12)
            r1 = 1
        L_0x00ab:
            if (r1 != 0) goto L_0x01e1
            if (r7 == r2) goto L_0x01e1
            android.content.Context r12 = r11.f1126h
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r12.getConfiguration()
            r1.<init>(r7)
            android.content.res.Configuration r7 = r12.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r2 = r2 | r7
            r1.uiMode = r2
            r12.updateConfiguration(r1, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            r8 = 23
            if (r2 >= r7) goto L_0x019c
            r7 = 28
            if (r2 < r7) goto L_0x00da
            goto L_0x019c
        L_0x00da:
            java.lang.String r7 = "mDrawableCache"
            java.lang.String r9 = "ResourcesFlusher"
            if (r2 < r5) goto L_0x0140
            boolean r2 = g.a.a.b.a.f877h
            if (r2 != 0) goto L_0x00fa
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r5 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x00f2 }
            g.a.a.b.a.f876g = r2     // Catch:{ NoSuchFieldException -> 0x00f2 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x00f2 }
            goto L_0x00f8
        L_0x00f2:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r9, r5, r2)
        L_0x00f8:
            g.a.a.b.a.f877h = r6
        L_0x00fa:
            java.lang.reflect.Field r2 = g.a.a.b.a.f876g
            if (r2 != 0) goto L_0x0100
            goto L_0x019c
        L_0x0100:
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0105 }
            goto L_0x010c
        L_0x0105:
            r12 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r9, r2, r12)
            r12 = r4
        L_0x010c:
            if (r12 != 0) goto L_0x0110
            goto L_0x019c
        L_0x0110:
            boolean r2 = g.a.a.b.a.f874b
            if (r2 != 0) goto L_0x012a
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchFieldException -> 0x0122 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0122 }
            g.a.a.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x0122 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0122 }
            goto L_0x0128
        L_0x0122:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r9, r5, r2)
        L_0x0128:
            g.a.a.b.a.f874b = r6
        L_0x012a:
            java.lang.reflect.Field r2 = g.a.a.b.a.a
            if (r2 == 0) goto L_0x0139
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0133 }
            goto L_0x013a
        L_0x0133:
            r12 = move-exception
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r9, r2, r12)
        L_0x0139:
            r12 = r4
        L_0x013a:
            if (r12 == 0) goto L_0x019c
            g.a.a.b.a.b((java.lang.Object) r12)
            goto L_0x019c
        L_0x0140:
            java.lang.String r5 = "Could not retrieve Resources#mDrawableCache field"
            java.lang.String r10 = "Could not retrieve value from Resources#mDrawableCache"
            if (r2 < r8) goto L_0x0171
            boolean r2 = g.a.a.b.a.f874b
            if (r2 != 0) goto L_0x015c
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0156 }
            g.a.a.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x0156 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            r2 = move-exception
            android.util.Log.e(r9, r5, r2)
        L_0x015a:
            g.a.a.b.a.f874b = r6
        L_0x015c:
            java.lang.reflect.Field r2 = g.a.a.b.a.a
            if (r2 == 0) goto L_0x0169
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0165 }
            goto L_0x016a
        L_0x0165:
            r12 = move-exception
            android.util.Log.e(r9, r10, r12)
        L_0x0169:
            r12 = r4
        L_0x016a:
            if (r12 != 0) goto L_0x016d
            goto L_0x019c
        L_0x016d:
            g.a.a.b.a.b((java.lang.Object) r12)
            goto L_0x019c
        L_0x0171:
            boolean r2 = g.a.a.b.a.f874b
            if (r2 != 0) goto L_0x0187
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r7)     // Catch:{ NoSuchFieldException -> 0x0181 }
            g.a.a.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x0181 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0181 }
            goto L_0x0185
        L_0x0181:
            r2 = move-exception
            android.util.Log.e(r9, r5, r2)
        L_0x0185:
            g.a.a.b.a.f874b = r6
        L_0x0187:
            java.lang.reflect.Field r2 = g.a.a.b.a.a
            if (r2 == 0) goto L_0x019c
            java.lang.Object r12 = r2.get(r12)     // Catch:{ IllegalAccessException -> 0x0192 }
            java.util.Map r12 = (java.util.Map) r12     // Catch:{ IllegalAccessException -> 0x0192 }
            goto L_0x0197
        L_0x0192:
            r12 = move-exception
            android.util.Log.e(r9, r10, r12)
            r12 = r4
        L_0x0197:
            if (r12 == 0) goto L_0x019c
            r12.clear()
        L_0x019c:
            int r12 = r11.R
            if (r12 == 0) goto L_0x01b4
            android.content.Context r2 = r11.f1126h
            r2.setTheme(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r8) goto L_0x01b4
            android.content.Context r12 = r11.f1126h
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r2 = r11.R
            r12.applyStyle(r2, r6)
        L_0x01b4:
            if (r3 == 0) goto L_0x01e2
            java.lang.Object r12 = r11.f1125g
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L_0x01e2
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r2 = r12 instanceof h.o.l
            if (r2 == 0) goto L_0x01d9
            r2 = r12
            h.o.l r2 = (h.o.l) r2
            h.o.h r2 = r2.a()
            h.o.m r2 = (h.o.m) r2
            h.o.h$b r2 = r2.f2058b
            h.o.h$b r3 = h.o.h.b.STARTED
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L_0x01e2
            r12.onConfigurationChanged(r1)
            goto L_0x01e2
        L_0x01d9:
            boolean r2 = r11.O
            if (r2 == 0) goto L_0x01e2
            r12.onConfigurationChanged(r1)
            goto L_0x01e2
        L_0x01e1:
            r6 = r1
        L_0x01e2:
            if (r6 == 0) goto L_0x01f0
            java.lang.Object r12 = r11.f1125g
            boolean r1 = r12 instanceof h.b.k.h
            if (r1 == 0) goto L_0x01f0
            h.b.k.h r12 = (h.b.k.h) r12
            if (r12 == 0) goto L_0x01ef
            goto L_0x01f0
        L_0x01ef:
            throw r4
        L_0x01f0:
            if (r0 != 0) goto L_0x01fc
            android.content.Context r12 = r11.f1126h
            h.b.k.k$g r12 = r11.a((android.content.Context) r12)
            r12.e()
            goto L_0x0203
        L_0x01fc:
            h.b.k.k$g r12 = r11.U
            if (r12 == 0) goto L_0x0203
            r12.a()
        L_0x0203:
            r12 = 3
            if (r0 != r12) goto L_0x0219
            android.content.Context r12 = r11.f1126h
            h.b.k.k$g r0 = r11.V
            if (r0 != 0) goto L_0x0213
            h.b.k.k$f r0 = new h.b.k.k$f
            r0.<init>(r12)
            r11.V = r0
        L_0x0213:
            h.b.k.k$g r12 = r11.V
            r12.e()
            goto L_0x0220
        L_0x0219:
            h.b.k.k$g r12 = r11.V
            if (r12 == 0) goto L_0x0220
            r12.a()
        L_0x0220:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.k.a(boolean):boolean");
    }

    public final Configuration a(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public final g a(Context context) {
        if (this.U == null) {
            if (u.d == null) {
                Context applicationContext = context.getApplicationContext();
                u.d = new u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.U = new h(u.d);
        }
        return this.U;
    }

    public int a(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.V == null) {
                            this.V = new f(context);
                        }
                        return this.V.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return a(context).c();
            } else {
                return -1;
            }
        }
        return i2;
    }
}
