package q;

import java.lang.reflect.Array;
import javax.annotation.Nullable;

/* compiled from: ParameterHandler */
public class y extends z<Object> {
    public final /* synthetic */ z a;

    public y(z zVar) {
        this.a = zVar;
    }

    public void a(b0 b0Var, @Nullable Object obj) {
        if (obj != null) {
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                this.a.a(b0Var, Array.get(obj, i2));
            }
        }
    }
}
