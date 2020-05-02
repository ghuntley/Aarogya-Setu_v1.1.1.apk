package nic.goi.aarogyasetu.models;

import b.a.a.l.o;
import b.a.a.l.w;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import i.c.e.s.b;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.Date;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class BluetoothData {
    @b("d")
    public String bluetoothMacAddress;
    @b("dist")
    public Integer distance;
    @b("id")
    public int id;
    public double latitude;
    @b("lat")
    public EncryptedInfo latitudeenc;
    public double longitude;
    @b("long")
    public EncryptedInfo longitudeenc;
    @b("ts")
    public Integer timeStamp = Integer.valueOf((int) (new Date().getTime() / ((long) AnswersRetryFilesSender.BACKOFF_MS)));
    @b("tx_power")
    public String txPower;
    @b("tx_power_level")
    public String txPowerLevel;

    public BluetoothData(String str, Integer num, String str2, String str3) {
        this.bluetoothMacAddress = str;
        this.distance = num;
        this.txPower = str2;
        this.txPowerLevel = str3;
        o.a aVar = o.f436b;
    }

    private void setEncLatitute(double d) {
        EncryptedInfo encryptedInfo = new EncryptedInfo();
        try {
            encryptedInfo.setData(w.c.a(String.valueOf(d)));
            encryptedInfo.setIv(w.c.f441b);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | UnrecoverableEntryException | CertificateException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
        }
        this.latitudeenc = encryptedInfo;
    }

    private void setEncLongitude(double d) {
        EncryptedInfo encryptedInfo = new EncryptedInfo();
        try {
            encryptedInfo.setData(w.c.a(String.valueOf(d)));
            encryptedInfo.setIv(w.c.f441b);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | UnrecoverableEntryException | CertificateException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
        }
        this.longitudeenc = encryptedInfo;
    }

    public String getBluetoothMacAddress() {
        return this.bluetoothMacAddress;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public int getId() {
        return this.id;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public EncryptedInfo getLatitudeenc() {
        return this.latitudeenc;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public EncryptedInfo getLongitudeenc() {
        return this.longitudeenc;
    }

    public Integer getTimeStamp() {
        return this.timeStamp;
    }

    public String getTxPower() {
        return this.txPower;
    }

    public String getTxPowerLevel() {
        return this.txPowerLevel;
    }

    public void setBluetoothMacAddress(String str) {
        this.bluetoothMacAddress = str;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setLatitude(double d) {
        setEncLatitute(d);
    }

    public void setLatitudeenc(EncryptedInfo encryptedInfo) {
        this.latitudeenc = encryptedInfo;
    }

    public void setLongitude(double d) {
        setEncLongitude(d);
    }

    public void setLongitudeenc(EncryptedInfo encryptedInfo) {
        this.longitudeenc = encryptedInfo;
    }

    public void setTimeStamp(Integer num) {
        this.timeStamp = num;
    }

    public void setTxPower(String str) {
        this.txPower = str;
    }

    public void setTxPowerLevel(String str) {
        this.txPowerLevel = str;
    }
}
