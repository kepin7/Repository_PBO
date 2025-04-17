package Unguided;

/**
 *
 * @author Kepin
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(7);

        System.out.println("Jari-jari: " + lingkaran.getJarijari());
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Luas dengan parameter: " + lingkaran.getLuas(10));

        Bola bola = new Bola();
        bola.setJarijari(7);

        System.out.println("Jari-jari: " + bola.getJarijari());
        System.out.println("Luas permukaan: " + bola.getLuas());
        System.out.println("Volume: " + bola.getVolume());
    }
}