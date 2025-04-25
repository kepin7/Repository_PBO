package Guided1;
import java.util.Random;
/**
 *
 * @author Kepin
 */
public class CobaPolimorpic {
    public static void main(String[] args) {
        // Array dari objek Binatang, berisi berbagai jenis binatang
        Binatang[] peliharaanku = {
        new Burung("Kakat Tua"),
        new Kambing("Etawa"),
        new Anjing("Kintamani"),
        new Kucing("Anggora")
    };
        
    Binatang kesayangan;
    Random pilihan = new Random();
    // Memilih satu binatang secara acak dari array
    kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];
    
    System.out.println("Binatang Kesayangan Anda: " + kesayangan);
    System.out.print("Suaranya: ");
    kesayangan.suara();
    }
}