package h.s;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.core.CodedOutputStream;
import h.s.n.a;
import h.s.n.b;
import h.v.a.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* compiled from: SQLiteCopyOpenHelper */
public class k implements c {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2209f;

    /* renamed from: g  reason: collision with root package name */
    public final File f2210g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2211h;

    /* renamed from: i  reason: collision with root package name */
    public final c f2212i;

    /* renamed from: j  reason: collision with root package name */
    public a f2213j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2214k;

    public final void a() {
        String databaseName = this.f2212i.getDatabaseName();
        File databasePath = this.e.getDatabasePath(databaseName);
        a aVar = this.f2213j;
        a aVar2 = new a(databaseName, this.e.getFilesDir(), aVar == null || aVar.f2159j);
        try {
            aVar2.f2217b.lock();
            if (aVar2.c) {
                FileChannel channel = new FileOutputStream(aVar2.a).getChannel();
                aVar2.d = channel;
                channel.lock();
            }
            if (!databasePath.exists()) {
                a(databasePath);
                aVar2.a();
            } else if (this.f2213j == null) {
                aVar2.a();
            } else {
                try {
                    int a = b.a(databasePath);
                    if (a == this.f2211h) {
                        aVar2.a();
                    } else if (this.f2213j.a(a, this.f2211h)) {
                        aVar2.a();
                    } else {
                        if (this.e.deleteDatabase(databaseName)) {
                            try {
                                a(databasePath);
                            } catch (IOException e2) {
                                Log.w("ROOM", "Unable to copy database file.", e2);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                        }
                        aVar2.a();
                    }
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    aVar2.a();
                }
            }
        } catch (IOException e4) {
            throw new RuntimeException("Unable to copy database file.", e4);
        } catch (IOException e5) {
            throw new IllegalStateException("Unable to grab copy lock.", e5);
        } catch (Throwable th) {
            aVar2.a();
            throw th;
        }
    }

    public synchronized void close() {
        this.f2212i.close();
        this.f2214k = false;
    }

    public String getDatabaseName() {
        return this.f2212i.getDatabaseName();
    }

    public synchronized h.v.a.b getWritableDatabase() {
        if (!this.f2214k) {
            a();
            this.f2214k = true;
        }
        return this.f2212i.getWritableDatabase();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f2212i.setWriteAheadLoggingEnabled(z);
    }

    /* JADX INFO: finally extract failed */
    public final void a(File file) {
        ReadableByteChannel readableByteChannel;
        if (this.f2209f != null) {
            readableByteChannel = Channels.newChannel(this.e.getAssets().open(this.f2209f));
        } else if (this.f2210g != null) {
            readableByteChannel = new FileInputStream(this.f2210g).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.e.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream newInputStream = Channels.newInputStream(readableByteChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            } else {
                channel.transferFrom(readableByteChannel, 0, RecyclerView.FOREVER_NS);
            }
            channel.force(false);
            readableByteChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder a = i.a.a.a.a.a("Failed to create directories for ");
                a.append(file.getAbsolutePath());
                throw new IOException(a.toString());
            } else if (!createTempFile.renameTo(file)) {
                StringBuilder a2 = i.a.a.a.a.a("Failed to move intermediate file (");
                a2.append(createTempFile.getAbsolutePath());
                a2.append(") to destination (");
                a2.append(file.getAbsolutePath());
                a2.append(").");
                throw new IOException(a2.toString());
            }
        } catch (Throwable th) {
            readableByteChannel.close();
            channel.close();
            throw th;
        }
    }
}
