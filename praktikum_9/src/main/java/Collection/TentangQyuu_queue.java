package Collection;
import java.util.*;
/**
 *
 * @author Kepin
 */
public class TentangQyuu_queue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<String>();//PriorityQueue//ArrayDeque
        queue.add("Kevin");
        queue.add("Veo");
        queue.add("Adam");
        queue.add("Dontol");
        queue.add("Adit");

        System.out.println(queue);
        queue.remove("Dontol");
        System.out.println(queue);

        //System.out.println(queue.element());
        //System.out.println(queue.peak());
    }
}