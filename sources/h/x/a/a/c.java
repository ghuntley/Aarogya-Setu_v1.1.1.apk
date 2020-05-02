package h.x.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat */
public class c extends f implements b {

    /* renamed from: f  reason: collision with root package name */
    public b f2306f;

    /* renamed from: g  reason: collision with root package name */
    public Context f2307g;

    /* renamed from: h  reason: collision with root package name */
    public ArgbEvaluator f2308h;

    /* renamed from: i  reason: collision with root package name */
    public final Drawable.Callback f2309i;

    /* compiled from: AnimatedVectorDrawableCompat */
    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            c.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat */
    public static class b extends Drawable.ConstantState {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public g f2310b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public h.e.a<Animator, String> e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.a = bVar.a;
                g gVar = bVar.f2310b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f2310b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f2310b = (g) constantState.newDrawable();
                    }
                    g gVar2 = this.f2310b;
                    gVar2.mutate();
                    this.f2310b = gVar2;
                    gVar2.setCallback(callback);
                    this.f2310b.setBounds(bVar.f2310b.getBounds());
                    this.f2310b.f2316j = false;
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new h.e.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.d.get(i2);
                        Animator clone = animator.clone();
                        String orDefault = bVar.e.getOrDefault(animator, null);
                        clone.setTarget(this.f2310b.f2312f.f2354b.f2353p.getOrDefault(orDefault, null));
                        this.d.add(clone);
                        this.e.put(clone, orDefault);
                    }
                    if (this.c == null) {
                        this.c = new AnimatorSet();
                    }
                    this.c.playTogether(this.d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this((Context) null, (b) null, (Resources) null);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2306f.f2310b.draw(canvas);
        if (this.f2306f.c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2306f.f2310b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f2306f.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f2306f.f2310b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.e == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0075c(this.e.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f2306f.f2310b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f2306f.f2310b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f2306f.f2310b.getOpacity();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r7 = "Can't load animation resource ID #0x";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r7 = "Can't load animation resource ID #0x";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
        r19.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee A[ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r25
            android.graphics.drawable.Drawable r4 = r1.e
            if (r4 == 0) goto L_0x0012
            r5 = r23
            r4.inflate(r0, r5, r2, r3)
            return
        L_0x0012:
            r5 = r23
            int r4 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r4 == r7) goto L_0x0155
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r4 == r8) goto L_0x0155
        L_0x0029:
            r8 = 2
            if (r4 != r8) goto L_0x014e
            java.lang.String r4 = r23.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r8.equals(r4)
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L_0x0063
            int[] r4 = h.x.a.a.a.e
            android.content.res.TypedArray r4 = g.a.a.b.a.a((android.content.res.Resources) r0, (android.content.res.Resources.Theme) r3, (android.util.AttributeSet) r2, (int[]) r4)
            int r8 = r4.getResourceId(r10, r10)
            if (r8 == 0) goto L_0x005e
            h.x.a.a.g r8 = h.x.a.a.g.a(r0, r8, r3)
            r8.f2316j = r10
            android.graphics.drawable.Drawable$Callback r10 = r1.f2309i
            r8.setCallback(r10)
            h.x.a.a.c$b r10 = r1.f2306f
            h.x.a.a.g r10 = r10.f2310b
            if (r10 == 0) goto L_0x005a
            r10.setCallback(r9)
        L_0x005a:
            h.x.a.a.c$b r9 = r1.f2306f
            r9.f2310b = r8
        L_0x005e:
            r4.recycle()
            goto L_0x014e
        L_0x0063:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x014e
            int[] r4 = h.x.a.a.a.f2299f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r10)
            int r10 = r4.getResourceId(r7, r10)
            if (r10 == 0) goto L_0x014b
            android.content.Context r11 = r1.f2307g
            if (r11 == 0) goto L_0x0140
            int r12 = android.os.Build.VERSION.SDK_INT
            r13 = 24
            if (r12 < r13) goto L_0x008a
            android.animation.Animator r10 = android.animation.AnimatorInflater.loadAnimator(r11, r10)
            goto L_0x00b4
        L_0x008a:
            android.content.res.Resources r12 = r11.getResources()
            android.content.res.Resources$Theme r13 = r11.getTheme()
            java.lang.String r15 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r19 = r12.getAnimation(r10)     // Catch:{ XmlPullParserException -> 0x011a, IOException -> 0x00fc }
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r19)     // Catch:{ XmlPullParserException -> 0x00f5, IOException -> 0x00f0, all -> 0x00ee }
            r17 = 0
            r18 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r14 = r19
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            android.animation.Animator r10 = g.a.a.b.a.a(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x00ec, IOException -> 0x00ea, all -> 0x00ee }
            r19.close()
        L_0x00b4:
            h.x.a.a.c$b r7 = r1.f2306f
            h.x.a.a.g r7 = r7.f2310b
            h.x.a.a.g$h r7 = r7.f2312f
            h.x.a.a.g$g r7 = r7.f2354b
            h.e.a<java.lang.String, java.lang.Object> r7 = r7.f2353p
            java.lang.Object r7 = r7.getOrDefault(r8, r9)
            r10.setTarget(r7)
            h.x.a.a.c$b r7 = r1.f2306f
            java.util.ArrayList<android.animation.Animator> r9 = r7.d
            if (r9 != 0) goto L_0x00db
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r7.d = r9
            h.x.a.a.c$b r7 = r1.f2306f
            h.e.a r9 = new h.e.a
            r9.<init>()
            r7.e = r9
        L_0x00db:
            h.x.a.a.c$b r7 = r1.f2306f
            java.util.ArrayList<android.animation.Animator> r7 = r7.d
            r7.add(r10)
            h.x.a.a.c$b r7 = r1.f2306f
            h.e.a<android.animation.Animator, java.lang.String> r7 = r7.e
            r7.put(r10, r8)
            goto L_0x014b
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f2
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f7
        L_0x00ee:
            r0 = move-exception
            goto L_0x013a
        L_0x00f0:
            r0 = move-exception
            r7 = r15
        L_0x00f2:
            r9 = r19
            goto L_0x00fe
        L_0x00f5:
            r0 = move-exception
            r7 = r15
        L_0x00f7:
            r9 = r19
            goto L_0x011c
        L_0x00fa:
            r0 = move-exception
            goto L_0x0138
        L_0x00fc:
            r0 = move-exception
            r7 = r15
        L_0x00fe:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r3.<init>()     // Catch:{ all -> 0x00fa }
            r3.append(r7)     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00fa }
            r3.append(r4)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00fa }
            r2.<init>(r3)     // Catch:{ all -> 0x00fa }
            r2.initCause(r0)     // Catch:{ all -> 0x00fa }
            throw r2     // Catch:{ all -> 0x00fa }
        L_0x011a:
            r0 = move-exception
            r7 = r15
        L_0x011c:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x00fa }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fa }
            r3.<init>()     // Catch:{ all -> 0x00fa }
            r3.append(r7)     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = java.lang.Integer.toHexString(r10)     // Catch:{ all -> 0x00fa }
            r3.append(r4)     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00fa }
            r2.<init>(r3)     // Catch:{ all -> 0x00fa }
            r2.initCause(r0)     // Catch:{ all -> 0x00fa }
            throw r2     // Catch:{ all -> 0x00fa }
        L_0x0138:
            r19 = r9
        L_0x013a:
            if (r19 == 0) goto L_0x013f
            r19.close()
        L_0x013f:
            throw r0
        L_0x0140:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x014b:
            r4.recycle()
        L_0x014e:
            int r4 = r23.next()
            r7 = 1
            goto L_0x001e
        L_0x0155:
            h.x.a.a.c$b r0 = r1.f2306f
            android.animation.AnimatorSet r2 = r0.c
            if (r2 != 0) goto L_0x0162
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.c = r2
        L_0x0162:
            android.animation.AnimatorSet r2 = r0.c
            java.util.ArrayList<android.animation.Animator> r0 = r0.d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.a.a.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2306f.f2310b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f2306f.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f2306f.f2310b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2306f.f2310b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.f2306f.f2310b.setLevel(i2);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f2306f.f2310b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f2306f.f2310b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        g gVar = this.f2306f.f2310b;
        Drawable drawable2 = gVar.e;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            gVar.f2312f.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        g gVar = this.f2306f.f2310b;
        Drawable drawable2 = gVar.e;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        gVar.f2314h = colorFilter;
        gVar.invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.b(drawable, i2);
        } else {
            this.f2306f.f2310b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.a(drawable, colorStateList);
        } else {
            this.f2306f.f2310b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            g.a.a.b.a.a(drawable, mode);
        } else {
            this.f2306f.f2310b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f2306f.f2310b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f2306f.c.isStarted()) {
            this.f2306f.c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2306f.c.end();
        }
    }

    public c(Context context, b bVar, Resources resources) {
        this.f2308h = null;
        this.f2309i = new a();
        this.f2307g = context;
        if (bVar != null) {
            this.f2306f = bVar;
        } else {
            this.f2306f = new b(bVar, this.f2309i, resources);
        }
    }

    /* renamed from: h.x.a.a.c$c  reason: collision with other inner class name */
    /* compiled from: AnimatedVectorDrawableCompat */
    public static class C0075c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public C0075c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable();
            cVar.e = newDrawable;
            newDrawable.setCallback(cVar.f2309i);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable(resources);
            cVar.e = newDrawable;
            newDrawable.setCallback(cVar.f2309i);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c((Context) null, (b) null, (Resources) null);
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            cVar.e = newDrawable;
            newDrawable.setCallback(cVar.f2309i);
            return cVar;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
