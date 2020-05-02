package i.b.a.n.o.c;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.m.v;
import i.b.a.n.o.c.r;

/* compiled from: ParcelFileDescriptorBitmapDecoder */
public final class u implements i<ParcelFileDescriptor, Bitmap> {
    public final l a;

    public u(l lVar) {
        this.a = lVar;
    }

    public v a(Object obj, int i2, int i3, g gVar) {
        l lVar = this.a;
        return lVar.a((r) new r.b((ParcelFileDescriptor) obj, lVar.d, lVar.c), i2, i3, gVar, l.f2744k);
    }

    public boolean a(Object obj, g gVar) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        if (this.a != null) {
            return true;
        }
        throw null;
    }
}
