package agregasi;

import java.util.ArrayList;
import java.util.List;
public class Dosen {
    private String kodeDosen;
    private String namaDosen;
    private List<Mahasiswa> daftarMahasiswa; // Agregasi: Dosen memiliki daftar Mahasiswa sebagai atribut

    public Dosen(String kodeDosen, String namaDosen) {
        this.kodeDosen = kodeDosen;
        this.namaDosen = namaDosen;
        this.daftarMahasiswa = new ArrayList<>();
    }

    // Menambahkan Mahasiswa ke dalam daftar dosen
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void beriNilai(Mahasiswa mahasiswa, int nilai) {
        if (daftarMahasiswa.contains(mahasiswa)) {
            mahasiswa.setNilai(nilai);
            System.out.println(namaDosen + " memberikan nilai " + nilai + " kepada " + mahasiswa.getNama());
        } else {
            System.out.println(mahasiswa.getNama() + " bukan mahasiswa dari " + namaDosen);
        }
    }

    public void tampilkanMahasiswa() {
        System.out.println("Mahasiswa yang dibimbing oleh " + namaDosen + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("- " + mahasiswa.getNama());
        }
    }
}