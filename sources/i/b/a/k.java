package i.b.a;

import i.b.a.k;
import i.b.a.r.i.a;
import i.b.a.r.i.c;

/* compiled from: TransitionOptions */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public c<? super TranscodeType> e = a.f2857b;

    public final CHILD clone() {
        try {
            return (k) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Object m11clone() {
        try {
            return (k) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
