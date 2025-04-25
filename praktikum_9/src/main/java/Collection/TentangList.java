package Collection;
import java.util.*;
/**
 *
 * @author Kepin
 */
public class TentangList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();//LinkedList//ArrayList//Vector//Stack
        //ArrayList lebih cepat dalam akses elemen berdasarkan indeks
        //LinkedList lebih cepat dalam penambahan dan penghapusan elemen di awal atau tengah list
        list.add("Blue");
        list.add("Despacito");
        list.add("Bombayyah");
        list.add("Memories");
        list.add("Little Boy");
        list.add("Blue");
        list.add(3, "Happy skinnyfab");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
