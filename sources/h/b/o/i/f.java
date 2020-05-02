package h.b.o.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import h.b.o.i.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class f extends BaseAdapter {
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public int f1283f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1284g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1285h;

    /* renamed from: i  reason: collision with root package name */
    public final LayoutInflater f1286i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1287j;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f1285h = z;
        this.f1286i = layoutInflater;
        this.e = gVar;
        this.f1287j = i2;
        a();
    }

    public void a() {
        g gVar = this.e;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.a();
            ArrayList<i> arrayList = gVar.f1293j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == iVar) {
                    this.f1283f = i2;
                    return;
                }
            }
        }
        this.f1283f = -1;
    }

    public int getCount() {
        ArrayList<i> arrayList;
        if (this.f1285h) {
            g gVar = this.e;
            gVar.a();
            arrayList = gVar.f1293j;
        } else {
            arrayList = this.e.d();
        }
        if (this.f1283f < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1286i.inflate(this.f1287j, viewGroup, false);
        }
        int i3 = getItem(i2).f1303b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.e.e() && i3 != (i4 >= 0 ? getItem(i4).f1303b : i3));
        n.a aVar = (n.a) view;
        if (this.f1284g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    public i getItem(int i2) {
        ArrayList<i> arrayList;
        if (this.f1285h) {
            g gVar = this.e;
            gVar.a();
            arrayList = gVar.f1293j;
        } else {
            arrayList = this.e.d();
        }
        int i3 = this.f1283f;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayList.get(i2);
    }
}
