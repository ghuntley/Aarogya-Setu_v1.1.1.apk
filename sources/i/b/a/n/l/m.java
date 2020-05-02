package i.b.a.n.l;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import i.b.a.n.l.e;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorRewinder */
public final class m implements e<ParcelFileDescriptor> {
    public final b a;

    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class b {
        public final ParcelFileDescriptor a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.a = parcelFileDescriptor;
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new b(parcelFileDescriptor);
    }

    public void b() {
    }

    /* compiled from: ParcelFileDescriptorRewinder */
    public static final class a implements e.a<ParcelFileDescriptor> {
        public e a(Object obj) {
            return new m((ParcelFileDescriptor) obj);
        }

        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }
    }

    public ParcelFileDescriptor a() {
        b bVar = this.a;
        if (bVar != null) {
            try {
                Os.lseek(bVar.a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return bVar.a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } else {
            throw null;
        }
    }
}
