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

//    public static  void gantiNamo(String namoBaru){
//        this.nama = nama;
//    }
//
//    public static String tanyaNama(){
//        return nama;
//    }

//    public static String getDetail(){
//        return "Mahasiswa {"+"nama="+getNama()+"prodi="+getProdi()+"}";
//    }
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama +
                "prodi=" + prodi +'\'' +
                '}';
    }
}
