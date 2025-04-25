package Upcasting;

/**
 *
 * @author Kepin
 */
// Kelas induk
class Mobil {
    void tekanGas() {
        System.out.println("Mobil biasa: gas ditekan...");
    }
}
// Kelas anak 1
class MobilSport extends Mobil {
    @Override
    void tekanGas() {
        System.out.println("Mobil Sport: melesat cepat!");
    }
}
// Kelas anak 2
class MobilListrik extends Mobil {
    @Override
    void tekanGas() {
        System.out.println("Mobil Listrik: melaju tanpa suara...");
        }
}
// Kelas utama
public class Upcasting {
    public static void main(String[] args) {
        // Upcasting: objek anak disimpan dalam referensi induk
        Mobil mobilSport = new MobilSport(); // Upcasting
        Mobil mobilListrik = new MobilListrik(); // Upcasting
        
        System.out.println("----- UPCASTING -----");
        mobilSport.tekanGas(); // Output: Mobil Sport: melesat cepat!
        mobilListrik.tekanGas(); // Output: Mobil Listrik: melaju tanpa suara...
    }
}