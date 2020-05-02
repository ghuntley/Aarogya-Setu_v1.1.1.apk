package b.a.a.a;

import android.view.View;
import b.a.a.e;
import n.m.c.f;
import nic.goi.aarogyasetu.utility.ViewPagerFixed;
import nic.goi.aarogyasetu.views.OnboardingActivity;

/* compiled from: OnboardingActivity.kt */
public final class q0 implements View.OnClickListener {
    public final /* synthetic */ OnboardingActivity e;

    public q0(OnboardingActivity onboardingActivity) {
        this.e = onboardingActivity;
    }

    public final void onClick(View view) {
        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) this.e.c(e.pager);
        f.a((Object) viewPagerFixed, "pager");
        if (viewPagerFixed.getCurrentItem() < 3) {
            ViewPagerFixed viewPagerFixed2 = (ViewPagerFixed) this.e.c(e.pager);
            f.a((Object) viewPagerFixed2, "pager");
            ViewPagerFixed viewPagerFixed3 = (ViewPagerFixed) this.e.c(e.pager);
            f.a((Object) viewPagerFixed3, "pager");
            viewPagerFixed2.setCurrentItem(viewPagerFixed3.getCurrentItem() + 1);
        }
    }
}
