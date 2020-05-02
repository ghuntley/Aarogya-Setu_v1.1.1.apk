package i.c.a.c.e0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i.c.a.c.e0.g;
import i.c.a.c.e0.m;
import java.util.ArrayList;

/* compiled from: ShapeAppearancePathProvider */
public class k {
    public final m[] a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f4088b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f4089f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f4090g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4091h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f4092i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public boolean f4093j = true;

    /* compiled from: ShapeAppearancePathProvider */
    public interface a {
    }

    public k() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new m();
            this.f4088b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    public void a(j jVar, float f2, RectF rectF, a aVar, Path path) {
        float f3;
        f fVar;
        c cVar;
        d dVar;
        j jVar2 = jVar;
        float f4 = f2;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        this.e.rewind();
        this.f4089f.rewind();
        this.f4089f.addRect(rectF2, Path.Direction.CW);
        char c2 = 0;
        int i2 = 0;
        while (i2 < 4) {
            if (i2 == 1) {
                cVar = jVar2.f4074g;
            } else if (i2 == 2) {
                cVar = jVar2.f4075h;
            } else if (i2 != 3) {
                cVar = jVar2.f4073f;
            } else {
                cVar = jVar2.e;
            }
            if (i2 == 1) {
                dVar = jVar2.c;
            } else if (i2 == 2) {
                dVar = jVar2.d;
            } else if (i2 != 3) {
                dVar = jVar2.f4072b;
            } else {
                dVar = jVar2.a;
            }
            m mVar = this.a[i2];
            if (dVar != null) {
                dVar.a(mVar, 90.0f, f4, cVar.a(rectF2));
                int i3 = i2 + 1;
                float f5 = (float) (i3 * 90);
                this.f4088b[i2].reset();
                PointF pointF = this.d;
                if (i2 == 1) {
                    pointF.set(rectF2.right, rectF2.bottom);
                } else if (i2 == 2) {
                    pointF.set(rectF2.left, rectF2.bottom);
                } else if (i2 != 3) {
                    pointF.set(rectF2.right, rectF2.top);
                } else {
                    pointF.set(rectF2.left, rectF2.top);
                }
                Matrix matrix = this.f4088b[i2];
                PointF pointF2 = this.d;
                matrix.setTranslate(pointF2.x, pointF2.y);
                this.f4088b[i2].preRotate(f5);
                float[] fArr = this.f4091h;
                m[] mVarArr = this.a;
                fArr[0] = mVarArr[i2].c;
                fArr[1] = mVarArr[i2].d;
                this.f4088b[i2].mapPoints(fArr);
                this.c[i2].reset();
                Matrix matrix2 = this.c[i2];
                float[] fArr2 = this.f4091h;
                matrix2.setTranslate(fArr2[0], fArr2[1]);
                this.c[i2].preRotate(f5);
                i2 = i3;
            } else {
                throw null;
            }
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr3 = this.f4091h;
            m[] mVarArr2 = this.a;
            fArr3[c2] = mVarArr2[i4].a;
            fArr3[1] = mVarArr2[i4].f4095b;
            this.f4088b[i4].mapPoints(fArr3);
            if (i4 == 0) {
                float[] fArr4 = this.f4091h;
                path2.moveTo(fArr4[c2], fArr4[1]);
            } else {
                float[] fArr5 = this.f4091h;
                path2.lineTo(fArr5[c2], fArr5[1]);
            }
            this.a[i4].a(this.f4088b[i4], path2);
            if (aVar != null) {
                m mVar2 = this.a[i4];
                Matrix matrix3 = this.f4088b[i4];
                g.a aVar2 = (g.a) aVar;
                g.this.f4049h.set(i4, mVar2.f4099i);
                m.f[] fVarArr = g.this.f4047f;
                mVar2.a(mVar2.f4096f);
                fVarArr[i4] = new l(mVar2, new ArrayList(mVar2.f4098h), matrix3);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f4091h;
            m[] mVarArr3 = this.a;
            fArr6[c2] = mVarArr3[i4].c;
            fArr6[1] = mVarArr3[i4].d;
            this.f4088b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f4092i;
            m[] mVarArr4 = this.a;
            fArr7[c2] = mVarArr4[i6].a;
            fArr7[1] = mVarArr4[i6].f4095b;
            this.f4088b[i6].mapPoints(fArr7);
            float[] fArr8 = this.f4091h;
            float f6 = fArr8[c2];
            float[] fArr9 = this.f4092i;
            float max = Math.max(((float) Math.hypot((double) (f6 - fArr9[c2]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f4091h;
            m[] mVarArr5 = this.a;
            fArr10[c2] = mVarArr5[i4].c;
            fArr10[1] = mVarArr5[i4].d;
            this.f4088b[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f3 = Math.abs(rectF.centerX() - this.f4091h[c2]);
            } else {
                f3 = Math.abs(rectF.centerY() - this.f4091h[1]);
            }
            this.f4090g.a(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                fVar = jVar2.f4078k;
            } else if (i4 == 2) {
                fVar = jVar2.f4079l;
            } else if (i4 != 3) {
                fVar = jVar2.f4077j;
            } else {
                fVar = jVar2.f4076i;
            }
            fVar.a(max, f3, f4, this.f4090g);
            Path path3 = new Path();
            this.f4090g.a(this.c[i4], path3);
            if (!this.f4093j || (!a(path3, i4) && !a(path3, i6))) {
                this.f4090g.a(this.c[i4], path2);
            } else {
                path3.op(path3, this.f4089f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f4091h;
                m mVar3 = this.f4090g;
                fArr11[c2] = mVar3.a;
                fArr11[1] = mVar3.f4095b;
                this.c[i4].mapPoints(fArr11);
                Path path4 = this.e;
                float[] fArr12 = this.f4091h;
                path4.moveTo(fArr12[c2], fArr12[1]);
                this.f4090g.a(this.c[i4], this.e);
            }
            if (aVar != null) {
                m mVar4 = this.f4090g;
                Matrix matrix4 = this.c[i4];
                g.a aVar3 = (g.a) aVar;
                g.this.f4049h.set(i4 + 4, mVar4.f4099i);
                m.f[] fVarArr2 = g.this.f4048g;
                mVar4.a(mVar4.f4096f);
                fVarArr2[i4] = new l(mVar4, new ArrayList(mVar4.f4098h), matrix4);
            }
            i4 = i5;
            c2 = 0;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path2.op(this.e, Path.Op.UNION);
        }
    }

    public final boolean a(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].a(this.f4088b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
