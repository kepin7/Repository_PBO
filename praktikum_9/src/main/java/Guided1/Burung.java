package Guided1;

/**
 *
 * @author Kepin
 */
public class Burung extends Binatang {
    private String nama;

    public Burung(String nama){
        super("Burung");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("berkicau");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
}
