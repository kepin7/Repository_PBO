package Interface;
import static Interface.Product.MAKER;
/**
 *
 * @author Kepin
 */
public class Shoe implements Product {
    public int getPrice(int id) {
        if (id == 1) {
            return 5;
        } else {
            return 10; 
        }
    }
}