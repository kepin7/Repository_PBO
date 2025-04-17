package Keyword_super;

/**
 *
 * @author Kepin
 */
class Manager extends Employee {
    private String alamat;
    
    public Manager(String nama, String s) {
        super(nama); // Memanggil konstruktor superclass Employee untuk menginisialisasi nama
        alamat = s; // Menginisialisasi variabel alamat
    }
    
    // Method untuk menampilkan alamat dan departemen
    public void tampilAlamat() {
        super.departemen = "Personalia";
        
        super.tampilNama();
        System.out.println("Alamat : " + alamat);
        System.out.println("Departemen : " + super.departemen); // Menampilkan departemen
    }
    
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Manager kevin = new Manager("Kevin", "Teluk");
        kevin.tampilAlamat(); // Memanggil method tampilAlamat() untuk menampilkan informasi
    }
}