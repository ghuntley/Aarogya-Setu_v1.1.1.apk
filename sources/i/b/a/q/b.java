package i.b.a.q;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ImageHeaderParserRegistry */
public final class b {
    public final List<ImageHeaderParser> a = new ArrayList();

    public synchronized List<ImageHeaderParser> a() {
        return this.a;
    }

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }
}
