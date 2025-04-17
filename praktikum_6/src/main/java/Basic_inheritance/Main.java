package Basic_inheritance;

/**
 *
 * @author Kepin
 */
// Kelas utama yang menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas A (superclass)
        A superclass = new A();
        // Membuat objek dari kelas B (subclass)
        B subclass = new B();
        System.out.println("Superclass:");
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();
        // Menampilkan data dari subclass
        System.out.println("Subclass:");
        subclass.x = 1;  // Mengatur nilai x di subclass
        subclass.y = 2;  // Mengatur nilai y di subclass
        subclass.tampilXY();  // Memanggil method tampilXY() dari superclass
        // Menggunakan atribut tambahan yang hanya ada di subclass
        subclass.z = 5;  // Mengatur nilai z di subclass
        subclass.jumlahXY();  // Memanggil method jumlahXY() untuk menghitung jumlah x, y, dan z
    }
}