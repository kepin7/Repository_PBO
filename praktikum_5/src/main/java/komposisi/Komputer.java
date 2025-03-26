package komposisi;

/**
 *
 * @author Kepin
 */
public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    
    public Komputer() { // Objek-objek tersebut dibuat langsung dalam konstruktor Komputer 
        this.cpu = new CPU("Intel i7", 3);
        this.monitor = new Monitor("LG 24 Inch");
        this.mouse = new Mouse("Logitech", "Wireless");
    }
    
    public void displaySpecKomputer() {
        System.out.println("Spesifikasi Komputer: ");
        cpu.displaySpecCPU();
        monitor.displaySpecMonitor();
        mouse.displaySpecMouse();
    }
    
    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        komputer.displaySpecKomputer();
    }
}