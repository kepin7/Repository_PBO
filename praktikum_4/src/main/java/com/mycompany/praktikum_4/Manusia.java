package com.mycompany.praktikum_4;

/**
 *
 * @author Kepin
 */
public class Manusia {
    
    private String nama;
    private int umur;
    // constructor default
    public Manusia(){}
    // constructor dengan eksplisit/parameter
    public Manusia (String a, int b){
        nama = a;
        umur = b;
    }
    
    //membuat method set dan get untuk mengambil data
    public void setNama(String a){
        nama = a;
    } public String getNama(){
        return nama;
    } public void setUmur(int b){
        umur = b;
    } public int getUmur(){
        return umur;
    }
}