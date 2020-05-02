package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import h.b.j;
import h.b.k.q;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q = 0;
    public Handler R;
    public final View.OnClickListener S = new a();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final q f40b;
    public final Window c;
    public final int d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f41f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f42g;

    /* renamed from: h  reason: collision with root package name */
    public View f43h;

    /* renamed from: i  reason: collision with root package name */
    public int f44i;

    /* renamed from: j  reason: collision with root package name */
    public int f45j;

    /* renamed from: k  reason: collision with root package name */
    public int f46k;

    /* renamed from: l  reason: collision with root package name */
    public int f47l;

    /* renamed from: m  reason: collision with root package name */
    public int f48m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f49n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f50o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f51p;

    /* renamed from: q  reason: collision with root package name */
    public Message f52q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public static class RecycleListView extends ListView {
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final int f53f;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RecycleListView);
            this.f53f = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingBottomNoButtons, -1);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            r3 = r0.y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f50o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f52q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                h.b.k.q r3 = r3.f40b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f54b;
        public int c = 0;
        public Drawable d;
        public int e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f55f;

        /* renamed from: g  reason: collision with root package name */
        public View f56g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f57h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f58i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f59j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f60k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnClickListener f61l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f62m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnCancelListener f63n;

        /* renamed from: o  reason: collision with root package name */
        public DialogInterface.OnDismissListener f64o;

        /* renamed from: p  reason: collision with root package name */
        public DialogInterface.OnKeyListener f65p;

        /* renamed from: q  reason: collision with root package name */
        public ListAdapter f66q;
        public DialogInterface.OnClickListener r;
        public boolean s = false;
        public boolean t;
        public int u = -1;

        public b(Context context) {
            this.a = context;
            this.f62m = true;
            this.f54b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {
        public WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.a = context;
        this.f40b = qVar;
        this.c = window;
        this.R = new c(qVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.AlertDialog, h.b.a.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(j.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(j.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(j.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(j.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(j.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(j.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(j.AlertDialog_showTitle, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        qVar.a(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.f51p = charSequence;
            this.f52q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void a(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public final ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void a(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public final void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
