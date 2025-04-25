package Guided1;

/**
 *
 * @author Kepin
 */
public class Kambing extends Binatang {
    private String nama;

    public Kambing(String nama){
        super("Kambing");
        this.nama = nama;
    }

    public void suara(){
        System.out.println("mengembik");
    }

    public String toString(){
        return super.toString() + " " + nama;
    }
}