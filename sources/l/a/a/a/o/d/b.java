package l.a.a.a.o.d;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.k;
import l.a.a.a.o.b.v;

/* compiled from: EventsFilesManager */
public abstract class b<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    public final Context context;
    public final k currentTimeProvider;
    public final int defaultMaxFilesToKeep;
    public final c eventStorage;
    public volatile long lastRollOverTime;
    public final List<d> rollOverListeners = new CopyOnWriteArrayList();
    public final a<T> transform;

    /* compiled from: EventsFilesManager */
    public class a implements Comparator<C0148b> {
        public a(b bVar) {
        }

        public int compare(Object obj, Object obj2) {
            return (int) (((C0148b) obj).f5148b - ((C0148b) obj2).f5148b);
        }
    }

    /* renamed from: l.a.a.a.o.d.b$b  reason: collision with other inner class name */
    /* compiled from: EventsFilesManager */
    public static class C0148b {
        public final File a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5148b;

        public C0148b(File file, long j2) {
            this.a = file;
            this.f5148b = j2;
        }
    }

    public b(Context context2, a<T> aVar, k kVar, c cVar, int i2) {
        this.context = context2.getApplicationContext();
        this.transform = aVar;
        this.eventStorage = cVar;
        this.currentTimeProvider = kVar;
        if (((v) kVar) != null) {
            this.lastRollOverTime = System.currentTimeMillis();
            this.defaultMaxFilesToKeep = i2;
            return;
        }
        throw null;
    }

    private void rollFileOverIfNeeded(int i2) {
        if (!this.eventStorage.a(i2, getMaxByteSizePerFile())) {
            i.a(this.context, 4, String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.eventStorage.c()), Integer.valueOf(i2), Integer.valueOf(getMaxByteSizePerFile())}));
            rollFileOver();
        }
    }

    private void triggerRollOverOnListeners(String str) {
        for (d onRollOver : this.rollOverListeners) {
            try {
                onRollOver.onRollOver(str);
            } catch (Exception unused) {
                i.c(this.context, "One of the roll over listeners threw an exception");
            }
        }
    }

    public void deleteAllEventsFiles() {
        c cVar = this.eventStorage;
        cVar.a(cVar.a());
        this.eventStorage.b();
    }

    public void deleteOldestInRollOverIfOverMax() {
        List<File> a2 = this.eventStorage.a();
        int maxFilesToKeep = getMaxFilesToKeep();
        if (a2.size() > maxFilesToKeep) {
            int size = a2.size() - maxFilesToKeep;
            i.b(this.context, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(a2.size()), Integer.valueOf(maxFilesToKeep), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new a(this));
            for (File next : a2) {
                treeSet.add(new C0148b(next, parseCreationTimestampFromFileName(next.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0148b) it.next()).a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.eventStorage.a((List<File>) arrayList);
        }
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.a(list);
    }

    public abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.a(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    public int getMaxByteSizePerFile() {
        return MAX_BYTE_SIZE_PER_FILE;
    }

    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long parseCreationTimestampFromFileName(String str) {
        String[] split = str.split(ROLL_OVER_FILE_NAME_SEPARATOR);
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public void registerRollOverListener(d dVar) {
        if (dVar != null) {
            this.rollOverListeners.add(dVar);
        }
    }

    public boolean rollFileOver() {
        boolean z = true;
        String str = null;
        if (!this.eventStorage.d()) {
            String generateUniqueRollOverFileName = generateUniqueRollOverFileName();
            this.eventStorage.a(generateUniqueRollOverFileName);
            i.a(this.context, 4, String.format(Locale.US, "generated new file %s", new Object[]{generateUniqueRollOverFileName}));
            if (((v) this.currentTimeProvider) != null) {
                this.lastRollOverTime = System.currentTimeMillis();
                str = generateUniqueRollOverFileName;
            } else {
                throw null;
            }
        } else {
            z = false;
        }
        triggerRollOverOnListeners(str);
        return z;
    }

    public void writeEvent(T t) {
        byte[] bytes = this.transform.toBytes(t);
        rollFileOverIfNeeded(bytes.length);
        this.eventStorage.a(bytes);
    }
}
