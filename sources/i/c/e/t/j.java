package i.c.e.t;

import com.google.gson.JsonIOException;
import i.a.a.a.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* compiled from: ConstructorConstructor */
public class j implements s<T> {
    public final /* synthetic */ Type a;

    public j(g gVar, Type type) {
        this.a = type;
    }

    public T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            StringBuilder a2 = a.a("Invalid EnumSet type: ");
            a2.append(this.a.toString());
            throw new JsonIOException(a2.toString());
        }
        StringBuilder a3 = a.a("Invalid EnumSet type: ");
        a3.append(this.a.toString());
        throw new JsonIOException(a3.toString());
    }
}
