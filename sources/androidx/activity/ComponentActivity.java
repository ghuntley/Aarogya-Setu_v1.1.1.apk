package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import h.h.e.d;
import h.o.b0;
import h.o.c0;
import h.o.d0;
import h.o.g;
import h.o.h;
import h.o.j;
import h.o.l;
import h.o.m;
import h.o.w;
import h.o.y;
import h.t.c;

public class ComponentActivity extends d implements l, d0, g, c, h.a.c {

    /* renamed from: f  reason: collision with root package name */
    public final m f31f = new m(this);

    /* renamed from: g  reason: collision with root package name */
    public final h.t.b f32g = new h.t.b(this);

    /* renamed from: h  reason: collision with root package name */
    public c0 f33h;

    /* renamed from: i  reason: collision with root package name */
    public b0.b f34i;

    /* renamed from: j  reason: collision with root package name */
    public final OnBackPressedDispatcher f35j = new OnBackPressedDispatcher(new a());

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    public static final class b {
        public c0 a;
    }

    public ComponentActivity() {
        m mVar = this.f31f;
        if (mVar != null) {
            mVar.a(new j() {
                public void a(l lVar, h.a aVar) {
                    if (aVar == h.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.f31f.a(new j() {
                public void a(l lVar, h.a aVar) {
                    if (aVar == h.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.h().a();
                    }
                }
            });
            if (Build.VERSION.SDK_INT <= 23) {
                this.f31f.a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final OnBackPressedDispatcher b() {
        return this.f35j;
    }

    public final h.t.a c() {
        return this.f32g.f2228b;
    }

    public c0 h() {
        if (getApplication() != null) {
            if (this.f33h == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f33h = bVar.a;
                }
                if (this.f33h == null) {
                    this.f33h = new c0();
                }
            }
            return this.f33h;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public b0.b j() {
        if (getApplication() != null) {
            if (this.f34i == null) {
                this.f34i = new y(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.f34i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f35j.a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f32g.a(bundle);
        w.b(this);
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        c0 c0Var = this.f33h;
        if (c0Var == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            c0Var = bVar.a;
        }
        if (c0Var == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = c0Var;
        return bVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        m mVar = this.f31f;
        if (mVar instanceof m) {
            mVar.a(h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f32g.b(bundle);
    }

    public h a() {
        return this.f31f;
    }
}
