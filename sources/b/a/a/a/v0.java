package b.a.a.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.a.a.l.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.l.d.e;
import h.l.d.r;
import i.c.a.c.p.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.models.LanguageDTO;

/* compiled from: SelectLanguageFragment */
public class v0 extends c {
    public b.a.a.f.a n0;
    public Button o0;
    public int p0 = -1;
    public a q0;

    /* compiled from: SelectLanguageFragment */
    public interface a {
        void g();
    }

    public static void a(r rVar, boolean z) {
        v0 v0Var = new v0();
        v0Var.g0 = z;
        Dialog dialog = v0Var.j0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
        if (rVar != null) {
            h.l.d.a aVar = new h.l.d.a(rVar);
            aVar.a(0, v0Var, "LanguageSelection", 1);
            aVar.a();
            return;
        }
        throw null;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void a(View view, Bundle bundle) {
    }

    public void b(Bundle bundle) {
        super.b(bundle);
    }

    public void a(Context context) {
        super.a(context);
        if (context instanceof a) {
            this.q0 = (a) context;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(Dialog dialog, int i2) {
        super.a(dialog, i2);
        View inflate = View.inflate(k(), R.layout.fragment_select_language, (ViewGroup) null);
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(false);
        BottomSheetBehavior.b((View) inflate.getParent()).b((int) (((double) ((e) Objects.requireNonNull(f())).getResources().getDisplayMetrics().heightPixels) * 1.0d));
        this.o0 = (Button) inflate.findViewById(R.id.btn_next);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LanguageDTO("en", "English"));
        arrayList.add(new LanguageDTO("hi", "हिंदी"));
        arrayList.add(new LanguageDTO("gu", "ગુજરાતી"));
        arrayList.add(new LanguageDTO("ka", "ಕನ್ನಡ"));
        arrayList.add(new LanguageDTO("te", "తెలుగు"));
        arrayList.add(new LanguageDTO("od", "ଓଡ଼ିଆ"));
        arrayList.add(new LanguageDTO("ta", "தமிழ்"));
        arrayList.add(new LanguageDTO("ma", "मराठी"));
        arrayList.add(new LanguageDTO("mal", "മലയാളം"));
        arrayList.add(new LanguageDTO("ba", "বাংলা"));
        arrayList.add(new LanguageDTO("pu", "ਪੰਜਾਬੀ"));
        arrayList.add(new LanguageDTO("as", "অসমীয়া"));
        this.o0.setOnClickListener(new g(this, arrayList));
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_select_language);
        k();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        b.a.a.f.a aVar = new b.a.a.f.a(arrayList, new f(this));
        this.n0 = aVar;
        recyclerView.setAdapter(aVar);
        b.a("languageSelectionScreen", (Bundle) null, 2);
    }

    public /* synthetic */ void a(List list, View view) {
        if (this.p0 < 0 || !this.o0.isEnabled()) {
            Toast.makeText(k(), R.string.please_select_a_language_to_proceed, 0).show();
            return;
        }
        b.a.a.k.a.b(k(), "USER_SELECTED_LANGUAGE_CODE", ((LanguageDTO) list.get(this.p0)).getLanguageCode());
        b.a();
        a aVar = this.q0;
        if (aVar != null) {
            aVar.g();
            H();
        }
    }

    public /* synthetic */ void a(int i2, String str) {
        this.p0 = i2;
        this.o0.setEnabled(true);
        this.n0.a.b();
    }
}
