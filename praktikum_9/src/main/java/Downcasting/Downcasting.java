package Downcasting;

/**
 *
 * @author Kepin
 */
// Kelas induk (superclass)
class Unggas {
    void bersuara() {
        System.out.println("Unggas bersuara ... ");
    }
}
// Kelas anak 1 (subclass)
class Ayam extends Unggas {
    @Override
    void bersuara() {
        System.out.println("Ayam berkokok ... ");
    }
    void bertelur() {
        System.out.println("Ayam bertelur.");
    }
}
// Kelas anak 2 (subclass)
class Bebek extends Unggas {
    @Override
    void bersuara() {
        System.out.println("Bebek quack ... ");
    }
    void berenang() {
        System.out.println("Bebek sedang berenang.");
    }
}