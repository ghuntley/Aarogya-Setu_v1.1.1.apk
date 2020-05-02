package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import i.c.a.b.g.g.i3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class u3<T extends i3> {
    public static final Logger a = Logger.getLogger(zzen.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static String f3473b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static <T extends i3> T a(Class<T> cls) {
        String str;
        Class<u3> cls2 = u3.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(i3.class)) {
            str = f3473b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (i3) cls.cast(((u3) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((u3) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (i3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (i3) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract T a();
}
