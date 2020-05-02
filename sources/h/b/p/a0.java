package h.b.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper */
public class a0 {

    /* renamed from: k  reason: collision with root package name */
    public static final RectF f1347k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1348l = new ConcurrentHashMap<>();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1349m = new ConcurrentHashMap<>();
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1350b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1351f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1352g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1353h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1354i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1355j;

    public a0(TextView textView) {
        this.f1354i = textView;
        this.f1355j = textView.getContext();
    }

    public final int[] a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (!d() || this.a != 1) {
            this.f1350b = false;
        } else {
            if (!this.f1352g || this.f1351f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.c) + this.d);
                }
                this.f1351f = a(iArr);
            }
            this.f1350b = true;
        }
        return this.f1350b;
    }

    public final boolean c() {
        int length = this.f1351f.length;
        boolean z = length > 0;
        this.f1352g = z;
        if (z) {
            this.a = 1;
            int[] iArr = this.f1351f;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return this.f1352g;
    }

    public final boolean d() {
        return !(this.f1354i instanceof k);
    }

    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.f1352g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    public void a(int i2, float f2) {
        Resources resources;
        Context context = this.f1355j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.f1354i.getPaint().getTextSize()) {
            this.f1354i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f1354i.isInLayout();
            if (this.f1354i.getLayout() != null) {
                this.f1350b = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.f1354i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f1354i.requestLayout();
                } else {
                    this.f1354i.forceLayout();
                }
                this.f1354i.invalidate();
            }
        }
    }

    public final int a(RectF rectF) {
        StaticLayout staticLayout;
        int i2;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f1351f.length;
        if (length != 0) {
            int i3 = length - 1;
            int i4 = 0;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i3) {
                int i7 = (i5 + i3) / 2;
                int i8 = this.f1351f[i7];
                CharSequence text = this.f1354i.getText();
                TransformationMethod transformationMethod = this.f1354i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1354i)) == null)) {
                    text = transformation;
                }
                int maxLines = this.f1354i.getMaxLines();
                TextPaint textPaint = this.f1353h;
                if (textPaint == null) {
                    this.f1353h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1353h.set(this.f1354i.getPaint());
                this.f1353h.setTextSize((float) i8);
                Layout.Alignment alignment = (Layout.Alignment) a((Object) this.f1354i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF2.right);
                if (Build.VERSION.SDK_INT >= 23) {
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, i4, text.length(), this.f1353h, round);
                    obtain.setAlignment(alignment).setLineSpacing(this.f1354i.getLineSpacingExtra(), this.f1354i.getLineSpacingMultiplier()).setIncludePad(this.f1354i.getIncludeFontPadding()).setBreakStrategy(this.f1354i.getBreakStrategy()).setHyphenationFrequency(this.f1354i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            textDirectionHeuristic = this.f1354i.getTextDirectionHeuristic();
                        } else {
                            textDirectionHeuristic = (TextDirectionHeuristic) a((Object) this.f1354i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                        }
                        obtain.setTextDirection(textDirectionHeuristic);
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                    staticLayout = obtain.build();
                    i2 = -1;
                } else {
                    i2 = -1;
                    staticLayout = new StaticLayout(text, this.f1353h, round, alignment, this.f1354i.getLineSpacingMultiplier(), this.f1354i.getLineSpacingExtra(), this.f1354i.getIncludeFontPadding());
                }
                if ((maxLines == i2 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF2.bottom) {
                    i4 = 0;
                    int i9 = i7 + 1;
                    i6 = i5;
                    i5 = i9;
                } else {
                    i6 = i7 - 1;
                    i3 = i6;
                    i4 = 0;
                }
            }
            return this.f1351f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static <T> T a(Object obj, String str, T t) {
        try {
            return a(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public static Method a(String str) {
        try {
            Method method = f1348l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1348l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public void a() {
        boolean z;
        int i2;
        if (d() && this.a != 0) {
            if (this.f1350b) {
                if (this.f1354i.getMeasuredHeight() > 0 && this.f1354i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.f1354i.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) a((Object) this.f1354i, "getHorizontallyScrolling", false)).booleanValue();
                    }
                    if (z) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.f1354i.getMeasuredWidth() - this.f1354i.getTotalPaddingLeft()) - this.f1354i.getTotalPaddingRight();
                    }
                    int height = (this.f1354i.getHeight() - this.f1354i.getCompoundPaddingBottom()) - this.f1354i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (f1347k) {
                            f1347k.setEmpty();
                            f1347k.right = (float) i2;
                            f1347k.bottom = (float) height;
                            float a2 = (float) a(f1347k);
                            if (a2 != this.f1354i.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1350b = true;
        }
    }
}
