package h.b.p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import h.b.o.i.f;
import h.b.o.i.g;
import h.b.o.i.i;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow */
public class m0 extends k0 implements l0 {
    public static Method K;
    public l0 J;

    /* compiled from: MenuPopupWindow */
    public static class a extends f0 {
        public final int s;
        public final int t;
        public l0 u;
        public MenuItem v;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.s = 21;
                this.t = 22;
                return;
            }
            this.s = 22;
            this.t = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            f fVar;
            int pointToPosition;
            int i3;
            if (this.u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    fVar = (f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    fVar = (f) adapter;
                }
                i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.v;
                if (menuItem != iVar) {
                    g gVar = fVar.e;
                    if (menuItem != null) {
                        this.u.b(gVar, menuItem);
                    }
                    this.v = iVar;
                    if (iVar != null) {
                        this.u.a(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.t) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ((f) getAdapter()).e.a(false);
                return true;
            }
        }

        public void setHoverListener(l0 l0Var) {
            this.u = l0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public f0 a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    public void b(g gVar, MenuItem menuItem) {
        l0 l0Var = this.J;
        if (l0Var != null) {
            l0Var.b(gVar, menuItem);
        }
    }

    public void a(g gVar, MenuItem menuItem) {
        l0 l0Var = this.J;
        if (l0Var != null) {
            l0Var.a(gVar, menuItem);
        }
    }
}
