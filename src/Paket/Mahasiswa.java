package Paket;

public class Mahasiswa extends Manusia{
    private String nama;
    public Mahasiswa(String nama){
        super(nama);
    }

    @Override
    public void setNama(String nama) {
        String namadobel = nama+nama;
        super.setNama(namadobel);
    }

    @Override
    public String toString() {
        return "Manusia{" +
                "nama='" + super.getNama() + '\'' +
                '}';
    }
}
