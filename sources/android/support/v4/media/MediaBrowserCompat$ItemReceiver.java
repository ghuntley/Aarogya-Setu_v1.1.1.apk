package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import g.a.a.c.b;

public class MediaBrowserCompat$ItemReceiver extends b {
    public void a(int i2, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        if (i2 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
