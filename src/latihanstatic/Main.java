package latihanstatic;

import bangun2D.Persegi;
import bangun3D.Limas;

public class Main {
    public static void main(String[] args) {
//      System.out.println(Mahasiswa.getProdi());
//      System.out.println(Mahasiswa.nama);

//        // Percobaan 1b
//        Mahasiswa st1 = new Mahasiswa("Mr X satu");
//        System.out.println(st1.getProdi());
//        System.out.println(st1.getNama());
//        Mahasiswa st2 = new Mahasiswa("Mr X dua");
//        System.out.println(st2.getProdi());
//        System.out.println(st2.getNama());
//
//        st1.setProdi("Teknologi RPL");
//        st1.setNama("Agus");
//        st2.setProdi("Teknologi Rekayasa Perangkat Lunak");
//        st2.setNama("Budi");
//
//        Mahasiswa.setProdi("Softaware Engineering Technology");
//        System.out.println(st1.getProdi());
//        System.out.println(st1.getNama());
//        System.out.println(st2.getProdi());
//        System.out.println(st2.getNama());

//        PersegiPanjang persegiPanjang1 = new PersegiPanjang(10, 5);
//        Limas limas1 =new Limas(10,persegiPanjang1);
//        System.out.println(limas1.getVolumeLimas());
//        System.out.println(limas1.getDetailAlas());
//
//        System.out.println("--------------");
//
//        Persegi persegi1 = new Persegi(11);
//        Limas limas2 = new Limas(8,persegi1);
//        System.out.println(limas2.getVolumeLimas());
//        System.out.println(limas2.getDetailAlas());

        try {
            Persegi persegi = new Persegi(8);
            Limas limas1 = new Limas(10,persegi);
            System.out.println(limas1);
            System.out.println(limas1.getVolumeLimas());
            System.out.println(limas1.getDetailAlas());
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}
