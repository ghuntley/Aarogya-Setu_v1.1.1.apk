package androidx.versionedparcelable;

import android.os.Parcelable;
import android.text.TextUtils;
import h.e.a;
import h.y.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class VersionedParcel {
    public final a<String, Method> a;

    /* renamed from: b  reason: collision with root package name */
    public final a<String, Method> f365b;
    public final a<String, Class> c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        this.a = aVar;
        this.f365b = aVar2;
        this.c = aVar3;
    }

    public abstract void a();

    public abstract boolean a(int i2);

    public boolean a(boolean z, int i2) {
        if (!a(i2)) {
            return z;
        }
        return ((h.y.a) this).e.readInt() != 0;
    }

    public abstract VersionedParcel b();

    public abstract void b(int i2);

    public void b(int i2, int i3) {
        b(i3);
        ((h.y.a) this).e.writeInt(i2);
    }

    public <T extends b> T c() {
        String readString = ((h.y.a) this).e.readString();
        if (readString == null) {
            return null;
        }
        VersionedParcel b2 = b();
        try {
            return (b) a(readString).invoke((Object) null, new Object[]{b2});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    public int a(int i2, int i3) {
        if (!a(i3)) {
            return i2;
        }
        return ((h.y.a) this).e.readInt();
    }

    public void b(Parcelable parcelable, int i2) {
        b(i2);
        ((h.y.a) this).e.writeParcelable(parcelable, 0);
    }

    public <T extends Parcelable> T a(T t, int i2) {
        if (!a(i2)) {
            return t;
        }
        return ((h.y.a) this).e.readParcelable(h.y.a.class.getClassLoader());
    }

    public final Method b(Class cls) {
        Method orDefault = this.f365b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class a2 = a((Class<? extends b>) cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", new Class[]{cls, VersionedParcel.class});
        this.f365b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public CharSequence a(CharSequence charSequence, int i2) {
        if (!a(i2)) {
            return charSequence;
        }
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((h.y.a) this).e);
    }

    public void a(b bVar) {
        if (bVar == null) {
            ((h.y.a) this).e.writeString((String) null);
            return;
        }
        try {
            ((h.y.a) this).e.writeString(a((Class<? extends b>) bVar.getClass()).getName());
            VersionedParcel b2 = b();
            try {
                b((Class) bVar.getClass()).invoke((Object) null, new Object[]{bVar, b2});
                b2.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(bVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    public final Method a(String str) {
        Class<VersionedParcel> cls = VersionedParcel.class;
        Method orDefault = this.a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Class a(Class<? extends b> cls) {
        Class orDefault = this.c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls2);
        return cls2;
    }
}
