package l.a.a.a.o.d;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.u;

/* compiled from: GZIPQueueFileEventStorage */
public class g implements c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final File f5149b;
    public final String c;
    public final File d;
    public u e = new u(this.d);

    /* renamed from: f  reason: collision with root package name */
    public File f5150f;

    public g(Context context, File file, String str, String str2) {
        this.a = context;
        this.f5149b = file;
        this.c = str2;
        this.d = new File(this.f5149b, str);
        e();
    }

    public void a(byte[] bArr) {
        u uVar = this.e;
        if (uVar != null) {
            uVar.a(bArr, 0, bArr.length);
            return;
        }
        throw null;
    }

    public void b() {
        try {
            this.e.close();
        } catch (IOException unused) {
        }
        this.d.delete();
    }

    public int c() {
        return this.e.j();
    }

    public boolean d() {
        return this.e.f();
    }

    public final void e() {
        File file = new File(this.f5149b, this.c);
        this.f5150f = file;
        if (!file.exists()) {
            this.f5150f.mkdirs();
        }
    }

    public void a(String str) {
        this.e.close();
        a(this.d, new File(this.f5150f, str));
        this.e = new u(this.d);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.io.OutputStream, java.io.Closeable, java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.File r8, java.io.File r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close output stream"
            java.lang.String r1 = "Failed to close file input stream"
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x002d }
            r3.<init>(r8)     // Catch:{ all -> 0x002d }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0028 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x0028 }
            r5.<init>(r9)     // Catch:{ all -> 0x0028 }
            r4.<init>(r5)     // Catch:{ all -> 0x0028 }
            r9 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x0025 }
            l.a.a.a.o.b.i.a((java.io.InputStream) r3, (java.io.OutputStream) r4, (byte[]) r9)     // Catch:{ all -> 0x0025 }
            l.a.a.a.o.b.i.a((java.io.Closeable) r3, (java.lang.String) r1)
            l.a.a.a.o.b.i.a((java.io.Closeable) r4, (java.lang.String) r0)
            r8.delete()
            return
        L_0x0025:
            r9 = move-exception
            r2 = r4
            goto L_0x0029
        L_0x0028:
            r9 = move-exception
        L_0x0029:
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x002f
        L_0x002d:
            r9 = move-exception
            r3 = r2
        L_0x002f:
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r1)
            l.a.a.a.o.b.i.a((java.io.Closeable) r3, (java.lang.String) r0)
            r8.delete()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.d.g.a(java.io.File, java.io.File):void");
    }

    public List a(int i2) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f5150f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i2) {
                break;
            }
        }
        return arrayList;
    }

    public void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            i.b(this.a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    public List a() {
        return Arrays.asList(this.f5150f.listFiles());
    }

    public boolean a(int i2, int i3) {
        return (this.e.j() + 4) + i2 <= i3;
    }
}
