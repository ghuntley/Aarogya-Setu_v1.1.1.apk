package i.c.d.k;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import i.a.a.a.a;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class c0 implements Runnable {
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final PowerManager.WakeLock f4683f;

    /* renamed from: g  reason: collision with root package name */
    public final FirebaseInstanceId f4684g;

    /* renamed from: h  reason: collision with root package name */
    public final e0 f4685h;

    public c0(FirebaseInstanceId firebaseInstanceId, e0 e0Var, long j2) {
        this.f4684g = firebaseInstanceId;
        this.f4685h = e0Var;
        this.e = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f4683f = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        FirebaseApp firebaseApp = this.f4684g.f701b;
        firebaseApp.a();
        return firebaseApp.a;
    }

    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean c() {
        d0 a = this.f4684g.a();
        boolean z = true;
        if (!this.f4684g.a(a)) {
            return true;
        }
        try {
            String b2 = this.f4684g.b();
            if (b2 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (a == null || !b2.equals(a.a)) {
                FirebaseApp firebaseApp = this.f4684g.f701b;
                firebaseApp.a();
                if ("[DEFAULT]".equals(firebaseApp.f692b)) {
                    if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        FirebaseApp firebaseApp2 = this.f4684g.f701b;
                        firebaseApp2.a();
                        String valueOf = String.valueOf(firebaseApp2.f692b);
                        Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
                    }
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", b2);
                    Context a2 = a();
                    Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                    intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                    intent2.putExtra("wrapped_intent", intent);
                    a2.sendBroadcast(intent2);
                }
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e2.getMessage();
                StringBuilder sb = new StringBuilder(a.a(message2, 52));
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb.toString());
                return false;
            } else if (e2.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e2;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (a0.a().a(a())) {
            this.f4683f.acquire();
        }
        try {
            boolean z = true;
            this.f4684g.a(true);
            if (this.f4684g.c.a() == 0) {
                z = false;
            }
            if (!z) {
                this.f4684g.a(false);
                if (a0.a().a(a())) {
                    this.f4683f.release();
                }
            } else if (!a0.a().b(a()) || b()) {
                if (!c() || !this.f4685h.a(this.f4684g)) {
                    this.f4684g.a(this.e);
                } else {
                    this.f4684g.a(false);
                }
                if (a0.a().a(a())) {
                    this.f4683f.release();
                }
            } else {
                new f0(this).a();
                if (a0.a().a(a())) {
                    this.f4683f.release();
                }
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f4684g.a(false);
            if (a0.a().a(a())) {
                this.f4683f.release();
            }
        } catch (Throwable th) {
            if (a0.a().a(a())) {
                this.f4683f.release();
            }
            throw th;
        }
    }
}
