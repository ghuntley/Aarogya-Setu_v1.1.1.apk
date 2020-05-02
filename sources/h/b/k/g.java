package h.b.k;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import h.b.f;
import h.b.p.i0;
import h.h.m.m;

/* compiled from: AlertDialog */
public class g extends q implements DialogInterface {

    /* renamed from: g  reason: collision with root package name */
    public final AlertController f1122g = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {
        public final AlertController.b a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1123b;

        public a(Context context) {
            int a2 = g.a(context, 0);
            this.a = new AlertController.b(new ContextThemeWrapper(context, g.a(context, a2)));
            this.f1123b = a2;
        }

        public g a() {
            int i2;
            g gVar = new g(this.a.a, this.f1123b);
            AlertController.b bVar = this.a;
            AlertController alertController = gVar.f1122g;
            View view = bVar.f56g;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f55f;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i3 = bVar.c;
                if (i3 != 0) {
                    alertController.a(i3);
                }
                int i4 = bVar.e;
                if (i4 != 0) {
                    if (alertController != null) {
                        TypedValue typedValue = new TypedValue();
                        alertController.a.getTheme().resolveAttribute(i4, typedValue, true);
                        alertController.a(typedValue.resourceId);
                    } else {
                        throw null;
                    }
                }
            }
            CharSequence charSequence2 = bVar.f57h;
            if (charSequence2 != null) {
                alertController.f41f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f58i;
            if (charSequence3 != null) {
                alertController.a(-1, charSequence3, bVar.f59j, (Message) null, (Drawable) null);
            }
            CharSequence charSequence4 = bVar.f60k;
            if (charSequence4 != null) {
                alertController.a(-2, charSequence4, bVar.f61l, (Message) null, (Drawable) null);
            }
            if (bVar.f66q != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f54b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.t) {
                    i2 = alertController.N;
                } else {
                    i2 = alertController.O;
                }
                ListAdapter listAdapter = bVar.f66q;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i2, 16908308, (CharSequence[]) null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.u;
                if (bVar.r != null) {
                    recycleListView.setOnItemClickListener(new f(bVar, alertController));
                }
                if (bVar.t) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f42g = recycleListView;
            }
            gVar.setCancelable(this.a.f62m);
            if (this.a.f62m) {
                gVar.setCanceledOnTouchOutside(true);
            }
            gVar.setOnCancelListener(this.a.f63n);
            gVar.setOnDismissListener(this.a.f64o);
            DialogInterface.OnKeyListener onKeyListener = this.a.f65p;
            if (onKeyListener != null) {
                gVar.setOnKeyListener(onKeyListener);
            }
            return gVar;
        }
    }

    public g(Context context, int i2) {
        super(context, a(context, i2));
    }

    public static int a(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.b.a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View view;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f1122g;
        int i2 = alertController.K;
        if (i2 == 0) {
            i2 = alertController.J;
        } else if (alertController.Q != 1) {
            i2 = alertController.J;
        }
        alertController.f40b.setContentView(i2);
        View findViewById2 = alertController.c.findViewById(f.parentPanel);
        View findViewById3 = findViewById2.findViewById(f.topPanel);
        View findViewById4 = findViewById2.findViewById(f.contentPanel);
        View findViewById5 = findViewById2.findViewById(f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(f.customPanel);
        View view2 = alertController.f43h;
        View view3 = null;
        int i3 = 0;
        if (view2 == null) {
            view2 = alertController.f44i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.f44i, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.a(view2)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(f.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f49n) {
                frameLayout.setPadding(alertController.f45j, alertController.f46k, alertController.f47l, alertController.f48m);
            }
            if (alertController.f42g != null) {
                ((i0.a) viewGroup.getLayoutParams()).a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(f.topPanel);
        View findViewById7 = viewGroup.findViewById(f.contentPanel);
        View findViewById8 = viewGroup.findViewById(f.buttonPanel);
        ViewGroup a2 = alertController.a(findViewById6, findViewById3);
        ViewGroup a3 = alertController.a(findViewById7, findViewById4);
        ViewGroup a4 = alertController.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.c.findViewById(f.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f41f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f42g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f42g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    a3.setVisibility(8);
                }
            }
        }
        Button button = (Button) a4.findViewById(16908313);
        alertController.f50o = button;
        button.setOnClickListener(alertController.S);
        if (!TextUtils.isEmpty(alertController.f51p) || alertController.r != null) {
            alertController.f50o.setText(alertController.f51p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i4 = alertController.d;
                drawable.setBounds(0, 0, i4, i4);
                alertController.f50o.setCompoundDrawables(alertController.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.f50o.setVisibility(0);
            z = true;
        } else {
            alertController.f50o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) a4.findViewById(16908314);
        alertController.s = button2;
        button2.setOnClickListener(alertController.S);
        if (!TextUtils.isEmpty(alertController.t) || alertController.v != null) {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i5 = alertController.d;
                drawable2.setBounds(0, 0, i5, i5);
                alertController.s.setCompoundDrawables(alertController.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        } else {
            alertController.s.setVisibility(8);
        }
        Button button3 = (Button) a4.findViewById(16908315);
        alertController.w = button3;
        button3.setOnClickListener(alertController.S);
        if (!TextUtils.isEmpty(alertController.x) || alertController.z != null) {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i6 = alertController.d;
                drawable3.setBounds(0, 0, i6, i6);
                alertController.w.setCompoundDrawables(alertController.z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.w.setVisibility(0);
            z |= true;
        } else {
            alertController.w.setVisibility(8);
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.b.a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.a(alertController.f50o);
            } else if (z) {
                alertController.a(alertController.s);
            } else if (z) {
                alertController.a(alertController.w);
            }
        }
        if (!(z)) {
            a4.setVisibility(8);
        }
        if (alertController.G != null) {
            a2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(f.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.P) {
                alertController.c.findViewById(f.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.c.findViewById(f.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i7 = alertController.B;
                if (i7 != 0) {
                    alertController.D.setImageResource(i7);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i8 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = a4.getVisibility() != 8;
        if (!z4 && (findViewById = a3.findViewById(f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i8 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f41f == null && alertController.f42g == null) {
                view = null;
            } else {
                view = a2.findViewById(f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = a3.findViewById(f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = alertController.f42g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            if (recycleListView == null) {
                throw null;
            } else if (!z4 || i8 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i8 != 0 ? recycleListView.getPaddingTop() : recycleListView.e, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f53f);
            }
        }
        if (!z3) {
            View view4 = alertController.f42g;
            if (view4 == null) {
                view4 = alertController.A;
            }
            if (view4 != null) {
                if (z4) {
                    i3 = 2;
                }
                int i9 = i8 | i3;
                View findViewById10 = alertController.c.findViewById(f.scrollIndicatorUp);
                View findViewById11 = alertController.c.findViewById(f.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    m.a(view4, i9, 3);
                    if (findViewById10 != null) {
                        a3.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        a3.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i9 & 1) == 0) {
                        a3.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 == null || (i9 & 2) != 0) {
                        view3 = findViewById11;
                    } else {
                        a3.removeView(findViewById11);
                    }
                    if (!(findViewById10 == null && view3 == null)) {
                        if (alertController.f41f != null) {
                            alertController.A.setOnScrollChangeListener(new b(alertController, findViewById10, view3));
                            alertController.A.post(new c(alertController, findViewById10, view3));
                        } else {
                            ListView listView2 = alertController.f42g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new d(alertController, findViewById10, view3));
                                alertController.f42g.post(new e(alertController, findViewById10, view3));
                            } else {
                                if (findViewById10 != null) {
                                    a3.removeView(findViewById10);
                                }
                                if (view3 != null) {
                                    a3.removeView(view3);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f42g;
        if (listView3 != null && (listAdapter = alertController.H) != null) {
            listView3.setAdapter(listAdapter);
            int i10 = alertController.I;
            if (i10 > -1) {
                listView3.setItemChecked(i10, true);
                listView3.setSelection(i10);
            }
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1122g.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1122g.A;
        if (nestedScrollView != null && nestedScrollView.a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1122g;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
