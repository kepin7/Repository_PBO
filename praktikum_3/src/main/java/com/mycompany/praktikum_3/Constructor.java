package com.mycompany.praktikum_3;

class Dosen{
    String nama;
    String matkul;
    
    Dosen(String inputmatkul, String inputnama) {
        matkul = inputmatkul;
        nama = inputnama;
        
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Nama Mata Kuliah: " + matkul);
    }
}
/**
 *
 * @author Kepin
 */
public class Constructor {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen(" Pemfu", " Demon");
        Dosen dosen2 = new Dosen(" AI", "Aldi");
    }
}