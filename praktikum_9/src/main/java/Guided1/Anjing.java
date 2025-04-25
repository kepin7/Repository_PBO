package Guided1;

/**
 *
 * @author Kepin
 */
public class Anjing extends Binatang {
    Anjing(String nama) {
        super("Anjing");
        this.nama = nama;
    }
    public void suara() {
        System.out.println("menggonggong");
    }
    public String toString() {
        return super.toString()+" "+nama;
    }
    private String nama;
}
