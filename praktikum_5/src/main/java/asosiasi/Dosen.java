package asosiasi;

/**
 *
 * @author Kepin
 */
public class Dosen {
    private String nama;
    public Dosen(String nama){
        this.nama = nama;
    }
    public void beriNilai (Mahasiswa m, int nilai){
        m.setNilai (nilai);
        System.out.println(nama +" Memberikan nilai "+ nilai + " kepada "+ m.getNama());
    }
}