package Downcasting;

/**
 *
 * @author Kepin
 */
// Kelas utama
public class Main {
    public static void main(String[] args) {
        // Membuat objek unggas spesifik
        Unggas unggasAyam = new Ayam(); // Referensi Unggas tapi objek Ayam
        Unggas unggasBebek = new Bebek(); // Referensi Unggas tapi objek Bebek
        System.out.println("---- DOWNCASTING UNGGAS ----");
        
        // *Downcasting* ke Ayam dan Bebek
        Ayam ayam = (Ayam) unggasAyam; // Downcasting Unggas ke Ayam
        Bebek bebek = (Bebek) unggasBebek; // Downcasting Unggas ke Bebek
        ayam.bersuara(); // Output: Ayam berkokok...
        bebek.bersuara(); // Output: Bebek quack...
        
        // *Akses fitur khusus subclass setelah downcasting*
        ayam.bertelur(); // Output: Ayam bertelur.
        bebek.berenang(); // Output: Bebek sedang berenang.
    }
}
