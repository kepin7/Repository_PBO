package Unguided;

/**
 *
 * @author Kepin
 */
public class Lingkaran {
    private int jarijari;

    public void setJarijari(int j) {
        jarijari = j;
    }

    public int getJarijari() {
        return jarijari;
    }

    public double getLuas() {
        return 3.14 * jarijari * jarijari;
    }

    public double getLuas(int jarijari) {
        return 3.14 * jarijari * jarijari;
    }
}