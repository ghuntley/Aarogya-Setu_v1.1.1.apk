package b.a.a.m;

import b.a.a.l.h;
import h.o.a0;
import h.o.r;
import nic.goi.aarogyasetu.background.BluetoothScanningService;

/* compiled from: OnBoardingViewModel.kt */
public final class b extends a0 {
    public r<Boolean> c = new r<>(false);
    public r<Boolean> d = new r<>(false);
    public r<Boolean> e = new r<>(false);

    public b() {
        this.c.b(Boolean.valueOf(h.c.a()));
        this.e.b(Boolean.valueOf(!BluetoothScanningService.f5231p));
    }
}
