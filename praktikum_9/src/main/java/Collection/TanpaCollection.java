package Collection;

/**
 *
 * @author Kepin
 */
public class TanpaCollection {
    public static void main(String[] args) {
        String[] dataInput = {
            "0811", "0822", "0888", "0877",
            "0899", "0833", "0844", "0855"
        };

        String[] set = new String[100]; // untuk simpan elemen unik
        int size = 0;

        for (String nomor : dataInput) {
            if (!contains(set, size, nomor)) {
                set[size] = nomor;
                size++;
            }
        }

        // Sort manual (bubble sort)
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (set[j].compareTo(set[j + 1]) > 0) {
                    String temp = set[j];
                    set[j] = set[j + 1];
                    set[j + 1] = temp;
                }
            }
        }

        // Cetak hasil
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(set[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static boolean contains(String[] arr, int size, String target) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(target)) {
                return true;
            }
        }
        return false;
    }
}
