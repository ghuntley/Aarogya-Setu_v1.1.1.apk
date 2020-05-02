package h.r.d;

import android.view.View;

/* compiled from: ViewBoundsCheck */
public class y {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public a f2150b = new a();

    /* compiled from: ViewBoundsCheck */
    public static class a {
        public int a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2151b;
        public int c;
        public int d;
        public int e;

        public int a(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }

        public boolean a() {
            int i2 = this.a;
            if ((i2 & 7) != 0 && (i2 & (a(this.d, this.f2151b) << 0)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 112) != 0 && (i3 & (a(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 1792) != 0 && (i4 & (a(this.e, this.f2151b) << 8)) == 0) {
                return false;
            }
            int i5 = this.a;
            if ((i5 & 28672) == 0 || (i5 & (a(this.e, this.c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ViewBoundsCheck */
    public interface b {
        int a();

        int a(View view);

        View a(int i2);

        int b();

        int b(View view);
    }

    public y(b bVar) {
        this.a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int b2 = this.a.b();
        int a2 = this.a.a();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View a3 = this.a.a(i2);
            int b3 = this.a.b(a3);
            int a4 = this.a.a(a3);
            a aVar = this.f2150b;
            aVar.f2151b = b2;
            aVar.c = a2;
            aVar.d = b3;
            aVar.e = a4;
            if (i4 != 0) {
                aVar.a = 0;
                aVar.a = i4 | 0;
                if (aVar.a()) {
                    return a3;
                }
            }
            if (i5 != 0) {
                a aVar2 = this.f2150b;
                aVar2.a = 0;
                aVar2.a = i5 | 0;
                if (aVar2.a()) {
                    view = a3;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean a(View view, int i2) {
        a aVar = this.f2150b;
        int b2 = this.a.b();
        int a2 = this.a.a();
        int b3 = this.a.b(view);
        int a3 = this.a.a(view);
        aVar.f2151b = b2;
        aVar.c = a2;
        aVar.d = b3;
        aVar.e = a3;
        if (i2 == 0) {
            return false;
        }
        a aVar2 = this.f2150b;
        aVar2.a = 0;
        aVar2.a = 0 | i2;
        return aVar2.a();
    }
}
