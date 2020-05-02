package h.l.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import h.a.c;
import h.e.d;
import h.e.i;
import h.h.e.a;
import h.o.c0;
import h.o.d0;
import h.o.h;
import h.o.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity */
public class e extends ComponentActivity implements a.b, a.d {

    /* renamed from: k  reason: collision with root package name */
    public final m f1947k;

    /* renamed from: l  reason: collision with root package name */
    public final m f1948l = new m(this);

    /* renamed from: m  reason: collision with root package name */
    public boolean f1949m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1950n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1951o = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1952p;

    /* renamed from: q  reason: collision with root package name */
    public int f1953q;
    public i<String> r;

    /* compiled from: FragmentActivity */
    public class a extends o<e> implements d0, c {
        public a() {
            super(e.this);
        }

        public h a() {
            return e.this.f1948l;
        }

        public OnBackPressedDispatcher b() {
            return e.this.f35j;
        }

        public boolean d() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public c0 h() {
            return e.this.h();
        }

        public View a(int i2) {
            return e.this.findViewById(i2);
        }
    }

    public e() {
        a aVar = new a();
        g.a.a.b.a.a(aVar, (Object) "callbacks == null");
        this.f1947k = new m(aVar);
    }

    public static void b(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final void a(int i2) {
        if (i2 != -1) {
            b(i2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1949m);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1950n);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1951o);
        if (getApplication() != null) {
            h.p.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1947k.a.f2003h.a(str, fileDescriptor, printWriter, strArr);
    }

    public r k() {
        return this.f1947k.a.f2003h;
    }

    @Deprecated
    public void l() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1947k.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String a2 = this.r.a(i5);
            this.r.c(i5);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment c = this.f1947k.a.f2003h.c(a2);
            if (c == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            c.a(i2 & 65535, i3, intent);
            return;
        }
        h.h.e.a.a();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1947k.a();
        this.f1947k.a.f2003h.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        o<?> oVar = this.f1947k.a;
        oVar.f2003h.a(oVar, oVar, (Fragment) null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            o<?> oVar2 = this.f1947k.a;
            if (oVar2 instanceof d0) {
                oVar2.f2003h.a(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.f1953q = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.r = new i<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.r.c(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.r == null) {
            this.r = new i<>(10);
            this.f1953q = 0;
        }
        super.onCreate(bundle);
        this.f1948l.a(h.a.ON_CREATE);
        this.f1947k.a.f2003h.b();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        m mVar = this.f1947k;
        return onCreatePanelMenu | mVar.a.f2003h.a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1947k.a.f2003h.f2006f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1947k.a.f2003h.c();
        this.f1948l.a(h.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1947k.a.f2003h.d();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1947k.a.f2003h.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1947k.a.f2003h.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1947k.a.f2003h.a(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1947k.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1947k.a.f2003h.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.f1950n = false;
        this.f1947k.a.f2003h.a(3);
        this.f1948l.a(h.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1947k.a.f2003h.b(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1948l.a(h.a.ON_RESUME);
        r rVar = this.f1947k.a.f2003h;
        rVar.u = false;
        rVar.v = false;
        rVar.a(4);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f1947k.a.f2003h.b(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1947k.a();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.r.a(i4);
            this.r.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f1947k.a.f2003h.c(a2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.f1950n = true;
        this.f1947k.a();
        this.f1947k.a.f2003h.d(true);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (a(k(), h.b.CREATED));
        this.f1948l.a(h.a.ON_STOP);
        Parcelable k2 = this.f1947k.a.f2003h.k();
        if (k2 != null) {
            bundle.putParcelable("android:support:fragments", k2);
        }
        if (this.r.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1953q);
            int[] iArr = new int[this.r.c()];
            String[] strArr = new String[this.r.c()];
            for (int i2 = 0; i2 < this.r.c(); i2++) {
                iArr[i2] = this.r.b(i2);
                strArr[i2] = this.r.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.f1951o = false;
        if (!this.f1949m) {
            this.f1949m = true;
            r rVar = this.f1947k.a.f2003h;
            rVar.u = false;
            rVar.v = false;
            rVar.a(2);
        }
        this.f1947k.a();
        this.f1947k.a.f2003h.d(true);
        this.f1948l.a(h.a.ON_START);
        r rVar2 = this.f1947k.a.f2003h;
        rVar2.u = false;
        rVar2.v = false;
        rVar2.a(3);
    }

    public void onStateNotSaved() {
        this.f1947k.a();
    }

    public void onStop() {
        super.onStop();
        this.f1951o = true;
        do {
        } while (a(k(), h.b.CREATED));
        r rVar = this.f1947k.a.f2003h;
        rVar.v = true;
        rVar.a(2);
        this.f1948l.a(h.a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.f1952p && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public final int a(Fragment fragment) {
        if (this.r.c() < 65534) {
            while (true) {
                i<String> iVar = this.r;
                int i2 = this.f1953q;
                if (iVar.e) {
                    iVar.b();
                }
                if (d.a(iVar.f1572f, iVar.f1574h, i2) >= 0) {
                    this.f1953q = (this.f1953q + 1) % 65534;
                } else {
                    int i3 = this.f1953q;
                    this.r.c(i3, fragment.f231i);
                    this.f1953q = (this.f1953q + 1) % 65534;
                    return i3;
                }
            }
        } else {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            b(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.f1952p && i2 != -1) {
            b(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1947k.a.f2003h.f2006f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    public static boolean a(r rVar, h.b bVar) {
        e eVar;
        boolean z = false;
        for (Fragment next : rVar.c.c()) {
            if (next != null) {
                o<?> oVar = next.w;
                if (oVar == null) {
                    eVar = null;
                } else {
                    eVar = e.this;
                }
                if (eVar != null) {
                    z |= a(next.i(), bVar);
                }
                if (next.U.f2058b.a(h.b.STARTED)) {
                    next.U.a(bVar);
                    z = true;
                }
            }
        }
        return z;
    }
}
