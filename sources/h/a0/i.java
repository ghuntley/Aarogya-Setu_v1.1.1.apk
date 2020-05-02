package h.a0;

import i.a.a.a.a;
import java.util.List;

/* compiled from: InputMerger */
public abstract class i {
    public static final String a = l.a("InputMerger");

    public static i a(String str) {
        try {
            return (i) Class.forName(str).newInstance();
        } catch (Exception e) {
            l.a().b(a, a.b("Trouble instantiating + ", str), e);
            return null;
        }
    }

    public abstract e a(List<e> list);
}
