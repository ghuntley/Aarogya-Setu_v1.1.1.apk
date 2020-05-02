package i.c.a.c.e0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapePath */
public class m {
    @Deprecated
    public float a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f4095b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4096f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f4097g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f4098h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f4099i;

    /* compiled from: ShapePath */
    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f4100b;

        public a(c cVar) {
            this.f4100b = cVar;
        }

        public void a(Matrix matrix, i.c.a.c.d0.a aVar, int i2, Canvas canvas) {
            i.c.a.c.d0.a aVar2 = aVar;
            int i3 = i2;
            Canvas canvas2 = canvas;
            c cVar = this.f4100b;
            float f2 = cVar.f4104f;
            float f3 = cVar.f4105g;
            c cVar2 = this.f4100b;
            RectF rectF = new RectF(cVar2.f4103b, cVar2.c, cVar2.d, cVar2.e);
            boolean z = f3 < 0.0f;
            Path path = aVar2.f4044g;
            if (z) {
                int[] iArr = i.c.a.c.d0.a.f4040k;
                iArr[0] = 0;
                iArr[1] = aVar2.f4043f;
                iArr[2] = aVar2.e;
                iArr[3] = aVar2.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = (float) (-i3);
                rectF.inset(f4, f4);
                int[] iArr2 = i.c.a.c.d0.a.f4040k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.d;
                iArr2[2] = aVar2.e;
                iArr2[3] = aVar2.f4043f;
            }
            float width = 1.0f - (((float) i3) / (rectF.width() / 2.0f));
            float[] fArr = i.c.a.c.d0.a.f4041l;
            fArr[1] = width;
            fArr[2] = ((1.0f - width) / 2.0f) + width;
            aVar2.f4042b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, i.c.a.c.d0.a.f4040k, i.c.a.c.d0.a.f4041l, Shader.TileMode.CLAMP));
            canvas.save();
            canvas2.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.f4045h);
            }
            canvas.drawArc(rectF, f2, f3, true, aVar2.f4042b);
            canvas.restore();
        }
    }

    /* compiled from: ShapePath */
    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f4102h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4103b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4104f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f4105g;

        public c(float f2, float f3, float f4, float f5) {
            this.f4103b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            f4102h.set(this.f4103b, this.c, this.d, this.e);
            path.arcTo(f4102h, this.f4104f, this.f4105g, false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f4106b;
        public float c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4106b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath */
    public static abstract class e {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* compiled from: ShapePath */
    public static abstract class f {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, i.c.a.c.d0.a aVar, int i2, Canvas canvas);
    }

    public m() {
        a(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3) {
        d dVar = new d();
        dVar.f4106b = f2;
        dVar.c = f3;
        this.f4097g.add(dVar);
        b bVar = new b(dVar, this.c, this.d);
        a(bVar.a() + 270.0f);
        this.f4098h.add(bVar);
        this.e = bVar.a() + 270.0f;
        this.c = f2;
        this.d = f3;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f4104f = f6;
        cVar.f4105g = f7;
        this.f4097g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        a(f6);
        this.f4098h.add(aVar);
        this.e = f9;
        double d2 = (double) f8;
        this.c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    /* compiled from: ShapePath */
    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f4101b;
        public final float c;
        public final float d;

        public b(d dVar, float f2, float f3) {
            this.f4101b = dVar;
            this.c = f2;
            this.d = f3;
        }

        public void a(Matrix matrix, i.c.a.c.d0.a aVar, int i2, Canvas canvas) {
            d dVar = this.f4101b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.c - this.d), (double) (dVar.f4106b - this.c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(a());
            if (aVar != null) {
                rectF.bottom += (float) i2;
                rectF.offset(0.0f, (float) (-i2));
                int[] iArr = i.c.a.c.d0.a.f4038i;
                iArr[0] = aVar.f4043f;
                iArr[1] = aVar.e;
                iArr[2] = aVar.d;
                Paint paint = aVar.c;
                float f2 = rectF.left;
                paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, i.c.a.c.d0.a.f4038i, i.c.a.c.d0.a.f4039j, Shader.TileMode.CLAMP));
                canvas.save();
                canvas.concat(matrix2);
                canvas.drawRect(rectF, aVar.c);
                canvas.restore();
                return;
            }
            throw null;
        }

        public float a() {
            d dVar = this.f4101b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.c - this.d) / (dVar.f4106b - this.c))));
        }
    }

    public void a(Matrix matrix, Path path) {
        int size = this.f4097g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4097g.get(i2).a(matrix, path);
        }
    }

    public final void a(float f2) {
        float f3 = this.e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.c;
                float f6 = this.d;
                c cVar = new c(f5, f6, f5, f6);
                cVar.f4104f = this.e;
                cVar.f4105g = f4;
                this.f4098h.add(new a(cVar));
                this.e = f2;
            }
        }
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.f4095b = f3;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f4096f = (f4 + f5) % 360.0f;
        this.f4097g.clear();
        this.f4098h.clear();
        this.f4099i = false;
    }
}
