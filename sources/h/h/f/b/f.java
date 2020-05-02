package h.h.f.b;

import java.util.List;

/* compiled from: GradientColorInflaterCompat */
public final class f {
    public final int[] a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f1751b;

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.a = new int[size];
        this.f1751b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.a[i2] = list.get(i2).intValue();
            this.f1751b[i2] = list2.get(i2).floatValue();
        }
    }

    public f(int i2, int i3) {
        this.a = new int[]{i2, i3};
        this.f1751b = new float[]{0.0f, 1.0f};
    }

    public f(int i2, int i3, int i4) {
        this.a = new int[]{i2, i3, i4};
        this.f1751b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
