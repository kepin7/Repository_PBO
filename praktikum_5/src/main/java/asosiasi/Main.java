package asosiasi;

/**
 *
 * @author Kepin
 */
public class Main {
    public static void main (String[] args){
        Mahasiswa mhs = new Mahasiswa ("Budi");
        
        Dosen dosen = new Dosen ("Sudianto");
        dosen.beriNilai(mhs, 90);
    }
}