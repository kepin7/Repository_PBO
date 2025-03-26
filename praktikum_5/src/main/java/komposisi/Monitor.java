package komposisi;

/**
 *
 * @author Kepin
 */
public class Monitor {
    private String merk;
    
    public Monitor(String m) {
        this.merk = m;
    }
    
    public void displaySpecMonitor() {
        System.out.println("Monitor: " + this.merk);
    }
}