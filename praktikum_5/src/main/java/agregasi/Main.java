package agregasi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("130118383", "Budi");
        Mahasiswa mhs2 = new Mahasiswa("130118384", "Siti");

        // Membuat objek Dosen
        Dosen dosen = new Dosen("D001", "Dr. Rahmat");

        // Menambahkan Mahasiswa ke dalam Dosen
        dosen.tambahMahasiswa(mhs1);
        dosen.tambahMahasiswa(mhs2);

        // Dosen memberikan nilai
        dosen.beriNilai(mhs1, 90);
        dosen.beriNilai(mhs2, 85);

        // Menampilkan daftar Mahasiswa yang dibimbing oleh Dosen
        dosen.tampilkanMahasiswa();
    }
}