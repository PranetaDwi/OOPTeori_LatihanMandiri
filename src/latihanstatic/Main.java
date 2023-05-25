package latihanstatic;

public class Main {
    public static void main(String[] args) {
//      System.out.println(Mahasiswa.prodi);
//      System.out.println(Mahasiswa.nama);

        // Percobaan 1b
        Mahasiswa st1 = new Mahasiswa("Mr X satu");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        Mahasiswa st2 = new Mahasiswa("Mr X dua");
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());

        st1.setProdi("Teknologi RPL");
        st1.setNama("Agus");
        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
        st2.setNama("Budi");

        Mahasiswa.setProdi("Softaware Engineering Technology");
        System.out.println(st1.getProdi());
        System.out.println(st1.getNama());
        System.out.println(st2.getProdi());
        System.out.println(st2.getNama());
    }
}
