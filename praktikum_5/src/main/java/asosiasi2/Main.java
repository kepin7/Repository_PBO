package asosiasi2;

/**
 *
 * @author Kepin
 */
public class Main {
    public static void main(String[] args) {
    
    // Kereta pertama
    Kereta kereta1 = new Kereta();
    kereta1.setNamaKereta("Joglosemarkerto");
    kereta1.setNoKereta("112");
    
    // Kereta kedua
    Kereta kereta2 = new Kereta();
    kereta2.setNamaKereta("Kamandaka");
    kereta2.setNoKereta("114");
    
    // Masinis
    Masinis m1 = new Masinis();
    Masinis m2 = new Masinis();
    
    // Atur kecepatan untuk setiap kereta
    m1.giveVelocity(kereta1, 100);
    m2.giveVelocity(kereta2, 110);
    
    // Cetak data kereta
    System.out.println("No Kereta: " + kereta1.getNoKereta() + ", Nama: "
            + kereta1.getNamaKereta() + ", Kecepatan: " + m1.getVelocity(kereta1) + "km/jam"); 
    System.out.println("No Kereta: " + kereta2.getNoKereta() + ", Nama: " 
            + kereta2.getNamaKereta() + ", Kecepatan: " + m2.getVelocity(kereta2) + "km/jam");
    }
}