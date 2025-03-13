package com.mycompany.praktikum_3;

/**
 *
 * @author Kepin
 */
class Lagu {
    // Variabel instance menyimpan lagu
    private String pencipta;
    private String judul;

    // Method untuk mengisi parameter lagu menggunakan "this"
    public void IsiParam(String judul, String pencipta) {
        this.judul = judul; // Ini untuk mencegah kebingungan antara variabel instance dan parameter
        this.pencipta = pencipta;
    }

    public void cetakKeLayar() {
        if (judul == null && pencipta == null) return; // Jika null, tidak mencetak apa pun
        System.out.println("Judul: " + judul + ", Pencipta: " + pencipta);
    }
}

public class DemoLaguThis {
    public static void main(String[] args) {
        // Membuat objek lagu dan menampilkan output
        Lagu a = new Lagu();
        a.IsiParam("God Will Make A Way", "Don Moen");
        a.cetakKeLayar();

        Lagu b = new Lagu();
        b.IsiParam("Someone Like You", "Adele");
        b.cetakKeLayar();
    }
}