package b.a.a.a;

import android.widget.Button;
import b.a.a.e;
import h.z.a.b;
import n.m.c.f;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.utility.ViewPagerFixed;
import nic.goi.aarogyasetu.views.OnboardingActivity;

/* compiled from: OnboardingActivity.kt */
public final class r0 implements b.i {
    public final /* synthetic */ OnboardingActivity e;

    public r0(OnboardingActivity onboardingActivity) {
        this.e = onboardingActivity;
    }

    public void a(int i2) {
    }

    public void a(int i2, float f2, int i3) {
    }

    public void b(int i2) {
        int i3 = i2 + 1;
        if (i3 == 1) {
            this.e.d(R.color.onboarding_screen_1_bg_color);
        } else if (i3 == 2) {
            this.e.d(R.color.onboarding_screen_2_bg_color);
        } else if (i3 == 3) {
            this.e.d(R.color.onboarding_screen_3_bg_color);
        } else if (i3 == 4) {
            this.e.d(R.color.onboarding_screen_4_bg_color);
        }
        OnboardingActivity onboardingActivity = this.e;
        if (onboardingActivity.u) {
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) onboardingActivity.c(e.pager);
            f.a((Object) viewPagerFixed, "pager");
            if (viewPagerFixed.getCurrentItem() < 3) {
                Button button = (Button) this.e.c(e.close);
                f.a((Object) button, "close");
                button.setVisibility(0);
                return;
            }
            Button button2 = (Button) this.e.c(e.close);
            f.a((Object) button2, "close");
            button2.setVisibility(8);
        }
    }
}
