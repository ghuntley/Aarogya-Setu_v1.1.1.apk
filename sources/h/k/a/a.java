package h.k.a;

import android.content.res.AssetManager;
import android.util.Log;
import com.crashlytics.android.answers.BackgroundManager;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: ExifInterface */
public class a {
    public static final c A = new c("StripOffsets", 273, 3);
    public static final c[] B = {new c("ThumbnailImage", 256, 7), new c("CameraSettingsIFDPointer", 8224, 4), new c("ImageProcessingIFDPointer", 8256, 4)};
    public static final c[] C = {new c("PreviewImageStart", 257, 4), new c("PreviewImageLength", 258, 4)};
    public static final c[] D = {new c("AspectFrame", 4371, 3)};
    public static final c[] E;
    public static final c[][] F;
    public static final c[] G = {new c("SubIFDPointer", 330, 4), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("InteroperabilityIFDPointer", 40965, 4), new c("CameraSettingsIFDPointer", 8224, 1), new c("ImageProcessingIFDPointer", 8256, 1)};
    public static final HashMap<Integer, c>[] H;
    public static final HashMap<String, c>[] I;
    public static final HashSet<String> J = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
    public static final HashMap<Integer, Integer> K = new HashMap<>();
    public static final Charset L;
    public static final byte[] M;

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f1893m = {8, 8, 8};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f1894n = {8};

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f1895o = {-1, -40, -1};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f1896p = {79, 76, 89, 77, 80, 0};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f1897q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static SimpleDateFormat r;
    public static final String[] s = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
    public static final int[] t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] u = {65, 83, 67, 73, 73, 0, 0, 0};
    public static final c[] v = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ImageWidth", 256, 3, 4), new c("ImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("SensorTopBorder", 4, 4), new c("SensorLeftBorder", 5, 4), new c("SensorBottomBorder", 6, 4), new c("SensorRightBorder", 7, 4), new c("ISO", 23, 3), new c("JpgFromRaw", 46, 7)};
    public static final c[] w = {new c("ExposureTime", 33434, 5), new c("FNumber", 33437, 5), new c("ExposureProgram", 34850, 3), new c("SpectralSensitivity", 34852, 2), new c("PhotographicSensitivity", 34855, 3), new c("OECF", 34856, 7), new c("ExifVersion", 36864, 2), new c("DateTimeOriginal", 36867, 2), new c("DateTimeDigitized", 36868, 2), new c("ComponentsConfiguration", 37121, 7), new c("CompressedBitsPerPixel", 37122, 5), new c("ShutterSpeedValue", 37377, 10), new c("ApertureValue", 37378, 5), new c("BrightnessValue", 37379, 10), new c("ExposureBiasValue", 37380, 10), new c("MaxApertureValue", 37381, 5), new c("SubjectDistance", 37382, 5), new c("MeteringMode", 37383, 3), new c("LightSource", 37384, 3), new c("Flash", 37385, 3), new c("FocalLength", 37386, 5), new c("SubjectArea", 37396, 3), new c("MakerNote", 37500, 7), new c("UserComment", 37510, 7), new c("SubSecTime", 37520, 2), new c("SubSecTimeOriginal", 37521, 2), new c("SubSecTimeDigitized", 37522, 2), new c("FlashpixVersion", 40960, 7), new c("ColorSpace", 40961, 3), new c("PixelXDimension", 40962, 3, 4), new c("PixelYDimension", 40963, 3, 4), new c("RelatedSoundFile", 40964, 2), new c("InteroperabilityIFDPointer", 40965, 4), new c("FlashEnergy", 41483, 5), new c("SpatialFrequencyResponse", 41484, 7), new c("FocalPlaneXResolution", 41486, 5), new c("FocalPlaneYResolution", 41487, 5), new c("FocalPlaneResolutionUnit", 41488, 3), new c("SubjectLocation", 41492, 3), new c("ExposureIndex", 41493, 5), new c("SensingMethod", 41495, 3), new c("FileSource", 41728, 7), new c("SceneType", 41729, 7), new c("CFAPattern", 41730, 7), new c("CustomRendered", 41985, 3), new c("ExposureMode", 41986, 3), new c("WhiteBalance", 41987, 3), new c("DigitalZoomRatio", 41988, 5), new c("FocalLengthIn35mmFilm", 41989, 3), new c("SceneCaptureType", 41990, 3), new c("GainControl", 41991, 3), new c("Contrast", 41992, 3), new c("Saturation", 41993, 3), new c("Sharpness", 41994, 3), new c("DeviceSettingDescription", 41995, 7), new c("SubjectDistanceRange", 41996, 3), new c("ImageUniqueID", 42016, 2), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    public static final c[] x = {new c("GPSVersionID", 0, 1), new c("GPSLatitudeRef", 1, 2), new c("GPSLatitude", 2, 5), new c("GPSLongitudeRef", 3, 2), new c("GPSLongitude", 4, 5), new c("GPSAltitudeRef", 5, 1), new c("GPSAltitude", 6, 5), new c("GPSTimeStamp", 7, 5), new c("GPSSatellites", 8, 2), new c("GPSStatus", 9, 2), new c("GPSMeasureMode", 10, 2), new c("GPSDOP", 11, 5), new c("GPSSpeedRef", 12, 2), new c("GPSSpeed", 13, 5), new c("GPSTrackRef", 14, 2), new c("GPSTrack", 15, 5), new c("GPSImgDirectionRef", 16, 2), new c("GPSImgDirection", 17, 5), new c("GPSMapDatum", 18, 2), new c("GPSDestLatitudeRef", 19, 2), new c("GPSDestLatitude", 20, 5), new c("GPSDestLongitudeRef", 21, 2), new c("GPSDestLongitude", 22, 5), new c("GPSDestBearingRef", 23, 2), new c("GPSDestBearing", 24, 5), new c("GPSDestDistanceRef", 25, 2), new c("GPSDestDistance", 26, 5), new c("GPSProcessingMethod", 27, 7), new c("GPSAreaInformation", 28, 7), new c("GPSDateStamp", 29, 2), new c("GPSDifferential", 30, 3)};
    public static final c[] y = {new c("InteroperabilityIndex", 1, 2)};
    public static final c[] z = {new c("NewSubfileType", 254, 4), new c("SubfileType", 255, 4), new c("ThumbnailImageWidth", 256, 3, 4), new c("ThumbnailImageLength", 257, 3, 4), new c("BitsPerSample", 258, 3), new c("Compression", 259, 3), new c("PhotometricInterpretation", 262, 3), new c("ImageDescription", 270, 2), new c("Make", 271, 2), new c("Model", 272, 2), new c("StripOffsets", 273, 3, 4), new c("Orientation", 274, 3), new c("SamplesPerPixel", 277, 3), new c("RowsPerStrip", 278, 3, 4), new c("StripByteCounts", 279, 3, 4), new c("XResolution", 282, 5), new c("YResolution", 283, 5), new c("PlanarConfiguration", 284, 3), new c("ResolutionUnit", 296, 3), new c("TransferFunction", 301, 3), new c("Software", 305, 2), new c("DateTime", 306, 2), new c("Artist", 315, 2), new c("WhitePoint", 318, 5), new c("PrimaryChromaticities", 319, 5), new c("SubIFDPointer", 330, 4), new c("JPEGInterchangeFormat", 513, 4), new c("JPEGInterchangeFormatLength", 514, 4), new c("YCbCrCoefficients", 529, 5), new c("YCbCrSubSampling", 530, 3), new c("YCbCrPositioning", 531, 3), new c("ReferenceBlackWhite", 532, 5), new c("Copyright", 33432, 2), new c("ExifIFDPointer", 34665, 4), new c("GPSInfoIFDPointer", 34853, 4), new c("DNGVersion", 50706, 1), new c("DefaultCropSize", 50720, 3, 4)};
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f1898b;
    public int c;
    public final HashMap<String, b>[] d = new HashMap[F.length];
    public Set<Integer> e = new HashSet(F.length);

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f1899f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g  reason: collision with root package name */
    public int f1900g;

    /* renamed from: h  reason: collision with root package name */
    public int f1901h;

    /* renamed from: i  reason: collision with root package name */
    public int f1902i;

    /* renamed from: j  reason: collision with root package name */
    public int f1903j;

    /* renamed from: k  reason: collision with root package name */
    public int f1904k;

    /* renamed from: l  reason: collision with root package name */
    public int f1905l;

    /* compiled from: ExifInterface */
    public static class d {
        public final long a;

        /* renamed from: b  reason: collision with root package name */
        public final long f1913b;

        public d(long j2, long j3) {
            if (j3 == 0) {
                this.a = 0;
                this.f1913b = 1;
                return;
            }
            this.a = j2;
            this.f1913b = j3;
        }

        public String toString() {
            return this.a + "/" + this.f1913b;
        }
    }

    static {
        Arrays.asList(new Integer[]{1, 6, 3, 8});
        Arrays.asList(new Integer[]{2, 7, 4, 5});
        c[] cVarArr = {new c("ColorSpace", 55, 3)};
        E = cVarArr;
        c[] cVarArr2 = v;
        F = new c[][]{cVarArr2, w, x, y, z, cVarArr2, B, C, D, cVarArr};
        c[][] cVarArr3 = F;
        H = new HashMap[cVarArr3.length];
        I = new HashMap[cVarArr3.length];
        Charset forName = Charset.forName("US-ASCII");
        L = forName;
        M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i2 = 0; i2 < F.length; i2++) {
            H[i2] = new HashMap<>();
            I[i2] = new HashMap<>();
            for (c cVar : F[i2]) {
                H[i2].put(Integer.valueOf(cVar.a), cVar);
                I[i2].put(cVar.f1912b, cVar);
            }
        }
        K.put(Integer.valueOf(G[0].a), 5);
        K.put(Integer.valueOf(G[1].a), 1);
        K.put(Integer.valueOf(G[2].a), 2);
        K.put(Integer.valueOf(G[3].a), 3);
        K.put(Integer.valueOf(G[4].a), 7);
        K.put(Integer.valueOf(G[5].a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public a(InputStream inputStream) {
        if (inputStream != null) {
            this.a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f1898b = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f1898b = null;
            }
            int i2 = 0;
            while (i2 < F.length) {
                try {
                    this.d[i2] = new HashMap<>();
                    i2++;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, BackgroundManager.BACKGROUND_DELAY);
            this.c = a(bufferedInputStream);
            C0057a aVar = new C0057a((InputStream) bufferedInputStream);
            switch (this.c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    c(aVar);
                    break;
                case 4:
                    a(aVar, 0, 0);
                    break;
                case 7:
                    a(aVar);
                    break;
                case 9:
                    b(aVar);
                    break;
                case 10:
                    d(aVar);
                    break;
            }
            f(aVar);
            a();
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    public String a(String str) {
        b b2 = b(str);
        if (b2 != null) {
            if (!J.contains(str)) {
                return b2.c(this.f1899f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = b2.a;
                if (i2 == 5 || i2 == 10) {
                    d[] dVarArr = (d[]) b2.d(this.f1899f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder a2 = i.a.a.a.a.a("Invalid GPS Timestamp array. array=");
                        a2.append(Arrays.toString(dVarArr));
                        Log.w("ExifInterface", a2.toString());
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].a) / ((float) dVarArr[0].f1913b))), Integer.valueOf((int) (((float) dVarArr[1].a) / ((float) dVarArr[1].f1913b))), Integer.valueOf((int) (((float) dVarArr[2].a) / ((float) dVarArr[2].f1913b)))});
                }
                StringBuilder a3 = i.a.a.a.a.a("GPS Timestamp format is not rational. format=");
                a3.append(b2.a);
                Log.w("ExifInterface", a3.toString());
                return null;
            }
            try {
                return Double.toString(b2.a(this.f1899f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final b b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < F.length; i2++) {
            b bVar = this.d[i2].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    public final void c(C0057a aVar) {
        b bVar;
        a(aVar, aVar.available());
        b(aVar, 0);
        c(aVar, 0);
        c(aVar, 5);
        c(aVar, 4);
        a(0, 5);
        a(0, 4);
        a(5, 4);
        b bVar2 = this.d[1].get("PixelXDimension");
        b bVar3 = this.d[1].get("PixelYDimension");
        if (!(bVar2 == null || bVar3 == null)) {
            this.d[0].put("ImageWidth", bVar2);
            this.d[0].put("ImageLength", bVar3);
        }
        if (this.d[4].isEmpty() && a((HashMap) this.d[5])) {
            HashMap<String, b>[] hashMapArr = this.d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!a((HashMap) this.d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        if (this.c == 8 && (bVar = this.d[1].get("MakerNote")) != null) {
            C0057a aVar2 = new C0057a(bVar.c);
            aVar2.f1908f = this.f1899f;
            aVar2.e(6);
            b(aVar2, 9);
            b bVar4 = this.d[9].get("ColorSpace");
            if (bVar4 != null) {
                this.d[1].put("ColorSpace", bVar4);
            }
        }
    }

    public final void d(C0057a aVar) {
        c(aVar);
        if (this.d[0].get("JpgFromRaw") != null) {
            a(aVar, this.f1905l, 5);
        }
        b bVar = this.d[0].get("ISO");
        b bVar2 = this.d[1].get("PhotographicSensitivity");
        if (bVar != null && bVar2 == null) {
            this.d[1].put("PhotographicSensitivity", bVar);
        }
    }

    public final ByteOrder e(C0057a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder a2 = i.a.a.a.a.a("Invalid byte order: ");
        a2.append(Integer.toHexString(readShort));
        throw new IOException(a2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (java.util.Arrays.equals(r1, f1894n) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (java.util.Arrays.equals(r1, f1893m) != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(h.k.a.a.C0057a r13) {
        /*
            r12 = this;
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r0 = r12.d
            r1 = 4
            r0 = r0[r1]
            java.lang.String r1 = "Compression"
            java.lang.Object r1 = r0.get(r1)
            h.k.a.a$b r1 = (h.k.a.a.b) r1
            r2 = 6
            if (r1 == 0) goto L_0x00df
            java.nio.ByteOrder r3 = r12.f1899f
            int r1 = r1.b(r3)
            r12.f1900g = r1
            r3 = 1
            if (r1 == r3) goto L_0x0027
            if (r1 == r2) goto L_0x0022
            r4 = 7
            if (r1 == r4) goto L_0x0027
            goto L_0x00e4
        L_0x0022:
            r12.a((h.k.a.a.C0057a) r13, (java.util.HashMap) r0)
            goto L_0x00e4
        L_0x0027:
            java.lang.String r1 = "BitsPerSample"
            java.lang.Object r1 = r0.get(r1)
            h.k.a.a$b r1 = (h.k.a.a.b) r1
            r4 = 0
            if (r1 == 0) goto L_0x006d
            java.nio.ByteOrder r5 = r12.f1899f
            java.lang.Object r1 = r1.d(r5)
            int[] r1 = (int[]) r1
            int[] r5 = f1893m
            boolean r5 = java.util.Arrays.equals(r5, r1)
            if (r5 == 0) goto L_0x0043
            goto L_0x006e
        L_0x0043:
            int r5 = r12.c
            r6 = 3
            if (r5 != r6) goto L_0x006d
            java.lang.String r5 = "PhotometricInterpretation"
            java.lang.Object r5 = r0.get(r5)
            h.k.a.a$b r5 = (h.k.a.a.b) r5
            if (r5 == 0) goto L_0x006d
            java.nio.ByteOrder r6 = r12.f1899f
            int r5 = r5.b(r6)
            if (r5 != r3) goto L_0x0062
            int[] r6 = f1894n
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 != 0) goto L_0x006e
        L_0x0062:
            if (r5 != r2) goto L_0x006d
            int[] r2 = f1893m
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 == 0) goto L_0x00e4
            java.lang.String r1 = "StripOffsets"
            java.lang.Object r1 = r0.get(r1)
            h.k.a.a$b r1 = (h.k.a.a.b) r1
            java.lang.String r2 = "StripByteCounts"
            java.lang.Object r0 = r0.get(r2)
            h.k.a.a$b r0 = (h.k.a.a.b) r0
            if (r1 == 0) goto L_0x00e4
            if (r0 == 0) goto L_0x00e4
            java.nio.ByteOrder r2 = r12.f1899f
            java.lang.Object r1 = r1.d(r2)
            long[] r1 = a((java.lang.Object) r1)
            java.nio.ByteOrder r2 = r12.f1899f
            java.lang.Object r0 = r0.d(r2)
            long[] r0 = a((java.lang.Object) r0)
            java.lang.String r2 = "ExifInterface"
            if (r1 != 0) goto L_0x00a2
            java.lang.String r13 = "stripOffsets should not be null."
            android.util.Log.w(r2, r13)
            goto L_0x00e4
        L_0x00a2:
            if (r0 != 0) goto L_0x00aa
            java.lang.String r13 = "stripByteCounts should not be null."
            android.util.Log.w(r2, r13)
            goto L_0x00e4
        L_0x00aa:
            r5 = 0
            int r3 = r0.length
            r7 = 0
        L_0x00ae:
            if (r7 >= r3) goto L_0x00b6
            r8 = r0[r7]
            long r5 = r5 + r8
            int r7 = r7 + 1
            goto L_0x00ae
        L_0x00b6:
            int r3 = (int) r5
            byte[] r3 = new byte[r3]
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x00bc:
            int r8 = r1.length
            if (r5 >= r8) goto L_0x00e4
            r8 = r1[r5]
            int r9 = (int) r8
            r10 = r0[r5]
            int r8 = (int) r10
            int r9 = r9 - r6
            if (r9 >= 0) goto L_0x00cd
            java.lang.String r10 = "Invalid strip offset value"
            android.util.Log.d(r2, r10)
        L_0x00cd:
            long r10 = (long) r9
            r13.e(r10)
            int r6 = r6 + r9
            byte[] r9 = new byte[r8]
            r13.read(r9)
            int r6 = r6 + r8
            java.lang.System.arraycopy(r9, r4, r3, r7, r8)
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00df:
            r12.f1900g = r2
            r12.a((h.k.a.a.C0057a) r13, (java.util.HashMap) r0)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.k.a.a.f(h.k.a.a$a):void");
    }

    /* renamed from: h.k.a.a$a  reason: collision with other inner class name */
    /* compiled from: ExifInterface */
    public static class C0057a extends InputStream implements DataInput {

        /* renamed from: i  reason: collision with root package name */
        public static final ByteOrder f1906i = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: j  reason: collision with root package name */
        public static final ByteOrder f1907j = ByteOrder.BIG_ENDIAN;
        public DataInputStream e;

        /* renamed from: f  reason: collision with root package name */
        public ByteOrder f1908f;

        /* renamed from: g  reason: collision with root package name */
        public final int f1909g;

        /* renamed from: h  reason: collision with root package name */
        public int f1910h;

        public C0057a(InputStream inputStream) {
            this.f1908f = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.e = dataInputStream;
            int available = dataInputStream.available();
            this.f1909g = available;
            this.f1910h = 0;
            this.e.mark(available);
        }

        public long a() {
            return ((long) readInt()) & 4294967295L;
        }

        public int available() {
            return this.e.available();
        }

        public void e(long j2) {
            int i2 = this.f1910h;
            if (((long) i2) > j2) {
                this.f1910h = 0;
                this.e.reset();
                this.e.mark(this.f1909g);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() {
            this.f1910h++;
            return this.e.read();
        }

        public boolean readBoolean() {
            this.f1910h++;
            return this.e.readBoolean();
        }

        public byte readByte() {
            int i2 = this.f1910h + 1;
            this.f1910h = i2;
            if (i2 <= this.f1909g) {
                int read = this.e.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f1910h += 2;
            return this.e.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            int i4 = this.f1910h + i3;
            this.f1910h = i4;
            if (i4 > this.f1909g) {
                throw new EOFException();
            } else if (this.e.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i2 = this.f1910h + 4;
            this.f1910h = i2;
            if (i2 <= this.f1909g) {
                int read = this.e.read();
                int read2 = this.e.read();
                int read3 = this.e.read();
                int read4 = this.e.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f1908f;
                    if (byteOrder == f1906i) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f1907j) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder a = i.a.a.a.a.a("Invalid byte order: ");
                    a.append(this.f1908f);
                    throw new IOException(a.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            int i2 = this.f1910h + 8;
            this.f1910h = i2;
            if (i2 <= this.f1909g) {
                int read = this.e.read();
                int read2 = this.e.read();
                int read3 = this.e.read();
                int read4 = this.e.read();
                int read5 = this.e.read();
                int read6 = this.e.read();
                int read7 = this.e.read();
                int read8 = this.e.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f1908f;
                    if (byteOrder == f1906i) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == f1907j) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder a = i.a.a.a.a.a("Invalid byte order: ");
                    a.append(this.f1908f);
                    throw new IOException(a.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i2 = this.f1910h + 2;
            this.f1910h = i2;
            if (i2 <= this.f1909g) {
                int read = this.e.read();
                int read2 = this.e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f1908f;
                    if (byteOrder == f1906i) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f1907j) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder a = i.a.a.a.a.a("Invalid byte order: ");
                    a.append(this.f1908f);
                    throw new IOException(a.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f1910h += 2;
            return this.e.readUTF();
        }

        public int readUnsignedByte() {
            this.f1910h++;
            return this.e.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i2 = this.f1910h + 2;
            this.f1910h = i2;
            if (i2 <= this.f1909g) {
                int read = this.e.read();
                int read2 = this.e.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f1908f;
                    if (byteOrder == f1906i) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f1907j) {
                        return (read << 8) + read2;
                    }
                    StringBuilder a = i.a.a.a.a.a("Invalid byte order: ");
                    a.append(this.f1908f);
                    throw new IOException(a.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i2) {
            int min = Math.min(i2, this.f1909g - this.f1910h);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.e.skipBytes(min - i3);
            }
            this.f1910h += i3;
            return i3;
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.e.read(bArr, i2, i3);
            this.f1910h += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            int length = this.f1910h + bArr.length;
            this.f1910h = length;
            if (length > this.f1909g) {
                throw new EOFException();
            } else if (this.e.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C0057a(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }
    }

    public final void b(C0057a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        a(aVar, i2, 5);
        aVar.e((long) i3);
        aVar.f1908f = ByteOrder.BIG_ENDIAN;
        int readInt = aVar.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == A.a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                b a2 = b.a((int) readShort, this.f1899f);
                b a3 = b.a((int) readShort2, this.f1899f);
                this.d[0].put("ImageLength", a2);
                this.d[0].put("ImageWidth", a3);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* compiled from: ExifInterface */
    public static class b {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1911b;
        public final byte[] c;

        public b(int i2, int i3, byte[] bArr) {
            this.a = i2;
            this.f1911b = i3;
            this.c = bArr;
        }

        public static b a(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[3] * 1)]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new b(3, 1, wrap.array());
        }

        public int b(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String c(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(d instanceof d[])) {
                return null;
            } else {
                d[] dVarArr = (d[]) d;
                while (i2 < dVarArr.length) {
                    sb.append(dVarArr[i2].a);
                    sb.append('/');
                    sb.append(dVarArr[i2].f1913b);
                    i2++;
                    if (i2 != dVarArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x01aa A[SYNTHETIC, Splitter:B:164:0x01aa] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object d(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                h.k.a.a$a r3 = new h.k.a.a$a     // Catch:{ IOException -> 0x0194, all -> 0x0192 }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0194, all -> 0x0192 }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x0194, all -> 0x0192 }
                r3.f1908f = r11     // Catch:{ IOException -> 0x0190 }
                int r11 = r10.a     // Catch:{ IOException -> 0x0190 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x014b;
                    case 2: goto L_0x00fc;
                    case 3: goto L_0x00e2;
                    case 4: goto L_0x00c8;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x014b;
                    case 7: goto L_0x00fc;
                    case 8: goto L_0x008b;
                    case 9: goto L_0x0071;
                    case 10: goto L_0x004c;
                    case 11: goto L_0x0031;
                    case 12: goto L_0x0017;
                    default: goto L_0x0015;
                }     // Catch:{ IOException -> 0x0190 }
            L_0x0015:
                goto L_0x0187
            L_0x0017:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x001b:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x0028
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x001b
            L_0x0028:
                r3.close()     // Catch:{ IOException -> 0x002c }
                goto L_0x0030
            L_0x002c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0030:
                return r11
            L_0x0031:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x0035:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x0043
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0190 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x0035
            L_0x0043:
                r3.close()     // Catch:{ IOException -> 0x0047 }
                goto L_0x004b
            L_0x0047:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004b:
                return r11
            L_0x004c:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                h.k.a.a$d[] r11 = new h.k.a.a.d[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x0050:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x0068
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0190 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0190 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0190 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0190 }
                h.k.a.a$d r4 = new h.k.a.a$d     // Catch:{ IOException -> 0x0190 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x0050
            L_0x0068:
                r3.close()     // Catch:{ IOException -> 0x006c }
                goto L_0x0070
            L_0x006c:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0070:
                return r11
            L_0x0071:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x0075:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x0082
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x0075
            L_0x0082:
                r3.close()     // Catch:{ IOException -> 0x0086 }
                goto L_0x008a
            L_0x0086:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008a:
                return r11
            L_0x008b:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x008f:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x009c
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x008f
            L_0x009c:
                r3.close()     // Catch:{ IOException -> 0x00a0 }
                goto L_0x00a4
            L_0x00a0:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a4:
                return r11
            L_0x00a5:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                h.k.a.a$d[] r11 = new h.k.a.a.d[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x00a9:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x00bf
                long r6 = r3.a()     // Catch:{ IOException -> 0x0190 }
                long r8 = r3.a()     // Catch:{ IOException -> 0x0190 }
                h.k.a.a$d r4 = new h.k.a.a$d     // Catch:{ IOException -> 0x0190 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x00a9
            L_0x00bf:
                r3.close()     // Catch:{ IOException -> 0x00c3 }
                goto L_0x00c7
            L_0x00c3:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c7:
                return r11
            L_0x00c8:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x00cc:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x00d9
                long r6 = r3.a()     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x00cc
            L_0x00d9:
                r3.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00e1
            L_0x00dd:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e1:
                return r11
            L_0x00e2:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0190 }
            L_0x00e6:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x00f3
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0190 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0190 }
                int r5 = r5 + 1
                goto L_0x00e6
            L_0x00f3:
                r3.close()     // Catch:{ IOException -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fb:
                return r11
            L_0x00fc:
                int r11 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                byte[] r6 = h.k.a.a.u     // Catch:{ IOException -> 0x0190 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0190 }
                if (r11 < r6) goto L_0x011d
                r11 = 0
            L_0x0104:
                byte[] r6 = h.k.a.a.u     // Catch:{ IOException -> 0x0190 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0190 }
                if (r11 >= r6) goto L_0x0118
                byte[] r6 = r10.c     // Catch:{ IOException -> 0x0190 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0190 }
                byte[] r7 = h.k.a.a.u     // Catch:{ IOException -> 0x0190 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0190 }
                if (r6 == r7) goto L_0x0115
                r4 = 0
                goto L_0x0118
            L_0x0115:
                int r11 = r11 + 1
                goto L_0x0104
            L_0x0118:
                if (r4 == 0) goto L_0x011d
                byte[] r11 = h.k.a.a.u     // Catch:{ IOException -> 0x0190 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0190 }
            L_0x011d:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0190 }
                r11.<init>()     // Catch:{ IOException -> 0x0190 }
            L_0x0122:
                int r4 = r10.f1911b     // Catch:{ IOException -> 0x0190 }
                if (r5 >= r4) goto L_0x013e
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0190 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0190 }
                if (r4 != 0) goto L_0x012d
                goto L_0x013e
            L_0x012d:
                r6 = 32
                if (r4 < r6) goto L_0x0136
                char r4 = (char) r4     // Catch:{ IOException -> 0x0190 }
                r11.append(r4)     // Catch:{ IOException -> 0x0190 }
                goto L_0x013b
            L_0x0136:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0190 }
            L_0x013b:
                int r5 = r5 + 1
                goto L_0x0122
            L_0x013e:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0190 }
                r3.close()     // Catch:{ IOException -> 0x0146 }
                goto L_0x014a
            L_0x0146:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x014a:
                return r11
            L_0x014b:
                byte[] r11 = r10.c     // Catch:{ IOException -> 0x0190 }
                int r11 = r11.length     // Catch:{ IOException -> 0x0190 }
                if (r11 != r4) goto L_0x0175
                byte[] r11 = r10.c     // Catch:{ IOException -> 0x0190 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0190 }
                if (r11 < 0) goto L_0x0175
                byte[] r11 = r10.c     // Catch:{ IOException -> 0x0190 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0190 }
                if (r11 > r4) goto L_0x0175
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0190 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0190 }
                byte[] r6 = r10.c     // Catch:{ IOException -> 0x0190 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0190 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0190 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0190 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0190 }
                r3.close()     // Catch:{ IOException -> 0x0170 }
                goto L_0x0174
            L_0x0170:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0174:
                return r11
            L_0x0175:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0190 }
                byte[] r4 = r10.c     // Catch:{ IOException -> 0x0190 }
                java.nio.charset.Charset r5 = h.k.a.a.L     // Catch:{ IOException -> 0x0190 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0190 }
                r3.close()     // Catch:{ IOException -> 0x0182 }
                goto L_0x0186
            L_0x0182:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0186:
                return r11
            L_0x0187:
                r3.close()     // Catch:{ IOException -> 0x018b }
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x018f:
                return r2
            L_0x0190:
                r11 = move-exception
                goto L_0x0196
            L_0x0192:
                r11 = move-exception
                goto L_0x01a8
            L_0x0194:
                r11 = move-exception
                r3 = r2
            L_0x0196:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x01a6 }
                if (r3 == 0) goto L_0x01a5
                r3.close()     // Catch:{ IOException -> 0x01a1 }
                goto L_0x01a5
            L_0x01a1:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x01a5:
                return r2
            L_0x01a6:
                r11 = move-exception
                r2 = r3
            L_0x01a8:
                if (r2 == 0) goto L_0x01b2
                r2.close()     // Catch:{ IOException -> 0x01ae }
                goto L_0x01b2
            L_0x01ae:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01b2:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: h.k.a.a.b.d(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("(");
            a2.append(a.s[this.a]);
            a2.append(", data length:");
            a2.append(this.c.length);
            a2.append(")");
            return a2.toString();
        }

        public static b a(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[4] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new b(4, 1, wrap.array());
        }

        public static b a(String str) {
            byte[] bytes = (str + 0).getBytes(a.L);
            return new b(2, bytes.length, bytes);
        }

        public static b a(d dVar, ByteOrder byteOrder) {
            d[] dVarArr = {dVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.t[5] * 1)]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                d dVar2 = dVarArr[i2];
                wrap.putInt((int) dVar2.a);
                wrap.putInt((int) dVar2.f1913b);
            }
            return new b(5, 1, wrap.array());
        }

        public double a(ByteOrder byteOrder) {
            Object d = d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d instanceof String) {
                return Double.parseDouble((String) d);
            } else {
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (d instanceof d[]) {
                    d[] dVarArr = (d[]) d;
                    if (dVarArr.length == 1) {
                        d dVar = dVarArr[0];
                        return ((double) dVar.a) / ((double) dVar.f1913b);
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }
    }

    /* compiled from: ExifInterface */
    public static class c {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final String f1912b;
        public final int c;
        public final int d;

        public c(String str, int i2, int i3) {
            this.f1912b = str;
            this.a = i2;
            this.c = i3;
            this.d = -1;
        }

        public c(String str, int i2, int i3, int i4) {
            this.f1912b = str;
            this.a = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public final int a(BufferedInputStream bufferedInputStream) {
        boolean z2;
        boolean z3;
        boolean z4;
        bufferedInputStream.mark(BackgroundManager.BACKGROUND_DELAY);
        byte[] bArr = new byte[BackgroundManager.BACKGROUND_DELAY];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f1895o;
            z2 = true;
            if (i2 >= bArr2.length) {
                z3 = true;
                break;
            } else if (bArr[i2] != bArr2[i2]) {
                z3 = false;
                break;
            } else {
                i2++;
            }
        }
        if (z3) {
            return 4;
        }
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        int i3 = 0;
        while (true) {
            if (i3 >= bytes.length) {
                z4 = true;
                break;
            } else if (bArr[i3] != bytes[i3]) {
                z4 = false;
                break;
            } else {
                i3++;
            }
        }
        if (z4) {
            return 9;
        }
        C0057a aVar = new C0057a(bArr);
        ByteOrder e2 = e(aVar);
        this.f1899f = e2;
        aVar.f1908f = e2;
        short readShort = aVar.readShort();
        aVar.close();
        if (readShort == 20306 || readShort == 21330) {
            return 7;
        }
        C0057a aVar2 = new C0057a(bArr);
        ByteOrder e3 = e(aVar2);
        this.f1899f = e3;
        aVar2.f1908f = e3;
        short readShort2 = aVar2.readShort();
        aVar2.close();
        if (readShort2 != 85) {
            z2 = false;
        }
        if (z2) {
            return 10;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        r13 = r12.d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(h.k.a.a.C0057a r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.e
            int r4 = r1.f1910h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f1910h
            int r3 = r3 + 2
            int r4 = r1.f1909g
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.f1910h
            int r5 = r3 * 12
            int r5 = r5 + r4
            int r4 = r1.f1909g
            if (r5 > r4) goto L_0x0356
            if (r3 > 0) goto L_0x002b
            goto L_0x0356
        L_0x002b:
            r4 = 0
        L_0x002c:
            r5 = 4
            java.lang.String r6 = "ExifInterface"
            if (r4 >= r3) goto L_0x02e9
            int r7 = r24.readUnsignedShort()
            int r8 = r24.readUnsignedShort()
            int r9 = r24.readInt()
            int r10 = r1.f1910h
            long r10 = (long) r10
            r12 = 4
            long r10 = r10 + r12
            java.util.HashMap<java.lang.Integer, h.k.a.a$c>[] r12 = H
            r12 = r12[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            java.lang.Object r12 = r12.get(r13)
            h.k.a.a$c r12 = (h.k.a.a.c) r12
            r14 = 7
            if (r12 != 0) goto L_0x006d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "Skip the tag entry since tag number is not defined: "
            r5.append(r13)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r6, r5)
        L_0x0068:
            r15 = r3
            r17 = r4
            goto L_0x011a
        L_0x006d:
            if (r8 <= 0) goto L_0x0103
            int[] r15 = t
            int r15 = r15.length
            if (r8 < r15) goto L_0x0076
            goto L_0x0103
        L_0x0076:
            int r15 = r12.c
            if (r15 == r14) goto L_0x00ac
            if (r8 != r14) goto L_0x007d
            goto L_0x00ac
        L_0x007d:
            if (r15 == r8) goto L_0x00ac
            int r13 = r12.d
            if (r13 != r8) goto L_0x0084
            goto L_0x00ac
        L_0x0084:
            if (r15 == r5) goto L_0x0088
            if (r13 != r5) goto L_0x008c
        L_0x0088:
            r5 = 3
            if (r8 != r5) goto L_0x008c
            goto L_0x00ac
        L_0x008c:
            int r5 = r12.c
            r13 = 9
            if (r5 == r13) goto L_0x0096
            int r5 = r12.d
            if (r5 != r13) goto L_0x009b
        L_0x0096:
            r5 = 8
            if (r8 != r5) goto L_0x009b
            goto L_0x00ac
        L_0x009b:
            int r5 = r12.c
            r13 = 12
            if (r5 == r13) goto L_0x00a5
            int r5 = r12.d
            if (r5 != r13) goto L_0x00aa
        L_0x00a5:
            r5 = 11
            if (r8 != r5) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            r5 = 0
            goto L_0x00ad
        L_0x00ac:
            r5 = 1
        L_0x00ad:
            if (r5 != 0) goto L_0x00ce
            java.lang.String r5 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r5 = i.a.a.a.a.a(r5)
            java.lang.String[] r13 = s
            r13 = r13[r8]
            r5.append(r13)
            java.lang.String r13 = ") is unexpected for tag: "
            r5.append(r13)
            java.lang.String r13 = r12.f1912b
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r6, r5)
            goto L_0x0068
        L_0x00ce:
            if (r8 != r14) goto L_0x00d2
            int r8 = r12.c
        L_0x00d2:
            long r13 = (long) r9
            int[] r5 = t
            r5 = r5[r8]
            r15 = r3
            r17 = r4
            long r3 = (long) r5
            long r13 = r13 * r3
            r3 = 0
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x00ee
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00eb
            goto L_0x00ee
        L_0x00eb:
            r3 = r13
            r13 = 1
            goto L_0x0120
        L_0x00ee:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since the number of components is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r6, r3)
            goto L_0x011d
        L_0x0103:
            r15 = r3
            r17 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r6, r3)
        L_0x011a:
            r3 = 0
            r13 = r3
        L_0x011d:
            r3 = 0
            r3 = r13
            r13 = 0
        L_0x0120:
            if (r13 != 0) goto L_0x0129
            r1.e(r10)
            r16 = r15
            goto L_0x02e2
        L_0x0129:
            java.lang.String r5 = "Compression"
            r13 = 4
            int r16 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x01dc
            int r13 = r24.readInt()
            int r14 = r0.c
            r16 = r15
            r15 = 7
            if (r14 != r15) goto L_0x019b
            java.lang.String r14 = r12.f1912b
            java.lang.String r15 = "MakerNote"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0149
            r0.f1902i = r13
            goto L_0x0194
        L_0x0149:
            r14 = 6
            if (r2 != r14) goto L_0x0194
            java.lang.String r14 = r12.f1912b
            java.lang.String r15 = "ThumbnailImage"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0194
            r0.f1903j = r13
            r0.f1904k = r9
            java.nio.ByteOrder r14 = r0.f1899f
            r15 = 6
            h.k.a.a$b r14 = h.k.a.a.b.a((int) r15, (java.nio.ByteOrder) r14)
            int r15 = r0.f1903j
            r19 = r8
            r18 = r9
            long r8 = (long) r15
            java.nio.ByteOrder r15 = r0.f1899f
            h.k.a.a$b r8 = h.k.a.a.b.a((long) r8, (java.nio.ByteOrder) r15)
            int r9 = r0.f1904k
            r20 = r10
            long r9 = (long) r9
            java.nio.ByteOrder r11 = r0.f1899f
            h.k.a.a$b r9 = h.k.a.a.b.a((long) r9, (java.nio.ByteOrder) r11)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r10 = r0.d
            r11 = 4
            r10 = r10[r11]
            r10.put(r5, r14)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r10 = r0.d
            r10 = r10[r11]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r10.put(r14, r8)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r8 = r0.d
            r8 = r8[r11]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r8.put(r10, r9)
            goto L_0x01b1
        L_0x0194:
            r19 = r8
            r18 = r9
            r20 = r10
            goto L_0x01b1
        L_0x019b:
            r19 = r8
            r18 = r9
            r20 = r10
            r8 = 10
            if (r14 != r8) goto L_0x01b1
            java.lang.String r8 = r12.f1912b
            java.lang.String r9 = "JpgFromRaw"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01b1
            r0.f1905l = r13
        L_0x01b1:
            long r8 = (long) r13
            long r10 = r8 + r3
            int r14 = r1.f1909g
            long r14 = (long) r14
            int r22 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r22 > 0) goto L_0x01c1
            r1.e(r8)
            r10 = r20
            goto L_0x01e2
        L_0x01c1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data offset is invalid: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r6, r3)
            r10 = r20
            r1.e(r10)
            goto L_0x02e2
        L_0x01dc:
            r19 = r8
            r18 = r9
            r16 = r15
        L_0x01e2:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r8 = K
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r8.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x027a
            r3 = -1
            r5 = 3
            r8 = r19
            if (r8 == r5) goto L_0x0216
            r5 = 4
            if (r8 == r5) goto L_0x0211
            r5 = 8
            if (r8 == r5) goto L_0x020c
            r5 = 9
            if (r8 == r5) goto L_0x0207
            r5 = 13
            if (r8 == r5) goto L_0x0207
            goto L_0x021b
        L_0x0207:
            int r3 = r24.readInt()
            goto L_0x021a
        L_0x020c:
            short r3 = r24.readShort()
            goto L_0x021a
        L_0x0211:
            long r3 = r24.a()
            goto L_0x021b
        L_0x0216:
            int r3 = r24.readUnsignedShort()
        L_0x021a:
            long r3 = (long) r3
        L_0x021b:
            r8 = 0
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0262
            int r5 = r1.f1909g
            long r8 = (long) r5
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0262
            java.util.Set<java.lang.Integer> r5 = r0.e
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r5 = r5.contains(r8)
            if (r5 != 0) goto L_0x0240
            r1.e(r3)
            int r3 = r7.intValue()
            r0.b(r1, r3)
            goto L_0x0276
        L_0x0240:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r5.append(r8)
            r5.append(r7)
            java.lang.String r7 = " (at "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r6, r3)
            goto L_0x0276
        L_0x0262:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Skip jump into the IFD since its offset is invalid: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r6, r3)
        L_0x0276:
            r1.e(r10)
            goto L_0x02e2
        L_0x027a:
            r8 = r19
            int r4 = (int) r3
            byte[] r3 = new byte[r4]
            r1.readFully(r3)
            h.k.a.a$b r4 = new h.k.a.a$b
            r6 = r18
            r4.<init>(r8, r6, r3)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r3 = r0.d
            r3 = r3[r2]
            java.lang.String r6 = r12.f1912b
            r3.put(r6, r4)
            java.lang.String r3 = r12.f1912b
            java.lang.String r6 = "DNGVersion"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x029f
            r3 = 3
            r0.c = r3
        L_0x029f:
            java.lang.String r3 = r12.f1912b
            java.lang.String r6 = "Make"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x02b3
            java.lang.String r3 = r12.f1912b
            java.lang.String r6 = "Model"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x02c1
        L_0x02b3:
            java.nio.ByteOrder r3 = r0.f1899f
            java.lang.String r3 = r4.c(r3)
            java.lang.String r6 = "PENTAX"
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L_0x02d4
        L_0x02c1:
            java.lang.String r3 = r12.f1912b
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x02d8
            java.nio.ByteOrder r3 = r0.f1899f
            int r3 = r4.b(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x02d8
        L_0x02d4:
            r3 = 8
            r0.c = r3
        L_0x02d8:
            int r3 = r1.f1910h
            long r3 = (long) r3
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x02e2
            r1.e(r10)
        L_0x02e2:
            int r4 = r17 + 1
            short r4 = (short) r4
            r3 = r16
            goto L_0x002c
        L_0x02e9:
            int r2 = r1.f1910h
            int r2 = r2 + 4
            int r3 = r1.f1909g
            if (r2 > r3) goto L_0x0356
            int r2 = r24.readInt()
            long r3 = (long) r2
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0342
            int r5 = r1.f1909g
            if (r2 >= r5) goto L_0x0342
            java.util.Set<java.lang.Integer> r5 = r0.e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L_0x032d
            r1.e(r3)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r2 = r0.d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x031e
            r0.b(r1, r3)
            goto L_0x0356
        L_0x031e:
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r2 = r0.d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0356
            r0.b(r1, r3)
            goto L_0x0356
        L_0x032d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r6, r1)
            goto L_0x0356
        L_0x0342:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r6, r1)
        L_0x0356:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.k.a.a.b(h.k.a.a$a, int):void");
    }

    public final void c(C0057a aVar, int i2) {
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4 = this.d[i2].get("DefaultCropSize");
        b bVar5 = this.d[i2].get("SensorTopBorder");
        b bVar6 = this.d[i2].get("SensorLeftBorder");
        b bVar7 = this.d[i2].get("SensorBottomBorder");
        b bVar8 = this.d[i2].get("SensorRightBorder");
        if (bVar4 != null) {
            if (bVar4.a == 5) {
                d[] dVarArr = (d[]) bVar4.d(this.f1899f);
                if (dVarArr == null || dVarArr.length != 2) {
                    StringBuilder a2 = i.a.a.a.a.a("Invalid crop size values. cropSize=");
                    a2.append(Arrays.toString(dVarArr));
                    Log.w("ExifInterface", a2.toString());
                    return;
                }
                bVar3 = b.a(dVarArr[0], this.f1899f);
                bVar2 = b.a(dVarArr[1], this.f1899f);
            } else {
                int[] iArr = (int[]) bVar4.d(this.f1899f);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder a3 = i.a.a.a.a.a("Invalid crop size values. cropSize=");
                    a3.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", a3.toString());
                    return;
                }
                bVar3 = b.a(iArr[0], this.f1899f);
                bVar2 = b.a(iArr[1], this.f1899f);
            }
            this.d[i2].put("ImageWidth", bVar3);
            this.d[i2].put("ImageLength", bVar2);
        } else if (bVar5 == null || bVar6 == null || bVar7 == null || bVar8 == null) {
            b bVar9 = this.d[i2].get("ImageLength");
            b bVar10 = this.d[i2].get("ImageWidth");
            if ((bVar9 == null || bVar10 == null) && (bVar = this.d[i2].get("JPEGInterchangeFormat")) != null) {
                a(aVar, bVar.b(this.f1899f), i2);
            }
        } else {
            int b2 = bVar5.b(this.f1899f);
            int b3 = bVar7.b(this.f1899f);
            int b4 = bVar8.b(this.f1899f);
            int b5 = bVar6.b(this.f1899f);
            if (b3 > b2 && b4 > b5) {
                b a4 = b.a(b3 - b2, this.f1899f);
                b a5 = b.a(b4 - b5, this.f1899f);
                this.d[i2].put("ImageLength", a4);
                this.d[i2].put("ImageWidth", a5);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0086 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.k.a.a.C0057a r9, int r10, int r11) {
        /*
            r8 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r9.f1908f = r0
            long r0 = (long) r10
            r9.e(r0)
            byte r0 = r9.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x014f
            r3 = 1
            int r10 = r10 + r3
            byte r4 = r9.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r10 = r10 + r3
        L_0x001c:
            byte r0 = r9.readByte()
            if (r0 != r2) goto L_0x011f
            int r10 = r10 + r3
            byte r0 = r9.readByte()
            int r10 = r10 + r3
            r1 = -39
            if (r0 == r1) goto L_0x011a
            r1 = -38
            if (r0 != r1) goto L_0x0032
            goto L_0x011a
        L_0x0032:
            int r1 = r9.readUnsignedShort()
            int r1 = r1 + -2
            int r10 = r10 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x0114
            r5 = -31
            java.lang.String r6 = "Invalid exif"
            if (r0 == r5) goto L_0x00b7
            r5 = -2
            if (r0 == r5) goto L_0x008e
            switch(r0) {
                case -64: goto L_0x0055;
                case -63: goto L_0x0055;
                case -62: goto L_0x0055;
                case -61: goto L_0x0055;
                default: goto L_0x004a;
            }
        L_0x004a:
            switch(r0) {
                case -59: goto L_0x0055;
                case -58: goto L_0x0055;
                case -57: goto L_0x0055;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r0) {
                case -55: goto L_0x0055;
                case -54: goto L_0x0055;
                case -53: goto L_0x0055;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r0) {
                case -51: goto L_0x0055;
                case -50: goto L_0x0055;
                case -49: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x00e9
        L_0x0055:
            int r0 = r9.skipBytes(r3)
            if (r0 != r3) goto L_0x0086
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r0 = r8.d
            r0 = r0[r11]
            int r5 = r9.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r8.f1899f
            h.k.a.a$b r5 = h.k.a.a.b.a((long) r5, (java.nio.ByteOrder) r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r0 = r8.d
            r0 = r0[r11]
            int r5 = r9.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r8.f1899f
            h.k.a.a$b r5 = h.k.a.a.b.a((long) r5, (java.nio.ByteOrder) r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e9
        L_0x0086:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid SOFx"
            r9.<init>(r10)
            throw r9
        L_0x008e:
            byte[] r0 = new byte[r1]
            int r5 = r9.read(r0)
            if (r5 != r1) goto L_0x00b1
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r8.a((java.lang.String) r1)
            if (r5 != 0) goto L_0x00e8
            java.util.HashMap<java.lang.String, h.k.a.a$b>[] r5 = r8.d
            r5 = r5[r3]
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = L
            r6.<init>(r0, r7)
            h.k.a.a$b r0 = h.k.a.a.b.a((java.lang.String) r6)
            r5.put(r1, r0)
            goto L_0x00e8
        L_0x00b1:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x00b7:
            r0 = 6
            if (r1 >= r0) goto L_0x00bb
            goto L_0x00e9
        L_0x00bb:
            byte[] r5 = new byte[r0]
            int r7 = r9.read(r5)
            if (r7 != r0) goto L_0x010e
            int r10 = r10 + 6
            int r1 = r1 + -6
            byte[] r0 = M
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d0
            goto L_0x00e9
        L_0x00d0:
            if (r1 <= 0) goto L_0x0108
            r8.f1901h = r10
            byte[] r0 = new byte[r1]
            int r5 = r9.read(r0)
            if (r5 != r1) goto L_0x0102
            int r10 = r10 + r1
            h.k.a.a$a r5 = new h.k.a.a$a
            r5.<init>((byte[]) r0)
            r8.a((h.k.a.a.C0057a) r5, (int) r1)
            r8.b(r5, r11)
        L_0x00e8:
            r1 = 0
        L_0x00e9:
            if (r1 < 0) goto L_0x00fc
            int r0 = r9.skipBytes(r1)
            if (r0 != r1) goto L_0x00f4
            int r10 = r10 + r1
            goto L_0x001c
        L_0x00f4:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid JPEG segment"
            r9.<init>(r10)
            throw r9
        L_0x00fc:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r4)
            throw r9
        L_0x0102:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x0108:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x010e:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r6)
            throw r9
        L_0x0114:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r4)
            throw r9
        L_0x011a:
            java.nio.ByteOrder r10 = r8.f1899f
            r9.f1908f = r10
            return
        L_0x011f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Invalid marker:"
            java.lang.StringBuilder r10 = i.a.a.a.a.a(r10)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0138:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = i.a.a.a.a.a(r1)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x014f:
            java.io.IOException r9 = new java.io.IOException
            java.lang.StringBuilder r10 = i.a.a.a.a.a(r1)
            r11 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h.k.a.a.a(h.k.a.a$a, int, int):void");
    }

    public final void a(C0057a aVar) {
        c(aVar);
        b bVar = this.d[1].get("MakerNote");
        if (bVar != null) {
            C0057a aVar2 = new C0057a(bVar.c);
            aVar2.f1908f = this.f1899f;
            byte[] bArr = new byte[f1896p.length];
            aVar2.readFully(bArr);
            aVar2.e(0);
            byte[] bArr2 = new byte[f1897q.length];
            aVar2.readFully(bArr2);
            if (Arrays.equals(bArr, f1896p)) {
                aVar2.e(8);
            } else if (Arrays.equals(bArr2, f1897q)) {
                aVar2.e(12);
            }
            b(aVar2, 6);
            b bVar2 = this.d[7].get("PreviewImageStart");
            b bVar3 = this.d[7].get("PreviewImageLength");
            if (!(bVar2 == null || bVar3 == null)) {
                this.d[5].put("JPEGInterchangeFormat", bVar2);
                this.d[5].put("JPEGInterchangeFormatLength", bVar3);
            }
            b bVar4 = this.d[8].get("AspectFrame");
            if (bVar4 != null) {
                int[] iArr = (int[]) bVar4.d(this.f1899f);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder a2 = i.a.a.a.a.a("Invalid aspect frame values. frame=");
                    a2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", a2.toString());
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    b a3 = b.a(i2, this.f1899f);
                    b a4 = b.a(i3, this.f1899f);
                    this.d[0].put("ImageWidth", a3);
                    this.d[0].put("ImageLength", a4);
                }
            }
        }
    }

    public final void a() {
        String a2 = a("DateTimeOriginal");
        if (a2 != null && a("DateTime") == null) {
            this.d[0].put("DateTime", b.a(a2));
        }
        if (a("ImageWidth") == null) {
            this.d[0].put("ImageWidth", b.a(0, this.f1899f));
        }
        if (a("ImageLength") == null) {
            this.d[0].put("ImageLength", b.a(0, this.f1899f));
        }
        if (a("Orientation") == null) {
            this.d[0].put("Orientation", b.a(0, this.f1899f));
        }
        if (a("LightSource") == null) {
            this.d[1].put("LightSource", b.a(0, this.f1899f));
        }
    }

    public final void a(C0057a aVar, int i2) {
        ByteOrder e2 = e(aVar);
        this.f1899f = e2;
        aVar.f1908f = e2;
        int readUnsignedShort = aVar.readUnsignedShort();
        int i3 = this.c;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(i.a.a.a.a.b("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && aVar.skipBytes(i4) != i4) {
                throw new IOException(i.a.a.a.a.b("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        StringBuilder a2 = i.a.a.a.a.a("Invalid start code: ");
        a2.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(a2.toString());
    }

    public final void a(C0057a aVar, HashMap hashMap) {
        int i2;
        b bVar = (b) hashMap.get("JPEGInterchangeFormat");
        b bVar2 = (b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b2 = bVar.b(this.f1899f);
            int min = Math.min(bVar2.b(this.f1899f), aVar.available() - b2);
            int i3 = this.c;
            if (i3 == 4 || i3 == 9 || i3 == 10) {
                i2 = this.f1901h;
            } else {
                if (i3 == 7) {
                    i2 = this.f1902i;
                }
                if (b2 > 0 && min > 0 && this.a == null && this.f1898b == null) {
                    aVar.e((long) b2);
                    aVar.readFully(new byte[min]);
                    return;
                }
                return;
            }
            b2 += i2;
            if (b2 > 0) {
            }
        }
    }

    public final boolean a(HashMap hashMap) {
        b bVar = (b) hashMap.get("ImageLength");
        b bVar2 = (b) hashMap.get("ImageWidth");
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.b(this.f1899f) <= 512 && bVar2.b(this.f1899f) <= 512;
    }

    public final void a(int i2, int i3) {
        if (!this.d[i2].isEmpty() && !this.d[i3].isEmpty()) {
            b bVar = this.d[i2].get("ImageLength");
            b bVar2 = this.d[i2].get("ImageWidth");
            b bVar3 = this.d[i3].get("ImageLength");
            b bVar4 = this.d[i3].get("ImageWidth");
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b2 = bVar.b(this.f1899f);
                int b3 = bVar2.b(this.f1899f);
                int b4 = bVar3.b(this.f1899f);
                int b5 = bVar4.b(this.f1899f);
                if (b2 < b4 && b3 < b5) {
                    HashMap<String, b>[] hashMapArr = this.d;
                    HashMap<String, b> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                }
            }
        }
    }

    public static long[] a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
