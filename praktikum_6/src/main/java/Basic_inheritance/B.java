package Basic_inheritance;

/**
 *
 * @author Kepin
 */
// Subclass B yang mewarisi dari superclass A
class B extends A {
    int z;  // Variabel tambahan khusus untuk kelas B
    
    // Method untuk menghitung jumlah x, y, dan z
    void jumlahXY() {
        System.out.println("Jumlah: " + (x + y + z));
    }
 }   