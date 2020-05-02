package h.s.n;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.os.CancellationSignal;
import h.s.h;
import h.v.a.e;
import h.v.a.f.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBUtil */
public class b {
    public static Cursor a(h hVar, e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor a = hVar.a(eVar, cancellationSignal);
        if (z && (a instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) a;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i2 = 0; i2 < abstractWindowedCursor.getColumnCount(); i2++) {
                            int type = abstractWindowedCursor.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(abstractWindowedCursor.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(abstractWindowedCursor.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = abstractWindowedCursor.getString(i2);
                            } else if (type == 4) {
                                objArr[i2] = abstractWindowedCursor.getBlob(i2);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return a;
    }

    /* JADX INFO: finally extract failed */
    public static void a(h.v.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        a aVar = (a) bVar;
        Cursor b2 = aVar.b("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (b2.moveToNext()) {
            try {
                arrayList.add(b2.getString(0));
            } catch (Throwable th) {
                b2.close();
                throw th;
            }
        }
        b2.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.e.execSQL(i.a.a.a.a.b("DROP TRIGGER IF EXISTS ", str));
            }
        }
    }

    public static int a(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i2 = allocate.getInt();
                fileChannel.close();
                return i2;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
