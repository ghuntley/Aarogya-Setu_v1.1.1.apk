package h.s.n;

import android.database.Cursor;
import com.crashlytics.android.answers.SessionEventTransform;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public class c {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a> f2218b;
    public final Set<b> c;
    public final Set<d> d;

    /* compiled from: TableInfo */
    public static class a {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2219b;
        public final int c;
        public final boolean d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final String f2220f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2221g;

        public a(String str, String str2, boolean z, int i2, String str3, int i3) {
            this.a = str;
            this.f2219b = str2;
            this.d = z;
            this.e = i2;
            int i4 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i4 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i4 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i4 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i4;
            this.f2220f = str3;
            this.f2221g = i3;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e != aVar.e || !this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            if (this.f2221g == 1 && aVar.f2221g == 2 && (str3 = this.f2220f) != null && !str3.equals(aVar.f2220f)) {
                return false;
            }
            if (this.f2221g == 2 && aVar.f2221g == 1 && (str2 = aVar.f2220f) != null && !str2.equals(this.f2220f)) {
                return false;
            }
            int i2 = this.f2221g;
            if ((i2 == 0 || i2 != aVar.f2221g || ((str = this.f2220f) == null ? aVar.f2220f == null : str.equals(aVar.f2220f))) && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("Column{name='");
            a2.append(this.a);
            a2.append('\'');
            a2.append(", type='");
            a2.append(this.f2219b);
            a2.append('\'');
            a2.append(", affinity='");
            a2.append(this.c);
            a2.append('\'');
            a2.append(", notNull=");
            a2.append(this.d);
            a2.append(", primaryKeyPosition=");
            a2.append(this.e);
            a2.append(", defaultValue='");
            a2.append(this.f2220f);
            a2.append('\'');
            a2.append('}');
            return a2.toString();
        }
    }

    /* compiled from: TableInfo */
    public static class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f2222b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.f2222b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.f2222b.equals(bVar.f2222b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f2222b.hashCode();
            int hashCode2 = this.c.hashCode();
            int hashCode3 = this.d.hashCode();
            return this.e.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("ForeignKey{referenceTable='");
            a2.append(this.a);
            a2.append('\'');
            a2.append(", onDelete='");
            a2.append(this.f2222b);
            a2.append('\'');
            a2.append(", onUpdate='");
            a2.append(this.c);
            a2.append('\'');
            a2.append(", columnNames=");
            a2.append(this.d);
            a2.append(", referenceColumnNames=");
            a2.append(this.e);
            a2.append('}');
            return a2.toString();
        }
    }

    /* renamed from: h.s.n.c$c  reason: collision with other inner class name */
    /* compiled from: TableInfo */
    public static class C0066c implements Comparable<C0066c> {
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2223f;

        /* renamed from: g  reason: collision with root package name */
        public final String f2224g;

        /* renamed from: h  reason: collision with root package name */
        public final String f2225h;

        public C0066c(int i2, int i3, String str, String str2) {
            this.e = i2;
            this.f2223f = i3;
            this.f2224g = str;
            this.f2225h = str2;
        }

        public int compareTo(Object obj) {
            C0066c cVar = (C0066c) obj;
            int i2 = this.e - cVar.e;
            return i2 == 0 ? this.f2223f - cVar.f2223f : i2;
        }
    }

    /* compiled from: TableInfo */
    public static class d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2226b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.f2226b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f2226b != dVar.f2226b || !this.c.equals(dVar.c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return dVar.a.startsWith("index_");
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int i2;
            if (this.a.startsWith("index_")) {
                i2 = -1184239155;
            } else {
                i2 = this.a.hashCode();
            }
            return this.c.hashCode() + (((i2 * 31) + (this.f2226b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("Index{name='");
            a2.append(this.a);
            a2.append('\'');
            a2.append(", unique=");
            a2.append(this.f2226b);
            a2.append(", columns=");
            a2.append(this.c);
            a2.append('}');
            return a2.toString();
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.a = str;
        this.f2218b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.d = set3;
    }

    public static List<C0066c> a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < count; i2++) {
            cursor.moveToPosition(i2);
            arrayList.add(new C0066c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
            return false;
        }
        Map<String, a> map = this.f2218b;
        if (map == null ? cVar.f2218b != null : !map.equals(cVar.f2218b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? cVar.c != null : !set2.equals(cVar.c)) {
            return false;
        }
        Set<d> set3 = this.d;
        if (set3 == null || (set = cVar.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f2218b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("TableInfo{name='");
        a2.append(this.a);
        a2.append('\'');
        a2.append(", columns=");
        a2.append(this.f2218b);
        a2.append(", foreignKeys=");
        a2.append(this.c);
        a2.append(", indices=");
        a2.append(this.d);
        a2.append('}');
        return a2.toString();
    }

    /* JADX INFO: finally extract failed */
    public static c a(h.v.a.b bVar, String str) {
        int i2;
        int i3;
        List<C0066c> list;
        int i4;
        String str2 = str;
        h.v.a.f.a aVar = (h.v.a.f.a) bVar;
        Cursor b2 = aVar.b(i.a.a.a.a.a("PRAGMA table_info(`", str2, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (b2.getColumnCount() > 0) {
                int columnIndex = b2.getColumnIndex(DefaultAppMeasurementEventListenerRegistrar.NAME);
                int columnIndex2 = b2.getColumnIndex(SessionEventTransform.TYPE_KEY);
                int columnIndex3 = b2.getColumnIndex("notnull");
                int columnIndex4 = b2.getColumnIndex("pk");
                int columnIndex5 = b2.getColumnIndex("dflt_value");
                while (b2.moveToNext()) {
                    String string = b2.getString(columnIndex);
                    int i5 = columnIndex;
                    a aVar2 = r12;
                    a aVar3 = new a(string, b2.getString(columnIndex2), b2.getInt(columnIndex3) != 0, b2.getInt(columnIndex4), b2.getString(columnIndex5), 2);
                    hashMap.put(string, aVar2);
                    columnIndex = i5;
                }
            }
            b2.close();
            HashSet hashSet = new HashSet();
            Cursor b3 = aVar.b("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = b3.getColumnIndex("id");
                int columnIndex7 = b3.getColumnIndex("seq");
                int columnIndex8 = b3.getColumnIndex("table");
                int columnIndex9 = b3.getColumnIndex("on_delete");
                int columnIndex10 = b3.getColumnIndex("on_update");
                List<C0066c> a2 = a(b3);
                int count = b3.getCount();
                int i6 = 0;
                while (i6 < count) {
                    b3.moveToPosition(i6);
                    if (b3.getInt(columnIndex7) != 0) {
                        i2 = columnIndex6;
                        i4 = columnIndex7;
                        list = a2;
                        i3 = count;
                    } else {
                        int i7 = b3.getInt(columnIndex6);
                        i2 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i4 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) a2).iterator();
                        while (it.hasNext()) {
                            List<C0066c> list2 = a2;
                            C0066c cVar = (C0066c) it.next();
                            int i8 = count;
                            if (cVar.e == i7) {
                                arrayList.add(cVar.f2224g);
                                arrayList2.add(cVar.f2225h);
                            }
                            a2 = list2;
                            count = i8;
                        }
                        list = a2;
                        i3 = count;
                        hashSet.add(new b(b3.getString(columnIndex8), b3.getString(columnIndex9), b3.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i6++;
                    columnIndex6 = i2;
                    columnIndex7 = i4;
                    a2 = list;
                    count = i3;
                }
                b3.close();
                Cursor b4 = aVar.b("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = b4.getColumnIndex(DefaultAppMeasurementEventListenerRegistrar.NAME);
                    int columnIndex12 = b4.getColumnIndex("origin");
                    int columnIndex13 = b4.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (b4.moveToNext()) {
                                if ("c".equals(b4.getString(columnIndex12))) {
                                    d a3 = a(aVar, b4.getString(columnIndex11), b4.getInt(columnIndex13) == 1);
                                    if (a3 != null) {
                                        hashSet3.add(a3);
                                    }
                                }
                            }
                            b4.close();
                            hashSet2 = hashSet3;
                            return new c(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new c(str2, hashMap, hashSet, hashSet2);
                } finally {
                    b4.close();
                }
            } catch (Throwable th) {
                b3.close();
                throw th;
            }
        } catch (Throwable th2) {
            b2.close();
            throw th2;
        }
    }

    public static d a(h.v.a.b bVar, String str, boolean z) {
        Cursor b2 = ((h.v.a.f.a) bVar).b(i.a.a.a.a.a("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = b2.getColumnIndex("seqno");
            int columnIndex2 = b2.getColumnIndex("cid");
            int columnIndex3 = b2.getColumnIndex(DefaultAppMeasurementEventListenerRegistrar.NAME);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (b2.moveToNext()) {
                        if (b2.getInt(columnIndex2) >= 0) {
                            int i2 = b2.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i2), b2.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    b2.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            b2.close();
        }
    }
}
