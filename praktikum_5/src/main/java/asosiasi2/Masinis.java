package asosiasi2;

/**
 *
 * @author Kepin
 */
public class Masinis {
    private String kodeMasinis;
    private String namaMasinis;
    
    // Setter
    public void setKodeMasinis(String kodeMasinis) {
        this.kodeMasinis = kodeMasinis;
    }
    
    public void setNamaMasinis(String namaMasinis) {
        this.namaMasinis = namaMasinis;
    }
    
    // Getter
    public String getKodeMasinis() {
        return this.kodeMasinis;
    }
    
    public String getNamaMasinis() {
        return this.namaMasinis;
    }
    
    // Metode untuk memberikan kecepatan pada kereta
    public void giveVelocity(Kereta s, int kecepatan) {
        s.setKecepatan(kecepatan);
    }
    
    // Metode untuk mengambil kecepatan dari kereta
    public int getVelocity(Kereta s) {
        return s.getKecepatan();
    }
}