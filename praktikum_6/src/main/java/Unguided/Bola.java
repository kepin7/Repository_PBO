package Unguided;

/**
 *
 * @author Kepin
 */
public class Bola extends Lingkaran {

    public double getLuas() {
        int r = getJarijari();
        return 4 * 3.14 * r * r; 
    }

    public double getVolume() {
        int r = getJarijari();
        return (4.0 / 3) * 3.14 * r * r * r;
    }
}