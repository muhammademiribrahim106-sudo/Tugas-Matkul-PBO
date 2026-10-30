package tugasmatkul;
public class SegiTiga {
    float alas, tinggi;

    public SegiTiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    float luas() {
        return 0.5f * alas * tinggi;
    }

    float keliling() {
        // Asumsi sisi miring menggunakan teorema Pythagoras (untuk segitiga siku-siku)
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
