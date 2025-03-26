package asosiasi2;

/**
 *
 * @author Kepin
 */
public class Kereta {
    private String namaKereta;
    private String noKereta;
    private int kecepatan; // Tambahkan atribut kecepatan
    
    // Setter
    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }
    
    public void setNoKereta(String noKereta) {
        this.noKereta = noKereta;
    }
    
    public void setKecepatan(int kecepatan) { // Tambahkan setter kecepatan
        this.kecepatan = kecepatan;
    }
    
    // Getter
    public String getNamaKereta() {
        return this.namaKereta;
    }
    
    public String getNoKereta() {
        return this.noKereta;
    }
    
    public int getKecepatan() { // Tambahkan getter kecepatan
        return this.kecepatan;
    }
}