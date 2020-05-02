package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import i.a.a.a.a;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f210j = PorterDuff.Mode.SRC_IN;
    public int a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f211b;
    public byte[] c = null;
    public Parcelable d = null;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f212f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f213g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f214h = f210j;

    /* renamed from: i  reason: collision with root package name */
    public String f215i = null;

    public IconCompat() {
    }

    public static IconCompat a(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i2;
            if (resources != null) {
                try {
                    iconCompat.f211b = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f211b = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public String b() {
        int i2;
        if (this.a == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f211b;
            if (i2 >= 28) {
                return icon.getResPackage();
            }
            try {
                return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            }
        } else if (this.a == 2) {
            return ((String) this.f211b).split(":", -1)[0];
        } else {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
    }

    public Uri c() {
        int i2;
        if (this.a != -1 || (i2 = Build.VERSION.SDK_INT) < 23) {
            int i3 = this.a;
            if (i3 == 4 || i3 == 6) {
                return Uri.parse((String) this.f211b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        Icon icon = (Icon) this.f211b;
        if (i2 >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    @Deprecated
    public Icon d() {
        Icon icon;
        switch (this.a) {
            case -1:
                return (Icon) this.f211b;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.f211b);
                break;
            case 2:
                icon = Icon.createWithResource(b(), this.e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.f211b, this.e, this.f212f);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.f211b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(a((Bitmap) this.f211b, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.f211b);
                    break;
                }
            case 6:
                StringBuilder a2 = a.a("Context is required to resolve the file uri of the icon: ");
                a2.append(c());
                throw new IllegalArgumentException(a2.toString());
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.f213g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f214h;
        if (mode == f210j) {
            return icon;
        }
        icon.setTintMode(mode);
        return icon;
    }

    public String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.f211b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f211b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f211b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(b());
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(a())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f212f != 0) {
                    sb.append(" off=");
                    sb.append(this.f212f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f211b);
                break;
        }
        if (this.f213g != null) {
            sb.append(" tint=");
            sb.append(this.f213g);
        }
        if (this.f214h != f210j) {
            sb.append(" mode=");
            sb.append(this.f214h);
        }
        sb.append(")");
        return sb.toString();
    }

    public int a() {
        int i2;
        if (this.a == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
            Icon icon = (Icon) this.f211b;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        } else if (this.a == 2) {
            return this.e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public IconCompat(int i2) {
        this.a = i2;
    }

    public static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }
}
