package h.h.k;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

/* compiled from: PrecomputedTextCompat */
public class b implements Spannable {
    public char charAt(int i2) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        } else {
            throw null;
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    public String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat */
    public static final class a {
        public final TextPaint a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f1803b;
        public final int c;
        public final int d;

        @SuppressLint({"NewApi"})
        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.f1803b = textDirectionHeuristic;
            this.c = i2;
            this.d = i3;
        }

        public boolean a(a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.c != aVar.c || this.d != aVar.d)) || this.a.getTextSize() != aVar.a.getTextSize() || this.a.getTextScaleX() != aVar.a.getTextScaleX() || this.a.getTextSkewX() != aVar.a.getTextSkewX() || this.a.getLetterSpacing() != aVar.a.getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.a.getFontFeatureSettings()) || this.a.getFlags() != aVar.a.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.a.getTextLocales().equals(aVar.a.getTextLocales())) {
                    return false;
                }
            } else if (!this.a.getTextLocale().equals(aVar.a.getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f1803b == aVar.f1803b;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f1803b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
            }
            return Objects.hash(new Object[]{Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.f1803b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder a2 = i.a.a.a.a.a("textSize=");
            a2.append(this.a.getTextSize());
            sb.append(a2.toString());
            sb.append(", textScaleX=" + this.a.getTextScaleX());
            sb.append(", textSkewX=" + this.a.getTextSkewX());
            sb.append(", letterSpacing=" + this.a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder a3 = i.a.a.a.a.a(", textLocale=");
                a3.append(this.a.getTextLocales());
                sb.append(a3.toString());
            } else {
                StringBuilder a4 = i.a.a.a.a.a(", textLocale=");
                a4.append(this.a.getTextLocale());
                sb.append(a4.toString());
            }
            StringBuilder a5 = i.a.a.a.a.a(", typeface=");
            a5.append(this.a.getTypeface());
            sb.append(a5.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder a6 = i.a.a.a.a.a(", variationSettings=");
                a6.append(this.a.getFontVariationSettings());
                sb.append(a6.toString());
            }
            StringBuilder a7 = i.a.a.a.a.a(", textDir=");
            a7.append(this.f1803b);
            sb.append(a7.toString());
            sb.append(", breakStrategy=" + this.c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.f1803b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }
    }
}
