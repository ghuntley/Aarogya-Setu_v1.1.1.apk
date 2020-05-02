package i.c.a.c.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.e0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FloatingActionButtonImpl */
public class e {
    public static final TimeInterpolator A = i.c.a.c.l.a.c;
    public static final int[] B = {16842919, 16842910};
    public static final int[] C = {16843623, 16842908, 16842910};
    public static final int[] D = {16842908, 16842910};
    public static final int[] E = {16843623, 16842910};
    public static final int[] F = {16842910};
    public static final int[] G = new int[0];
    public j a;

    /* renamed from: b  reason: collision with root package name */
    public i.c.a.c.e0.g f4244b;
    public boolean c;
    public boolean d = true;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f4245f;

    /* renamed from: g  reason: collision with root package name */
    public float f4246g;

    /* renamed from: h  reason: collision with root package name */
    public final i.c.a.c.z.f f4247h;

    /* renamed from: i  reason: collision with root package name */
    public i.c.a.c.l.g f4248i;

    /* renamed from: j  reason: collision with root package name */
    public i.c.a.c.l.g f4249j;

    /* renamed from: k  reason: collision with root package name */
    public Animator f4250k;

    /* renamed from: l  reason: collision with root package name */
    public i.c.a.c.l.g f4251l;

    /* renamed from: m  reason: collision with root package name */
    public i.c.a.c.l.g f4252m;

    /* renamed from: n  reason: collision with root package name */
    public float f4253n;

    /* renamed from: o  reason: collision with root package name */
    public float f4254o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public int f4255p = 0;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f4256q;
    public ArrayList<Animator.AnimatorListener> r;
    public ArrayList<C0126e> s;
    public final FloatingActionButton t;
    public final i.c.a.c.d0.b u;
    public final Rect v = new Rect();
    public final RectF w = new RectF();
    public final RectF x = new RectF();
    public final Matrix y = new Matrix();
    public ViewTreeObserver.OnPreDrawListener z;

    /* compiled from: FloatingActionButtonImpl */
    public class a extends i.c.a.c.l.f {
        public a() {
        }

        public Object evaluate(float f2, Object obj, Object obj2) {
            e.this.f4254o = f2;
            ((Matrix) obj).getValues(this.a);
            ((Matrix) obj2).getValues(this.f4150b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f4150b;
                float f3 = fArr[i2];
                float[] fArr2 = this.a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.c.setValues(this.f4150b);
            return this.c;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class b extends h {
        public b(e eVar) {
            super((c) null);
        }

        public float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class c extends h {
        public c() {
            super((c) null);
        }

        public float a() {
            e eVar = e.this;
            return eVar.e + eVar.f4245f;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public class d extends h {
        public d() {
            super((c) null);
        }

        public float a() {
            e eVar = e.this;
            return eVar.e + eVar.f4246g;
        }
    }

    /* renamed from: i.c.a.c.y.e$e  reason: collision with other inner class name */
    /* compiled from: FloatingActionButtonImpl */
    public interface C0126e {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl */
    public interface f {
    }

    /* compiled from: FloatingActionButtonImpl */
    public class g extends h {
        public g() {
            super((c) null);
        }

        public float a() {
            return e.this.e;
        }
    }

    /* compiled from: FloatingActionButtonImpl */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public float f4257b;
        public float c;

        public /* synthetic */ h(c cVar) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            if (e.this != null) {
                this.a = false;
                return;
            }
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f2;
            if (!this.a) {
                i.c.a.c.e0.g gVar = e.this.f4244b;
                if (gVar == null) {
                    f2 = 0.0f;
                } else {
                    f2 = gVar.e.f4069o;
                }
                this.f4257b = f2;
                this.c = a();
                this.a = true;
            }
            e eVar = e.this;
            valueAnimator.getAnimatedFraction();
            if (eVar == null) {
                throw null;
            }
        }
    }

    public e(FloatingActionButton floatingActionButton, i.c.a.c.d0.b bVar) {
        this.t = floatingActionButton;
        this.u = bVar;
        i.c.a.c.z.f fVar = new i.c.a.c.z.f();
        this.f4247h = fVar;
        fVar.a(B, a((h) new d()));
        this.f4247h.a(C, a((h) new c()));
        this.f4247h.a(D, a((h) new c()));
        this.f4247h.a(E, a((h) new c()));
        this.f4247h.a(F, a((h) new g()));
        this.f4247h.a(G, a((h) new b(this)));
        this.f4253n = this.t.getRotation();
    }

    public float a() {
        throw null;
    }

    public final void a(float f2) {
        this.f4254o = f2;
        Matrix matrix = this.y;
        matrix.reset();
        this.t.getDrawable();
        this.t.setImageMatrix(matrix);
    }

    public void a(float f2, float f3, float f4) {
        throw null;
    }

    public void a(ColorStateList colorStateList) {
        throw null;
    }

    public void a(int[] iArr) {
        throw null;
    }

    public boolean b() {
        if (this.t.getVisibility() == 0) {
            if (this.f4255p == 1) {
                return true;
            }
            return false;
        } else if (this.f4255p != 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean c() {
        if (this.t.getVisibility() != 0) {
            if (this.f4255p == 2) {
                return true;
            }
            return false;
        } else if (this.f4255p != 1) {
            return true;
        } else {
            return false;
        }
    }

    public void d() {
        throw null;
    }

    public void e() {
        throw null;
    }

    public void f() {
        ArrayList<C0126e> arrayList = this.s;
        if (arrayList != null) {
            Iterator<C0126e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void g() {
        ArrayList<C0126e> arrayList = this.s;
        if (arrayList != null) {
            Iterator<C0126e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public boolean h() {
        throw null;
    }

    public boolean i() {
        throw null;
    }

    public final boolean j() {
        return m.x(this.t) && !this.t.isInEditMode();
    }

    public final boolean k() {
        return !this.c || this.t.getSizeDimension() >= 0;
    }

    public void l() {
        throw null;
    }

    public final void m() {
        Rect rect = this.v;
        a(rect);
        g.a.a.b.a.a(null, (Object) "Didn't initialize content background");
        if (i()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.u;
            if (bVar != null) {
                e.super.setBackgroundDrawable(insetDrawable);
            } else {
                throw null;
            }
        } else if (((FloatingActionButton.b) this.u) == null) {
            throw null;
        }
        i.c.a.c.d0.b bVar2 = this.u;
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton.b bVar3 = (FloatingActionButton.b) bVar2;
        FloatingActionButton.this.f628o.set(i2, i3, i4, i5);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i6 = floatingActionButton.f626m;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    public final AnimatorSet a(i.c.a.c.l.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.t, View.ALPHA, new float[]{f2});
        gVar.a("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.t, View.SCALE_X, new float[]{f3});
        gVar.a("scale").a(ofFloat2);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat2.setEvaluator(new f(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.t, View.SCALE_Y, new float[]{f3});
        gVar.a("scale").a(ofFloat3);
        if (Build.VERSION.SDK_INT == 26) {
            ofFloat3.setEvaluator(new f(this));
        }
        arrayList.add(ofFloat3);
        this.y.reset();
        this.t.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.t, new i.c.a.c.l.e(), new a(), new Matrix[]{new Matrix(this.y)});
        gVar.a("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        q.a(animatorSet, (List<Animator>) arrayList);
        return animatorSet;
    }

    public void a(Rect rect) {
        int i2 = 0;
        if (this.c) {
            i2 = (0 - this.t.getSizeDimension()) / 2;
        }
        float a2 = this.d ? a() + this.f4246g : 0.0f;
        int max = Math.max(i2, (int) Math.ceil((double) a2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (a2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public final ValueAnimator a(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(A);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }
}
