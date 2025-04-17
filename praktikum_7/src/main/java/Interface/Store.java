package Interface;

/**
 *
 * @author Kepin
 */
public class Store {
    static Shoe hightop; 
  
    public static void init() {
        hightop = new Shoe(); 
    }
    
    public static void getInfo(Shoe item) {
        System.out.println("Produk ini dibuat oleh " + item.MAKER); 
        System.out.println("dengan Harga $" + item.getPrice(1) + '\n'); 
    }

    public static void orderInfo(Product item) {
        System.out.println("Pesanan dari " + item.MAKER + " call " + item.PHONE + "."); 
        System.out.println("Setiap barang berharga $" + item.getPrice(1)); 
    }

    public static void main (String[]args){
        init();
        getInfo(hightop);
        orderInfo(hightop);
    }
}