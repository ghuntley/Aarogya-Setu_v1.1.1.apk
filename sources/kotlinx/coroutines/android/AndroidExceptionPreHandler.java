package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlinx.coroutines.CoroutineExceptionHandler;
import n.b;
import n.k.a;
import n.m.c.f;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;

@Keep
/* compiled from: AndroidExceptionPreHandler.kt */
public final class AndroidExceptionPreHandler extends a implements CoroutineExceptionHandler, n.m.b.a<Method> {
    public static final /* synthetic */ e[] $$delegatedProperties;
    public final b preHandler$delegate = i.c.d.p.e.a(this);

    static {
        i iVar = new i(k.a(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        k.a((h) iVar);
        $$delegatedProperties = new e[]{iVar};
    }

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.c);
    }

    private final Method getPreHandler() {
        b bVar = this.preHandler$delegate;
        e eVar = $$delegatedProperties[0];
        return (Method) bVar.getValue();
    }

    public void handleException(n.k.e eVar, Throwable th) {
        Object obj = null;
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (th != null) {
            Thread currentThread = Thread.currentThread();
            if (Build.VERSION.SDK_INT >= 28) {
                f.a((Object) currentThread, "thread");
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                return;
            }
            Method preHandler = getPreHandler();
            Object invoke = preHandler != null ? preHandler.invoke((Object) null, new Object[0]) : null;
            if (invoke instanceof Thread.UncaughtExceptionHandler) {
                obj = invoke;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
            }
        } else {
            f.a("exception");
            throw null;
        }
    }

    public Method invoke() {
        boolean z = false;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            f.a((Object) declaredMethod, "it");
            if (Modifier.isPublic(declaredMethod.getModifiers()) && Modifier.isStatic(declaredMethod.getModifiers())) {
                z = true;
            }
            if (z) {
                return declaredMethod;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
