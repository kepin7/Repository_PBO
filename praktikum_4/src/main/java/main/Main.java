package main;

/**
 *
 * @author Kepin
 */

import namadosen.NamaDosen;
import matakuliah.MataKuliah;
import hizkia.kevin.octaviano.NamaKu;

public class Main {
    public static void main(String[] args) {
        NamaDosen objectDosen = new NamaDosen();
        objectDosen.infodosen();
        
        MataKuliah objectMK = new MataKuliah();
        objectMK.info();
        
        NamaKu objectNM = new NamaKu();
        objectNM.infonama();
    }
}