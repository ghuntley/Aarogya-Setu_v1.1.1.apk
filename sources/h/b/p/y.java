package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import h.b.j;
import h.h.f.b.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: AppCompatTextHelper */
public class y {
    public final TextView a;

    /* renamed from: b  reason: collision with root package name */
    public v0 f1493b;
    public v0 c;
    public v0 d;
    public v0 e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f1494f;

    /* renamed from: g  reason: collision with root package name */
    public v0 f1495g;

    /* renamed from: h  reason: collision with root package name */
    public v0 f1496h;

    /* renamed from: i  reason: collision with root package name */
    public final a0 f1497i;

    /* renamed from: j  reason: collision with root package name */
    public int f1498j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1499k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1500l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1501m;

    /* compiled from: AppCompatTextHelper */
    public class a extends g {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1502b;
        public final /* synthetic */ WeakReference c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.a = i2;
            this.f1502b = i3;
            this.c = weakReference;
        }

        public void a(int i2) {
        }

        public void a(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f1502b & 2) != 0);
            }
            y yVar = y.this;
            WeakReference weakReference = this.c;
            if (yVar.f1501m) {
                yVar.f1500l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, yVar.f1498j);
                }
            }
        }
    }

    public y(TextView textView) {
        this.a = textView;
        this.f1497i = new a0(this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03c0  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0427  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            android.widget.TextView r1 = r0.a
            android.content.Context r10 = r1.getContext()
            h.b.p.j r11 = h.b.p.j.a()
            int[] r1 = h.b.j.AppCompatTextHelper
            r12 = 0
            h.b.p.x0 r13 = h.b.p.x0.a(r10, r8, r1, r9, r12)
            android.widget.TextView r1 = r0.a
            android.content.Context r2 = r1.getContext()
            int[] r3 = h.b.j.AppCompatTextHelper
            android.content.res.TypedArray r5 = r13.f1492b
            r7 = 0
            r4 = r18
            r6 = r19
            h.h.m.m.a(r1, r2, r3, r4, r5, r6, r7)
            int r1 = h.b.j.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r1 = r13.f(r1, r14)
            int r2 = h.b.j.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x0044
            int r2 = h.b.j.AppCompatTextHelper_android_drawableLeft
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.f1493b = r2
        L_0x0044:
            int r2 = h.b.j.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x0058
            int r2 = h.b.j.AppCompatTextHelper_android_drawableTop
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.c = r2
        L_0x0058:
            int r2 = h.b.j.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x006c
            int r2 = h.b.j.AppCompatTextHelper_android_drawableRight
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.d = r2
        L_0x006c:
            int r2 = h.b.j.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x0080
            int r2 = h.b.j.AppCompatTextHelper_android_drawableBottom
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.e = r2
        L_0x0080:
            int r2 = h.b.j.AppCompatTextHelper_android_drawableStart
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x0094
            int r2 = h.b.j.AppCompatTextHelper_android_drawableStart
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.f1494f = r2
        L_0x0094:
            int r2 = h.b.j.AppCompatTextHelper_android_drawableEnd
            boolean r2 = r13.f(r2)
            if (r2 == 0) goto L_0x00a8
            int r2 = h.b.j.AppCompatTextHelper_android_drawableEnd
            int r2 = r13.f(r2, r12)
            h.b.p.v0 r2 = a(r10, r11, r2)
            r0.f1495g = r2
        L_0x00a8:
            android.content.res.TypedArray r2 = r13.f1492b
            r2.recycle()
            android.widget.TextView r2 = r0.a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 23
            r4 = 26
            if (r1 == r14) goto L_0x013f
            int[] r5 = h.b.j.TextAppearance
            h.b.p.x0 r6 = new h.b.p.x0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r5)
            r6.<init>(r10, r1)
            if (r2 != 0) goto L_0x00d8
            int r1 = h.b.j.TextAppearance_textAllCaps
            boolean r1 = r6.f(r1)
            if (r1 == 0) goto L_0x00d8
            int r1 = h.b.j.TextAppearance_textAllCaps
            boolean r1 = r6.a((int) r1, (boolean) r12)
            r5 = 1
            goto L_0x00da
        L_0x00d8:
            r1 = 0
            r5 = 0
        L_0x00da:
            r0.a((android.content.Context) r10, (h.b.p.x0) r6)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 >= r3) goto L_0x0112
            int r7 = h.b.j.TextAppearance_android_textColor
            boolean r7 = r6.f(r7)
            if (r7 == 0) goto L_0x00f0
            int r7 = h.b.j.TextAppearance_android_textColor
            android.content.res.ColorStateList r7 = r6.a(r7)
            goto L_0x00f1
        L_0x00f0:
            r7 = 0
        L_0x00f1:
            int r15 = h.b.j.TextAppearance_android_textColorHint
            boolean r15 = r6.f(r15)
            if (r15 == 0) goto L_0x0100
            int r15 = h.b.j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r15 = r6.a(r15)
            goto L_0x0101
        L_0x0100:
            r15 = 0
        L_0x0101:
            int r13 = h.b.j.TextAppearance_android_textColorLink
            boolean r13 = r6.f(r13)
            if (r13 == 0) goto L_0x0110
            int r13 = h.b.j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r13 = r6.a(r13)
            goto L_0x0115
        L_0x0110:
            r13 = 0
            goto L_0x0115
        L_0x0112:
            r7 = 0
            r13 = 0
            r15 = 0
        L_0x0115:
            int r14 = h.b.j.TextAppearance_textLocale
            boolean r14 = r6.f(r14)
            if (r14 == 0) goto L_0x0124
            int r14 = h.b.j.TextAppearance_textLocale
            java.lang.String r14 = r6.d(r14)
            goto L_0x0125
        L_0x0124:
            r14 = 0
        L_0x0125:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r4) goto L_0x0138
            int r3 = h.b.j.TextAppearance_fontVariationSettings
            boolean r3 = r6.f(r3)
            if (r3 == 0) goto L_0x0138
            int r3 = h.b.j.TextAppearance_fontVariationSettings
            java.lang.String r3 = r6.d(r3)
            goto L_0x0139
        L_0x0138:
            r3 = 0
        L_0x0139:
            android.content.res.TypedArray r6 = r6.f1492b
            r6.recycle()
            goto L_0x0146
        L_0x013f:
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0146:
            int[] r6 = h.b.j.TextAppearance
            h.b.p.x0 r4 = new h.b.p.x0
            android.content.res.TypedArray r6 = r10.obtainStyledAttributes(r8, r6, r9, r12)
            r4.<init>(r10, r6)
            if (r2 != 0) goto L_0x0162
            int r6 = h.b.j.TextAppearance_textAllCaps
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0162
            int r1 = h.b.j.TextAppearance_textAllCaps
            boolean r1 = r4.a((int) r1, (boolean) r12)
            r5 = 1
        L_0x0162:
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 23
            if (r6 >= r12) goto L_0x0192
            int r6 = h.b.j.TextAppearance_android_textColor
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0176
            int r6 = h.b.j.TextAppearance_android_textColor
            android.content.res.ColorStateList r7 = r4.a(r6)
        L_0x0176:
            int r6 = h.b.j.TextAppearance_android_textColorHint
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0184
            int r6 = h.b.j.TextAppearance_android_textColorHint
            android.content.res.ColorStateList r15 = r4.a(r6)
        L_0x0184:
            int r6 = h.b.j.TextAppearance_android_textColorLink
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0192
            int r6 = h.b.j.TextAppearance_android_textColorLink
            android.content.res.ColorStateList r13 = r4.a(r6)
        L_0x0192:
            int r6 = h.b.j.TextAppearance_textLocale
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x01a0
            int r6 = h.b.j.TextAppearance_textLocale
            java.lang.String r14 = r4.d(r6)
        L_0x01a0:
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 26
            if (r6 < r12) goto L_0x01b4
            int r6 = h.b.j.TextAppearance_fontVariationSettings
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x01b4
            int r3 = h.b.j.TextAppearance_fontVariationSettings
            java.lang.String r3 = r4.d(r3)
        L_0x01b4:
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 28
            if (r6 < r12) goto L_0x01d5
            int r6 = h.b.j.TextAppearance_android_textSize
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x01d5
            int r6 = h.b.j.TextAppearance_android_textSize
            r12 = -1
            int r6 = r4.c(r6, r12)
            if (r6 != 0) goto L_0x01d5
            android.widget.TextView r6 = r0.a
            r12 = 0
            r16 = r11
            r11 = 0
            r6.setTextSize(r11, r12)
            goto L_0x01d7
        L_0x01d5:
            r16 = r11
        L_0x01d7:
            r0.a((android.content.Context) r10, (h.b.p.x0) r4)
            android.content.res.TypedArray r4 = r4.f1492b
            r4.recycle()
            if (r7 == 0) goto L_0x01e6
            android.widget.TextView r4 = r0.a
            r4.setTextColor(r7)
        L_0x01e6:
            if (r15 == 0) goto L_0x01ed
            android.widget.TextView r4 = r0.a
            r4.setHintTextColor(r15)
        L_0x01ed:
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r4 = r0.a
            r4.setLinkTextColor(r13)
        L_0x01f4:
            if (r2 != 0) goto L_0x01fd
            if (r5 == 0) goto L_0x01fd
            android.widget.TextView r2 = r0.a
            r2.setAllCaps(r1)
        L_0x01fd:
            android.graphics.Typeface r1 = r0.f1500l
            if (r1 == 0) goto L_0x0213
            int r2 = r0.f1499k
            r4 = -1
            if (r2 != r4) goto L_0x020e
            android.widget.TextView r2 = r0.a
            int r4 = r0.f1498j
            r2.setTypeface(r1, r4)
            goto L_0x0213
        L_0x020e:
            android.widget.TextView r2 = r0.a
            r2.setTypeface(r1)
        L_0x0213:
            if (r3 == 0) goto L_0x021a
            android.widget.TextView r1 = r0.a
            r1.setFontVariationSettings(r3)
        L_0x021a:
            r11 = 24
            if (r14 == 0) goto L_0x0241
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r11) goto L_0x022c
            android.widget.TextView r1 = r0.a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r14)
            r1.setTextLocales(r2)
            goto L_0x0241
        L_0x022c:
            r1 = 44
            int r1 = r14.indexOf(r1)
            r2 = 0
            java.lang.String r1 = r14.substring(r2, r1)
            android.widget.TextView r3 = r0.a
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            r3.setTextLocale(r1)
            goto L_0x0242
        L_0x0241:
            r2 = 0
        L_0x0242:
            h.b.p.a0 r12 = r0.f1497i
            android.content.Context r1 = r12.f1355j
            int[] r3 = h.b.j.AppCompatTextView
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r8, r3, r9, r2)
            android.widget.TextView r1 = r12.f1354i
            android.content.Context r2 = r1.getContext()
            int[] r3 = h.b.j.AppCompatTextView
            r7 = 0
            r4 = r18
            r5 = r13
            r6 = r19
            h.h.m.m.a(r1, r2, r3, r4, r5, r6, r7)
            int r1 = h.b.j.AppCompatTextView_autoSizeTextType
            boolean r1 = r13.hasValue(r1)
            if (r1 == 0) goto L_0x026e
            int r1 = h.b.j.AppCompatTextView_autoSizeTextType
            r2 = 0
            int r1 = r13.getInt(r1, r2)
            r12.a = r1
        L_0x026e:
            int r1 = h.b.j.AppCompatTextView_autoSizeStepGranularity
            boolean r1 = r13.hasValue(r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x027f
            int r1 = h.b.j.AppCompatTextView_autoSizeStepGranularity
            float r1 = r13.getDimension(r1, r2)
            goto L_0x0281
        L_0x027f:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0281:
            int r3 = h.b.j.AppCompatTextView_autoSizeMinTextSize
            boolean r3 = r13.hasValue(r3)
            if (r3 == 0) goto L_0x0290
            int r3 = h.b.j.AppCompatTextView_autoSizeMinTextSize
            float r3 = r13.getDimension(r3, r2)
            goto L_0x0292
        L_0x0290:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0292:
            int r4 = h.b.j.AppCompatTextView_autoSizeMaxTextSize
            boolean r4 = r13.hasValue(r4)
            if (r4 == 0) goto L_0x02a1
            int r4 = h.b.j.AppCompatTextView_autoSizeMaxTextSize
            float r4 = r13.getDimension(r4, r2)
            goto L_0x02a3
        L_0x02a1:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x02a3:
            int r5 = h.b.j.AppCompatTextView_autoSizePresetSizes
            boolean r5 = r13.hasValue(r5)
            if (r5 == 0) goto L_0x02dd
            int r5 = h.b.j.AppCompatTextView_autoSizePresetSizes
            r6 = 0
            int r5 = r13.getResourceId(r5, r6)
            if (r5 <= 0) goto L_0x02dd
            android.content.res.Resources r6 = r13.getResources()
            android.content.res.TypedArray r5 = r6.obtainTypedArray(r5)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x02da
            r9 = 0
        L_0x02c5:
            if (r9 >= r6) goto L_0x02d1
            r14 = -1
            int r15 = r5.getDimensionPixelSize(r9, r14)
            r7[r9] = r15
            int r9 = r9 + 1
            goto L_0x02c5
        L_0x02d1:
            int[] r6 = r12.a((int[]) r7)
            r12.f1351f = r6
            r12.c()
        L_0x02da:
            r5.recycle()
        L_0x02dd:
            r13.recycle()
            boolean r5 = r12.d()
            r6 = 2
            if (r5 == 0) goto L_0x031b
            int r5 = r12.a
            r7 = 1
            if (r5 != r7) goto L_0x031e
            boolean r5 = r12.f1352g
            if (r5 != 0) goto L_0x0317
            android.content.Context r5 = r12.f1355j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r7 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0304
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = android.util.TypedValue.applyDimension(r6, r3, r5)
        L_0x0304:
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x030e
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
        L_0x030e:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0314
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0314:
            r12.a((float) r3, (float) r4, (float) r1)
        L_0x0317:
            r12.b()
            goto L_0x031e
        L_0x031b:
            r1 = 0
            r12.a = r1
        L_0x031e:
            boolean r1 = h.h.n.b.a
            if (r1 == 0) goto L_0x035d
            h.b.p.a0 r1 = r0.f1497i
            int r3 = r1.a
            if (r3 == 0) goto L_0x035d
            int[] r1 = r1.f1351f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x035d
            android.widget.TextView r3 = r0.a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0357
            android.widget.TextView r1 = r0.a
            h.b.p.a0 r2 = r0.f1497i
            float r2 = r2.d
            int r2 = java.lang.Math.round(r2)
            h.b.p.a0 r3 = r0.f1497i
            float r3 = r3.e
            int r3 = java.lang.Math.round(r3)
            h.b.p.a0 r4 = r0.f1497i
            float r4 = r4.c
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x035d
        L_0x0357:
            r5 = 0
            android.widget.TextView r2 = r0.a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r5)
        L_0x035d:
            int[] r1 = h.b.j.AppCompatTextView
            h.b.p.x0 r2 = new h.b.p.x0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1)
            r2.<init>(r10, r1)
            int r1 = h.b.j.AppCompatTextView_drawableLeftCompat
            r3 = -1
            int r1 = r2.f(r1, r3)
            if (r1 == r3) goto L_0x0378
            r4 = r16
            android.graphics.drawable.Drawable r1 = r4.a((android.content.Context) r10, (int) r1)
            goto L_0x037b
        L_0x0378:
            r4 = r16
            r1 = 0
        L_0x037b:
            int r5 = h.b.j.AppCompatTextView_drawableTopCompat
            int r5 = r2.f(r5, r3)
            if (r5 == r3) goto L_0x0388
            android.graphics.drawable.Drawable r5 = r4.a((android.content.Context) r10, (int) r5)
            goto L_0x0389
        L_0x0388:
            r5 = 0
        L_0x0389:
            int r7 = h.b.j.AppCompatTextView_drawableRightCompat
            int r7 = r2.f(r7, r3)
            if (r7 == r3) goto L_0x0396
            android.graphics.drawable.Drawable r7 = r4.a((android.content.Context) r10, (int) r7)
            goto L_0x0397
        L_0x0396:
            r7 = 0
        L_0x0397:
            int r8 = h.b.j.AppCompatTextView_drawableBottomCompat
            int r8 = r2.f(r8, r3)
            if (r8 == r3) goto L_0x03a4
            android.graphics.drawable.Drawable r8 = r4.a((android.content.Context) r10, (int) r8)
            goto L_0x03a5
        L_0x03a4:
            r8 = 0
        L_0x03a5:
            int r9 = h.b.j.AppCompatTextView_drawableStartCompat
            int r9 = r2.f(r9, r3)
            if (r9 == r3) goto L_0x03b2
            android.graphics.drawable.Drawable r9 = r4.a((android.content.Context) r10, (int) r9)
            goto L_0x03b3
        L_0x03b2:
            r9 = 0
        L_0x03b3:
            int r12 = h.b.j.AppCompatTextView_drawableEndCompat
            int r12 = r2.f(r12, r3)
            if (r12 == r3) goto L_0x03c0
            android.graphics.drawable.Drawable r3 = r4.a((android.content.Context) r10, (int) r12)
            goto L_0x03c1
        L_0x03c0:
            r3 = 0
        L_0x03c1:
            r4 = 3
            if (r9 != 0) goto L_0x0416
            if (r3 == 0) goto L_0x03c7
            goto L_0x0416
        L_0x03c7:
            if (r1 != 0) goto L_0x03cf
            if (r5 != 0) goto L_0x03cf
            if (r7 != 0) goto L_0x03cf
            if (r8 == 0) goto L_0x0437
        L_0x03cf:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r9 = 0
            r10 = r3[r9]
            if (r10 != 0) goto L_0x0400
            r10 = r3[r6]
            if (r10 == 0) goto L_0x03df
            goto L_0x0400
        L_0x03df:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r10 = r0.a
            if (r1 == 0) goto L_0x03ea
            goto L_0x03ec
        L_0x03ea:
            r1 = r3[r9]
        L_0x03ec:
            if (r5 == 0) goto L_0x03ef
            goto L_0x03f2
        L_0x03ef:
            r5 = 1
            r5 = r3[r5]
        L_0x03f2:
            if (r7 == 0) goto L_0x03f5
            goto L_0x03f7
        L_0x03f5:
            r7 = r3[r6]
        L_0x03f7:
            if (r8 == 0) goto L_0x03fa
            goto L_0x03fc
        L_0x03fa:
            r8 = r3[r4]
        L_0x03fc:
            r10.setCompoundDrawablesWithIntrinsicBounds(r1, r5, r7, r8)
            goto L_0x0437
        L_0x0400:
            android.widget.TextView r1 = r0.a
            r7 = 0
            r7 = r3[r7]
            if (r5 == 0) goto L_0x0408
            goto L_0x040b
        L_0x0408:
            r5 = 1
            r5 = r3[r5]
        L_0x040b:
            r6 = r3[r6]
            if (r8 == 0) goto L_0x0410
            goto L_0x0412
        L_0x0410:
            r8 = r3[r4]
        L_0x0412:
            r1.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r5, r6, r8)
            goto L_0x0437
        L_0x0416:
            android.widget.TextView r1 = r0.a
            android.graphics.drawable.Drawable[] r1 = r1.getCompoundDrawablesRelative()
            android.widget.TextView r7 = r0.a
            if (r9 == 0) goto L_0x0421
            goto L_0x0424
        L_0x0421:
            r9 = 0
            r9 = r1[r9]
        L_0x0424:
            if (r5 == 0) goto L_0x0427
            goto L_0x042a
        L_0x0427:
            r5 = 1
            r5 = r1[r5]
        L_0x042a:
            if (r3 == 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            r3 = r1[r6]
        L_0x042f:
            if (r8 == 0) goto L_0x0432
            goto L_0x0434
        L_0x0432:
            r8 = r1[r4]
        L_0x0434:
            r7.setCompoundDrawablesRelativeWithIntrinsicBounds(r9, r5, r3, r8)
        L_0x0437:
            int r1 = h.b.j.AppCompatTextView_drawableTint
            boolean r1 = r2.f(r1)
            if (r1 == 0) goto L_0x045d
            int r1 = h.b.j.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r1 = r2.a(r1)
            android.widget.TextView r3 = r0.a
            if (r3 == 0) goto L_0x045b
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r11) goto L_0x0451
            r3.setCompoundDrawableTintList(r1)
            goto L_0x045d
        L_0x0451:
            boolean r4 = r3 instanceof h.h.n.e
            if (r4 == 0) goto L_0x045d
            h.h.n.e r3 = (h.h.n.e) r3
            r3.setSupportCompoundDrawablesTintList(r1)
            goto L_0x045d
        L_0x045b:
            r1 = 0
            throw r1
        L_0x045d:
            r1 = 0
            int r3 = h.b.j.AppCompatTextView_drawableTintMode
            boolean r3 = r2.f(r3)
            if (r3 == 0) goto L_0x0489
            int r3 = h.b.j.AppCompatTextView_drawableTintMode
            r4 = -1
            int r3 = r2.d(r3, r4)
            android.graphics.PorterDuff$Mode r3 = h.b.p.e0.a(r3, r1)
            android.widget.TextView r1 = r0.a
            if (r1 == 0) goto L_0x0487
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r11) goto L_0x047d
            r1.setCompoundDrawableTintMode(r3)
            goto L_0x0489
        L_0x047d:
            boolean r4 = r1 instanceof h.h.n.e
            if (r4 == 0) goto L_0x0489
            h.h.n.e r1 = (h.h.n.e) r1
            r1.setSupportCompoundDrawablesTintMode(r3)
            goto L_0x0489
        L_0x0487:
            r1 = 0
            throw r1
        L_0x0489:
            int r1 = h.b.j.AppCompatTextView_firstBaselineToTopHeight
            r3 = -1
            int r1 = r2.c(r1, r3)
            int r4 = h.b.j.AppCompatTextView_lastBaselineToBottomHeight
            int r4 = r2.c(r4, r3)
            int r5 = h.b.j.AppCompatTextView_lineHeight
            int r5 = r2.c(r5, r3)
            android.content.res.TypedArray r2 = r2.f1492b
            r2.recycle()
            if (r1 == r3) goto L_0x04a8
            android.widget.TextView r2 = r0.a
            g.a.a.b.a.a((android.widget.TextView) r2, (int) r1)
        L_0x04a8:
            if (r4 == r3) goto L_0x04af
            android.widget.TextView r1 = r0.a
            g.a.a.b.a.b((android.widget.TextView) r1, (int) r4)
        L_0x04af:
            if (r5 == r3) goto L_0x04b6
            android.widget.TextView r1 = r0.a
            g.a.a.b.a.c(r1, r5)
        L_0x04b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.y.a(android.util.AttributeSet, int):void");
    }

    public boolean b() {
        a0 a0Var = this.f1497i;
        return a0Var.d() && a0Var.a != 0;
    }

    public final void a(Context context, x0 x0Var) {
        String d2;
        this.f1498j = x0Var.d(j.TextAppearance_android_textStyle, this.f1498j);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int d3 = x0Var.d(j.TextAppearance_android_textFontWeight, -1);
            this.f1499k = d3;
            if (d3 != -1) {
                this.f1498j = (this.f1498j & 2) | 0;
            }
        }
        if (x0Var.f(j.TextAppearance_android_fontFamily) || x0Var.f(j.TextAppearance_fontFamily)) {
            this.f1500l = null;
            int i2 = x0Var.f(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            int i3 = this.f1499k;
            int i4 = this.f1498j;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = x0Var.a(i2, this.f1498j, (g) new a(i3, i4, new WeakReference(this.a)));
                    if (a2 != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.f1499k == -1) {
                            this.f1500l = a2;
                        } else {
                            this.f1500l = Typeface.create(Typeface.create(a2, 0), this.f1499k, (this.f1498j & 2) != 0);
                        }
                    }
                    this.f1501m = this.f1500l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1500l == null && (d2 = x0Var.d(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1499k == -1) {
                    this.f1500l = Typeface.create(d2, this.f1498j);
                    return;
                }
                Typeface create = Typeface.create(d2, 0);
                int i5 = this.f1499k;
                if ((this.f1498j & 2) != 0) {
                    z = true;
                }
                this.f1500l = Typeface.create(create, i5, z);
            }
        } else if (x0Var.f(j.TextAppearance_android_typeface)) {
            this.f1501m = false;
            int d4 = x0Var.d(j.TextAppearance_android_typeface, 1);
            if (d4 == 1) {
                this.f1500l = Typeface.SANS_SERIF;
            } else if (d4 == 2) {
                this.f1500l = Typeface.SERIF;
            } else if (d4 == 3) {
                this.f1500l = Typeface.MONOSPACE;
            }
        }
    }

    public void a(Context context, int i2) {
        String d2;
        ColorStateList a2;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i2, j.TextAppearance));
        if (x0Var.f(j.TextAppearance_textAllCaps)) {
            this.a.setAllCaps(x0Var.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && x0Var.f(j.TextAppearance_android_textColor) && (a2 = x0Var.a(j.TextAppearance_android_textColor)) != null) {
            this.a.setTextColor(a2);
        }
        if (x0Var.f(j.TextAppearance_android_textSize) && x0Var.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        a(context, x0Var);
        if (Build.VERSION.SDK_INT >= 26 && x0Var.f(j.TextAppearance_fontVariationSettings) && (d2 = x0Var.d(j.TextAppearance_fontVariationSettings)) != null) {
            this.a.setFontVariationSettings(d2);
        }
        x0Var.f1492b.recycle();
        Typeface typeface = this.f1500l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.f1498j);
        }
    }

    public void a() {
        if (!(this.f1493b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1493b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f1494f != null || this.f1495g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1494f);
            a(compoundDrawablesRelative[2], this.f1495g);
        }
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable != null && v0Var != null) {
            j.a(drawable, v0Var, this.a.getDrawableState());
        }
    }

    public static v0 a(Context context, j jVar, int i2) {
        ColorStateList b2 = jVar.b(context, i2);
        if (b2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.d = true;
        v0Var.a = b2;
        return v0Var;
    }

    public void a(int i2) {
        a0 a0Var = this.f1497i;
        if (!a0Var.d()) {
            return;
        }
        if (i2 == 0) {
            a0Var.a = 0;
            a0Var.d = -1.0f;
            a0Var.e = -1.0f;
            a0Var.c = -1.0f;
            a0Var.f1351f = new int[0];
            a0Var.f1350b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = a0Var.f1355j.getResources().getDisplayMetrics();
            a0Var.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (a0Var.b()) {
                a0Var.a();
            }
        } else {
            throw new IllegalArgumentException(i.a.a.a.a.b("Unknown auto-size text type: ", i2));
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        a0 a0Var = this.f1497i;
        if (a0Var.d()) {
            DisplayMetrics displayMetrics = a0Var.f1355j.getResources().getDisplayMetrics();
            a0Var.a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }

    public void a(int[] iArr, int i2) {
        a0 a0Var = this.f1497i;
        if (a0Var.d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.f1355j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                a0Var.f1351f = a0Var.a(iArr2);
                if (!a0Var.c()) {
                    StringBuilder a2 = i.a.a.a.a.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                a0Var.f1352g = false;
            }
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }

    public void a(ColorStateList colorStateList) {
        if (this.f1496h == null) {
            this.f1496h = new v0();
        }
        v0 v0Var = this.f1496h;
        v0Var.a = colorStateList;
        v0Var.d = colorStateList != null;
        v0 v0Var2 = this.f1496h;
        this.f1493b = v0Var2;
        this.c = v0Var2;
        this.d = v0Var2;
        this.e = v0Var2;
        this.f1494f = v0Var2;
        this.f1495g = v0Var2;
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f1496h == null) {
            this.f1496h = new v0();
        }
        v0 v0Var = this.f1496h;
        v0Var.f1477b = mode;
        v0Var.c = mode != null;
        v0 v0Var2 = this.f1496h;
        this.f1493b = v0Var2;
        this.c = v0Var2;
        this.d = v0Var2;
        this.e = v0Var2;
        this.f1494f = v0Var2;
        this.f1495g = v0Var2;
    }
}
