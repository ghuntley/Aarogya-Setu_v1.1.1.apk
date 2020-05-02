package h.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h.i.a.b;

/* compiled from: CursorAdapter */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1854f;

    /* renamed from: g  reason: collision with root package name */
    public Cursor f1855g;

    /* renamed from: h  reason: collision with root package name */
    public Context f1856h;

    /* renamed from: i  reason: collision with root package name */
    public int f1857i;

    /* renamed from: j  reason: collision with root package name */
    public C0054a f1858j;

    /* renamed from: k  reason: collision with root package name */
    public DataSetObserver f1859k;

    /* renamed from: l  reason: collision with root package name */
    public b f1860l;

    /* renamed from: h.i.a.a$a  reason: collision with other inner class name */
    /* compiled from: CursorAdapter */
    public class C0054a extends ContentObserver {
        public C0054a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f1854f && (cursor = aVar.f1855g) != null && !cursor.isClosed()) {
                aVar.e = aVar.f1855g.requery();
            }
        }
    }

    /* compiled from: CursorAdapter */
    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.e = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        boolean z2 = true;
        char c = z ? (char) 1 : 2;
        if ((c & 1) == 1) {
            c |= 2;
            this.f1854f = true;
        } else {
            this.f1854f = false;
        }
        z2 = cursor == null ? false : z2;
        this.f1855g = cursor;
        this.e = z2;
        this.f1856h = context;
        this.f1857i = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c & 2) == 2) {
            this.f1858j = new C0054a();
            this.f1859k = new b();
        } else {
            this.f1858j = null;
            this.f1859k = null;
        }
        if (z2) {
            C0054a aVar = this.f1858j;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1859k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public void a(Cursor cursor) {
        Cursor cursor2 = this.f1855g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0054a aVar = this.f1858j;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f1859k;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f1855g = cursor;
            if (cursor != null) {
                C0054a aVar2 = this.f1858j;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f1859k;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f1857i = cursor.getColumnIndexOrThrow("_id");
                this.e = true;
                notifyDataSetChanged();
            } else {
                this.f1857i = -1;
                this.e = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence b(Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.e || (cursor = this.f1855g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            return null;
        }
        this.f1855g.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f1863o.inflate(cVar.f1862n, viewGroup, false);
        }
        a(view, this.f1856h, this.f1855g);
        return view;
    }

    public Filter getFilter() {
        if (this.f1860l == null) {
            this.f1860l = new b(this);
        }
        return this.f1860l;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.f1855g) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f1855g;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.e || (cursor = this.f1855g) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f1855g.getLong(this.f1857i);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1855g.moveToPosition(i2)) {
            if (view == null) {
                view = a(this.f1856h, this.f1855g, viewGroup);
            }
            a(view, this.f1856h, this.f1855g);
            return view;
        } else {
            throw new IllegalStateException(i.a.a.a.a.b("couldn't move cursor to position ", i2));
        }
    }
}
