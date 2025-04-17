package Keyword_super;

/**
 *
 * @author Kepin
 */
class Employee {
    private String name;
    String departemen;
    // Konstruktor menginisialisasi nama pegawai
    public Employee(String s) {
        name = s;
    }
    
    public void tampilNama() {
        System.out.println("Nama : " + name);
    }
}