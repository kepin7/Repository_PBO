package Overloading_Method;

/**
 *
 * @author Kepin
 */
class Lagu {
    String pencipta;
    String judul;
    int tahunterbit;
    
    void IsiParam(String param1) {
        judul = param1;
        pencipta = "Tidak dikenal";
    }
    
    void IsiParam(String param1, String param2) {
        judul = param1;
        pencipta = param2;
    }
    
    void IsiParam(String param1, String param2, int param3) {
        judul = param1;
        pencipta = param2;
        tahunterbit = param3;
    }
    
    void CetakKeLayar() {
        System.out.println("Judul : " + judul + ", pencipta : " + pencipta);
    }
}