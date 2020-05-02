package h.b.k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import h.b.j;
import h.b.o.a;

/* compiled from: ActionBar */
public abstract class a {

    /* compiled from: ActionBar */
    public interface b {
        void a(boolean z);
    }

    @Deprecated
    /* compiled from: ActionBar */
    public static abstract class c {
        public abstract void a();
    }

    public abstract h.b.o.a a(a.C0035a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract boolean a(int i2, KeyEvent keyEvent);

    public abstract int b();

    public abstract void b(boolean z);

    public abstract Context c();

    public abstract void c(boolean z);

    /* renamed from: h.b.k.a$a  reason: collision with other inner class name */
    /* compiled from: ActionBar */
    public static class C0030a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0030a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0030a(int i2, int i3) {
            super(i2, i3);
            this.a = 0;
            this.a = 8388627;
        }

        public C0030a(C0030a aVar) {
            super(aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public C0030a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
