package i.c.a.b.d.l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewParent;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.zzfo;
import h.b.p.x0;
import h.h.m.m;
import i.c.a.b.d.h;
import i.c.a.b.d.m.b;
import i.c.a.b.d.p.c;
import i.c.a.b.g.g.a2;
import i.c.a.b.g.g.d2;
import i.c.a.b.g.g.d4;
import i.c.a.b.g.g.f2;
import i.c.a.b.g.g.f5;
import i.c.a.b.g.g.f6;
import i.c.a.b.g.g.h5;
import i.c.a.b.g.g.i6;
import i.c.a.b.g.g.j1;
import i.c.a.b.g.g.o6;
import i.c.a.b.g.g.t2;
import i.c.a.b.g.g.t5;
import i.c.a.b.g.g.u2;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.y3;
import i.c.a.b.g.g.z3;
import i.c.a.b.i.a.m4;
import i.c.a.b.i.a.oa;
import i.c.a.b.l.d0;
import i.c.a.b.l.e0;
import i.c.a.b.l.g;
import i.c.a.b.l.j;
import i.c.a.b.l.k;
import i.c.a.c.e0.d;
import i.c.a.c.e0.e;
import i.c.a.c.e0.g;
import i.c.a.c.e0.i;
import i.c.a.c.u.c;
import i.c.c.a.c0.a0;
import i.c.c.a.c0.u;
import i.c.c.a.c0.v;
import i.c.c.a.c0.w;
import i.c.c.a.c0.y;
import i.c.c.a.r;
import i.c.c.a.z.a1;
import i.c.c.a.z.b2;
import i.c.c.a.z.m0;
import i.c.c.a.z.m1;
import i.c.c.a.z.p0;
import i.c.c.a.z.p1;
import i.c.c.a.z.q2;
import i.c.c.a.z.v0;
import java.io.File;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class q {
    public static i.c.a.b.d.m.a a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f3142b;
    public static Boolean c;
    public static Boolean d;
    public static oa e;

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static final class a {
        public final List<String> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f3143b;

        public /* synthetic */ a(Object obj, u0 u0Var) {
            q.a(obj);
            this.f3143b = obj;
        }

        public final a a(String str, Object obj) {
            List<String> list = this.a;
            q.a(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + i.a.a.a.a.a(str2, 1));
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3143b.getClass().getSimpleName());
            sb.append('{');
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(this.a.get(i2));
                if (i2 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static float a(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static void a(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    public static /* synthetic */ boolean a(byte b2) {
        return b2 >= 0;
    }

    public static boolean b(byte b2) {
        return b2 > -65;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void d(Parcel parcel, int i2, int i3) {
        if (i3 >= 65535) {
            parcel.writeInt(i2 | -65536);
            parcel.writeInt(i3);
            return;
        }
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static boolean e(Parcel parcel, int i2) {
        b(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static IBinder g(Parcel parcel, int i2) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + j2);
        return readStrongBinder;
    }

    public static int h(Parcel parcel, int i2) {
        b(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long i(Parcel parcel, int i2) {
        b(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int j(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (i2 >> 16) & 65535 : parcel.readInt();
    }

    public static void k(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + j(parcel, i2));
    }

    public static int l(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static <TResult> g<TResult> b(TResult tresult) {
        d0 d0Var = new d0();
        d0Var.a(tresult);
        return d0Var;
    }

    public static float f(Parcel parcel, int i2) {
        b(parcel, i2, 4);
        return parcel.readFloat();
    }

    public static synchronized i.c.a.b.d.m.a a() {
        i.c.a.b.d.m.a aVar;
        synchronized (q.class) {
            if (a == null) {
                a = new b();
            }
            aVar = a;
        }
        return aVar;
    }

    public static a c(Object obj) {
        return new a(obj, (u0) null);
    }

    public static float e(byte[] bArr, int i2) {
        return Float.intBitsToFloat(b(bArr, i2));
    }

    public static int b(Parcel parcel) {
        int readInt = parcel.readInt();
        int j2 = j(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if ((65535 & readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new SafeParcelReader$ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = j2 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static void c(Parcel parcel, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(i.a.a.a.a.a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new SafeParcelReader$ParseException(sb.toString(), parcel);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[Catch:{ IOException | ClassNotFoundException -> 0x0040 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object d(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002f }
            r2.flush()     // Catch:{ all -> 0x002f }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002f }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002f }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002f }
            r3.<init>(r1)     // Catch:{ all -> 0x002f }
            r4.<init>(r3)     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
            return r1
        L_0x002d:
            r1 = move-exception
            goto L_0x0035
        L_0x002f:
            r1 = move-exception
            r4 = r0
            goto L_0x0035
        L_0x0032:
            r1 = move-exception
            r4 = r0
            r2 = r4
        L_0x0035:
            if (r2 == 0) goto L_0x003a
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x003f:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0040 }
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.q.d(java.lang.Object):java.lang.Object");
    }

    public static boolean e() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int e(byte[] bArr, int i2, t2 t2Var) {
        int a2 = a(bArr, i2, t2Var);
        int i3 = t2Var.a;
        if (i3 < 0) {
            throw zzfo.b();
        } else if (i3 > bArr.length - a2) {
            throw zzfo.a();
        } else if (i3 == 0) {
            t2Var.c = u2.f3471f;
            return a2;
        } else {
            t2Var.c = u2.a(bArr, a2, i3);
            return a2 + i3;
        }
    }

    @TargetApi(21)
    public static boolean c(Context context) {
        if (c == null) {
            c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue();
    }

    public static int a(byte[] bArr, int i2, t2 t2Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return a((int) b2, bArr, i3, t2Var);
        }
        t2Var.a = b2;
        return i3;
    }

    public static <T> a2<T> a(a2<T> a2Var) {
        if ((a2Var instanceof f2) || (a2Var instanceof d2)) {
            return a2Var;
        }
        if (a2Var instanceof Serializable) {
            return new d2(a2Var);
        }
        return new f2(a2Var);
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            sb.append("0123456789abcdef".charAt(b3 / 16));
            sb.append("0123456789abcdef".charAt(b3 % 16));
        }
        return sb.toString();
    }

    public static void b(Parcel parcel, int i2, int i3) {
        int j2 = j(parcel, i2);
        if (j2 != i3) {
            String hexString = Integer.toHexString(j2);
            StringBuilder sb = new StringBuilder(i.a.a.a.a.a(hexString, 46));
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(j2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new SafeParcelReader$ParseException(sb.toString(), parcel);
        }
    }

    public static final String e(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append(l.a.a.a.o.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static <V> V a(j1<V> j1Var) {
        long clearCallingIdentity;
        try {
            return j1Var.a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a2 = j1Var.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i2, String str) {
        i.c.a.b.d.p.b b2 = c.b(context);
        if (b2 != null) {
            try {
                ((AppOpsManager) b2.a.getSystemService("appops")).checkPackage(i2, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    public static String c(p1 p1Var) {
        int ordinal = p1Var.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha256";
        }
        if (ordinal == 3) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + p1Var);
    }

    public static byte[] d(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                int digit = Character.digit(str.charAt(i3), 16);
                int digit2 = Character.digit(str.charAt(i3 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i2] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static long c(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int c(byte[] bArr, int i2, t2 t2Var) {
        int a2 = a(bArr, i2, t2Var);
        int i3 = t2Var.a;
        if (i3 < 0) {
            throw zzfo.b();
        } else if (i3 == 0) {
            t2Var.c = "";
            return a2;
        } else {
            t2Var.c = new String(bArr, a2, i3, y3.a);
            return a2 + i3;
        }
    }

    public static String a(u2 u2Var) {
        f6 f6Var = new f6(u2Var);
        StringBuilder sb = new StringBuilder(f6Var.a.a());
        for (int i2 = 0; i2 < f6Var.a.a(); i2++) {
            byte a2 = f6Var.a.a(i2);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 >= 32 && a2 <= 126) {
                            sb.append((char) a2);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        if (a(context)) {
            if (!(Build.VERSION.SDK_INT >= 24) || (c(context) && !f())) {
                return true;
            }
        }
        return false;
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static Calendar c() {
        return a(Calendar.getInstance());
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return a(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static double d(byte[] bArr, int i2) {
        return Double.longBitsToDouble(c(bArr, i2));
    }

    public static int b(byte[] bArr, int i2, t2 t2Var) {
        int i3 = i2 + 1;
        long j2 = (long) bArr[i2];
        if (j2 >= 0) {
            t2Var.f3453b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & Byte.MAX_VALUE)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & Byte.MAX_VALUE)) << i5;
            int i7 = i6;
            b2 = b3;
            i4 = i7;
        }
        t2Var.f3453b = j3;
        return i4;
    }

    public static int d(byte[] bArr, int i2, t2 t2Var) {
        int a2 = a(bArr, i2, t2Var);
        int i3 = t2Var.a;
        if (i3 < 0) {
            throw zzfo.b();
        } else if (i3 == 0) {
            t2Var.c = "";
            return a2;
        } else {
            t2Var.c = o6.a.a(bArr, a2, i3);
            return a2 + i3;
        }
    }

    public static ArrayList<String> c(Parcel parcel, int i2) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + j2);
        return createStringArrayList;
    }

    public static final boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        byte b2 = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            b2 |= bArr[i2] ^ bArr2[i2];
        }
        if (b2 == 0) {
            return true;
        }
        return false;
    }

    public static <T> ArrayList<T> c(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + j2);
        return createTypedArrayList;
    }

    public static Calendar d() {
        return b((Calendar) null);
    }

    public static void d(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new SafeParcelReader$ParseException(sb.toString(), parcel);
        }
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) ((bArr[i2] << 1) & 254);
            if (i2 < length - 1) {
                bArr2[i2] = (byte) (bArr2[i2] | ((byte) ((bArr[i2 + 1] >> 7) & 1)));
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static TimeZone b() {
        return TimeZone.getTimeZone("UTC");
    }

    public static TypedValue b(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static int b(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static String b(p1 p1Var) {
        int ordinal = p1Var.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha256";
        }
        if (ordinal == 3) {
            return "HmacSha512";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + p1Var);
    }

    public static Set<String> a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery(i.a.a.a.a.a(i.a.a.a.a.a(str, 22), "SELECT * FROM ", str, " LIMIT 0"), (String[]) null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public static <TResult> TResult b(g<TResult> gVar) {
        if (gVar.d()) {
            return gVar.b();
        }
        if (((d0) gVar).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.a());
    }

    public static void a(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static Calendar b(Calendar calendar) {
        Calendar instance = Calendar.getInstance(b());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    public static String b(Parcel parcel, int i2) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + j2);
        return readString;
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    public static boolean a(Context context, int i2) {
        if (!b(context, i2, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            h a2 = h.a(context);
            if (a2 == null) {
                throw null;
            } else if (packageInfo == null) {
                return false;
            } else {
                if (!h.a(packageInfo, false)) {
                    if (!h.a(packageInfo, true)) {
                        return false;
                    }
                    if (!i.c.a.b.d.g.honorsDebugCertificates(a2.a)) {
                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        return false;
                    }
                }
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    public static u b(m1 m1Var) {
        int ordinal = m1Var.ordinal();
        if (ordinal == 1) {
            return u.NIST_P256;
        }
        if (ordinal == 2) {
            return u.NIST_P384;
        }
        if (ordinal == 3) {
            return u.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + m1Var);
    }

    public static Drawable b(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable c2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (c2 = h.b.l.a.a.c(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return c2;
    }

    public static <T> T[] b(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + j2);
        return createTypedArray;
    }

    public static <TResult> g<TResult> a(Exception exc) {
        d0 d0Var = new d0();
        d0Var.a(exc);
        return d0Var;
    }

    public static String a(PowerManager.WakeLock wakeLock, String str) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public static ECParameterSpec b(u uVar) {
        int ordinal = uVar.ordinal();
        if (ordinal == 0) {
            return a("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (ordinal == 1) {
            return a("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (ordinal == 2) {
            return a("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + uVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (((java.lang.Boolean) r4).booleanValue() == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f8, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0209, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021b, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i.c.a.b.g.g.f5 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x026c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = e(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = i.c.a.b.g.g.w3.a((java.lang.reflect.Method) r9, (java.lang.Object) r13, (java.lang.Object[]) r4)
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r3, (java.lang.Object) r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r4 = r8.concat(r4)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = e(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = i.c.a.b.g.g.w3.a((java.lang.reflect.Method) r3, (java.lang.Object) r13, (java.lang.Object[]) r6)
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r4, (java.lang.Object) r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r4 = r6.length()
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r6)
            goto L_0x0149
        L_0x0143:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x017d
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0172
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0177
        L_0x0172:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0177:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017d:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x019c
            java.lang.String r3 = r3.concat(r4)
            goto L_0x01a2
        L_0x019c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x01a2:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01ad
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01b2:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r6 = r8.concat(r6)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x01ca:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = i.c.a.b.g.g.w3.a((java.lang.reflect.Method) r4, (java.lang.Object) r13, (java.lang.Object[]) r8)
            if (r6 != 0) goto L_0x0255
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01ed
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x01ea
        L_0x01e7:
            r6 = 1
            goto L_0x0250
        L_0x01ea:
            r6 = 0
            goto L_0x0250
        L_0x01ed:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01fb
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x01fb:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x020c
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x020c:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x021e
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x021e:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x0229
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x0250
        L_0x0229:
            boolean r6 = r4 instanceof i.c.a.b.g.g.u2
            if (r6 == 0) goto L_0x0234
            i.c.a.b.g.g.u2 r6 = i.c.a.b.g.g.u2.f3471f
            boolean r6 = r4.equals(r6)
            goto L_0x0250
        L_0x0234:
            boolean r6 = r4 instanceof i.c.a.b.g.g.f5
            if (r6 == 0) goto L_0x0242
            r6 = r4
            i.c.a.b.g.g.f5 r6 = (i.c.a.b.g.g.f5) r6
            i.c.a.b.g.g.f5 r6 = r6.h()
            if (r4 != r6) goto L_0x01ea
            goto L_0x01e7
        L_0x0242:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x01ea
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x0250:
            if (r6 != 0) goto L_0x0253
            goto L_0x0261
        L_0x0253:
            r10 = 0
            goto L_0x0261
        L_0x0255:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = i.c.a.b.g.g.w3.a((java.lang.reflect.Method) r6, (java.lang.Object) r13, (java.lang.Object[]) r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0261:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = e(r3)
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r3, (java.lang.Object) r4)
            goto L_0x004d
        L_0x026c:
            boolean r0 = r13 instanceof i.c.a.b.g.g.w3.d
            if (r0 == 0) goto L_0x0292
            r0 = r13
            i.c.a.b.g.g.w3$d r0 = (i.c.a.b.g.g.w3.d) r0
            i.c.a.b.g.g.o3<i.c.a.b.g.g.w3$c> r0 = r0.zzc
            java.util.Iterator r0 = r0.b()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0280
            goto L_0x0292
        L_0x0280:
            java.lang.Object r13 = r0.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getKey()
            i.c.a.b.g.g.w3$c r13 = (i.c.a.b.g.g.w3.c) r13
            java.lang.NoSuchMethodError r13 = new java.lang.NoSuchMethodError
            r13.<init>()
            throw r13
        L_0x0292:
            i.c.a.b.g.g.w3 r13 = (i.c.a.b.g.g.w3) r13
            i.c.a.b.g.g.i6 r13 = r13.zzb
            if (r13 == 0) goto L_0x02af
        L_0x0298:
            int r0 = r13.a
            if (r5 >= r0) goto L_0x02af
            int[] r0 = r13.f3318b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.c
            r1 = r1[r5]
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r0, (java.lang.Object) r1)
            int r5 = r5 + 1
            goto L_0x0298
        L_0x02af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.q.a(i.c.a.b.g.g.f5, java.lang.StringBuilder, int):void");
    }

    public static /* synthetic */ void a(byte b2, byte b3, char[] cArr, int i2) {
        if (b2 < -62 || b(b3)) {
            throw zzfo.f();
        }
        cArr[i2] = (char) (((b2 & 31) << 6) | (b3 & 63));
    }

    public static String a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static int a(int i2, byte[] bArr, int i3, t2 t2Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            t2Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i5 + 1;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            t2Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i7 + 1;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            t2Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i9 + 1;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            t2Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                t2Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{str, cls.getCanonicalName(), t2.getClass().getCanonicalName()}));
    }

    public static <TResult> g<TResult> a(Executor executor, Callable<TResult> callable) {
        a(executor, (Object) "Executor must not be null");
        a(callable, (Object) "Callback must not be null");
        d0 d0Var = new d0();
        executor.execute(new e0(d0Var, callable));
        return d0Var;
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static /* synthetic */ void a(byte b2, byte b3, byte b4, char[] cArr, int i2) {
        if (b(b3) || ((b2 == -32 && b3 < -96) || ((b2 == -19 && b3 >= -96) || b(b4)))) {
            throw zzfo.f();
        }
        cArr[i2] = (char) (((b2 & 15) << 12) | ((b3 & 63) << 6) | (b4 & 63));
    }

    @TargetApi(20)
    public static boolean a(Context context) {
        if (f3142b == null) {
            f3142b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f3142b.booleanValue();
    }

    public static int a(Parcel parcel) {
        return l(parcel, 20293);
    }

    public static void a(Parcel parcel, int i2, boolean z) {
        d(parcel, i2, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static /* synthetic */ void a(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
        if (!b(b3)) {
            if ((((b3 + 112) + (b2 << 28)) >> 30) == 0 && !b(b4) && !b(b5)) {
                byte b6 = ((b2 & 7) << 18) | ((b3 & 63) << 12) | ((b4 & 63) << 6) | (b5 & 63);
                cArr[i2] = (char) ((b6 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((b6 & 1023) + 56320);
                return;
            }
        }
        throw zzfo.f();
    }

    public static String a(String str, String[] strArr, String[] strArr2) {
        a(strArr);
        a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            String str2 = strArr[i2];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i2];
            }
        }
        return null;
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(a1 a1Var) {
        b(a(a1Var.k().i()));
        b(a1Var.k().j());
        if (a1Var.j() != m0.UNKNOWN_FORMAT) {
            r.b(a1Var.i().i());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static void a(p0 p0Var) {
        v0 j2 = p0Var.j();
        p1 k2 = p0Var.k();
        m1 i2 = p0Var.i();
        int ordinal = j2.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            int ordinal2 = i2.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2 && ordinal2 != 3) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                } else if (k2 != p1.SHA512) {
                    throw new GeneralSecurityException("Invalid ECDSA parameters");
                }
            } else if (k2 != p1.SHA256) {
                throw new GeneralSecurityException("Invalid ECDSA parameters");
            }
        } else {
            throw new GeneralSecurityException("unsupported signature encoding");
        }
    }

    public static void a(m4 m4Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean z;
        if (m4Var != null) {
            Cursor cursor = null;
            try {
                Cursor query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{DefaultAppMeasurementEventListenerRegistrar.NAME}, "name=?", new String[]{str}, (String) null, (String) null, (String) null);
                z = query.moveToFirst();
                query.close();
            } catch (SQLiteException e2) {
                m4Var.f3761i.a("Error querying for table", str, e2);
                if (cursor != null) {
                    cursor.close();
                }
                z = false;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            if (!z) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> a2 = a(sQLiteDatabase, str);
                String[] split = str3.split(",");
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str4 = split[i2];
                    if (((HashSet) a2).remove(str4)) {
                        i2++;
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                        sb.append("Table ");
                        sb.append(str);
                        sb.append(" is missing required column: ");
                        sb.append(str4);
                        throw new SQLiteException(sb.toString());
                    }
                }
                if (strArr != null) {
                    for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                        if (!((HashSet) a2).remove(strArr[i3])) {
                            sQLiteDatabase.execSQL(strArr[i3 + 1]);
                        }
                    }
                }
                if (!((HashSet) a2).isEmpty()) {
                    m4Var.f3761i.a("Table has extra columns. table, columns", str, TextUtils.join(", ", a2));
                }
            } catch (SQLiteException e3) {
                m4Var.f3758f.a("Failed to verify columns on table that was just created", str);
                throw e3;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    public static long a(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    public static void a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void a(Parcel parcel, int i2, int i3) {
        d(parcel, i2, 4);
        parcel.writeInt(i3);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static d a(int i2) {
        if (i2 == 0) {
            return new i();
        }
        if (i2 != 1) {
            return new i();
        }
        return new e();
    }

    public static long a(byte[] bArr, int i2, int i3) {
        return (a(bArr, i2) >> i3) & 67108863;
    }

    public static <TResult> TResult a(g<TResult> gVar) {
        c("Must not be called on the main application thread");
        a(gVar, (Object) "Task must not be null");
        if (gVar.c()) {
            return b(gVar);
        }
        j jVar = new j((e0) null);
        a((g<?>) gVar, (k) jVar);
        jVar.a.await();
        return b(gVar);
    }

    public static <TResult> TResult a(g<TResult> gVar, long j2, TimeUnit timeUnit) {
        c("Must not be called on the main application thread");
        a(gVar, (Object) "Task must not be null");
        a(timeUnit, (Object) "TimeUnit must not be null");
        if (gVar.c()) {
            return b(gVar);
        }
        j jVar = new j((e0) null);
        a((g<?>) gVar, (k) jVar);
        if (jVar.a.await(j2, timeUnit)) {
            return b(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void a(Parcel parcel, int i2, long j2) {
        d(parcel, i2, 8);
        parcel.writeLong(j2);
    }

    public static ColorStateList a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList b2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (b2 = h.b.l.a.a.b(context, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return b2;
    }

    public static void a(byte[] bArr, long j2, int i2) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) ((int) (255 & j2));
            i3++;
            j2 >>= 8;
        }
    }

    public static void a(Handler handler) {
        String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
        String name2 = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(name, i.a.a.a.a.a(name2, 36)));
        sb.append("Must be called on ");
        sb.append(name2);
        sb.append(" thread, but got ");
        sb.append(name);
        sb.append(".");
        String sb2 = sb.toString();
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(sb2);
        }
    }

    public static void a(m4 m4Var, SQLiteDatabase sQLiteDatabase) {
        if (m4Var != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                m4Var.f3761i.a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                m4Var.f3761i.a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                m4Var.f3761i.a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                m4Var.f3761i.a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static byte[] a(byte[]... bArr) {
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            if (i3 <= Integer.MAX_VALUE - bArr2.length) {
                i3 += bArr2.length;
                i2++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i3];
        int i4 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
            i4 += bArr4.length;
        }
        return bArr3;
    }

    public static Animator a(i.c.a.c.u.c cVar, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0123c.a, c.b.f4204b, new c.e[]{new c.e(f2, f3, f4)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f2, (int) f3, revealInfo.c, f4);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    public static void a(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof i.c.a.c.e0.g) {
            i.c.a.c.e0.g gVar = (i.c.a.c.e0.g) background;
            g.b bVar = gVar.e;
            if (bVar.f4069o != f2) {
                bVar.f4069o = f2;
                gVar.i();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[bArr.length] = Byte.MIN_VALUE;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    public static int a(Context context, int i2, String str) {
        TypedValue b2 = b(context, i2);
        if (b2 != null) {
            return b2.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    public static void a(i.c.a.b.l.g<?> gVar, k kVar) {
        gVar.a(i.c.a.b.l.i.f4004b, (i.c.a.b.l.e<? super Object>) kVar);
        gVar.a(i.c.a.b.l.i.f4004b, (i.c.a.b.l.d) kVar);
        gVar.a(i.c.a.b.l.i.f4004b, (i.c.a.b.l.b) kVar);
    }

    public static PorterDuffColorFilter a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long a2 = a(bArr3, 0, 0) & 67108863;
            int i2 = 2;
            long a3 = a(bArr3, 3, 2) & 67108611;
            long a4 = a(bArr3, 6, 4) & 67092735;
            long a5 = a(bArr3, 9, 6) & 66076671;
            long a6 = a(bArr3, 12, 8) & 1048575;
            long j2 = a3 * 5;
            long j3 = a4 * 5;
            long j4 = a5 * 5;
            long j5 = a6 * 5;
            int i3 = 17;
            byte[] bArr5 = new byte[17];
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            int i4 = 0;
            while (i4 < bArr4.length) {
                int min = Math.min(16, bArr4.length - i4);
                System.arraycopy(bArr4, i4, bArr5, 0, min);
                bArr5[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr5, min + 1, i3, (byte) 0);
                }
                long a7 = a(bArr5, 0, 0) + j10;
                long a8 = a(bArr5, 3, i2) + j6;
                long a9 = a(bArr5, 6, 4) + j7;
                long a10 = a(bArr5, 9, 6) + j8;
                long a11 = j9 + (a(bArr5, 12, 8) | ((long) (bArr5[16] << 24)));
                long j11 = (a11 * j2) + (a10 * j3) + (a9 * j4) + (a8 * j5) + (a7 * a2);
                long j12 = (a11 * j3) + (a10 * j4) + (a9 * j5) + (a8 * a2) + (a7 * a3);
                long j13 = (a11 * j4) + (a10 * j5) + (a9 * a2) + (a8 * a3) + (a7 * a4);
                long j14 = (a10 * a2) + (a9 * a3) + (a8 * a4) + (a7 * a5);
                long j15 = a10 * a3;
                long j16 = a11 * a2;
                long j17 = j12 + (j11 >> 26);
                long j18 = j13 + (j17 >> 26);
                long j19 = (a11 * j5) + j14 + (j18 >> 26);
                long j20 = j16 + j15 + (a9 * a4) + (a8 * a5) + (a7 * a6) + (j19 >> 26);
                long j21 = j20 >> 26;
                j9 = j20 & 67108863;
                long j22 = (j21 * 5) + (j11 & 67108863);
                long j23 = (j17 & 67108863) + (j22 >> 26);
                i4 += 16;
                j7 = j18 & 67108863;
                j8 = j19 & 67108863;
                i3 = 17;
                i2 = 2;
                j10 = j22 & 67108863;
                j6 = j23;
            }
            long j24 = j7 + (j6 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = j9 + (j26 >> 26);
            long j29 = j28 & 67108863;
            long j30 = ((j28 >> 26) * 5) + j10;
            long j31 = j30 >> 26;
            long j32 = j30 & 67108863;
            long j33 = (j6 & 67108863) + j31;
            long j34 = j32 + 5;
            long j35 = j34 & 67108863;
            long j36 = (j34 >> 26) + j33;
            long j37 = j25 + (j36 >> 26);
            long j38 = j27 + (j37 >> 26);
            long j39 = (j29 + (j38 >> 26)) - 67108864;
            long j40 = j39 >> 63;
            long j41 = j32 & j40;
            long j42 = j33 & j40;
            long j43 = j25 & j40;
            long j44 = j27 & j40;
            long j45 = j29 & j40;
            long j46 = ~j40;
            long j47 = j42 | (j36 & 67108863 & j46);
            long j48 = j43 | (j37 & 67108863 & j46);
            long j49 = j44 | (j38 & 67108863 & j46);
            long j50 = j45 | (j39 & j46);
            long a12 = a(bArr3, 16) + ((j41 | (j35 & j46) | (j47 << 26)) & 4294967295L);
            long a13 = a(bArr3, 20) + (((j47 >> 6) | (j48 << 20)) & 4294967295L) + (a12 >> 32);
            long j51 = a13 & 4294967295L;
            long a14 = a(bArr3, 24) + (((j48 >> 12) | (j49 << 14)) & 4294967295L) + (a13 >> 32);
            long a15 = a(bArr3, 28);
            byte[] bArr6 = new byte[16];
            a(bArr6, a12 & 4294967295L, 0);
            a(bArr6, j51, 4);
            a(bArr6, a14 & 4294967295L, 8);
            a(bArr6, (a15 + (((j49 >> 18) | (j50 << 8)) & 4294967295L) + (a14 >> 32)) & 4294967295L, 12);
            return bArr6;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static PorterDuff.Mode a(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static u a(m1 m1Var) {
        int ordinal = m1Var.ordinal();
        if (ordinal == 1) {
            return u.NIST_P256;
        }
        if (ordinal == 2) {
            return u.NIST_P384;
        }
        if (ordinal == 3) {
            return u.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + m1Var);
    }

    public static void a(Parcel parcel, int i2, float f2) {
        d(parcel, i2, 4);
        parcel.writeFloat(f2);
    }

    public static a0 a(p1 p1Var) {
        int ordinal = p1Var.ordinal();
        if (ordinal == 1) {
            return a0.SHA1;
        }
        if (ordinal == 2) {
            return a0.SHA256;
        }
        if (ordinal == 3) {
            return a0.SHA512;
        }
        throw new GeneralSecurityException("unknown hash type: " + p1Var);
    }

    public static boolean a(View view) {
        return m.k(view) == 1;
    }

    public static void a(q2 q2Var) {
        for (b2 next : q2Var.f4565j) {
            if (next.f4403i.isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (next.f4402h.isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!next.f4406l.isEmpty()) {
                r.a(r.a(next.f4406l).a(next.f4403i, next.f4402h, next.f4404j), next.f4405k);
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }

    public static final byte[] a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        if (i4 < 0 || bArr.length - i4 < i2 || bArr2.length - i4 < i3) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr3[i5] = (byte) (bArr[i5 + i2] ^ bArr2[i5 + i3]);
        }
        return bArr3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(i.c.a.b.g.g.t5 r6, byte[] r7, int r8, int r9, i.c.a.b.g.g.t2 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = a((int) r8, (byte[]) r7, (int) r0, (i.c.a.b.g.g.t2) r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            r6.b(r9)
            r10.c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzfo r6 = com.google.android.gms.internal.measurement.zzfo.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.d.l.q.a(i.c.a.b.g.g.t5, byte[], int, int, i.c.a.b.g.g.t2):int");
    }

    public static w a(m0 m0Var) {
        int ordinal = m0Var.ordinal();
        if (ordinal == 1) {
            return w.UNCOMPRESSED;
        }
        if (ordinal == 2) {
            return w.COMPRESSED;
        }
        if (ordinal == 3) {
            return w.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        throw new GeneralSecurityException("unknown point format: " + m0Var);
    }

    public static int a(View view, int i2) {
        return a(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static int a(Context context, int i2, int i3) {
        TypedValue b2 = b(context, i2);
        return b2 != null ? b2.data : i3;
    }

    public static final void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a2 : (List) obj) {
                a(sb, i2, str, a2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry a3 : ((Map) obj).entrySet()) {
                a(sb, i2, str, (Object) a3);
            }
        } else {
            sb.append(10);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(a(u2.a((String) obj)));
                sb.append('\"');
            } else if (obj instanceof u2) {
                sb.append(": \"");
                sb.append(a((u2) obj));
                sb.append('\"');
            } else if (obj instanceof w3) {
                sb.append(" {");
                a((f5) (w3) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i5 = i2 + 2;
                a(sb, i5, "key", entry.getKey());
                a(sb, i5, "value", entry.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static int a(t5 t5Var, byte[] bArr, int i2, int i3, int i4, t2 t2Var) {
        h5 h5Var = (h5) t5Var;
        Object a2 = h5Var.f3307l.a(h5Var.e);
        int a3 = h5Var.a(a2, bArr, i2, i3, i4, t2Var);
        h5Var.b(a2);
        t2Var.c = a2;
        return a3;
    }

    public static Calendar a(Calendar calendar) {
        Calendar b2 = b(calendar);
        Calendar d2 = d();
        d2.set(b2.get(1), b2.get(2), b2.get(5));
        return d2;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static int a(int i2, byte[] bArr, int i3, int i4, d4<?> d4Var, t2 t2Var) {
        z3 z3Var = (z3) d4Var;
        int a2 = a(bArr, i3, t2Var);
        z3Var.d(t2Var.a);
        while (a2 < i4) {
            int a3 = a(bArr, a2, t2Var);
            if (i2 != t2Var.a) {
                break;
            }
            a2 = a(bArr, a3, t2Var);
            z3Var.d(t2Var.a);
        }
        return a2;
    }

    public static void a(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int l2 = l(parcel, i2);
            parcel.writeString(str);
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> T a(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + j2);
        return t;
    }

    public static v a(v0 v0Var) {
        int ordinal = v0Var.ordinal();
        if (ordinal == 1) {
            return v.IEEE_P1363;
        }
        if (ordinal == 2) {
            return v.DER;
        }
        throw new GeneralSecurityException("unknown ECDSA encoding: " + v0Var);
    }

    public static Bundle a(Parcel parcel, int i2) {
        int j2 = j(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (j2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + j2);
        return readBundle;
    }

    public static boolean a(Context context, int i2, boolean z) {
        TypedValue b2 = b(context, i2);
        if (b2 == null || b2.type != 18) {
            return z;
        }
        return b2.data != 0;
    }

    public static void a(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int l2 = l(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static int a(byte[] bArr, int i2, d4<?> d4Var, t2 t2Var) {
        z3 z3Var = (z3) d4Var;
        int a2 = a(bArr, i2, t2Var);
        int i3 = t2Var.a + a2;
        while (a2 < i3) {
            a2 = a(bArr, a2, t2Var);
            z3Var.d(t2Var.a);
        }
        if (a2 == i3) {
            return a2;
        }
        throw zzfo.a();
    }

    public static void a(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int l2 = l(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static int a(t5<?> t5Var, int i2, byte[] bArr, int i3, int i4, d4<?> d4Var, t2 t2Var) {
        int a2 = a((t5) t5Var, bArr, i3, i4, t2Var);
        d4Var.add(t2Var.c);
        while (a2 < i4) {
            int a3 = a(bArr, a2, t2Var);
            if (i2 != t2Var.a) {
                break;
            }
            a2 = a((t5) t5Var, bArr, a3, i4, t2Var);
            d4Var.add(t2Var.c);
        }
        return a2;
    }

    public static void a(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int l2 = l(parcel, i2);
            parcel.writeBundle(bundle);
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static int a(int i2, int i3, float f2) {
        return h.h.g.a.a(h.h.g.a.b(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static int a(int i2, byte[] bArr, int i3, int i4, i6 i6Var, t2 t2Var) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                int b2 = b(bArr, i3, t2Var);
                i6Var.a(i2, Long.valueOf(t2Var.f3453b));
                return b2;
            } else if (i5 == 1) {
                i6Var.a(i2, Long.valueOf(c(bArr, i3)));
                return i3 + 8;
            } else if (i5 == 2) {
                int a2 = a(bArr, i3, t2Var);
                int i6 = t2Var.a;
                if (i6 < 0) {
                    throw zzfo.b();
                } else if (i6 <= bArr.length - a2) {
                    if (i6 == 0) {
                        i6Var.a(i2, u2.f3471f);
                    } else {
                        i6Var.a(i2, u2.a(bArr, a2, i6));
                    }
                    return a2 + i6;
                } else {
                    throw zzfo.a();
                }
            } else if (i5 == 3) {
                i6 b3 = i6.b();
                int i7 = (i2 & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i3 >= i4) {
                        break;
                    }
                    int a3 = a(bArr, i3, t2Var);
                    int i9 = t2Var.a;
                    i8 = i9;
                    if (i9 == i7) {
                        i3 = a3;
                        break;
                    }
                    int a4 = a(i8, bArr, a3, i4, b3, t2Var);
                    i8 = i9;
                    i3 = a4;
                }
                if (i3 > i4 || i8 != i7) {
                    throw zzfo.e();
                }
                i6Var.a(i2, b3);
                return i3;
            } else if (i5 == 5) {
                i6Var.a(i2, Integer.valueOf(b(bArr, i3)));
                return i3 + 4;
            } else {
                throw zzfo.c();
            }
        } else {
            throw zzfo.c();
        }
    }

    public static int a(int i2, byte[] bArr, int i3, int i4, t2 t2Var) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return b(bArr, i3, t2Var);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return a(bArr, i3, t2Var) + t2Var.a;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = a(bArr, i3, t2Var);
                    i7 = t2Var.a;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = a(i7, bArr, i3, i4, t2Var);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw zzfo.e();
            } else if (i5 == 5) {
                return i3 + 4;
            } else {
                throw zzfo.c();
            }
        } else {
            throw zzfo.c();
        }
    }

    public static void a(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            BigInteger p2 = ((ECFieldFp) field).getP();
            BigInteger affineX = eCPoint.getAffineX();
            BigInteger affineY = eCPoint.getAffineY();
            if (affineX == null || affineY == null) {
                throw new GeneralSecurityException("point is at infinity");
            } else if (affineX.signum() == -1 || affineX.compareTo(p2) != -1) {
                throw new GeneralSecurityException("x is out of range");
            } else if (affineY.signum() == -1 || affineY.compareTo(p2) != -1) {
                throw new GeneralSecurityException("y is out of range");
            } else if (!affineY.multiply(affineY).mod(p2).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(p2))) {
                throw new GeneralSecurityException("Point is not on curve");
            }
        } else {
            throw new GeneralSecurityException("Only curves over prime order fields are supported");
        }
    }

    public static ECParameterSpec a(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static ColorStateList a(Context context, x0 x0Var, int i2) {
        int resourceId;
        ColorStateList b2;
        if (!x0Var.f1492b.hasValue(i2) || (resourceId = x0Var.f1492b.getResourceId(i2, 0)) == 0 || (b2 = h.b.l.a.a.b(context, resourceId)) == null) {
            return x0Var.a(i2);
        }
        return b2;
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int l2 = l(parcel, i2);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, t, i3);
                }
            }
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, int i2, List<T> list, boolean z) {
        if (list != null) {
            int l2 = l(parcel, i2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    a(parcel, parcelable, 0);
                }
            }
            m(parcel, l2);
        } else if (z) {
            d(parcel, i2, 0);
        }
    }

    public static <T extends Parcelable> void a(Parcel parcel, T t, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i2);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static b2 a(String str, String str2, String str3, int i2, boolean z) {
        b2.b bVar = (b2.b) b2.f4400m.e();
        bVar.k();
        b2.a((b2) bVar.f4951f, str2);
        bVar.k();
        b2.c((b2) bVar.f4951f, "type.googleapis.com/google.crypto.tink." + str3);
        bVar.k();
        ((b2) bVar.f4951f).f4404j = i2;
        bVar.k();
        ((b2) bVar.f4951f).f4405k = z;
        bVar.k();
        b2.b((b2) bVar.f4951f, str);
        return (b2) bVar.i();
    }

    public static void a(View view, i.c.a.c.e0.g gVar) {
        i.c.a.c.w.a aVar = gVar.e.f4059b;
        if (aVar != null && aVar.a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f2 += m.g((View) parent);
            }
            g.b bVar = gVar.e;
            if (bVar.f4068n != f2) {
                bVar.f4068n = f2;
                gVar.i();
            }
        }
    }

    public static ECPublicKey a(u uVar, byte[] bArr, byte[] bArr2) {
        ECParameterSpec b2 = b(uVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        a(eCPoint, b2.getCurve());
        return (ECPublicKey) y.f4365j.a("EC").generatePublic(new ECPublicKeySpec(eCPoint, b2));
    }

    public static ECPrivateKey a(u uVar, byte[] bArr) {
        return (ECPrivateKey) y.f4365j.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), b(uVar)));
    }

    public static KeyPair a(u uVar) {
        ECParameterSpec b2 = b(uVar);
        KeyPairGenerator a2 = y.f4364i.a("EC");
        a2.initialize(b2);
        return a2.generateKeyPair();
    }
}
