package Overloading_Method;

/**
 *
 * @author Kepin
 */
class DemoOver2 {
    public static void main(String[] args) {
        Lagu d, e, f;
        d = new Lagu();
        e = new Lagu();
        f = new Lagu();
        
        d.IsiParam("Lagu 1");
        e.IsiParam("Seventeen", "AKB48");
        f.IsiParam("ST112", "Bunga", 1992);
        
        d.CetakKeLayar();
        e.CetakKeLayar();
        f.CetakKeLayar();
    }
}