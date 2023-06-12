package latihanpbo1;
import bangun2D.Segitiga;
import bangun2D.SegitigaSamaKaki;
import bangun2D.SegitigaSiku;
import bangun3D.*;

public  class LatihanPBO1 {
        public static void main(String[] args) {
//            Segitiga segi3 = new SegitigaSiku(3, 4);
//            PrismaSegitiga prismal = new PrismaSegitiga (segi3, 10); System.out.println (prismal);
//            System.out.println (prismal.getVolume());
//            System.out.println(prismal.getDetailAlas ());
//            System.out.println("- -------");
//            SegitigaSamaKaki kaki = new SegitigaSamaKaki (10, 7); PrismaSegitiga prisma2 = new PrismaSegitiga (kaki, 10); System.out.println (prisma2);
//            System.out.println(prisma2.getVolume()); System.out.println(prisma2.getDetailAlas());
//            System.out.println("-------");
            try{
                PrismaSegitiga prisma1 = new PrismaSegitiga(null,20);
                System.out.println(prisma1);
                System.out.println(prisma1.getVolume());
                System.out.println(prisma1.getDetailAlas());
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }

    }
}
