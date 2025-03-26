package komposisi;

/**
 *
 * @author Kepin
 */
public class CPU {
    private String merk;
    private int kecepatan;
    
    public CPU(String m, int k) {
        this.merk = m;
        this.kecepatan = k;
    }
    
    public void displaySpecCPU() {
        System.out.println("CPU: " + this.merk + ", Kecepatan: " + this.kecepatan + "GHz");
    }
}