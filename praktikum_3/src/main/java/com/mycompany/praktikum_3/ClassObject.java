package com.mycompany.praktikum_3;

class Mahasiswa {
    String Nama;
    double IPK;
    int NIM;
}

/**
 *
 * @author Kepin
 */
public class ClassObject {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa ();
        mahasiswa1.Nama = "Hizkia Kevin Octavano";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.NIM =  185;
        
        System.out.println("Nama: " + mahasiswa1.Nama);
        System.out.println("IPK : " + mahasiswa1.IPK);
        System.out.println("NIM : " + mahasiswa1.NIM);
    }
}