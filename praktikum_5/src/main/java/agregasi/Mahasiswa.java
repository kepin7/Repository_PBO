package agregasi;

public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }
    public int getNilai() {
        return this.nilai;
    }
}