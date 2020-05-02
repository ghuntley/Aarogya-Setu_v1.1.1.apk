package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import i.c.a.b.g.g.m2;
import i.c.a.b.g.g.o2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class m2<MessageType extends m2<MessageType, BuilderType>, BuilderType extends o2<MessageType, BuilderType>> implements f5 {
    public int zza = 0;

    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        y3.a(iterable);
        if (iterable instanceof l4) {
            List<?> b2 = ((l4) iterable).b();
            l4 l4Var = (l4) list;
            int size = list.size();
            for (Object next : b2) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(l4Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = l4Var.size() - 1; size2 >= size; size2--) {
                        l4Var.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof u2) {
                    l4Var.a((u2) next);
                } else {
                    l4Var.add((String) next);
                }
            }
        } else if (iterable instanceof q5) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }

    public final u2 c() {
        try {
            a3 c = u2.c(e());
            a(c.a);
            return c.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder("ByteString".length() + name.length() + 62);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] f() {
        try {
            byte[] bArr = new byte[e()];
            zzen a = zzen.a(bArr);
            a(a);
            if (a.a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(10 + name.length() + 62);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
