package i.c.a.b.g.g;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class w5 extends x5<FieldDescriptorType, Object> {
    public w5(int i2) {
        super(i2, (w5) null);
    }

    public final void a() {
        if (!this.f3522h) {
            for (int i2 = 0; i2 < b(); i2++) {
                Map.Entry a = a(i2);
                if (((q3) a.getKey()).d()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((q3) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
