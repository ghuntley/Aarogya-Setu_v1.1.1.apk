package h.b.k;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import h.b.i;
import h.b.o.a;
import h.b.o.c;
import h.b.o.f;
import h.b.p.c1;
import h.b.p.j;
import h.h.e.p;
import h.l.d.e;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: AppCompatActivity */
public class h extends e implements i, p {
    public j s;
    public Resources t;

    public a a(a.C0035a aVar) {
        return null;
    }

    public void a(a aVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m().a(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        k kVar = (k) m();
        boolean z = true;
        kVar.M = true;
        int i2 = kVar.Q;
        if (i2 == -100) {
            i2 = -100;
        }
        int a = kVar.a(context, i2);
        Configuration configuration = null;
        if (k.h0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(kVar.a(context, a, (Configuration) null));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof c) {
            try {
                ((c) context).a(kVar.a(context, a, (Configuration) null));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (k.g0) {
            try {
                Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
                Configuration configuration3 = context.getResources().getConfiguration();
                if (!configuration2.equals(configuration3)) {
                    configuration = new Configuration();
                    configuration.fontScale = 0.0f;
                    if (!(configuration3 == null || configuration2.diff(configuration3) == 0)) {
                        float f2 = configuration2.fontScale;
                        float f3 = configuration3.fontScale;
                        if (f2 != f3) {
                            configuration.fontScale = f3;
                        }
                        int i3 = configuration2.mcc;
                        int i4 = configuration3.mcc;
                        if (i3 != i4) {
                            configuration.mcc = i4;
                        }
                        int i5 = configuration2.mnc;
                        int i6 = configuration3.mnc;
                        if (i5 != i6) {
                            configuration.mnc = i6;
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            LocaleList locales = configuration2.getLocales();
                            LocaleList locales2 = configuration3.getLocales();
                            if (!locales.equals(locales2)) {
                                configuration.setLocales(locales2);
                                configuration.locale = configuration3.locale;
                            }
                        } else if (!Objects.equals(configuration2.locale, configuration3.locale)) {
                            configuration.locale = configuration3.locale;
                        }
                        int i7 = configuration2.touchscreen;
                        int i8 = configuration3.touchscreen;
                        if (i7 != i8) {
                            configuration.touchscreen = i8;
                        }
                        int i9 = configuration2.keyboard;
                        int i10 = configuration3.keyboard;
                        if (i9 != i10) {
                            configuration.keyboard = i10;
                        }
                        int i11 = configuration2.keyboardHidden;
                        int i12 = configuration3.keyboardHidden;
                        if (i11 != i12) {
                            configuration.keyboardHidden = i12;
                        }
                        int i13 = configuration2.navigation;
                        int i14 = configuration3.navigation;
                        if (i13 != i14) {
                            configuration.navigation = i14;
                        }
                        int i15 = configuration2.navigationHidden;
                        int i16 = configuration3.navigationHidden;
                        if (i15 != i16) {
                            configuration.navigationHidden = i16;
                        }
                        int i17 = configuration2.orientation;
                        int i18 = configuration3.orientation;
                        if (i17 != i18) {
                            configuration.orientation = i18;
                        }
                        int i19 = configuration2.screenLayout & 15;
                        int i20 = configuration3.screenLayout & 15;
                        if (i19 != i20) {
                            configuration.screenLayout |= i20;
                        }
                        int i21 = configuration2.screenLayout & 192;
                        int i22 = configuration3.screenLayout & 192;
                        if (i21 != i22) {
                            configuration.screenLayout |= i22;
                        }
                        int i23 = configuration2.screenLayout & 48;
                        int i24 = configuration3.screenLayout & 48;
                        if (i23 != i24) {
                            configuration.screenLayout |= i24;
                        }
                        int i25 = configuration2.screenLayout & 768;
                        int i26 = configuration3.screenLayout & 768;
                        if (i25 != i26) {
                            configuration.screenLayout |= i26;
                        }
                        if (Build.VERSION.SDK_INT >= 26) {
                            int i27 = configuration2.colorMode & 3;
                            int i28 = configuration3.colorMode & 3;
                            if (i27 != i28) {
                                configuration.colorMode |= i28;
                            }
                            int i29 = configuration2.colorMode & 12;
                            int i30 = configuration3.colorMode & 12;
                            if (i29 != i30) {
                                configuration.colorMode |= i30;
                            }
                        }
                        int i31 = configuration2.uiMode & 15;
                        int i32 = configuration3.uiMode & 15;
                        if (i31 != i32) {
                            configuration.uiMode |= i32;
                        }
                        int i33 = configuration2.uiMode & 48;
                        int i34 = configuration3.uiMode & 48;
                        if (i33 != i34) {
                            configuration.uiMode |= i34;
                        }
                        int i35 = configuration2.screenWidthDp;
                        int i36 = configuration3.screenWidthDp;
                        if (i35 != i36) {
                            configuration.screenWidthDp = i36;
                        }
                        int i37 = configuration2.screenHeightDp;
                        int i38 = configuration3.screenHeightDp;
                        if (i37 != i38) {
                            configuration.screenHeightDp = i38;
                        }
                        int i39 = configuration2.smallestScreenWidthDp;
                        int i40 = configuration3.smallestScreenWidthDp;
                        if (i39 != i40) {
                            configuration.smallestScreenWidthDp = i40;
                        }
                        int i41 = configuration2.densityDpi;
                        int i42 = configuration3.densityDpi;
                        if (i41 != i42) {
                            configuration.densityDpi = i42;
                        }
                    }
                }
                Configuration a2 = kVar.a(context, a, configuration);
                c cVar = new c(context, i.ThemeOverlay_AppCompat);
                cVar.a(a2);
                boolean z2 = false;
                try {
                    if (context.getTheme() == null) {
                        z = false;
                    }
                    z2 = z;
                } catch (NullPointerException unused3) {
                }
                if (z2) {
                    Resources.Theme theme = cVar.getTheme();
                    int i43 = Build.VERSION.SDK_INT;
                    if (i43 >= 29) {
                        theme.rebase();
                    } else if (i43 >= 23) {
                        h.h.f.b.h.a(theme);
                    }
                }
                context = cVar;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Application failed to obtain resources from itself", e);
            }
        }
        super.attachBaseContext(context);
    }

    public void b(a aVar) {
    }

    public void closeOptionsMenu() {
        a n2 = n();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a n2 = n();
        return super.dispatchKeyEvent(keyEvent);
    }

    public Intent f() {
        return g.a.a.b.a.a((Activity) this);
    }

    public <T extends View> T findViewById(int i2) {
        k kVar = (k) m();
        kVar.f();
        return kVar.f1127i.findViewById(i2);
    }

    public MenuInflater getMenuInflater() {
        k kVar = (k) m();
        if (kVar.f1131m == null) {
            kVar.i();
            a aVar = kVar.f1130l;
            kVar.f1131m = new f(aVar != null ? aVar.c() : kVar.f1126h);
        }
        return kVar.f1131m;
    }

    public Resources getResources() {
        if (this.t == null) {
            c1.a();
        }
        Resources resources = this.t;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        m().b();
    }

    public void l() {
        m().b();
    }

    public j m() {
        if (this.s == null) {
            this.s = j.a((Activity) this, (i) this);
        }
        return this.s;
    }

    public a n() {
        k kVar = (k) m();
        kVar.i();
        return kVar.f1130l;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.t != null) {
            this.t.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        k kVar = (k) m();
        if (kVar.D && kVar.x) {
            kVar.i();
            a aVar = kVar.f1130l;
            if (aVar != null) {
                aVar.a(configuration);
            }
        }
        j.a().a(kVar.f1126h);
        kVar.a(false);
    }

    public void onContentChanged() {
    }

    public void onCreate(Bundle bundle) {
        j m2 = m();
        m2.a();
        m2.a(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        m().c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.k.h.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent a;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a n2 = n();
        if (menuItem.getItemId() != 16908332 || n2 == null || (n2.b() & 4) == 0 || (a = g.a.a.b.a.a((Activity) this)) == null) {
            return false;
        }
        if (shouldUpRecreateTask(a)) {
            ArrayList arrayList = new ArrayList();
            Intent f2 = f();
            if (f2 == null) {
                f2 = g.a.a.b.a.a((Activity) this);
            }
            if (f2 != null) {
                ComponentName component = f2.getComponent();
                if (component == null) {
                    component = f2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent a2 = g.a.a.b.a.a((Context) this, component);
                    while (a2 != null) {
                        arrayList.add(size, a2);
                        a2 = g.a.a.b.a.a((Context) this, a2.getComponent());
                    }
                    arrayList.add(f2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                h.h.f.a.a(this, intentArr, (Bundle) null);
                try {
                    h.h.e.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a);
            return true;
        }
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k) m()).f();
    }

    public void onPostResume() {
        super.onPostResume();
        k kVar = (k) m();
        kVar.i();
        a aVar = kVar.f1130l;
        if (aVar != null) {
            aVar.c(true);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (((k) m()) == null) {
            throw null;
        }
    }

    public void onStart() {
        super.onStart();
        k kVar = (k) m();
        kVar.O = true;
        kVar.d();
    }

    public void onStop() {
        super.onStop();
        k kVar = (k) m();
        kVar.O = false;
        kVar.i();
        a aVar = kVar.f1130l;
        if (aVar != null) {
            aVar.c(false);
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m().a(charSequence);
    }

    public void openOptionsMenu() {
        a n2 = n();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i2) {
        m().b(i2);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        ((k) m()).R = i2;
    }

    public void setContentView(View view) {
        m().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m().b(view, layoutParams);
    }
}
