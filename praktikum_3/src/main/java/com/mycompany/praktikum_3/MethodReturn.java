package com.mycompany.praktikum_3;

/**
 *
 * @author Kepin
 */
public class MethodReturn {
    public static void main(String[] args) {
        MethodReturn obj = new MethodReturn();
        int hasil = obj.jumlahAngka(10, 20);
        
        System.out.println("Hasil: " + hasil);
    }
    public int jumlahAngka(int x, int y) {
        return x + y;
    }
}