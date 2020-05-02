package b.a.a.f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.models.LanguageDTO;

/* compiled from: SelectLanguageAdapter */
public class a extends RecyclerView.g<b> {
    public final C0006a c;
    public int d = -1;
    public List<LanguageDTO> e;

    /* renamed from: b.a.a.f.a$a  reason: collision with other inner class name */
    /* compiled from: SelectLanguageAdapter */
    public interface C0006a {
        void a(int i2, String str);
    }

    /* compiled from: SelectLanguageAdapter */
    public class b extends RecyclerView.d0 implements View.OnClickListener {
        public TextView x;
        public View y;

        public b(View view) {
            super(view);
            this.x = (TextView) view.findViewById(R.id.tv_language);
            this.y = view.findViewById(R.id.divider);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int d = d();
            a aVar = a.this;
            if (aVar.c != null && d != -1 && d < aVar.e.size()) {
                a aVar2 = a.this;
                aVar2.d = d;
                aVar2.c.a(d, aVar2.e.get(d).getLanguageTitle());
            }
        }
    }

    public a(List<LanguageDTO> list, C0006a aVar) {
        this.e = list;
        this.c = aVar;
    }

    public void a(RecyclerView.d0 d0Var, int i2) {
        int i3;
        b bVar = (b) d0Var;
        bVar.x.setText(this.e.get(i2).getLanguageTitle());
        TextView textView = bVar.x;
        if (i2 == this.d) {
            i3 = h.h.f.a.a(bVar.e.getContext(), (int) R.color.blue);
        } else {
            i3 = h.h.f.a.a(bVar.e.getContext(), (int) R.color.black);
        }
        textView.setTextColor(i3);
        if (i2 == this.e.size() - 1) {
            bVar.y.setVisibility(8);
        } else {
            bVar.y.setVisibility(0);
        }
    }

    public RecyclerView.d0 a(ViewGroup viewGroup, int i2) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_language, viewGroup, false));
    }

    public int a() {
        List<LanguageDTO> list = this.e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
