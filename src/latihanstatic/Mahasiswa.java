package latihanstatic;

public class Mahasiswa {
    private  static String prodi="TRPL";
    private  String nama;

    public Mahasiswa (String nama){
        this.nama = nama;
    }

    public static String getProdi() {
        return prodi;
    }

    public static void setProdi(String prodi) {
        Mahasiswa.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama +
                "prodi=" + prodi +'\'' +
                '}';
    }
}
