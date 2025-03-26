package asosiasi;

/**
 * 
 * @author Kepin
 */
public class Mahasiswa {
    private String nama;
    private int nilai;
    
    public Mahasiswa (String nama){
        this.nama = nama;
    }
    public void setNilai (int nilai){
        this.nilai = nilai;
    }
    public String getNama(){
        return nama;
    } 
}