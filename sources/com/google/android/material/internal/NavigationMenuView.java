package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.b.o.i.g;
import h.b.o.i.n;

public class NavigationMenuView extends RecyclerView implements n {
    public NavigationMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a(g gVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setLayoutManager(new LinearLayoutManager(1, false));
    }
}
