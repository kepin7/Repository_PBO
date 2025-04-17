package OverRiding_Method;

/**
 *
 * @author Kepin
 */
class B extends A {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar(); // Method milik superclass dipanggil
        System.out.println("Method milik class B dipanggil...");
    }
}