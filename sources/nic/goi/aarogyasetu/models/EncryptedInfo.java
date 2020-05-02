package nic.goi.aarogyasetu.models;

/* compiled from: EncryptedInfo.kt */
public final class EncryptedInfo {
    public String data;
    public byte[] iv;

    public final String getData() {
        return this.data;
    }

    public final byte[] getIv() {
        return this.iv;
    }

    public final void setData(String str) {
        this.data = str;
    }

    public final void setIv(byte[] bArr) {
        this.iv = bArr;
    }
}
