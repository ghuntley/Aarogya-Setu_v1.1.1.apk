package h.b.p;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper */
public class p0 {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1452b = 0;
    public int c = RecyclerView.UNDEFINED_DURATION;
    public int d = RecyclerView.UNDEFINED_DURATION;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1453f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1454g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1455h = false;

    public void a(int i2, int i3) {
        this.c = i2;
        this.d = i3;
        this.f1455h = true;
        if (this.f1454g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1452b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1452b = i3;
        }
    }
}
