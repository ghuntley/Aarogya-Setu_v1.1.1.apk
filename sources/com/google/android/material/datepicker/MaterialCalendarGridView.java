package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import h.h.m.w.b;
import i.c.a.b.d.l.q;
import i.c.a.c.f;
import i.c.a.c.v.c;
import i.c.a.c.v.d;
import i.c.a.c.v.m;
import i.c.a.c.v.o;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar e;

    public class a extends h.h.m.a {
        public a(MaterialCalendarGridView materialCalendarGridView) {
        }

        public void a(View view, b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        o adapter = getAdapter();
        d<?> dVar = adapter.f4233f;
        c cVar = adapter.f4234g;
        Long item = adapter.getItem(adapter.a());
        Long item2 = adapter.getItem(adapter.b());
        for (h.h.l.b next : dVar.j()) {
            F f2 = next.a;
            if (f2 != null) {
                if (next.f1808b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f2).longValue();
                    long longValue2 = ((Long) next.f1808b).longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    int i6 = 1;
                    if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                        if (longValue < item.longValue()) {
                            i3 = adapter.a();
                            if (i3 % adapter.e.f4230i == 0) {
                                i2 = 0;
                            } else {
                                i2 = materialCalendarGridView.getChildAt(i3 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.e.setTimeInMillis(longValue);
                            i3 = (materialCalendarGridView.e.get(5) - 1) + adapter.a();
                            View childAt = materialCalendarGridView.getChildAt(i3);
                            i2 = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            i5 = adapter.b();
                            if ((i5 + 1) % adapter.e.f4230i == 0) {
                                i4 = getWidth();
                            } else {
                                i4 = materialCalendarGridView.getChildAt(i5).getRight();
                            }
                        } else {
                            materialCalendarGridView.e.setTimeInMillis(longValue2);
                            i5 = (materialCalendarGridView.e.get(5) - 1) + adapter.a();
                            View childAt2 = materialCalendarGridView.getChildAt(i5);
                            i4 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) adapter.getItemId(i3);
                        int itemId2 = (int) adapter.getItemId(i5);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - i6;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i3 ? 0 : i2), (float) (childAt3.getTop() + cVar.a.a.top), (float) (i5 > numColumns2 ? getWidth() : i4), (float) (childAt3.getBottom() - cVar.a.a.bottom), cVar.f4216h);
                            itemId++;
                            i6 = 1;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i2, rect);
        } else if (i2 == 33) {
            setSelection(getAdapter().b());
        } else if (i2 == 130) {
            setSelection(getAdapter().a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().a());
        return true;
    }

    public void setSelection(int i2) {
        if (i2 < getAdapter().a()) {
            super.setSelection(getAdapter().a());
        } else {
            super.setSelection(i2);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof o) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = q.d();
        if (m.b(getContext())) {
            setNextFocusLeftId(f.cancel_button);
            setNextFocusRightId(f.confirm_button);
        }
        h.h.m.m.a((View) this, (h.h.m.a) new a(this));
    }

    public o getAdapter() {
        return (o) super.getAdapter();
    }
}
