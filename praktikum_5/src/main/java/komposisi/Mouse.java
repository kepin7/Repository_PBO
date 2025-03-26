package komposisi;

/**
 *
 * @author Kepin
 */
public class Mouse {
    private String merk, type;
    
    public Mouse(String m, String t) {
        this.merk = m;
        this.type = t;
    }
    
    public void displaySpecMouse() {
        System.out.println("Mouse: " + this.merk + ", Type: " + this.type);
    }
}