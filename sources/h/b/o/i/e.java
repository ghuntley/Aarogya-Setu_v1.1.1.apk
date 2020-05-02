package h.b.o.i;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.b.k.g;
import h.b.o.i.m;
import h.b.o.i.n;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class e implements m, AdapterView.OnItemClickListener {
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f1274f;

    /* renamed from: g  reason: collision with root package name */
    public g f1275g;

    /* renamed from: h  reason: collision with root package name */
    public ExpandedMenuView f1276h;

    /* renamed from: i  reason: collision with root package name */
    public int f1277i;

    /* renamed from: j  reason: collision with root package name */
    public int f1278j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1279k;

    /* renamed from: l  reason: collision with root package name */
    public m.a f1280l;

    /* renamed from: m  reason: collision with root package name */
    public a f1281m;

    /* compiled from: ListMenuPresenter */
    public class a extends BaseAdapter {
        public int e = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f1275g;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.a();
                ArrayList<i> arrayList = gVar.f1293j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == iVar) {
                        this.e = i2;
                        return;
                    }
                }
            }
            this.e = -1;
        }

        public int getCount() {
            g gVar = e.this.f1275g;
            gVar.a();
            int size = gVar.f1293j.size() - e.this.f1277i;
            return this.e < 0 ? size : size - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1274f.inflate(eVar.f1279k, viewGroup, false);
            }
            ((n.a) view).a(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        public i getItem(int i2) {
            g gVar = e.this.f1275g;
            gVar.a();
            ArrayList<i> arrayList = gVar.f1293j;
            int i3 = i2 + e.this.f1277i;
            int i4 = this.e;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }
    }

    public e(Context context, int i2) {
        this.f1279k = i2;
        this.e = context;
        this.f1274f = LayoutInflater.from(context);
    }

    public void a(Context context, g gVar) {
        if (this.f1278j != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1278j);
            this.e = contextThemeWrapper;
            this.f1274f = LayoutInflater.from(contextThemeWrapper);
        } else if (this.e != null) {
            this.e = context;
            if (this.f1274f == null) {
                this.f1274f = LayoutInflater.from(context);
            }
        }
        this.f1275g = gVar;
        a aVar = this.f1281m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean a(g gVar, i iVar) {
        return false;
    }

    public boolean b(g gVar, i iVar) {
        return false;
    }

    public boolean c() {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1275g.a((MenuItem) this.f1281m.getItem(i2), (m) this, 0);
    }

    public ListAdapter a() {
        if (this.f1281m == null) {
            this.f1281m = new a();
        }
        return this.f1281m;
    }

    public void a(boolean z) {
        a aVar = this.f1281m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void a(m.a aVar) {
        this.f1280l = aVar;
    }

    public boolean a(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        g gVar = hVar.e;
        g.a aVar = new g.a(gVar.a);
        e eVar = new e(aVar.a.a, h.b.g.abc_list_menu_item_layout);
        hVar.f1302g = eVar;
        eVar.f1280l = hVar;
        g gVar2 = hVar.e;
        gVar2.a((m) eVar, gVar2.a);
        ListAdapter a2 = hVar.f1302g.a();
        AlertController.b bVar = aVar.a;
        bVar.f66q = a2;
        bVar.r = hVar;
        View view = gVar.f1298o;
        if (view != null) {
            bVar.f56g = view;
        } else {
            bVar.d = gVar.f1297n;
            bVar.f55f = gVar.f1296m;
        }
        aVar.a.f65p = hVar;
        g a3 = aVar.a();
        hVar.f1301f = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f1301f.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f1301f.show();
        m.a aVar2 = this.f1280l;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(rVar);
        return true;
    }

    public void a(g gVar, boolean z) {
        m.a aVar = this.f1280l;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }
}
