package h.l.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import h.l.d.r;

/* compiled from: DialogFragment */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler a0;
    public Runnable b0 = new a();
    public DialogInterface.OnCancelListener c0 = new b();
    public DialogInterface.OnDismissListener d0 = new C0058c();
    public int e0 = 0;
    public int f0 = 0;
    public boolean g0 = true;
    public boolean h0 = true;
    public int i0 = -1;
    public Dialog j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;

    /* compiled from: DialogFragment */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c cVar = c.this;
            cVar.d0.onDismiss(cVar.j0);
        }
    }

    /* compiled from: DialogFragment */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            c cVar = c.this;
            Dialog dialog = cVar.j0;
            if (dialog != null) {
                cVar.onCancel(dialog);
            }
        }
    }

    /* renamed from: h.l.d.c$c  reason: collision with other inner class name */
    /* compiled from: DialogFragment */
    public class C0058c implements DialogInterface.OnDismissListener {
        public C0058c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            c cVar = c.this;
            Dialog dialog = cVar.j0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    public void B() {
        this.I = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            this.k0 = false;
            dialog.show();
        }
    }

    public void C() {
        this.I = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void H() {
        a(true, false);
    }

    public void a(int i2, int i3) {
        this.e0 = i2;
        if (i2 == 2 || i2 == 3) {
            this.f0 = 16973913;
        }
        if (i3 != 0) {
            this.f0 = i3;
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.a0 = new Handler();
        this.h0 = this.A == 0;
        if (bundle != null) {
            this.e0 = bundle.getInt("android:style", 0);
            this.f0 = bundle.getInt("android:theme", 0);
            this.g0 = bundle.getBoolean("android:cancelable", true);
            this.h0 = bundle.getBoolean("android:showsDialog", this.h0);
            this.i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public LayoutInflater c(Bundle bundle) {
        if (!this.h0) {
            return super.c(bundle);
        }
        Dialog f2 = f(bundle);
        this.j0 = f2;
        if (f2 == null) {
            return (LayoutInflater) this.w.f2001f.getSystemService("layout_inflater");
        }
        a(f2, this.e0);
        return (LayoutInflater) this.j0.getContext().getSystemService("layout_inflater");
    }

    public void d(boolean z) {
        this.g0 = z;
        Dialog dialog = this.j0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public Dialog f(Bundle bundle) {
        return new Dialog(E(), this.f0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.k0) {
            a(true, true);
        }
    }

    public void y() {
        this.I = true;
        Dialog dialog = this.j0;
        if (dialog != null) {
            this.k0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.j0.dismiss();
            if (!this.l0) {
                onDismiss(this.j0);
            }
            this.j0 = null;
        }
    }

    public void z() {
        this.I = true;
        if (!this.m0 && !this.l0) {
            this.l0 = true;
        }
    }

    public void d(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.j0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.e0;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.f0;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z = this.g0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.h0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i4 = this.i0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void a(r rVar, String str) {
        this.l0 = false;
        this.m0 = true;
        if (rVar != null) {
            a aVar = new a(rVar);
            aVar.a(0, this, str, 1);
            aVar.a(false);
            return;
        }
        throw null;
    }

    public void a(boolean z, boolean z2) {
        if (!this.l0) {
            this.l0 = true;
            this.m0 = false;
            Dialog dialog = this.j0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.j0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.a0.getLooper()) {
                        onDismiss(this.j0);
                    } else {
                        this.a0.post(this.b0);
                    }
                }
            }
            this.k0 = true;
            if (this.i0 >= 0) {
                r o2 = o();
                int i2 = this.i0;
                if (o2 == null) {
                    throw null;
                } else if (i2 >= 0) {
                    o2.a((r.e) new r.f((String) null, i2, 1), false);
                    this.i0 = -1;
                } else {
                    throw new IllegalArgumentException(i.a.a.a.a.b("Bad id: ", i2));
                }
            } else {
                r o3 = o();
                if (o3 != null) {
                    a aVar = new a(o3);
                    aVar.a((Fragment) this);
                    if (z) {
                        aVar.a();
                    } else {
                        aVar.a(false);
                    }
                } else {
                    throw null;
                }
            }
        }
    }

    public void a(Context context) {
        super.a(context);
        if (!this.m0) {
            this.l0 = false;
        }
    }

    public void a(Dialog dialog, int i2) {
        if (!(i2 == 1 || i2 == 2)) {
            if (i2 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void a(Bundle bundle) {
        Bundle bundle2;
        this.I = true;
        if (this.h0) {
            View view = this.K;
            if (view != null) {
                if (view.getParent() == null) {
                    this.j0.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            e f2 = f();
            if (f2 != null) {
                this.j0.setOwnerActivity(f2);
            }
            this.j0.setCancelable(this.g0);
            this.j0.setOnCancelListener(this.c0);
            this.j0.setOnDismissListener(this.d0);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.j0.onRestoreInstanceState(bundle2);
            }
        }
    }
}
