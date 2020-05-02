package i.c.d.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.core.CrashlyticsPinningInfoProvider;
import com.google.gson.Gson;
import f.a.m;
import f.a.t;
import f.a.z;
import i.c.d.f.d;
import i.c.d.f.h;
import i.c.f.o;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlinx.coroutines.CoroutineExceptionHandler;
import l.a.a.a.o.b.p;
import n.b;
import n.e;
import n.k.c;
import n.m.b.a;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import o.c0;
import o.j;
import o.l;
import o.p0.a;
import o.y;
import q.a0;
import q.e;
import q.e0;
import q.j;
import q.k;
import q.w;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final class e {
    public static e0 a;

    public static final long a(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r10 == '+') goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long a(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            if (r0 == 0) goto L_0x00f1
            java.lang.String r6 = f.a.a.o.a(r21)
            if (r6 == 0) goto L_0x00ee
            r7 = 10
            a((int) r7)
            int r8 = r6.length()
            if (r8 != 0) goto L_0x001a
            goto L_0x006a
        L_0x001a:
            r9 = 0
            char r10 = r6.charAt(r9)
            r11 = 48
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 1
            if (r10 >= r11) goto L_0x0039
            if (r8 != r14) goto L_0x002c
            goto L_0x006a
        L_0x002c:
            r11 = 45
            if (r10 != r11) goto L_0x0034
            r12 = -9223372036854775808
            r9 = 1
            goto L_0x003a
        L_0x0034:
            r11 = 43
            if (r10 != r11) goto L_0x006a
            goto L_0x003a
        L_0x0039:
            r14 = 0
        L_0x003a:
            r10 = 0
            r15 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r17 = r15
        L_0x0043:
            if (r14 >= r8) goto L_0x0072
            char r5 = r6.charAt(r14)
            int r5 = java.lang.Character.digit(r5, r7)
            if (r5 >= 0) goto L_0x0050
            goto L_0x006a
        L_0x0050:
            int r19 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x0060
            int r19 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r19 != 0) goto L_0x006a
            long r3 = (long) r7
            long r17 = r12 / r3
            int r3 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x0060
            goto L_0x006a
        L_0x0060:
            long r3 = (long) r7
            long r10 = r10 * r3
            long r3 = (long) r5
            long r19 = r12 + r3
            int r5 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r5 >= 0) goto L_0x006c
        L_0x006a:
            r5 = 0
            goto L_0x007f
        L_0x006c:
            long r10 = r10 - r3
            int r14 = r14 + 1
            r3 = r26
            goto L_0x0043
        L_0x0072:
            if (r9 == 0) goto L_0x0079
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            goto L_0x007e
        L_0x0079:
            long r3 = -r10
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x007e:
            r5 = r3
        L_0x007f:
            r3 = 39
            java.lang.String r4 = "System property '"
            if (r5 == 0) goto L_0x00ca
            long r5 = r5.longValue()
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0094
            r7 = r26
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x0096
            goto L_0x00f0
        L_0x0094:
            r7 = r26
        L_0x0096:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r0)
            java.lang.String r0 = "' should be in range "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r0 = ".."
            r9.append(r0)
            r9.append(r7)
            java.lang.String r0 = ", but is '"
            r9.append(r0)
            r9.append(r5)
            r9.append(r3)
            java.lang.String r0 = r9.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00ca:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00ee:
            r5 = r22
        L_0x00f0:
            return r5
        L_0x00f1:
            java.lang.String r0 = "propertyName"
            n.m.c.f.a((java.lang.String) r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.p.e.a(java.lang.String, long, long, long):long");
    }

    public static final int b(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static final boolean b(int i2) {
        return i2 == 1;
    }

    public static int c(int i2) {
        if (i2 >= 200 && i2 <= 299) {
            return 0;
        }
        if (i2 >= 300 && i2 <= 399) {
            return 1;
        }
        if (i2 >= 400 && i2 <= 499) {
            return 0;
        }
        if (i2 >= 500) {
        }
        return 1;
    }

    public static final String c(Object obj) {
        if (obj != null) {
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            f.a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
            return hexString;
        }
        f.a("$this$hexAddress");
        throw null;
    }

    public static final <T> List<T> d(T t) {
        List<T> singletonList = Collections.singletonList(t);
        f.a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final void e(Object obj) {
        if (obj instanceof e.a) {
            throw ((e.a) obj).e;
        }
    }

    public static final <T> Object f(Object obj) {
        if (n.e.d(obj)) {
            e(obj);
            return obj;
        }
        Throwable b2 = n.e.b(obj);
        if (b2 != null) {
            return new m(b2, false, 2);
        }
        f.a();
        throw null;
    }

    public static final String b(c<?> cVar) {
        String str;
        if (cVar == null) {
            f.a("$this$toDebugString");
            throw null;
        } else if (cVar instanceof z) {
            return cVar.toString();
        } else {
            try {
                String str2 = cVar + '@' + c((Object) cVar);
                n.e.a(str2);
                str = str2;
            } catch (Throwable th) {
                str = a(th);
            }
            Throwable b2 = n.e.b(str);
            String str3 = str;
            if (b2 != null) {
                str3 = cVar.getClass().getName() + '@' + c((Object) cVar);
            }
            return (String) str3;
        }
    }

    public static final String b(Object obj) {
        if (obj != null) {
            String simpleName = obj.getClass().getSimpleName();
            f.a((Object) simpleName, "this::class.java.simpleName");
            return simpleName;
        }
        f.a("$this$classSimpleName");
        throw null;
    }

    public static boolean b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == null) {
            f.a("originalException");
            throw null;
        } else if (th2 == null) {
            f.a("thrownException");
            throw null;
        } else if (th == th2) {
            return th;
        } else {
            RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
            a((Throwable) runtimeException, th);
            return runtimeException;
        }
    }

    public static e0 a(boolean z, boolean z2, boolean z3, String str) {
        return a(z, z2, z3, str, true);
    }

    public static final <T> b<T> a(a<? extends T> aVar) {
        if (aVar != null) {
            return new n.f(aVar, (Object) null, 2);
        }
        f.a("initializer");
        throw null;
    }

    public static d<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        d.b<f> a2 = d.a(f.class);
        a2.d = 1;
        a2.a((h<f>) new i.c.d.f.c(aVar));
        return a2.a();
    }

    public static final void a(n.k.e eVar, Throwable th) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (th != null) {
            try {
                CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) eVar.get(CoroutineExceptionHandler.c);
                if (coroutineExceptionHandler != null) {
                    coroutineExceptionHandler.handleException(eVar, th);
                } else {
                    t.a(eVar, th);
                }
            } catch (Throwable th2) {
                t.a(eVar, b(th, th2));
            }
        } else {
            f.a("exception");
            throw null;
        }
    }

    public static /* synthetic */ Thread a(boolean z, boolean z2, ClassLoader classLoader, String str, int i2, a aVar, int i3) {
        if ((i3 & 1) != 0) {
            z = true;
        }
        if ((i3 & 2) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            classLoader = null;
        }
        if ((i3 & 8) != 0) {
            str = null;
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if (aVar != null) {
            n.j.a aVar2 = new n.j.a(aVar);
            if (z2) {
                aVar2.setDaemon(true);
            }
            if (i2 > 0) {
                aVar2.setPriority(i2);
            }
            if (str != null) {
                aVar2.setName(str);
            }
            if (classLoader != null) {
                aVar2.setContextClassLoader(classLoader);
            }
            if (z) {
                aVar2.start();
            }
            return aVar2;
        }
        f.a("block");
        throw null;
    }

    public static void a(Context context, String str) {
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        if (context != null) {
            Resources resources = context.getResources();
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.locale = locale;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    public static e0 a(boolean z, boolean z2, boolean z3, String str, boolean z4) {
        List list;
        List list2;
        o.p0.a aVar = new o.p0.a();
        a.C0155a aVar2 = a.C0155a.BODY;
        if (aVar2 != null) {
            aVar.c = aVar2;
            c0.b bVar = new c0.b();
            if (z) {
                bVar.e.add(new b.a.a.j.b());
            }
            if (z3) {
                ArrayList arrayList = new ArrayList();
                for (String bVar2 : new String[]{"sha256/I7Lo+owBZM1cEwMYtuyR+zgbAOq7wm9jkViymnxJRro=", "sha256/fG6/vLLKjvXn3POo1CyG1slGY5jofe96s+O1ZluV17I="}) {
                    arrayList.add(new l.b("fp.swaraksha.gov.in", bVar2));
                }
                for (String bVar3 : new String[]{"sha256/AIqb5OUCgAHcfcFxfVdvawFedHb988CbKxjAKjl7zZ8=", "sha256/AIqb5OUCgAHcfcFxfVdvawFedHb988CbKxjAKjl7zZ8="}) {
                    arrayList.add(new l.b("api.swaraksha.gov.in", bVar3));
                }
                bVar.f5283o = new l(new LinkedHashSet(arrayList), (o.o0.m.c) null);
            }
            bVar.e.add(new b.a.a.j.d());
            if (z4) {
                bVar.f5285q = new b.a.a.j.d();
            }
            if (TextUtils.isEmpty(str)) {
                str = "https://fp.swaraksha.gov.in/";
            }
            a0 a0Var = a0.c;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Objects.requireNonNull(str, "baseUrl == null");
            y c = y.c(str);
            Objects.requireNonNull(c, "baseUrl == null");
            List<String> list3 = c.f5624f;
            if ("".equals(list3.get(list3.size() - 1))) {
                j.a aVar3 = (j.a) Objects.requireNonNull((j.a) Objects.requireNonNull(new c0(bVar), "client == null"), "factory == null");
                arrayList2.add((j.a) Objects.requireNonNull(new q.j0.a.a(new Gson()), "factory == null"));
                Executor executor = z2 ? (Executor) Objects.requireNonNull(Executors.newSingleThreadExecutor(), "executor == null") : null;
                if (aVar3 == null) {
                    aVar3 = new c0(new c0.b());
                }
                j.a aVar4 = aVar3;
                if (executor == null) {
                    executor = a0Var.a();
                }
                Executor executor2 = executor;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                if (a0Var != null) {
                    k kVar = new k(executor2);
                    if (a0Var.a) {
                        list = Arrays.asList(new e.a[]{q.h.a, kVar});
                    } else {
                        list = Collections.singletonList(kVar);
                    }
                    arrayList4.addAll(list);
                    ArrayList arrayList5 = new ArrayList(arrayList2.size() + 1 + (a0Var.a ? 1 : 0));
                    arrayList5.add(new q.c());
                    arrayList5.addAll(arrayList2);
                    if (a0Var.a) {
                        list2 = Collections.singletonList(w.a);
                    } else {
                        list2 = Collections.emptyList();
                    }
                    arrayList5.addAll(list2);
                    e0 e0Var = new e0(aVar4, c, Collections.unmodifiableList(arrayList5), Collections.unmodifiableList(arrayList4), executor2, false);
                    a = e0Var;
                    return e0Var;
                }
                throw null;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + c);
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public static final boolean a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    public static /* synthetic */ int a(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        if (str != null) {
            return (int) a(str, (long) i2, (long) i3, (long) i4);
        }
        f.a("propertyName");
        throw null;
    }

    public static String a(Context context, int i2) {
        String a2 = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", (String) null);
        if (a2 != null) {
            a(context, a2);
        }
        return context.getResources().getString(i2);
    }

    public static final SSLSocketFactory a(CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider) {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, new TrustManager[]{new l.a.a.a.o.e.d(new l.a.a.a.o.e.e(crashlyticsPinningInfoProvider.getKeyStoreStream(), crashlyticsPinningInfoProvider.getKeyStorePassword()), crashlyticsPinningInfoProvider)}, (SecureRandom) null);
        return instance.getSocketFactory();
    }

    public static SpannableStringBuilder a(Context context, int i2, String[] strArr) {
        String str;
        String a2 = b.a.a.k.a.a((Context) CoronaApplication.f5224g, "USER_SELECTED_LANGUAGE_CODE", (String) null);
        if (a2 != null) {
            a(context, a2);
        }
        int length = strArr.length;
        if (length == 1) {
            str = context.getString(i2, new Object[]{strArr[0]});
        } else if (length == 2) {
            str = context.getString(i2, new Object[]{strArr[0], strArr[1]});
        } else if (length != 3) {
            str = context.getString(i2);
        } else {
            str = context.getString(i2, new Object[]{strArr[0], strArr[1], strArr[2]});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : strArr) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, str2.length() + indexOf, 0);
            }
        }
        return spannableStringBuilder;
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static DateFormat a(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else if (i2 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(i.a.a.a.a.b("Unknown DateFormat style: ", i2));
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else if (i3 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(i.a.a.a.a.b("Unknown DateFormat style: ", i3));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static final void a(Throwable th, Throwable th2) {
        if (th == null) {
            f.a("$this$addSuppressed");
            throw null;
        } else if (th2 != null) {
            n.l.b.a.a(th, th2);
        } else {
            f.a("exception");
            throw null;
        }
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static /* synthetic */ long a(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = RecyclerView.FOREVER_NS;
        }
        return a(str, j2, j5, j4);
    }

    public static String a(i.c.f.f fVar) {
        StringBuilder sb = new StringBuilder(fVar.size());
        for (int i2 = 0; i2 < fVar.size(); i2++) {
            byte c = fVar.c(i2);
            if (c == 34) {
                sb.append("\\\"");
            } else if (c == 39) {
                sb.append("\\'");
            } else if (c != 92) {
                switch (c) {
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
                        if (c >= 32 && c <= 126) {
                            sb.append((char) c);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((c >>> 6) & 3) + 48));
                            sb.append((char) (((c >>> 3) & 7) + 48));
                            sb.append((char) ((c & 7) + 48));
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(java.lang.Exception r4, n.k.c<?> r5) {
        /*
            boolean r0 = r5 instanceof q.u
            if (r0 == 0) goto L_0x0013
            r0 = r5
            q.u r0 = (q.u) r0
            int r1 = r0.f5729i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f5729i = r1
            goto L_0x0018
        L_0x0013:
            q.u r0 = new q.u
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f5728h
            n.k.h.a r1 = n.k.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f5729i
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r4 = r0.f5730j
            java.lang.Exception r4 = (java.lang.Exception) r4
            e(r5)
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            e(r5)
            r0.f5730j = r4
            r0.f5729i = r3
            f.a.s r5 = f.a.c0.a
            n.k.e r2 = r0.c()
            q.t r3 = new q.t
            r3.<init>(r0, r4)
            r5.a(r2, r3)
            n.k.h.a r4 = n.k.h.a.COROUTINE_SUSPENDED
            if (r4 != r1) goto L_0x004d
            return r1
        L_0x004d:
            n.h r4 = n.h.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.p.e.a(java.lang.Exception, n.k.c):java.lang.Object");
    }

    public static final <T> Class<T> a(n.o.b<T> bVar) {
        if (bVar != null) {
            Class<?> a2 = ((n.m.c.b) bVar).a();
            if (!a2.isPrimitive()) {
                return a2;
            }
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return name.equals("double") ? Double.class : a2;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    return a2;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    return a2;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    return a2;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    return a2;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    return a2;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    return a2;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    return a2;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    return a2;
                default:
                    return a2;
            }
        } else {
            f.a("$this$javaObjectType");
            throw null;
        }
    }

    public static String a(y yVar) {
        String b2 = yVar.b();
        String d = yVar.d();
        if (d == null) {
            return b2;
        }
        return b2 + '?' + d;
    }

    public static final boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0160, code lost:
        if (((java.lang.Integer) r9).intValue() == 0) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0171, code lost:
        if (((java.lang.Float) r9).floatValue() == 0.0f) goto L_0x01b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0183, code lost:
        if (((java.lang.Double) r9).doubleValue() == 0.0d) goto L_0x01b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i.c.f.o r13, java.lang.StringBuilder r14, int r15) {
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
            if (r3 == 0) goto L_0x01d4
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ""
            java.lang.String r3 = r3.replaceFirst(r7, r4)
            java.lang.String r6 = "List"
            boolean r6 = r3.endsWith(r6)
            r8 = 1
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = "OrBuilderList"
            boolean r6 = r3.endsWith(r6)
            if (r6 != 0) goto L_0x00b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            int r9 = r3.length()
            int r9 = r9 + -4
            java.lang.String r9 = r3.substring(r8, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00b6
            java.lang.String r3 = a((java.lang.String) r6)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = i.c.f.k.a((java.lang.reflect.Method) r9, (java.lang.Object) r13, (java.lang.Object[]) r4)
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r3, (java.lang.Object) r4)
            goto L_0x004d
        L_0x00b6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "set"
            r6.append(r9)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r1.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 != 0) goto L_0x00d1
            goto L_0x004d
        L_0x00d1:
            java.lang.String r6 = "Bytes"
            boolean r6 = r3.endsWith(r6)
            if (r6 == 0) goto L_0x00f6
            java.lang.StringBuilder r6 = i.a.a.a.a.a(r7)
            int r9 = r3.length()
            int r9 = r9 + -5
            java.lang.String r9 = r3.substring(r5, r9)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x00f6
            goto L_0x004d
        L_0x00f6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = r3.substring(r5, r8)
            java.lang.String r9 = r9.toLowerCase()
            r6.append(r9)
            java.lang.String r9 = r3.substring(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.Object r9 = r0.get(r9)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "has"
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r9 == 0) goto L_0x004d
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Object r9 = i.c.f.k.a((java.lang.reflect.Method) r9, (java.lang.Object) r13, (java.lang.Object[]) r10)
            if (r3 != 0) goto L_0x01bd
            boolean r3 = r9 instanceof java.lang.Boolean
            if (r3 == 0) goto L_0x0155
            r3 = r9
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r3 = r3 ^ r8
            goto L_0x01b8
        L_0x0155:
            boolean r3 = r9 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x0163
            r3 = r9
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0163:
            boolean r3 = r9 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0174
            r3 = r9
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0174:
            boolean r3 = r9 instanceof java.lang.Double
            if (r3 == 0) goto L_0x0186
            r3 = r9
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            r10 = 0
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x01b7
            goto L_0x01b5
        L_0x0186:
            boolean r3 = r9 instanceof java.lang.String
            if (r3 == 0) goto L_0x018f
            boolean r3 = r9.equals(r4)
            goto L_0x01b8
        L_0x018f:
            boolean r3 = r9 instanceof i.c.f.f
            if (r3 == 0) goto L_0x019a
            i.c.f.f r3 = i.c.f.f.f4932f
            boolean r3 = r9.equals(r3)
            goto L_0x01b8
        L_0x019a:
            boolean r3 = r9 instanceof i.c.f.o
            if (r3 == 0) goto L_0x01a8
            r3 = r9
            i.c.f.o r3 = (i.c.f.o) r3
            i.c.f.o r3 = r3.d()
            if (r9 != r3) goto L_0x01b7
            goto L_0x01b5
        L_0x01a8:
            boolean r3 = r9 instanceof java.lang.Enum
            if (r3 == 0) goto L_0x01b7
            r3 = r9
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r3 = r3.ordinal()
            if (r3 != 0) goto L_0x01b7
        L_0x01b5:
            r3 = 1
            goto L_0x01b8
        L_0x01b7:
            r3 = 0
        L_0x01b8:
            if (r3 != 0) goto L_0x01bb
            goto L_0x01c9
        L_0x01bb:
            r8 = 0
            goto L_0x01c9
        L_0x01bd:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r3 = i.c.f.k.a((java.lang.reflect.Method) r3, (java.lang.Object) r13, (java.lang.Object[]) r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
        L_0x01c9:
            if (r8 == 0) goto L_0x004d
            java.lang.String r3 = a((java.lang.String) r6)
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r3, (java.lang.Object) r9)
            goto L_0x004d
        L_0x01d4:
            boolean r0 = r13 instanceof i.c.f.k.e
            if (r0 == 0) goto L_0x021b
            r0 = r13
            i.c.f.k$e r0 = (i.c.f.k.e) r0
            i.c.f.j<i.c.f.k$g> r0 = r0.f4954h
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01f1
            i.c.f.m$c r1 = new i.c.f.m$c
            i.c.f.s<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x01fb
        L_0x01f1:
            i.c.f.s<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x01fb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            i.c.f.k$g r2 = (i.c.f.k.g) r2
            if (r2 == 0) goto L_0x0219
            java.lang.Object r0 = r0.getValue()
            java.lang.String r2 = "[0]"
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r2, (java.lang.Object) r0)
            goto L_0x01fb
        L_0x0219:
            r13 = 0
            throw r13
        L_0x021b:
            i.c.f.k r13 = (i.c.f.k) r13
            i.c.f.t r13 = r13.f4949f
            if (r13 == 0) goto L_0x0239
        L_0x0221:
            int r0 = r13.a
            if (r5 >= r0) goto L_0x0239
            int[] r0 = r13.f4978b
            r0 = r0[r5]
            int r0 = r0 >>> 3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.c
            r1 = r1[r5]
            a((java.lang.StringBuilder) r14, (int) r15, (java.lang.String) r0, (java.lang.Object) r1)
            int r5 = r5 + 1
            goto L_0x0221
        L_0x0239:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.p.e.a(i.c.f.o, java.lang.StringBuilder, int):void");
    }

    public static final void a(String str, ExecutorService executorService) {
        Runtime.getRuntime().addShutdownHook(new Thread(new p(str, executorService, 2, TimeUnit.SECONDS), i.a.a.a.a.b("Crashlytics Shutdown Hook for ", str)));
    }

    public static final Object a(Throwable th) {
        if (th != null) {
            return new e.a(th);
        }
        f.a("exception");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> n.k.c<T> a(n.k.c<? super T> r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x002b
            boolean r1 = r2 instanceof n.k.i.a.c
            if (r1 != 0) goto L_0x0008
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            n.k.i.a.c r0 = (n.k.i.a.c) r0
            if (r0 == 0) goto L_0x002a
            n.k.c<java.lang.Object> r2 = r0.f5210f
            if (r2 == 0) goto L_0x0012
            goto L_0x002a
        L_0x0012:
            n.k.e r2 = r0.c()
            n.k.d$a r1 = n.k.d.f5208b
            n.k.e$a r2 = r2.get(r1)
            n.k.d r2 = (n.k.d) r2
            if (r2 == 0) goto L_0x0027
            n.k.c r2 = r2.b(r0)
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r0
        L_0x0028:
            r0.f5210f = r2
        L_0x002a:
            return r2
        L_0x002b:
            java.lang.String r2 = "$this$intercepted"
            n.m.c.f.a((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.p.e.a(n.k.c):n.k.c");
    }

    public static final int a(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new n.n.c(2, 36));
    }

    public static final void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object a2 : (List) obj) {
                a(sb, i2, str, a2);
            }
            return;
        }
        sb.append(10);
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(a(i.c.f.f.a((String) obj)));
            sb.append('\"');
        } else if (obj instanceof i.c.f.f) {
            sb.append(": \"");
            sb.append(a((i.c.f.f) obj));
            sb.append('\"');
        } else if (obj instanceof i.c.f.k) {
            sb.append(" {");
            a((o) (i.c.f.k) obj, sb, i2 + 2);
            sb.append("\n");
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append("}");
        } else {
            sb.append(": ");
            sb.append(obj.toString());
        }
    }

    public static final String a(String str) {
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

    public static /* synthetic */ Object[] a(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        if (objArr == null) {
            f.a("$this$copyInto");
            throw null;
        } else if (objArr2 != null) {
            System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
            return objArr2;
        } else {
            f.a("destination");
            throw null;
        }
    }

    public static final void a(Exception exc) {
        if (exc != null) {
            try {
                Crashlytics.getInstance().core.logException(exc);
            } catch (Exception unused) {
            }
        }
    }
}
