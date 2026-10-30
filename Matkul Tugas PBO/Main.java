package matkulpbo;
public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk masing-masing bangun datar dengan nilai bebas
        BangunDatar persegi = new Persegi(5);
        BangunDatar lingkaran = new Lingkaran(7);
        BangunDatar persegiPanjang = new PersegiPanjang(10, 5);
        BangunDatar segitiga = new Segitiga(6, 8);

        // Menampilkan hasil Persegi
        System.out.println("=== PERSEGI ===");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());

        // Menampilkan hasil Lingkaran
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        // Menampilkan hasil Persegi Panjang
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        // Menampilkan hasil Segitiga
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}
