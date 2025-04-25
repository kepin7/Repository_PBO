package Collection;
import java.util.*;
/**
 *
 * @author Kepin
 */
public class TentangSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();//HashSet//TreeSet//LinkedHashSet//gaperlu bikin logika sendiri
        //CopyOnWriteArraySet dan ConcurrentSkipListSet saat bahas multithreading
        //nambahin data
        set.add("0811");
        set.add("0822");
        set.add("0888");
        set.add("0877");
        set.add("0899");
        set.add("0833");
        set.add("0844");
        set.add("0855");
        System.out.println(set);
        set.remove("0822");
        System.out.println(set);
        set.add("0811");
        System.out.println(set);
    }
}