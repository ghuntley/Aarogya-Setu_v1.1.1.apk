package i.c.a.c.u;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import i.c.a.b.d.l.q;

/* compiled from: CircularRevealWidget */
public interface c {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f4204b = new b();
        public final e a = new e((a) null);

        public Object evaluate(float f2, Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            e eVar3 = this.a;
            float a2 = q.a(eVar.a, eVar2.a, f2);
            float a3 = q.a(eVar.f4205b, eVar2.f4205b, f2);
            float a4 = q.a(eVar.c, eVar2.c, f2);
            eVar3.a = a2;
            eVar3.f4205b = a3;
            eVar3.c = a4;
            return this.a;
        }
    }

    /* renamed from: i.c.a.c.u.c$c  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0123c extends Property<c, e> {
        public static final Property<c, e> a = new C0123c("circularReveal");

        public C0123c(String str) {
            super(e.class, str);
        }

        public Object get(Object obj) {
            return ((c) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((c) obj).setRevealInfo((e) obj2);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d extends Property<c, Integer> {
        public static final Property<c, Integer> a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((c) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class e {
        public float a;

        /* renamed from: b  reason: collision with root package name */
        public float f4205b;
        public float c;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.f4205b = f3;
            this.c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
