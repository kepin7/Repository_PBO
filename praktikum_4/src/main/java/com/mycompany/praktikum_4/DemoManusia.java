package com.mycompany.praktikum_4;

/**
 *
 * @author Kepin
 */
public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrMns[] = new Manusia[3]; //ngebuat array
        
        Manusia objMns1 = new Manusia();
        objMns1.setNama("Hayyan");
        objMns1.setUmur(20); // Menggunakan setter
        
        Manusia objMns2 = new Manusia("Kevin", 20);
        Manusia objMns3 = new Manusia("sugeng", 10); 
        
        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3;
        
        // Menampilkan data dengan getter
        for (Manusia arrMn : arrMns) {
            System.out.println("Nama: " + arrMn.getNama());
            System.out.println("Umur: " + arrMn.getUmur());
        }
    }
}